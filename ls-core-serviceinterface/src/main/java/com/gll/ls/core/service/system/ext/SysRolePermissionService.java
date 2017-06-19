package com.gll.ls.core.service.system.ext;

import java.util.List;

import com.gll.ls.core.pojo.system.vo.SysRolePermissionCustom;
import com.gll.ls.core.service.system.base.SysRolePermissionServiceBase;

/**
 * 角色 权限 DAO
 * 
 * @author XL
 * @Date 2017年4月23日 下午12:27:54
 */
public interface SysRolePermissionService extends SysRolePermissionServiceBase {

	// ==================================================================================================================

	/**
	 * 根据 权限id删除 删除 角色-权限表
	 * 
	 * @param permissionId
	 * @return
	 */
	public Integer deleteRolePermissionByPermissionId(Integer permissionId);

	/**
	 * 根据 角色id 删除 角色-权限 关联关系
	 * 
	 * @param roleId
	 * @return
	 */
	public Integer deleteRolePermissionByRoleId(Integer roleId);

	/**
	 * 根据 角色 id 查询 角色-权限 关联关系
	 * 
	 * @param roleId
	 * @return
	 */
	public List<SysRolePermissionCustom> getRolePermissionListByRoleId(Integer roleId);

	// ==================================================================================================================

	// ==================================================================================================================

}