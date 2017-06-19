package com.gll.ls.core.service.system.ext.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysModuleMapperCustom;
import com.gll.ls.core.dao.system.extended.SysModuleMapperExtended;
import com.gll.ls.core.dao.system.mapper.SysModuleMapper;
import com.gll.ls.core.pojo.system.vo.SysModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysModuleQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.Attribute;
import com.gll.ls.core.pojo.utils.tree.vo.Tree;
import com.gll.ls.core.pojo.utils.tree.vo.ZTree;
import com.gll.ls.core.service.system.base.impl.SysModuleServiceBaseImpl;
import com.gll.ls.core.service.system.ext.SysModuleService;
import com.gll.ls.core.service.system.ext.SysPermissionService;
import com.gll.ls.core.service.system.ext.SysRoleModuleService;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 系统角色
 * 
 * @author XL
 * @Date 2sysModuleMapper.17年4月23日 下午12:45:12
 */
@Service
@Transactional
public class SysModuleServiceImpl extends SysModuleServiceBaseImpl implements SysModuleService {

	@Resource
	private SysModuleMapper sysModuleMapper;
	@Resource
	private SysModuleMapperCustom sysModuleMapperCustom;
	@Resource
	private SysModuleMapperExtended sysModuleMapperExtended;

	@Resource
	private SysPermissionService sysPermissionService;// 权限表
	@Resource
	private SysRoleModuleService SysRoleModuleService;// 角色-模块 关系表

	// ==================================================================================================================

	/**
	 * 分页查询
	 * 
	 * @param sysModuleQueryVo
	 *            查询条件
	 * 
	 * @param rows
	 *            每页显示个数
	 * @param page
	 *            当前页码
	 */
	@Override
	public DataGridResultInfo<SysModuleCustom> getModuleListDataGridByQueryVo(SysModuleQueryVo sysModuleQueryVo, int rows, int page) {

		// 设置排序
		sysModuleQueryVo.orderbyShoworder(true);

		SysModuleCustom mc = sysModuleQueryVo.getSysModuleCustom();
		mc.setIsDel(1);// 查询未删除的
		sysModuleQueryVo.setPageSize(rows);// 每页显示个数
		sysModuleQueryVo.setPageNo(page);// 当前页码

		int count = sysModuleMapperCustom.getSysModuleCustomCount(sysModuleQueryVo);
		List<SysModuleCustom> list = sysModuleMapperCustom.getSysModuleCustomListWithPage(sysModuleQueryVo);

		SysModuleCustom p_mc = sysModuleMapperCustom.getSysModuleCustomByKey(mc.getParentId());
		if (p_mc != null) {
			for (SysModuleCustom smc : list) {
				smc.setParentName(p_mc.getModuleName());
			}
		} else {
			for (SysModuleCustom smc : list) {
				smc.setParentName("系统根节点");
			}
		}

		DataGridResultInfo<SysModuleCustom> resultInfo = new DataGridResultInfo<SysModuleCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集

		return resultInfo;
	}

	/**
	 * 根据id查询 模块
	 */
	@Override
	public SysModuleCustom getModuleByKey(Integer moduleId) {
		if (0 != moduleId) {
			SysModuleCustom mc = sysModuleMapperCustom.getSysModuleCustomByKey(moduleId);
			Integer parentId = mc.getParentId();
			if (parentId != 0) {
				SysModuleCustom p_mc = sysModuleMapperCustom.getSysModuleCustomByKey(mc.getParentId());
				mc.setParentName(p_mc.getModuleName());
			} else {
				mc.setParentName("系统菜单根节点");
			}
			return mc;
		} else {
			SysModuleCustom mc = new SysModuleCustom();
			mc.setModuleName("系统菜单根节点");
			mc.setModuleId(0);
			mc.setParentId(-1);
			return mc;
		}
	}

