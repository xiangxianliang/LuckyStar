package com.gll.ls.core.pojo.system.vo;

import java.util.Date;
import java.util.List;

import com.gll.ls.core.pojo.BaseQuery;

public class SysRoleQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private SysRoleCustom sysRoleCustom;

	// where 条件
	private boolean roleNameLike;
	private boolean roleDescriptionLike;
	private boolean roleRemarkLike;
	private Integer roleIdStart;
	private Integer roleIdEnd;
	private Date roleUpdatedateStart;
	private Date roleUpdatedateEnd;
	private Integer isPermissionsStart;
	private Integer isPermissionsEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> roleIdList;

	// update快照更新 字段
	private boolean updateRoleName;
	private boolean updateRoleDescription;
	private boolean updateRoleRemark;
	private boolean updateRoleUpdatedate;
	private boolean updateIsPermissions;
	private boolean updateIsDisplay;
	private boolean updateIsEnable;
	private boolean updateIsActivation;
	private boolean updateIsDel;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：RoleId
	 */
	public SysRoleQueryVo selectRoleId() {
		selectFields.add("role_id");
		return this;
	}

	/**
	 * 设置查询字段：RoleName
	 */
	public SysRoleQueryVo selectRoleName() {
		selectFields.add("role_name");
		return this;
	}

	/**
	 * 设置查询字段：RoleDescription
	 */
	public SysRoleQueryVo selectRoleDescription() {
		selectFields.add("role_description");
		return this;
	}

	/**
	 * 设置查询字段：RoleRemark
	 */
	public SysRoleQueryVo selectRoleRemark() {
		selectFields.add("role_remark");
		return this;
	}

	/**
	 * 设置查询字段：RoleUpdatedate
	 */
	public SysRoleQueryVo selectRoleUpdatedate() {
		selectFields.add("role_updatedate");
		return this;
	}

	/**
	 * 设置查询字段：IsPermissions
	 */
	public SysRoleQueryVo selectIsPermissions() {
		selectFields.add("is_permissions");
		return this;
	}

	/**
	 * 设置查询字段：IsDisplay
	 */
	public SysRoleQueryVo selectIsDisplay() {
		selectFields.add("is_display");
		return this;
	}

	/**
	 * 设置查询字段：IsEnable
	 */
	public SysRoleQueryVo selectIsEnable() {
		selectFields.add("is_enable");
		return this;
	}

	/**
	 * 设置查询字段：IsActivation
	 */
	public SysRoleQueryVo selectIsActivation() {
		selectFields.add("is_activation");
		return this;
	}

	/**
	 * 设置查询字段：IsDel
	 */
	public SysRoleQueryVo selectIsDel() {
		selectFields.add("is_del");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：RoleId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleQueryVo orderbyRoleId(boolean isAsc) {
		orderFields.add(new OrderField("role_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：RoleName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleQueryVo orderbyRoleName(boolean isAsc) {
		orderFields.add(new OrderField("role_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：RoleDescription
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleQueryVo orderbyRoleDescription(boolean isAsc) {
		orderFields.add(new OrderField("role_description", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：RoleRemark
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleQueryVo orderbyRoleRemark(boolean isAsc) {
		orderFields.add(new OrderField("role_remark", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：RoleUpdatedate
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleQueryVo orderbyRoleUpdatedate(boolean isAsc) {
		orderFields.add(new OrderField("role_updatedate", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsPermissions
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleQueryVo orderbyIsPermissions(boolean isAsc) {
		orderFields.add(new OrderField("is_permissions", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDisplay
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleQueryVo orderbyIsDisplay(boolean isAsc) {
		orderFields.add(new OrderField("is_display", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsEnable
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleQueryVo orderbyIsEnable(boolean isAsc) {
		orderFields.add(new OrderField("is_enable", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsActivation
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleQueryVo orderbyIsActivation(boolean isAsc) {
		orderFields.add(new OrderField("is_activation", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDel
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleQueryVo orderbyIsDel(boolean isAsc) {
		orderFields.add(new OrderField("is_del", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return sysRoleCustom
	 */
	public SysRoleCustom getSysRoleCustom() {
		return sysRoleCustom;
	}

	/**
	 * @param sysRoleCustom
	 *            要设置的 sysRoleCustom
	 */
	public void setSysRoleCustom(SysRoleCustom sysRoleCustom) {
		this.sysRoleCustom = sysRoleCustom;
	}

	/**
	 * @return roleNameLike
	 */
	public Boolean isRoleNameLike() {
		return roleNameLike;
	}

	/**
	 * @param roleNameLike
	 *            要设置的roleNameLike
	 */
	public void setRoleNameLike(boolean roleNameLike) {
		this.roleNameLike = roleNameLike;
	}

	/**
	 * @return roleDescriptionLike
	 */
	public Boolean isRoleDescriptionLike() {
		return roleDescriptionLike;
	}

	/**
	 * @param roleDescriptionLike
	 *            要设置的roleDescriptionLike
	 */
	public void setRoleDescriptionLike(boolean roleDescriptionLike) {
		this.roleDescriptionLike = roleDescriptionLike;
	}

	/**
	 * @return roleRemarkLike
	 */
	public Boolean isRoleRemarkLike() {
		return roleRemarkLike;
	}

	/**
	 * @param roleRemarkLike
	 *            要设置的roleRemarkLike
	 */
	public void setRoleRemarkLike(boolean roleRemarkLike) {
		this.roleRemarkLike = roleRemarkLike;
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
	 * @return roleUpdatedateStart
	 */
	public Date getRoleUpdatedateStart() {
		return roleUpdatedateStart;
	}

	/**
	 * @param roleUpdatedateStart
	 *            要设置的roleUpdatedateStart
	 */
	public void setRoleUpdatedateStart(Date roleUpdatedateStart) {
		this.roleUpdatedateStart = roleUpdatedateStart;
	}

	/**
	 * @return roleUpdatedateEnd
	 */
	public Date getRoleUpdatedateEnd() {
		return roleUpdatedateEnd;
	}

	/**
	 * @param roleUpdatedateEnd
	 *            要设置的roleUpdatedateEnd
	 */
	public void setRoleUpdatedateEnd(Date roleUpdatedateEnd) {
		this.roleUpdatedateEnd = roleUpdatedateEnd;
	}

	/**
	 * @return isPermissionsStart
	 */
	public Integer getIsPermissionsStart() {
		return isPermissionsStart;
	}

	/**
	 * @param isPermissionsStart
	 *            要设置的isPermissionsStart
	 */
	public void setIsPermissionsStart(Integer isPermissionsStart) {
		this.isPermissionsStart = isPermissionsStart;
	}

	/**
	 * @return isPermissionsEnd
	 */
	public Integer getIsPermissionsEnd() {
		return isPermissionsEnd;
	}

	/**
	 * @param isPermissionsEnd
	 *            要设置的isPermissionsEnd
	 */
	public void setIsPermissionsEnd(Integer isPermissionsEnd) {
		this.isPermissionsEnd = isPermissionsEnd;
	}

	/**
	 * @return roleIdList
	 */
	public List<Integer> getRoleIdList() {
		return roleIdList;
	}

	/**
	 * @param roleIdList
	 *            要设置的roleIdList
	 */
	public void setRoleIdList(List<Integer> roleIdList) {
		this.roleIdList = roleIdList;
	}

	/**
	 * @return updateRoleName
	 */
	public Boolean isUpdateRoleName() {
		return updateRoleName;
	}

	/**
	 * @param updateRoleName
	 *            要设置的updateRoleName
	 */
	public void setUpdateRoleName(boolean updateRoleName) {
		this.updateRoleName = updateRoleName;
	}

	/**
	 * @return updateRoleDescription
	 */
	public Boolean isUpdateRoleDescription() {
		return updateRoleDescription;
	}

	/**
	 * @param updateRoleDescription
	 *            要设置的updateRoleDescription
	 */
	public void setUpdateRoleDescription(boolean updateRoleDescription) {
		this.updateRoleDescription = updateRoleDescription;
	}

	/**
	 * @return updateRoleRemark
	 */
	public Boolean isUpdateRoleRemark() {
		return updateRoleRemark;
	}

	/**
	 * @param updateRoleRemark
	 *            要设置的updateRoleRemark
	 */
	public void setUpdateRoleRemark(boolean updateRoleRemark) {
		this.updateRoleRemark = updateRoleRemark;
	}

	/**
	 * @return updateRoleUpdatedate
	 */
	public Boolean isUpdateRoleUpdatedate() {
		return updateRoleUpdatedate;
	}

	/**
	 * @param updateRoleUpdatedate
	 *            要设置的updateRoleUpdatedate
	 */
	public void setUpdateRoleUpdatedate(boolean updateRoleUpdatedate) {
		this.updateRoleUpdatedate = updateRoleUpdatedate;
	}

	/**
	 * @return updateIsPermissions
	 */
	public Boolean isUpdateIsPermissions() {
		return updateIsPermissions;
	}

	/**
	 * @param updateIsPermissions
	 *            要设置的updateIsPermissions
	 */
	public void setUpdateIsPermissions(boolean updateIsPermissions) {
		this.updateIsPermissions = updateIsPermissions;
	}

	/**
	 * @return updateIsDisplay
	 */
	public Boolean isUpdateIsDisplay() {
		return updateIsDisplay;
	}

	/**
	 * @param updateIsDisplay
	 *            要设置的updateIsDisplay
	 */
	public void setUpdateIsDisplay(boolean updateIsDisplay) {
		this.updateIsDisplay = updateIsDisplay;
	}

	/**
	 * @return updateIsEnable
	 */
	public Boolean isUpdateIsEnable() {
		return updateIsEnable;
	}

	/**
	 * @param updateIsEnable
	 *            要设置的updateIsEnable
	 */
	public void setUpdateIsEnable(boolean updateIsEnable) {
		this.updateIsEnable = updateIsEnable;
	}

	/**
	 * @return updateIsActivation
	 */
	public Boolean isUpdateIsActivation() {
		return updateIsActivation;
	}

	/**
	 * @param updateIsActivation
	 *            要设置的updateIsActivation
	 */
	public void setUpdateIsActivation(boolean updateIsActivation) {
		this.updateIsActivation = updateIsActivation;
	}

	/**
	 * @return updateIsDel
	 */
	public Boolean isUpdateIsDel() {
		return updateIsDel;
	}

	/**
	 * @param updateIsDel
	 *            要设置的updateIsDel
	 */
	public void setUpdateIsDel(boolean updateIsDel) {
		this.updateIsDel = updateIsDel;
	}

}
