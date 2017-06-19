package com.gll.ls.core.service.system.ext.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysRoleMapperCustom;
import com.gll.ls.core.dao.system.extended.SysRoleMapperExtended;
import com.gll.ls.core.dao.system.mapper.SysRoleMapper;
import com.gll.ls.core.pojo.system.po.SysModule;
import com.gll.ls.core.pojo.system.vo.SysModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysModuleQueryVo;
import com.gll.ls.core.pojo.system.vo.SysPermissionCustom;
import com.gll.ls.core.pojo.system.vo.SysRoleCustom;
import com.gll.ls.core.pojo.system.vo.SysRoleModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysRolePermissionCustom;
import com.gll.ls.core.pojo.system.vo.SysRoleQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.Attribute;
import com.gll.ls.core.pojo.utils.tree.vo.Tree;
import com.gll.ls.core.service.system.base.impl.SysRoleServiceBaseImpl;
import com.gll.ls.core.service.system.ext.SysModuleService;
import com.gll.ls.core.service.system.ext.SysPermissionService;
import com.gll.ls.core.service.system.ext.SysRoleModuleService;
import com.gll.ls.core.service.system.ext.SysRolePermissionService;
import com.gll.ls.core.service.system.ext.SysRoleService;
import com.gll.ls.core.service.system.ext.SysUserRoleService;
import com.gll.ls.page.Pagination;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 角色
 * 
 * @author XL
 * @Date 2sysRoleMapper.17年4月23日 下午1:sysRoleMapper.2:sysRoleMapper.4
 */
@Service
@Transactional
public class SysRoleServiceImpl extends SysRoleServiceBaseImpl implements SysRoleService {

	@Resource
	private SysRoleMapper sysRoleMapper;
	@Resource
	private SysRoleMapperCustom sysRoleMapperCustom;
	@Resource
	private SysRoleMapperExtended sysRoleMapperExtended;

	@Resource
	private SysModuleService sysModuleService;
	@Resource
	private SysPermissionService sysPermissionService;// 权限表

	@Resource
	private SysRoleModuleService sysRoleModuleService;// 角色--模块关系表 // 多对多
	@Resource
	private SysRolePermissionService sysRolePermissionService;// 角色--权限关系表 // 多对多
	@Resource
	private SysUserRoleService sysUserRoleService;// 用户--角色 关系表 // 多对多

	// ==============================================================================================================

	/**
	 * 分页查询
	 */
	@Override
	public DataGridResultInfo<SysRoleCustom> getRoleListDataGridByQueryVo(SysRoleQueryVo sysRoleQueryVo, int rows, int page) {
		SysRoleCustom rc = sysRoleQueryVo.getSysRoleCustom();
		rc.setIsDel(1);// 查询未删除的
		sysRoleQueryVo.setPageSize(rows);// 每页显示个数
		sysRoleQueryVo.setPageNo(page);// 当前页码

		int count = sysRoleMapperCustom.getSysRoleCustomCount(sysRoleQueryVo);
		List<SysRoleCustom> list = sysRoleMapperCustom.getSysRoleCustomListWithPage(sysRoleQueryVo);

		DataGridResultInfo<SysRoleCustom> resultInfo = new DataGridResultInfo<SysRoleCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集

		return resultInfo;
	}

	/**
	 * 添加
	 */
	public Integer addRoleByQueryVo(SysRoleQueryVo sysRoleQueryVo) {
		SysRoleCustom sysRoleCustom = sysRoleQueryVo.getSysRoleCustom();
		sysRoleCustom.setRoleUpdatedate(new Date());
		// 设置默认字段
		sysRoleCustom.setIsDisplay(1);
		sysRoleCustom.setIsActivation(1);
		sysRoleCustom.setIsDel(1);
		// 更新数据库 返回
		return sysRoleMapperCustom.addSysRoleCustomByQueryVo(sysRoleQueryVo);
	}

	/**
	 * 根据id更新
	 */
	public Integer updateRoleByKey(SysRoleQueryVo sysRoleQueryVo) {
		// 设置字段
		SysRoleCustom sysRoleCustom = sysRoleQueryVo.getSysRoleCustom();
		sysRoleCustom.setRoleUpdatedate(new Date());
		// 设置快照
		sysRoleQueryVo.setUpdateRoleName(true);
		sysRoleQueryVo.setUpdateRoleDescription(true);
		sysRoleQueryVo.setUpdateRoleRemark(true);
		sysRoleQueryVo.setUpdateRoleUpdatedate(true);
		sysRoleQueryVo.setUpdateIsEnable(true);

		// 更新数据库 返回
		return sysRoleMapperCustom.updateSysRoleCustomByKeySnapshots(sysRoleQueryVo);
	}