	/**
	 * 增加模块
	 */
	@Override
	public Integer addModuleByQueryVo(SysModuleQueryVo sysModuleQueryVo) {

		SysModuleCustom new_module = sysModuleQueryVo.getSysModuleCustom();
		// 设置 新的节点为 子节点
		new_module.setIsSeaf(1);
		new_module.setIsDel(1);
		// 保存
		Integer count = sysModuleMapperCustom.addSysModuleCustomByQueryVo(sysModuleQueryVo);

		Integer parentId = new_module.getParentId();
		if (parentId != 0) {
			// 查询数据库 设置 父节点为 目录节点
			SysModuleCustom p_module = sysModuleMapperCustom.getSysModuleCustomByKey(parentId);
			if (1 == p_module.getIsSeaf()) {
				p_module.setIsSeaf(0);// 设置 父节点为 目录节点
				// 保存
				count += sysModuleMapper.updateByPrimaryKeySelective(p_module);
			}
		}

		return count;
	}

	/**
	 * 根据id更新
	 */
	@Override
	public Integer updateModuleByKey(SysModuleQueryVo sysModuleQueryVo) {
		sysModuleQueryVo.setUpdateModuleName(true);
		sysModuleQueryVo.setUpdateModuleDescription(true);
		sysModuleQueryVo.setUpdateModuleUrl(true);
		sysModuleQueryVo.setUpdateModuleIcon(true);
		sysModuleQueryVo.setUpdateShoworder(true);
		return sysModuleMapperCustom.updateSysModuleCustomByKeySnapshots(sysModuleQueryVo);
	}

	/**
	 * 带子父关系的批量删除 关联删除 角色与模块 权限表
	 */
	@Override
	public Integer deleteModuleAndRelationByKey(Integer moduleId) {
		// 根据id查询有没有子节点,有子节点 进行删除 ,子节点有子节点 也进行删除
		Integer i = this.deleteModuleByKeyRecusive(moduleId);
		return i;
	}

	/**
	 * 带子父关系的批量删除List 关联删除 角色与模块 权限表
	 */
	@Override
	public Integer deleteModuleAndRelationByKeys(List<Integer> moduleIdList) {
		int index = 0;
		for (Integer id : moduleIdList) {
			index += this.deleteModuleByKeyRecusive(id);
		}
		return index;
	}

	/**
	 * 带子父关系的批量删除 关联删除 角色与模块 权限表(递归结点)
	 */
	public Integer deleteModuleByKeyRecusive(Integer moduleId) {
		Integer count = 0;
		// 根据id查询有没有子节点,有子节点 进行删除 ,子节点有子节点 也进行删除
		// 查询根元素
		SysModuleQueryVo sysModuleQueryVo = new SysModuleQueryVo();
		sysModuleQueryVo.setSysModuleCustom(new SysModuleCustom());
		SysModuleCustom sysModuleCustom = sysModuleQueryVo.getSysModuleCustom();
		sysModuleCustom.setParentId(moduleId);
		List<SysModuleCustom> moduleList = sysModuleMapperCustom.getSysModuleCustomListByQueryVo(sysModuleQueryVo);
		if (moduleList != null && moduleList.size() > 0) {
			for (SysModuleCustom mc : moduleList) {
				Integer id = mc.getModuleId();
				count += this.deleteModuleByKeyRecusive(id);
			}
		} else {
			// 根据 模块id 删除 角色-模块 关联关系
			count += SysRoleModuleService.deleteRoleModuleByModuleId(moduleId);
			// 根据 模块id 删除 权限 的子父 关系
			count += sysPermissionService.deletePermissionAndRelationByModuleId(moduleId);
			// 进行删除
			count += sysModuleMapperCustom.deleteSysModuleCustomByKey(moduleId);

		}
		// 根据 模块id 删除 角色-模块 关联关系
		count += SysRoleModuleService.deleteRoleModuleByModuleId(moduleId);
		// 根据 模块id 删除 权限 的子父 关系
		count += sysPermissionService.deletePermissionAndRelationByModuleId(moduleId);
		// 删除 第一次递归参数传递 过来的 模块ID
		count += sysModuleMapperCustom.deleteSysModuleCustomByKey(moduleId);

		return count;
	}

