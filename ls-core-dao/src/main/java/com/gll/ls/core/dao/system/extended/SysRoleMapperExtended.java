package com.gll.ls.core.dao.system.extended;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gll.ls.core.pojo.utils.tree.vo.Tree;

/**
 * 角色自定义扩展Dao
 * 
 * @author XL
 * @Date 2017年4月27日 下午10:20:36
 */
public interface SysRoleMapperExtended {

	/**
	 * 权限查询
	 * 
	 * @param roleId
	 * @param moduleId
	 * @return
	 */
	public Integer getModuleCheckedByRoleId(@Param("roleId") Integer roleId, @Param("moduleId") Integer moduleId);

	/**
	 * 根据用户的id 查询用户 选中的角色
	 * 
	 * @param userId
	 * @return
	 */
	public List<Tree> getRoleCheckedByUserId(@Param("userId") Integer userId);

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