	/**
	 * 根据 角色id 删除 角色 及其 关联的表（用户-角色，角色-模块，角色-权限表）
	 */
	@Override
	public Integer deleteRoleAndRelationByKey(Integer roleId) {
		// 1.删除关联表（用户-角色）
		Integer count = sysUserRoleService.deleteUserRoleByRoleId(roleId);
		// 2.删除关联表（角色-模块）
		count += sysRoleModuleService.deleteRoleModuleByRoleId(roleId);
		// 3.删除关联表（角色-权限）
		count += sysRolePermissionService.deleteRolePermissionByRoleId(roleId);
		// 删除 角色表数据
		count += sysRoleMapperCustom.deleteSysRoleCustomByKey(roleId);

		return count;
	}

	/**
	 * 根据 角色id 删除 角色 及其 关联的表（用户-角色，角色-模块，角色-权限表）
	 */
	@Override
	public Integer deleteRoleAndRelationByKeys(List<Integer> roleIdList) {
		Integer count = 0;
		for (Integer roleId : roleIdList) {
			// 1.删除关联表（用户-角色）
			count = sysUserRoleService.deleteUserRoleByRoleId(roleId);
			// 2.删除关联表（角色-模块）
			count += sysRoleModuleService.deleteRoleModuleByRoleId(roleId);
			// 3.删除关联表（角色-权限）
			count += sysRolePermissionService.deleteRolePermissionByRoleId(roleId);
			// 删除 角色表数据
			count += sysRoleMapperCustom.deleteSysRoleCustomByKey(roleId);
		}
		count += sysRoleMapperCustom.deleteSysRoleCustomByKeyList(roleIdList);
		return count;
	}

	/**
	 * 启用 禁用
	 */
	@Override
	public Integer enableRoleByKey(Integer roleId, Integer isEnable) {
		// 查询数据库
		SysRoleCustom customByKey = sysRoleMapperCustom.getSysRoleCustomByKey(roleId);
		// 更新
		customByKey.setIsEnable(isEnable);
		// 提交数据库
		Integer count = sysRoleMapper.updateByPrimaryKey(customByKey);
		return count;
	}

	/**
	 * 角色 绑定权限 更新权限 分配权限
	 * 子节点 父节点
	 */
	@Override
	public void updateRoleDist(Integer roleId, Integer[] mids, Integer[] pids) {
		// TODO 确定 roleid 的 是否存在

		// 去重
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < pids.length; i++) {
			// pid 是 -1 则为系统的根节点 不需要
			Integer pid = pids[i];
			Integer mid = mids[i];
			if (pid.equals(-1)) {
				continue;
			}
			if (pid.equals(0)) {
				set.add(mid);
				continue;
			}
			set.add(pid);
			set.add(mid);
		}

		// 删除 角色-模块 多对多关系表中 旧数据
		int d_rm = sysRoleModuleService.deleteRoleModuleByRoleId(roleId);
		System.out.println(d_rm + "    ===================================================");

		// 删除 角色-权限 多对多关系表中 旧数据
		int d_rp = sysRolePermissionService.deleteRolePermissionByRoleId(roleId);
		System.out.println(d_rp + "    ===================================================");

		for (Integer mid : set) {
			SysModuleCustom module = sysModuleService.getModuleByKey(mid);
			if (module == null) {
				// TODO 抛出异常
			}
			// 向 角色--模块表插入数据
			SysRoleModuleCustom r_mc = new SysRoleModuleCustom();
			r_mc.setRoleId(roleId);
			r_mc.setModuleId(mid);

			sysRoleModuleService.insertSelective(r_mc);// 保存数据

			// 根据 模块 id mid 查询出该模块的所有权限
			List<SysPermissionCustom> permissionList = sysPermissionService.getPermissionListByMid(mid);
			for (SysPermissionCustom p_custom : permissionList) {

				Integer permissionId = p_custom.getPermissionId();// 得到权限ID
				// 创建 对象
				SysRolePermissionCustom rp_custom = new SysRolePermissionCustom();
				rp_custom.setRoleId(roleId);
				rp_custom.setPermissionId(permissionId);
				sysRolePermissionService.insertSelective(rp_custom);// 插入数据
			}
		}

