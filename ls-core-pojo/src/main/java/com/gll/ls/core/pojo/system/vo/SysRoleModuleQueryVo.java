package com.gll.ls.core.pojo.system.vo;

import java.util.List;
import com.gll.ls.core.pojo.BaseQuery;

public class SysRoleModuleQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private SysRoleModuleCustom sysRoleModuleCustom;

	// where 条件
	private Integer roleModuleIdStart;
	private Integer roleModuleIdEnd;
	private Integer roleIdStart;
	private Integer roleIdEnd;
	private Integer moduleIdStart;
	private Integer moduleIdEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> roleModuleIdList;

	// update快照更新 字段
	private boolean updateRoleId;
	private boolean updateModuleId;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：RoleModuleId
	 */
	public SysRoleModuleQueryVo selectRoleModuleId() {
		selectFields.add("role_module_id");
		return this;
	}

	/**
	 * 设置查询字段：RoleId
	 */
	public SysRoleModuleQueryVo selectRoleId() {
		selectFields.add("role_id");
		return this;
	}

	/**
	 * 设置查询字段：ModuleId
	 */
	public SysRoleModuleQueryVo selectModuleId() {
		selectFields.add("module_id");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：RoleModuleId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleModuleQueryVo orderbyRoleModuleId(boolean isAsc) {
		orderFields.add(new OrderField("role_module_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：RoleId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleModuleQueryVo orderbyRoleId(boolean isAsc) {
		orderFields.add(new OrderField("role_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ModuleId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysRoleModuleQueryVo orderbyModuleId(boolean isAsc) {
		orderFields.add(new OrderField("module_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return sysRoleModuleCustom
	 */
	public SysRoleModuleCustom getSysRoleModuleCustom() {
		return sysRoleModuleCustom;
	}

	/**
	 * @param sysRoleModuleCustom
	 *            要设置的 sysRoleModuleCustom
	 */
	public void setSysRoleModuleCustom(SysRoleModuleCustom sysRoleModuleCustom) {
		this.sysRoleModuleCustom = sysRoleModuleCustom;
	}

	/**
	 * @return roleModuleIdStart
	 */
	public Integer getRoleModuleIdStart() {
		return roleModuleIdStart;
	}

	/**
	 * @param roleModuleIdStart
	 *            要设置的roleModuleIdStart
	 */
	public void setRoleModuleIdStart(Integer roleModuleIdStart) {
		this.roleModuleIdStart = roleModuleIdStart;
	}

	/**
	 * @return roleModuleIdEnd
	 */
	public Integer getRoleModuleIdEnd() {
		return roleModuleIdEnd;
	}

	/**
	 * @param roleModuleIdEnd
	 *            要设置的roleModuleIdEnd
	 */
	public void setRoleModuleIdEnd(Integer roleModuleIdEnd) {
		this.roleModuleIdEnd = roleModuleIdEnd;
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
	 * @return moduleIdStart
	 */
	public Integer getModuleIdStart() {
		return moduleIdStart;
	}

	/**
	 * @param moduleIdStart
	 *            要设置的moduleIdStart
	 */
	public void setModuleIdStart(Integer moduleIdStart) {
		this.moduleIdStart = moduleIdStart;
	}

	/**
	 * @return moduleIdEnd
	 */
	public Integer getModuleIdEnd() {
		return moduleIdEnd;
	}

	/**
	 * @param moduleIdEnd
	 *            要设置的moduleIdEnd
	 */
	public void setModuleIdEnd(Integer moduleIdEnd) {
		this.moduleIdEnd = moduleIdEnd;
	}

	/**
	 * @return roleModuleIdList
	 */
	public List<Integer> getRoleModuleIdList() {
		return roleModuleIdList;
	}

	/**
	 * @param roleModuleIdList
	 *            要设置的roleModuleIdList
	 */
	public void setRoleModuleIdList(List<Integer> roleModuleIdList) {
		this.roleModuleIdList = roleModuleIdList;
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
	 * @return updateModuleId
	 */
	public Boolean isUpdateModuleId() {
		return updateModuleId;
	}

	/**
	 * @param updateModuleId
	 *            要设置的updateModuleId
	 */
	public void setUpdateModuleId(boolean updateModuleId) {
		this.updateModuleId = updateModuleId;
	}

}
