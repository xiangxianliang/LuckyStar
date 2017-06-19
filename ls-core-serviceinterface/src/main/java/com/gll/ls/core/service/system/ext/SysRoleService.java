package com.gll.ls.core.service.system.ext;

import java.util.List;

import com.gll.ls.core.pojo.system.vo.SysRoleCustom;
import com.gll.ls.core.pojo.system.vo.SysRoleQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.Tree;
import com.gll.ls.core.service.system.base.SysRoleServiceBase;
import com.gll.ls.page.Pagination;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 系统 角色DAO
 * 
 * @author XL
 * @Date 2017年4月23日 下午12:19:16
 */
public interface SysRoleService extends SysRoleServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysRoleQueryVo
	 * @param rows
	 * @param page
	 * @return
	 */
	public DataGridResultInfo<SysRoleCustom> getRoleListDataGridByQueryVo(SysRoleQueryVo sysRoleQueryVo, int rows, int page);

	/**
	 * 添加
	 */
	public Integer addRoleByQueryVo(SysRoleQueryVo sysRoleQueryVo);

	/**
	 * 根据id更新
	 */
	public Integer updateRoleByKey(SysRoleQueryVo sysRoleQueryVo);

	/**
	 * 根据 角色id 删除 角色 及其 关联的表（用户-角色，角色-模块，角色-权限表）
	 * 
	 * @param roleId
	 * @return
	 */
	public Integer deleteRoleAndRelationByKey(Integer roleId);

	/**
	 * 根据 角色id 删除 角色 及其 关联的表（用户-角色，角色-模块，角色-权限表）
	 * 
	 * @param roleIdList
	 * @return
	 */
	public Integer deleteRoleAndRelationByKeys(List<Integer> roleIdList);

	/**
	 * 启用 禁用
	 * 
	 * @param roleId
	 * @param isEnable
	 * @return
	 */
	public Integer enableRoleByKey(Integer roleId, Integer isEnable);

	/**
	 * 角色 绑定权限 更新权限 分配权限
	 * 
	 * @param roleId
	 *            角色id
	 * @param mids
	 *            子节点
	 * @param pids
	 *            父节点
	 */
	public void updateRoleDist(Integer roleId, Integer[] mids, Integer[] pids);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkRole(Integer roleId, SysRoleQueryVo sysRoleQueryVo);

	// ======================================================================================================

	/**
	 * 获取权限树 多选 并且 查询此角色 下的权限
	 */
	public List<Tree> getModulePermissionTree(Integer roleId);

	// ======================================================================================================
	/**
	 * 根据用户的id 查询用户 选中的角色
	 * 
	 * @param userId
	 * @return
	 */
	public List<Tree> getRoleCheckedByUserId(Integer userId);

	/**
	 * 查询用户的角色树树
	 * 
	 * @return
	 */
	public List<Tree> getRoleTree();

	/**
	 * 查询用户角色
	 * 
	 * @param userId
	 * @return
	 */
	public List<SysRoleCustom> getRoleListByUserId(Integer userId);

	// ============================================================================================================

	// ============================================================================================================

	/**
	 * 分页查询
	 * 
	 * @param sysRoleQueryVo
	 *            查询 条件 对象
	 * @return
	 */
	@Deprecated
	public Pagination<SysRoleCustom> getRoleListWithPage(SysRoleQueryVo sysRoleQueryVo);

	@Deprecated
	public Tree getPermissionTree(Integer roleId);

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
