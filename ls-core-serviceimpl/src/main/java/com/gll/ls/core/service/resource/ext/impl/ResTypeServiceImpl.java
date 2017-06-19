package com.gll.ls.core.service.resource.ext.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.resource.custom.ResTypeMapperCustom;
import com.gll.ls.core.dao.resource.extended.ResTypeMapperExtended;
import com.gll.ls.core.dao.resource.mapper.ResTypeMapper;
import com.gll.ls.core.pojo.resource.vo.ResTypeCustom;
import com.gll.ls.core.pojo.resource.vo.ResTypeQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.ZTree;
import com.gll.ls.core.service.resource.base.impl.ResTypeServiceBaseImpl;
import com.gll.ls.core.service.resource.ext.ResTypeService;
import com.gll.ls.utils.web.result.DataGridResultInfo;

@Service
@Transactional
public class ResTypeServiceImpl extends ResTypeServiceBaseImpl implements ResTypeService {

	@Resource
	private ResTypeMapper resTypeMapper;
	@Resource
	private ResTypeMapperCustom resTypeMapperCustom;
	@Resource
	private ResTypeMapperExtended resTypeMapperExtended;

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<ResTypeCustom> getTypeListDataGridByQueryVo(ResTypeQueryVo resTypeQueryVo, int rows, int page) {

		resTypeQueryVo.orderbyShoworder(true);
		ResTypeCustom ec = resTypeQueryVo.getResTypeCustom();
		ec.setIsDel(1);// 查询未删除的
		resTypeQueryVo.setPageSize(rows);// 每页显示个数
		resTypeQueryVo.setPageNo(page);// 当前页码

		int count = resTypeMapperCustom.getResTypeCustomCount(resTypeQueryVo);
		List<ResTypeCustom> list = resTypeMapperCustom.getResTypeCustomListWithPage(resTypeQueryVo);

		ResTypeCustom p_tc = resTypeMapperCustom.getResTypeCustomByKey(ec.getParentId());
		String parentName = "";
		if (p_tc != null) {
			parentName = p_tc.getTypeName();
		} else {
			parentName = "系统菜单根节点";
		}
		for (ResTypeCustom tc : list) {
			tc.setParentName(parentName);
		}

		DataGridResultInfo<ResTypeCustom> resultInfo = new DataGridResultInfo<ResTypeCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集

		return resultInfo;
	}

	/**
	 * 添加
	 */
	public Integer addTypeByQueryVo(ResTypeQueryVo resTypeQueryVo) {
		// TODO 自定义

		return resTypeMapperCustom.addResTypeCustomByQueryVo(resTypeQueryVo);
	}

	/**
	 * 根据id查询
	 */
	public ResTypeCustom getTypeByKey(Integer typeId) {
		// TODO 自定义

		return resTypeMapperCustom.getResTypeCustomByKey(typeId);
	}

	/**
	 * 根据id更新
	 */
	public Integer updateTypeByKey(ResTypeQueryVo resTypeQueryVo) {
		// TODO 自定义 快照

		return resTypeMapperCustom.updateResTypeCustomByKeySnapshots(resTypeQueryVo);
	}

	/**
	 * 根据id删除
	 */
	public Integer deleteTypeByKey(Integer typeId) {
		// TODO 自定义

		return resTypeMapperCustom.updateDeleteResTypeCustomByKey(typeId);
	}

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteTypeByKeyList(List<Integer> typeIdList) {
		// TODO 自定义

		return resTypeMapperCustom.updateDeleteResTypeCustomByKeyList(typeIdList);
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkType(Integer typeId, ResTypeQueryVo resTypeQueryVo) {
		List<ResTypeCustom> list = resTypeMapperCustom.getResTypeCustomListByQueryVo(resTypeQueryVo);
		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1) {
			if (null == typeId) {
				// 存在相同的模块
				return false;
			} else {
				Integer tid = list.get(0).getTypeId();
				if (tid.equals(typeId)) {
					// id 相同， 并且size() 是1 return 可以使用
					return true;
				} else {
					// 存在相同的模块
					return false;
				}
			}
		}
		// 其他情况
		return false;
	}

