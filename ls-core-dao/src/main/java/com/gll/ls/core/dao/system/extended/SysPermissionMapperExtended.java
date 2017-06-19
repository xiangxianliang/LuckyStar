package com.gll.ls.core.dao.system.extended;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gll.ls.core.pojo.utils.user.vo.Permission;

/**
 * 权限 自定义 扩展Dao
 * 
 * @author XL
 * @Date 2017年4月27日 下午10:20:25
 */
public interface SysPermissionMapperExtended {

	/**
	 * 根据用户的id 查询用户的 操作 权限
	 * 
	 * @param userId
	 * @return
	 */
	public List<Permission> getPermissonByUserId(@Param("userId") Integer userId);

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
