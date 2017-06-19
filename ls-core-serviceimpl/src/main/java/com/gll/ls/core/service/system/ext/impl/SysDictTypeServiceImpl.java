package com.gll.ls.core.service.system.ext.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysDictTypeMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysDictTypeMapper;
import com.gll.ls.core.pojo.system.vo.SysDictTypeCustom;
import com.gll.ls.core.pojo.system.vo.SysDictTypeQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.Attribute;
import com.gll.ls.core.pojo.utils.tree.vo.Tree;
import com.gll.ls.core.pojo.utils.tree.vo.ZTree;
import com.gll.ls.core.service.system.base.impl.SysDictTypeServiceBaseImpl;
import com.gll.ls.core.service.system.ext.SysDictInfoService;
import com.gll.ls.core.service.system.ext.SysDictTypeService;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 数据字典类型
 * 
 * @author XL
 * @Date 2017年4月29日 上午7:54:25
 */
@Service
@Transactional
public class SysDictTypeServiceImpl extends SysDictTypeServiceBaseImpl implements SysDictTypeService {

	@Resource
	private SysDictTypeMapper sysDictTypeMapper;
	@Resource
	private SysDictTypeMapperCustom sysDictTypeMapperCustom;

	@Resource
	private SysDictInfoService sysDictInfoService;

	// =================================================================================================

	/**
	 * 查询字典项
	 */
	@Deprecated
	@Override
	public Tree getDictionaryTree() {

		// 格式化树
		Tree tree = new Tree();
		tree.setId(0);
		tree.setText("系统根节点");
		tree.setPid(-1);
		Attribute attr = new Attribute();
		attr.setPid(-1);
		tree.setAttributes(attr);

		// 查询未删除的
		SysDictTypeCustom typeCustom = new SysDictTypeCustom();
		typeCustom.setIsDel(1);// 查询未删除的
		SysDictTypeQueryVo vo = new SysDictTypeQueryVo();
		vo.setSysDictTypeCustom(typeCustom);
		vo.orderbyShoworder(true);

		List<SysDictTypeCustom> typeList = sysDictTypeMapperCustom.getSysDictTypeCustomListByQueryVo(vo);

		List<Tree> treeList = new ArrayList<Tree>();
		for (SysDictTypeCustom type : typeList) {
			Tree t = new Tree();
			t.setId(type.getTypeId());
			t.setText(type.getTypeName());
			Attribute a = new Attribute();
			a.setPid(0);
			t.setPid(0);
			t.setAttributes(a);
			treeList.add(t); // 增加tree
		}

		tree.setChildren(treeList);

		return tree;
	}

	/**
	 * 查询字典项
	 */
	@Override
	public ZTree getDictionaryZTree() {

		// 格式化树
		ZTree tree = new ZTree();
		tree.setId(0);
		tree.setName("系统根节点");
		tree.setPid(-1);
		tree.setIsSeafed(0);
		tree.setOpen(true);
		tree.setIsParent(true);

		tree.setChildren(this.getDictionaryZtreeList(0));

		return tree;
	}

	private List<ZTree> getDictionaryZtreeList(Integer pid) {
		// 查询未删除的
		SysDictTypeCustom typeCustom = new SysDictTypeCustom();
		typeCustom.setIsDel(1);// 查询未删除的
		typeCustom.setParentId(pid);// 父id
		SysDictTypeQueryVo vo = new SysDictTypeQueryVo();
		vo.setSysDictTypeCustom(typeCustom);
		vo.orderbyShoworder(true);

		List<SysDictTypeCustom> typeList = sysDictTypeMapperCustom.getSysDictTypeCustomListByQueryVo(vo);

		List<ZTree> treeList = new ArrayList<ZTree>();
		for (SysDictTypeCustom type : typeList) {
			ZTree t = new ZTree();
			t.setId(type.getTypeId());
			t.setName(type.getTypeName());
			t.setPid(type.getParentId());
			t.setIsSeafed(type.getIsSeaf());
			if (type.getIsSeaf() == 0) {// 还有子节点
				List<ZTree> list = this.getDictionaryZtreeList(type.getTypeId());
				t.setChildren(list);
				t.setOpen(false);
			} else {
				t.setOpen(true);
			}
			treeList.add(t); // 增加tree
		}

		return treeList;
	}