	/**
	 * 启用 模块 带递归
	 */
	@Override
	public Integer enableModuleByKey(Integer moduleId, Integer isEnable) {
		Integer count = 0;
		// 查询 模块 判断 是否有子节点
		SysModuleCustom moduleCustomByKey = sysModuleMapperCustom.getSysModuleCustomByKey(moduleId);

		// 判断 有没有子节点
		if (moduleCustomByKey.getIsSeaf() == 0) {
			// 还有子节点
			count += this.enableModuleByKey_Recursive(moduleCustomByKey.getModuleId(), isEnable);
		}
		// 自己 更新到数据库
		moduleCustomByKey.setIsEnable(isEnable);
		// 更新到数据库
		count += sysModuleMapper.updateByPrimaryKey(moduleCustomByKey);

		return count;
	}

	private Integer enableModuleByKey_Recursive(Integer parentId, Integer isEnable) {
		Integer count = 0;
		// 封装查询条件
		SysModuleQueryVo sysModuleQueryVo = new SysModuleQueryVo();
		sysModuleQueryVo.setSysModuleCustom(new SysModuleCustom());
		SysModuleCustom sysModuleCustom = sysModuleQueryVo.getSysModuleCustom();
		sysModuleCustom.setParentId(parentId);

		List<SysModuleCustom> moduleList = sysModuleMapperCustom.getSysModuleCustomListByQueryVo(sysModuleQueryVo);
		if (moduleList != null && moduleList.size() > 0) {
			for (SysModuleCustom mc : moduleList) {
				if (mc.getIsSeaf() == 0) {
					count += this.enableModuleByKey_Recursive(mc.getModuleId(), isEnable);
				}
				// 将自己 设置到数据库
				mc.setIsEnable(isEnable);
				// 更新到数据库
				count += sysModuleMapper.updateByPrimaryKey(mc);

			}
		}
		return count;
	}