		// 更新 角色表 设置已经分配权限
		SysRoleCustom roleCustom = sysRoleMapperCustom.getSysRoleCustomByKey(roleId);
		if (roleCustom.getIsPermissions().equals(0)) {
			roleCustom.setIsPermissions(1);
			sysRoleMapper.updateByPrimaryKeySelective(roleCustom);
		}
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkRole(Integer roleId, SysRoleQueryVo sysRoleQueryVo) {
		// TODO 自定义 快照

		List<SysRoleCustom> list = sysRoleMapperCustom.getSysRoleCustomListByQueryVo(sysRoleQueryVo);
		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1) {
			if (null == roleId) {
				// 存在相同的模块
				return false;
			} else {
				Integer tid = list.get(0).getRoleId();
				if (tid.equals(roleId)) {
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

	// =========================================================================================

	/**
	 * 获取权限树 多选 并且 查询此角色 下的权限（分配权限用到）
	 */
	@Override
	public List<Tree> getModulePermissionTree(Integer roleId) {
		Tree tree = new Tree();
		tree.setId(0);
		tree.setPid(-1);
		tree.setState("open");
		Attribute attr = new Attribute();
		attr.setPid(-1);
		tree.setAttributes(attr);
		tree.setText("系统根节点");
		tree.setChildren(this.getModulePermissionTreeByRoleId(roleId, 0));

		List<Tree> treeList = new ArrayList<Tree>();
		treeList.add(tree);
		return treeList;
	}

	/**
	 * 递归查询 角色 对应的模块树 并且查询 角色对应的权限（分配权限用到）
	 * 
	 * @param roleId
	 *            角色id
	 * @param m_pid
	 *            模块的父ID 默认 从跟查询
	 * @return
	 */
	private List<Tree> getModulePermissionTreeByRoleId(Integer roleId, Integer m_pid) {
		List<Tree> moduleTreeList = null;

		// 查询 全部模块// 封装查询条件
		SysModuleCustom m_custom = new SysModuleCustom();
		m_custom.setParentId(m_pid);
		m_custom.setIsEnable(1);// 查询启用的 模块
		SysModuleQueryVo m_vo = new SysModuleQueryVo();
		m_vo.orderbyShoworder(true);
		m_vo.setSysModuleCustom(m_custom);
		// 查询
		List<SysModuleCustom> moduleList = sysModuleService.getSysModuleCustomListByQueryVo(m_vo);
		// 是否为空
		if (moduleList != null && moduleList.size() > 0) {
			moduleTreeList = new ArrayList<Tree>();
			for (SysModuleCustom smc : moduleList) {
				// 封装 tree
				Tree tree = new Tree();
				tree.setId(smc.getModuleId());
				// tree.setText(smc.getModuleName() + "--" + smc.getModuleId());
				tree.setText(smc.getModuleName());
				tree.setPid(smc.getParentId());
				// 封装属性
				Attribute attr = new Attribute();
				attr.setPid(smc.getParentId());
				attr.setUrl(smc.getModuleUrl());
				tree.setAttributes(attr);
				Integer new_m_pid = smc.getModuleId();// 当前 结点的 ID
				// 查询是否选中
				if (smc.getIsSeaf() == 1) {// 当 当前的结点没有子节点的时候进行 查询是否是 选中状态的查询 （is_sealf ==1 是 末端结点）
					tree.setState("open");
					// 末端节点 查询是否选中
					Integer count = sysRoleMapperExtended.getModuleCheckedByRoleId(roleId, new_m_pid);
					if (count > 0) {
						tree.setChecked("true");
					}
				} else {// 当前结点 是目录 结点 继续下一级的查询
					List<Tree> children = this.getModulePermissionTreeByRoleId(roleId, new_m_pid);
					if (children != null) {
						tree.setState("closed");
						tree.setChildren(children);
					}
				}
				// 将 当前新建 的tree 添加到 当前 总树中；
				moduleTreeList.add(tree);
			}
		}
		return moduleTreeList;
	}

	// =========================================================================================

	/**
	 * 根据用户的id 查询用户 选中的角色
	 */
	@Override
	public List<Tree> getRoleCheckedByUserId(Integer userId) {

		List<Tree> list = sysRoleMapperExtended.getRoleCheckedByUserId(userId);
		// 包装
		return Tree.formatTree(list);
	}

	/**
	 * 查询 角色树
	 */
	@Override
	public List<Tree> getRoleTree() {

		List<Tree> trees = new ArrayList<Tree>();
		List<SysRoleCustom> list = sysRoleMapperCustom.getSysRoleCustomListByQueryVo(new SysRoleQueryVo());
		for (SysRoleCustom src : list) {
			Tree t = new Tree();
			t.setId(src.getRoleId());
			t.setText(src.getRoleName());
			trees.add(t);
		}
		return Tree.formatTree(trees);
	}

	/**
	 * 查询用户角色
	 */
	@Override
	public List<SysRoleCustom> getRoleListByUserId(Integer userId) {
		List<SysRoleCustom> list = sysRoleMapperCustom.getSysRoleCustomListByQueryVo(new SysRoleQueryVo());
		return list;
	}

	// ==============================================================================================================

	// ==============================================================================================================

	/**
	 * 查询树
	 */
	@Deprecated
	@Override
	public Tree getPermissionTree(Integer roleId) {
		Tree tree = new Tree();
		tree.setId(0);
		tree.setPid(-1);
		Attribute attr = new Attribute();
		attr.setPid(-1);
		tree.setAttributes(attr);
		tree.setText("系统根节点");
		// tree.setState("closed");
		tree.setChildren(this.getModuleTreeByChecked(roleId, 0, 0));
		return tree;
	}

	/**
	 * 递归查询
	 */
	@Deprecated
	public List<Tree> getModuleTreeByChecked(Integer roleId, Integer Pid, Integer c) {
		List<Tree> moduleTreeList = null;
		c++;
		// 查询根元素
		SysModuleQueryVo sysModuleQueryVo = new SysModuleQueryVo();
		sysModuleQueryVo.setSysModuleCustom(new SysModuleCustom());
		SysModuleCustom sysModuleCustom = sysModuleQueryVo.getSysModuleCustom();
		sysModuleCustom.setParentId(Pid);

		List<SysModuleCustom> moduleList = sysModuleService.getSysModuleCustomListByQueryVo(sysModuleQueryVo);
		if (moduleList != null) {
			moduleTreeList = new ArrayList<Tree>();
			for (SysModuleCustom smc : moduleList) {
				Tree tree = new Tree();
				tree.setId(smc.getModuleId());
				tree.setText(smc.getModuleName());
				tree.setPid(smc.getParentId());
				Attribute attr = new Attribute();
				attr.setPid(smc.getParentId());
				tree.setAttributes(attr);
				if (c < 2) {
					List<Tree> children = this.getModuleTreeByChecked(roleId, smc.getModuleId(), c);
					c = c;
					if (children != null || children.size() > 0) {
						// tree.setState("closed");
						tree.setChildren(children);
					} else {
						// 查询 查询是否选中
						Integer moduleId = smc.getModuleId();
						Integer count = sysRoleMapperExtended.getModuleCheckedByRoleId(roleId, moduleId);
						if (count > 0) {
							tree.setChecked("true");
						}
					}
				} else {
					// 查询 查询是否选中
					Integer moduleId = smc.getModuleId();
					Integer count = sysRoleMapperExtended.getModuleCheckedByRoleId(roleId, moduleId);
					if (count > 0) {
						tree.setChecked("true");
					}
				}
				moduleTreeList.add(tree);
			}
		} else {

			SysModule module = sysModuleService.selectByPrimaryKey(Pid);
			// 查询 查询是否选中
			Integer moduleId = module.getModuleId();
			Integer count = sysRoleMapperExtended.getModuleCheckedByRoleId(roleId, moduleId);
			if (count > 0) {
				Tree tree = new Tree();
				tree.setId(module.getModuleId());
				tree.setText(module.getModuleName());
				tree.setPid(module.getParentId());
				Attribute attr = new Attribute();
				attr.setPid(module.getParentId());
				tree.setAttributes(attr);
				tree.setChecked("true");
			}
			System.out.println("================================================");
		}
		return moduleTreeList;
	}

	/**
	 * 分页查询
	 */
	@Deprecated
	@Override
	public Pagination<SysRoleCustom> getRoleListWithPage(SysRoleQueryVo sysRoleQueryVo) {
		sysRoleQueryVo.getSysRoleCustom().setIsDel(1);
		int totalCount = sysRoleMapperCustom.getSysRoleCustomCount(sysRoleQueryVo);
		Pagination<SysRoleCustom> pagination = new Pagination<SysRoleCustom>(sysRoleQueryVo.getPageNo(), sysRoleQueryVo.getPageSize(), totalCount);
		List<SysRoleCustom> list = sysRoleMapperCustom.getSysRoleCustomListWithPage(sysRoleQueryVo);
		pagination.setList(list);
		return pagination;
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
	 */

}