	/**
	 * 启用树
	 */
	@Override
	public Integer updateTypeEnable(List<Integer> typeIdList) {
		Integer count = resTypeMapperExtended.updateTypeEnable0();
		count += resTypeMapperExtended.updateTypeEnable(1, typeIdList);
		return count;
	}

	// =======================================================================================================================

	/**
	 * 查询ZTree 全部
	 */
	@Override
	public ZTree getTypeZTree() {
		List<ZTree> typezTree = this.getZTypeTree(0, null);

		ZTree ztree = new ZTree();
		ztree.setId(0);
		ztree.setName("系统菜单根节点");
		ztree.setPid(-1);
		ztree.setOpen(true);
		ztree.setIsParent(true);
		ztree.setChildren(typezTree);
		return ztree;
	}

	// 查询ZTree 全部 递归方法
	private List<ZTree> getZTypeTree(Integer pid, Integer isEnable) {
		List<ZTree> typeZTreeList = null;

		// 查询根元素
		ResTypeQueryVo t_vo = new ResTypeQueryVo();
		t_vo.orderbyShoworder(true);// 设置排序
		t_vo.setResTypeCustom(new ResTypeCustom());
		ResTypeCustom t_c = t_vo.getResTypeCustom();
		t_c.setParentId(pid);
		// 查询已经启动用的吗
		if (null != isEnable) {
			t_c.setIsEnable(isEnable);
		}

		List<ResTypeCustom> typeList = resTypeMapperCustom.getResTypeCustomListByQueryVo(t_vo);

		if (typeList != null) {
			typeZTreeList = new ArrayList<ZTree>();
			for (ResTypeCustom t_custom : typeList) {
				ZTree zTree = new ZTree();
				zTree.setId(t_custom.getTypeId());
				// zTree.setName(t_custom.getTypeId() + "=" + t_custom.getTypeName());
				zTree.setName(t_custom.getTypeName());
				zTree.setPid(t_custom.getParentId());
				zTree.setIsSelected(t_custom.getIsSelect());// 添加商品是否可以点击
				if (t_custom.getIsEnable() == 1) {
					zTree.setChecked(true);
				} else {
					zTree.setChecked(false);
				}
				if (t_custom.getIsSeaf() == 0) {// 目录结点 继续查询下一级菜单
					List<ZTree> children = this.getZTypeTree(t_custom.getTypeId(), isEnable);
					if (children != null && children.size() > 0) {
						zTree.setIsParent(true);
						zTree.setOpen(false);
						// tree.setState("closed");
						zTree.setChildren(children);
					}
				} else {
					zTree.setOpen(false);
					zTree.setIsParent(false);
				}
				typeZTreeList.add(zTree);
			}
		}
		return typeZTreeList;
	}

	/**
	 * 查询被选中的tree
	 */
	@Override
	public ZTree getEnableTypeZTree() {
		List<ZTree> typezTree = this.getZTypeTree(0, 1);

		ZTree ztree = new ZTree();
		ztree.setId(0);
		ztree.setName("系统菜单根节点");
		ztree.setPid(-1);
		ztree.setOpen(true);
		ztree.setIsParent(true);
		ztree.setChildren(typezTree);
		return ztree;
	}

	/**
	 * 查询特定的 模块树
	 */
	@Override
	public ZTree getModuleJSONByModuleId(Integer typeId) {
		ResTypeCustom t_custom = resTypeMapperCustom.getResTypeCustomByKey(typeId);
		ZTree zTree = new ZTree();
		zTree.setId(t_custom.getTypeId());
		zTree.setPid(t_custom.getParentId());
		zTree.setIsParent(false);
		zTree.setName(t_custom.getTypeName());
		return zTree;
	}

	/**
	 * 得到选中的ZTree （属性管理用到）
	 */
	@Override
	public ZTree getSelectTypeZTree() {
		List<ZTree> typezTree = this.getZTypeTree(0, 1);

		ZTree ztree = new ZTree();
		ztree.setId(0);
		ztree.setName("系统菜单根节点");
		ztree.setPid(-1);
		ztree.setOpen(true);
		ztree.setIsParent(true);
		ztree.setChildren(typezTree);
		return ztree;
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