	/**
	 * ajax 校验 名称是否正确
	 */
	@Override
	public Boolean checkModule(Integer moduleId, SysModuleQueryVo sysModuleQueryVo) {
		// 根据模块名称查询是否纯在该模块
		// 查询根元素
		List<SysModuleCustom> mc_list = sysModuleMapperCustom.getSysModuleCustomListByQueryVo(sysModuleQueryVo);
		if (mc_list.size() == 0) {
			return true;

		} else if (mc_list.size() == 1) {
			if (null == moduleId) {
				// 存在相同的模块
				return false;
			} else {
				Integer mid = mc_list.get(0).getModuleId();
				if (mid.equals(moduleId)) {
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

	// ============================================================================================================

	/**
	 * 查询树 模块管理时 用到
	 */
	@Override
	public Tree getModuleTree() {
		Tree tree = new Tree();
		tree.setId(0);
		tree.setText("系统根节点");
		// tree.setState("closed");
		tree.setChildren(this.getModuleTree(0));// 调用递归
		return tree;
	}

	/**
	 * 查询模块树 带 父节点查询
	 * 
	 * @param parentId
	 * @return
	 */
	@Override
	public Tree getModuleTreeByParentId(Integer parentId) {
		SysModuleCustom p_mc = sysModuleMapperCustom.getSysModuleCustomByKey(parentId);
		List<Tree> treeList = this.getModuleTree(parentId);
		Tree tree = new Tree();
		tree.setId(p_mc.getModuleId());
		tree.setText(p_mc.getModuleName());
		tree.setPid(p_mc.getParentId());
		Attribute attr = new Attribute();
		attr.setPid(p_mc.getParentId());
		attr.setUrl(p_mc.getModuleUrl());
		tree.setAttributes(attr);
		tree.setChildren(treeList);
		return tree;
	}

	/**
	 * 递归查询 模块管理时 用到（被调用的递归）
	 */
	public List<Tree> getModuleTree(Integer Pid) {
		List<Tree> moduleTreeList = null;

		// 查询根元素
		SysModuleQueryVo sysModuleQueryVo = new SysModuleQueryVo();
		sysModuleQueryVo.orderbyShoworder(true);// 设置排序
		sysModuleQueryVo.setSysModuleCustom(new SysModuleCustom());
		SysModuleCustom sysModuleCustom = sysModuleQueryVo.getSysModuleCustom();
		sysModuleCustom.setParentId(Pid);

		List<SysModuleCustom> moduleList = sysModuleMapperCustom.getSysModuleCustomListByQueryVo(sysModuleQueryVo);
		if (moduleList != null) {
			moduleTreeList = new ArrayList<Tree>();
			for (SysModuleCustom smc : moduleList) {
				Tree tree = new Tree();
				tree.setId(smc.getModuleId());
				tree.setText(smc.getModuleName());
				tree.setPid(smc.getParentId());
				Attribute attr = new Attribute();
				attr.setPid(smc.getParentId());
				attr.setUrl(smc.getModuleUrl());
				tree.setAttributes(attr);

				List<Tree> children = this.getModuleTree(smc.getModuleId());

				if (children != null) {
					// tree.setState("closed");
					tree.setChildren(children);
				}
				moduleTreeList.add(tree);
			}
		}
		return moduleTreeList;
	}

	/**
	 * 查询模块 ZTree
	 */
	@Override
	public ZTree getModuleZTree() {
		ZTree zTree = new ZTree();
		zTree.setId(0);
		zTree.setPid(-1);
		zTree.setOpen(true);
		zTree.setIsParent(true);
		zTree.setName("系统根节点");
		zTree.setChildren(this.getModuleZTree(0));
		return zTree;
	}

	/**
	 * 查询模块 ZTree
	 * 
	 * @param pid
	 *            父节点ID
	 * @return
	 */
	public List<ZTree> getModuleZTree(Integer pid) {
		List<ZTree> moduleZTreeList = null;

		// 查询根元素
		SysModuleQueryVo sysModuleQueryVo = new SysModuleQueryVo();
		sysModuleQueryVo.orderbyShoworder(true);// 设置排序
		sysModuleQueryVo.setSysModuleCustom(new SysModuleCustom());
		SysModuleCustom sysModuleCustom = sysModuleQueryVo.getSysModuleCustom();
		sysModuleCustom.setParentId(pid);

		List<SysModuleCustom> moduleList = sysModuleMapperCustom.getSysModuleCustomListByQueryVo(sysModuleQueryVo);
		if (moduleList != null) {
			moduleZTreeList = new ArrayList<ZTree>();
			for (SysModuleCustom smc : moduleList) {
				ZTree zTree = new ZTree();
				zTree.setId(smc.getModuleId());
				zTree.setName(smc.getModuleName());
				zTree.setPid(smc.getParentId());

				if (smc.getIsSeaf() == 0) { // 目录结点 进行再次查询 不是目录结点 就 不进行查询
					List<ZTree> children = this.getModuleZTree(smc.getModuleId());
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
				moduleZTreeList.add(zTree);
			}
		}
		return moduleZTreeList;
	}

	/**
	 * 递归查询 模块管理时 用到（被调用的递归） 递归查询 带 层级查询
	 */
	@Deprecated
	public List<Tree> getModuleTree(Integer Pid, Integer c) {
		List<Tree> moduleTreeList = null;
		c++;
		// 查询根元素
		SysModuleQueryVo sysModuleQueryVo = new SysModuleQueryVo();
		sysModuleQueryVo.setSysModuleCustom(new SysModuleCustom());
		SysModuleCustom sysModuleCustom = sysModuleQueryVo.getSysModuleCustom();
		sysModuleCustom.setParentId(Pid);

		List<SysModuleCustom> moduleList = sysModuleMapperCustom.getSysModuleCustomListByQueryVo(sysModuleQueryVo);
		if (moduleList != null) {
			moduleTreeList = new ArrayList<Tree>();
			for (SysModuleCustom smc : moduleList) {
				Tree tree = new Tree();
				tree.setId(smc.getModuleId());
				tree.setText(smc.getModuleName());
				if (c < 2) {
					List<Tree> children = this.getModuleTree(smc.getModuleId(), c);
					c = c;
					if (children != null) {
						// tree.setState("closed");
						tree.setChildren(children);
					}
				}
				moduleTreeList.add(tree);
			}
		}
		return moduleTreeList;
	}

	/**
	 * 查询指定结点的 zTree json信息
	 */
	@Override
	public ZTree getModuleJSONByModuleId(Integer moduleId) {
		SysModuleCustom moduleCustom = sysModuleMapperCustom.getSysModuleCustomByKey(moduleId);
		ZTree zTree = new ZTree();
		zTree.setId(moduleCustom.getModuleId());
		zTree.setPid(moduleCustom.getParentId());
		zTree.setIsParent(false);
		zTree.setName(moduleCustom.getModuleName());
		return zTree;
	}

	// ============================================================================================================

	/**
	 * 得到 用户目录树 （用户登录 用到）
	 */
	@Override
	public List<Tree> getUserModuleTreeByUserId(Integer userId) {
		List<Tree> moduleTreeList = new ArrayList<Tree>();
		// 用户 可以使用的模块的ID
		List<Integer> mIdList = sysModuleMapperExtended.getModuleCheckedIdByUserId(userId);
		// 查询一级菜单
		List<SysModuleCustom> moduleList = sysModuleMapperExtended.getModuleCheckedOneByUserId(mIdList);

		for (SysModuleCustom smc : moduleList) {
			Tree tree = new Tree();
			tree.setId(smc.getModuleId());
			tree.setText(smc.getModuleName());
			Attribute attr = new Attribute();
			attr.setPid(smc.getParentId());
			attr.setIsSeaf(smc.getIsSeaf());
			attr.setUrl(smc.getModuleUrl());
			tree.setAttributes(attr);

			Integer moduleId = smc.getModuleId();
			if (smc.getIsSeaf() == 0) {
				// 层级查询 多层次查询
				List<Tree> children = this.getUserModuleTreeByUserId(mIdList, moduleId);
				tree.setChildren(children);
				tree.setState("closed");
				
			}else{
				tree.setState("open");
			}
			moduleTreeList.add(tree);
		}
		// List<Tree> list =
		// sysModuleMapperCustom.getUserModuleTreeByUserId(userId);
		return moduleTreeList;
	}

	/**
	 * 得到 用户目录树 （用户登录 用到）(递归)
	 * 
	 * @param mIdList
	 * @param moduleId
	 * @return
	 */
	private List<Tree> getUserModuleTreeByUserId(List<Integer> mIdList, Integer moduleId) {
		List<Tree> moduleTreeList = new ArrayList<Tree>();
		// 查询数据库
		List<SysModuleCustom> moduleList = sysModuleMapperExtended.getModuleCheckedOtherByUserId(mIdList, moduleId);
		for (SysModuleCustom smc : moduleList) {
			Tree tree = new Tree();
			tree.setId(smc.getModuleId());
			tree.setText(smc.getModuleName());
			Attribute attr = new Attribute();
			attr.setPid(smc.getParentId());
			attr.setIsSeaf(smc.getIsSeaf());
			attr.setUrl(smc.getModuleUrl());
			tree.setAttributes(attr);
			Integer new_mid = smc.getModuleId();
			// 用户是否有子目录
			if (smc.getIsSeaf() == 0) {
				// 层级查询 多层次查询
				List<Tree> children = this.getUserModuleTreeByUserId(mIdList, new_mid);
				if (children != null && children.size() > 0) {
					tree.setChildren(children);
				}
			}
			moduleTreeList.add(tree);
		}
		return moduleTreeList;
	}

	// ============================================================================================================

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