package com.gll.ls.core.service.system.ext;

import java.util.List;

import com.gll.ls.core.pojo.system.vo.SysUserRoleCustom;
import com.gll.ls.core.service.system.base.SysUserRoleServiceBase;

/**
 * 用户 角色
 * 
 * @author XL
 * @Date 2017年4月23日 下午12:28:36
 */
public interface SysUserRoleService extends SysUserRoleServiceBase {

	// ==================================================================================================================

	/**
	 * 删除关联表（用户-角色） 根据角色id
	 * 
	 * @param roleId
	 * @return
	 */
	public Integer deleteUserRoleByRoleId(Integer roleId);

	/**
	 * 删除角色 by 用户ID
	 * 
	 * @param userIdList
	 * @return
	 */
	public Integer deletedeleteRoleByUserIds(List<Integer> userIdList);

	/**
	 * 根据 用户id 查询用户-角色关系表
	 * 
	 * @param userId
	 * @return
	 */
	public List<SysUserRoleCustom> getUserRoleListByUserId(Integer userId);

	/**
	 * 删除角色 by 用户ID
	 * 
	 * @param userId
	 * @return
	 */
	public Integer deleteRoleByUserId(Integer userId);

	// ==================================================================================================================

}
