package com.gll.ls.core.service.system.ext;

import java.util.List;

import com.gll.ls.core.pojo.system.vo.SysPermissionCustom;
import com.gll.ls.core.pojo.system.vo.SysPermissionQueryVo;
import com.gll.ls.core.pojo.utils.user.vo.Permission;
import com.gll.ls.core.service.system.base.SysPermissionServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 权限 DAO
 * 
 * @author XL
 * @Date 2017年4月23日 下午12:36:09
 */
public interface SysPermissionService extends SysPermissionServiceBase {

	/**
	 * 根据权限 的父 模块查询权限
	 * 
	 * @param sysPermissionQueryVo
	 * @param rows
	 * @param page
	 * @return
	 */
	public DataGridResultInfo<SysPermissionCustom> getPermissionListDataGridByQueryVo(SysPermissionQueryVo sysPermissionQueryVo, int rows, int page);

	/**
	 * 增加数据 code 生成
	 * 
	 * @param sysPermissionQueryVo
	 * @return
	 */
	public Integer addPermissionByQueryVo(SysPermissionQueryVo sysPermissionQueryVo);

	/**
	 * 根据主键 查询 权限
	 * 
	 * @param permissionId
	 * @return
	 */
	public SysPermissionCustom getPermissionByKey(Integer permissionId);

	/**
	 * 根据主键更新 权限 主要重写 自动总生成权限代码
	 * 
	 * @param sysPermissionQueryVo
	 * @return
	 */
	public Integer updatePermissionByKey(SysPermissionQueryVo sysPermissionQueryVo);

	/**
	 * 根据权限id 删除 权限 及其关联的 角色与权限表
	 * 
	 * @param permissionId
	 * @return
	 */
	public Integer deletePermissionAndRelationByKey(Integer permissionId);

	/**
	 * 根据权限id List 删除 权限 及其关联的 角色与权限表
	 * 
	 * @param arrayToList
	 * @return
	 */
	public Integer deletePermissionAndRelationByKeys(List<Integer> permissionIdList);

	/**
	 * 启动权限
	 * 
	 * @param permissionId
	 * @param isEnable
	 * @return
	 */
	public Integer enablePermission(Integer permissionId, Integer isEnable);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkPermission(Integer permissionId, SysPermissionQueryVo sysPermissionQueryVo);

	// ================================================================================================================

	/**
	 * 根据用户的id 查询用户的 操作 权限
	 * 
	 * @param userId
	 *            用户ID
	 * @return
	 */
	public List<Permission> getPermissonByUserId(Integer userId);

	/**
	 * 根据模块id 删除 权限 及其关联的 角色-权限 表
	 * 
	 * @param moduleId
	 *            模块ID
	 * @return
	 */
	public Integer deletePermissionAndRelationByModuleId(Integer moduleId);

	/**
	 * 根据 模块ID 查询出全部的权限
	 * 
	 * @param mid
	 *            模块ID
	 * @return
	 */
	public List<SysPermissionCustom> getPermissionListByMid(Integer mid);

	// ==================================================================================================================

}