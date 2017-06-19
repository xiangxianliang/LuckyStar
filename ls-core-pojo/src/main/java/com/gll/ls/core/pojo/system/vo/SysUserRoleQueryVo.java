package com.gll.ls.core.pojo.system.vo;

import java.util.List;
import com.gll.ls.core.pojo.BaseQuery;

public class SysUserRoleQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private SysUserRoleCustom sysUserRoleCustom;

	// where 条件
	private Integer userRoleIdStart;
	private Integer userRoleIdEnd;
	private Integer userIdStart;
	private Integer userIdEnd;
	private Integer roleIdStart;
	private Integer roleIdEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> userRoleIdList;

	// update快照更新 字段
	private boolean updateUserId;
	private boolean updateRoleId;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：UserRoleId
	 */
	public SysUserRoleQueryVo selectUserRoleId() {
		selectFields.add("user_role_id");
		return this;
	}

	/**
	 * 设置查询字段：UserId
	 */
	public SysUserRoleQueryVo selectUserId() {
		selectFields.add("user_id");
		return this;
	}

	/**
	 * 设置查询字段：RoleId
	 */
	public SysUserRoleQueryVo selectRoleId() {
		selectFields.add("role_id");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：UserRoleId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysUserRoleQueryVo orderbyUserRoleId(boolean isAsc) {
		orderFields.add(new OrderField("user_role_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：UserId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysUserRoleQueryVo orderbyUserId(boolean isAsc) {
		orderFields.add(new OrderField("user_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：RoleId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysUserRoleQueryVo orderbyRoleId(boolean isAsc) {
		orderFields.add(new OrderField("role_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return sysUserRoleCustom
	 */
	public SysUserRoleCustom getSysUserRoleCustom() {
		return sysUserRoleCustom;
	}

	/**
	 * @param sysUserRoleCustom
	 *            要设置的 sysUserRoleCustom
	 */
	public void setSysUserRoleCustom(SysUserRoleCustom sysUserRoleCustom) {
		this.sysUserRoleCustom = sysUserRoleCustom;
	}

	/**
	 * @return userRoleIdStart
	 */
	public Integer getUserRoleIdStart() {
		return userRoleIdStart;
	}

	/**
	 * @param userRoleIdStart
	 *            要设置的userRoleIdStart
	 */
	public void setUserRoleIdStart(Integer userRoleIdStart) {
		this.userRoleIdStart = userRoleIdStart;
	}

	/**
	 * @return userRoleIdEnd
	 */
	public Integer getUserRoleIdEnd() {
		return userRoleIdEnd;
	}

	/**
	 * @param userRoleIdEnd
	 *            要设置的userRoleIdEnd
	 */
	public void setUserRoleIdEnd(Integer userRoleIdEnd) {
		this.userRoleIdEnd = userRoleIdEnd;
	}

	/**
	 * @return userIdStart
	 */
	public Integer getUserIdStart() {
		return userIdStart;
	}

	/**
	 * @param userIdStart
	 *            要设置的userIdStart
	 */
	public void setUserIdStart(Integer userIdStart) {
		this.userIdStart = userIdStart;
	}

	/**
	 * @return userIdEnd
	 */
	public Integer getUserIdEnd() {
		return userIdEnd;
	}

	/**
	 * @param userIdEnd
	 *            要设置的userIdEnd
	 */
	public void setUserIdEnd(Integer userIdEnd) {
		this.userIdEnd = userIdEnd;
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
	 * @return userRoleIdList
	 */
	public List<Integer> getUserRoleIdList() {
		return userRoleIdList;
	}

	/**
	 * @param userRoleIdList
	 *            要设置的userRoleIdList
	 */
	public void setUserRoleIdList(List<Integer> userRoleIdList) {
		this.userRoleIdList = userRoleIdList;
	}

	/**
	 * @return updateUserId
	 */
	public Boolean isUpdateUserId() {
		return updateUserId;
	}

	/**
	 * @param updateUserId
	 *            要设置的updateUserId
	 */
	public void setUpdateUserId(boolean updateUserId) {
		this.updateUserId = updateUserId;
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

}
