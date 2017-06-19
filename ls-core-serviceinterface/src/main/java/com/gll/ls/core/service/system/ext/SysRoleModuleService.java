package com.gll.ls.core.service.system.ext;

import java.util.List;

import com.gll.ls.core.pojo.system.vo.SysRoleModuleCustom;
import com.gll.ls.core.service.system.base.SysRoleModuleServiceBase;

/**
 * 系统 角色 模块 DAO
 * 
 * @author XL
 * @Date 2017年4月23日 下午12:22:53
 */
public interface SysRoleModuleService extends SysRoleModuleServiceBase {

	// ==================================================================================================================

	/**
	 * 根据 模块id 删除 角色-模块 关联关系
	 * 
	 * @param moduleId
	 *            模块id
	 * @return
	 */
	public Integer deleteRoleModuleByModuleId(Integer moduleId);

	/**
	 * 删除关联表（角色-模块）
	 * 
	 * @param roleId
	 *            角色 ID
	 * @return
	 */
	public Integer deleteRoleModuleByRoleId(Integer roleId);

	/**
	 * 根据 角色 id 查询 角色-模块 关联关系
	 * 
	 * @param roleId
	 *            角色 ID
	 * @return
	 */
	public List<SysRoleModuleCustom> getRoleModuleListByRoleId(Integer roleId);

	// ==================================================================================================================

}
