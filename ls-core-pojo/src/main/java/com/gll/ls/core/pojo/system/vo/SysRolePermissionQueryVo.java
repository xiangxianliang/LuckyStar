package com.gll.ls.core.pojo.system.vo;

import java.util.List;
import com.gll.ls.core.pojo.BaseQuery;

public class SysRolePermissionQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private SysRolePermissionCustom sysRolePermissionCustom;

	// where 条件
	private Integer rolePermissionIdStart;
	private Integer rolePermissionIdEnd;
	private Integer roleIdStart;
	private Integer roleIdEnd;
	private Integer permissionIdStart;
	private Integer permissionIdEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> rolePermissionIdList;

	// update快照更新 字段
	private boolean updateRoleId;
	private boolean updatePermissionId;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：RolePermissionId
	 */
	public SysRolePermissionQueryVo selectRolePermissionId() {
		selectFields.add("role_permission_id");
		return this;
	}

	/**
	 * 设置查询字段：RoleId
	 */
	public SysRolePermissionQueryVo selectRoleId() {
		selectFields.add("role_id");
		return this;
	}

	/**
	 * 设置查询字段：PermissionId
	 */
	public SysRolePermissionQueryVo selectPermissionId() {
		selectFields.add("permission_id");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：RolePermissionId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRolePermissionQueryVo orderbyRolePermissionId(boolean isAsc) {
		orderFields.add(new OrderField("role_permission_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：RoleId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRolePermissionQueryVo orderbyRoleId(boolean isAsc) {
		orderFields.add(new OrderField("role_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：PermissionId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRolePermissionQueryVo orderbyPermissionId(boolean isAsc) {
		orderFields.add(new OrderField("permission_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return sysRolePermissionCustom
	 */
	public SysRolePermissionCustom getSysRolePermissionCustom() {
		return sysRolePermissionCustom;
	}

	/**
	 * @param sysRolePermissionCustom
	 *            要设置的 sysRolePermissionCustom
	 */
	public void setSysRolePermissionCustom(SysRolePermissionCustom sysRolePermissionCustom) {
		this.sysRolePermissionCustom = sysRolePermissionCustom;
	}

	/**
	 * @return rolePermissionIdStart
	 */
	public Integer getRolePermissionIdStart() {
		return rolePermissionIdStart;
	}

	/**
	 * @param rolePermissionIdStart
	 *            要设置的rolePermissionIdStart
	 */
	public void setRolePermissionIdStart(Integer rolePermissionIdStart) {
		this.rolePermissionIdStart = rolePermissionIdStart;
	}

	/**
	 * @return rolePermissionIdEnd
	 */
	public Integer getRolePermissionIdEnd() {
		return rolePermissionIdEnd;
	}

	/**
	 * @param rolePermissionIdEnd
	 *            要设置的rolePermissionIdEnd
	 */
	public void setRolePermissionIdEnd(Integer rolePermissionIdEnd) {
		this.rolePermissionIdEnd = rolePermissionIdEnd;
	}

	/**
	 * @return roleIdStart
	 */
	public Integer getRoleIdStart() {
		return roleIdStart;
	}

	/**
	 * @param roleIdStart
	 *            要设置的roleIdStart
	 */
	public void setRoleIdStart(Integer roleIdStart) {
		this.roleIdStart = roleIdStart;
	}

	/**
	 * @return roleIdEnd
	 */
	public Integer getRoleIdEnd() {
		return roleIdEnd;
	}

	/**
	 * @param roleIdEnd
	 *            要设置的roleIdEnd
	 */
	public void setRoleIdEnd(Integer roleIdEnd) {
		this.roleIdEnd = roleIdEnd;
	}

	/**
	 * @return permissionIdStart
	 */
	public Integer getPermissionIdStart() {
		return permissionIdStart;
	}

	/**
	 * @param permissionIdStart
	 *            要设置的permissionIdStart
	 */
	public void setPermissionIdStart(Integer permissionIdStart) {
		this.permissionIdStart = permissionIdStart;
	}

	/**
	 * @return permissionIdEnd
	 */
	public Integer getPermissionIdEnd() {
		return permissionIdEnd;
	}

	/**
	 * @param permissionIdEnd
	 *            要设置的permissionIdEnd
	 */
	public void setPermissionIdEnd(Integer permissionIdEnd) {
		this.permissionIdEnd = permissionIdEnd;
	}

	/**
	 * @return rolePermissionIdList
	 */
	public List<Integer> getRolePermissionIdList() {
		return rolePermissionIdList;
	}

	/**
	 * @param rolePermissionIdList
	 *            要设置的rolePermissionIdList
	 */
	public void setRolePermissionIdList(List<Integer> rolePermissionIdList) {
		this.rolePermissionIdList = rolePermissionIdList;
	}

	/**
	 * @return updateRoleId
	 */
	public Boolean isUpdateRoleId() {
		return updateRoleId;
	}

	/**
	 * @param updateRoleId
	 *            要设置的updateRoleId
	 */
	public void setUpdateRoleId(boolean updateRoleId) {
		this.updateRoleId = updateRoleId;
	}

	/**
	 * @return updatePermissionId
	 */
	public Boolean isUpdatePermissionId() {
		return updatePermissionId;
	}

	/**
	 * @param updatePermissionId
	 *            要设置的updatePermissionId
	 */
	public void setUpdatePermissionId(boolean updatePermissionId) {
		this.updatePermissionId = updatePermissionId;
	}

}