	/**
	 * 分页查询
	 */
	@Override
	public DataGridResultInfo<SysDictTypeCustom> getDictTypeDataGridByQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo, int rows, int page) {

		sysDictTypeQueryVo.orderbyShoworder(true);// 设置排序

		SysDictTypeCustom mc = sysDictTypeQueryVo.getSysDictTypeCustom();
		mc.setIsDel(1);// 查询未删除的
		sysDictTypeQueryVo.setPageSize(rows);// 每页显示个数
		sysDictTypeQueryVo.setPageNo(page);// 当前页码

		int count = sysDictTypeMapperCustom.getSysDictTypeCustomCount(sysDictTypeQueryVo);
		List<SysDictTypeCustom> list = sysDictTypeMapperCustom.getSysDictTypeCustomListWithPage(sysDictTypeQueryVo);

		DataGridResultInfo<SysDictTypeCustom> resultInfo = new DataGridResultInfo<SysDictTypeCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集

		return resultInfo;
	}

	/**
	 * 删除字典 项
	 */
	@Override
	public Integer updateDelDictTypeAndRelationByKey(Integer typeId) {
		// 删除字典项 ，并且删除 字典信息
		Integer count = sysDictInfoService.updateDelDictInfoByTypeId(typeId);

		SysDictTypeCustom typeCustom = sysDictTypeMapperCustom.getSysDictTypeCustomByKey(typeId);
		typeCustom.setIsDel(0);// 设置删除
		count += sysDictTypeMapper.updateByPrimaryKeySelective(typeCustom);

		return count;
	}

	/**
	 * 删除字典 项 多个
	 */
	@Override
	public Integer updateDelDictTypeAndRelationByKeys(List<Integer> typeIds) {
		Integer count = 0;
		for (Integer typeId : typeIds) {
			count += this.updateDelDictTypeAndRelationByKey(typeId);
		}
		return count;
	}

	/**
	 * 添加
	 */
	public Integer addDictTypeByQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo) {

		SysDictTypeCustom ebDictTypeCustom = sysDictTypeQueryVo.getSysDictTypeCustom();
		ebDictTypeCustom.setIsActivation(1);
		ebDictTypeCustom.setIsEnable(1);
		ebDictTypeCustom.setIsDisplay(1);
		ebDictTypeCustom.setIsDel(1);
		return sysDictTypeMapperCustom.addSysDictTypeCustomByQueryVo(sysDictTypeQueryVo);
	}

	/**
	 * 根据id更新
	 */
	public Integer updateDictTypeByKey(SysDictTypeQueryVo sysDictTypeQueryVo) {
		sysDictTypeQueryVo.setUpdateTypeName(true);
		sysDictTypeQueryVo.setUpdateTypeDescription(true);
		sysDictTypeQueryVo.setUpdateTypeRemark(true);
		sysDictTypeQueryVo.setUpdateShoworder(true);
		sysDictTypeQueryVo.setUpdateIsEnable(true);
		return sysDictTypeMapperCustom.updateSysDictTypeCustomByKeySnapshots(sysDictTypeQueryVo);
	}

	/**
	 * 根据id删除
	 */
	public Integer deleteDictTypeByKey(Integer typeId) {
		// 硬深处 从 数据库中删除
		return sysDictTypeMapperCustom.deleteSysDictTypeCustomByKey(typeId);
	}

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteDictTypeByKeyList(List<Integer> typeIdList) {
		// 硬深处 从 数据库中删除
		return sysDictTypeMapperCustom.deleteSysDictTypeCustomByKeyList(typeIdList);
	}

	/**
	 * 根据 字典类型id查询 节点信息
	 */
	@Deprecated
	@Override
	public Tree getDictTypeTreeBytypeId(Integer typeId) {
		SysDictTypeCustom typeCustom = sysDictTypeMapperCustom.getSysDictTypeCustomByKey(typeId);

		Tree t = new Tree();
		t.setId(typeCustom.getTypeId());
		t.setText(typeCustom.getTypeName());
		Attribute a = new Attribute();
		a.setPid(0);
		t.setPid(0);
		t.setAttributes(a);

		return t;
	}

	/**
	 * 根据 字典类型id查询 节点信息
	 */
	@Override
	public ZTree getDictTypeZTreeBytypeId(Integer typeId) {
		// 数据库根据 id查询
		SysDictTypeCustom typeCustom = sysDictTypeMapperCustom.getSysDictTypeCustomByKey(typeId);
		// 封装数据
		ZTree t = new ZTree();
		t.setId(typeCustom.getTypeId());
		t.setName(typeCustom.getTypeName());
		t.setPid(0);
		// 返回数据
		return t;
	}

	/**
	 * 启用 字典项
	 */
	@Override
	public Integer enableTypeByKey(Integer typeId, Integer isEnable) {
		// 数据库根据 id查询
		SysDictTypeCustom typeCustom = sysDictTypeMapperCustom.getSysDictTypeCustomByKey(typeId);
		typeCustom.setIsEnable(isEnable);
		// 更新数据
		int i = sysDictTypeMapper.updateByPrimaryKey(typeCustom);
		return i;
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkDictType(Integer typeId, SysDictTypeQueryVo sysDictTypeQueryVo) {
		// TODO 自定义 快照

		List<SysDictTypeCustom> list = sysDictTypeMapperCustom.getSysDictTypeCustomListByQueryVo(sysDictTypeQueryVo);
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

	// =================================================================================================

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
	 */
}