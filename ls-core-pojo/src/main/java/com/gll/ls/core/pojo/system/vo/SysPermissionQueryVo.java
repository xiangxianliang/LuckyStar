package com.gll.ls.core.pojo.system.vo;

import java.util.List;
import com.gll.ls.core.pojo.BaseQuery;

public class SysPermissionQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private SysPermissionCustom sysPermissionCustom;

	// where 条件
	private boolean permissionNameLike;
	private boolean permissionCodeLike;
	private boolean permissionMethodLike;
	private boolean permissionDescriptionLike;
	private boolean permissionIconLike;
	private boolean typeLike;
	private Integer permissionIdStart;
	private Integer permissionIdEnd;
	private Integer parentModuleIdStart;
	private Integer parentModuleIdEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> permissionIdList;

	// update快照更新 字段
	private boolean updatePermissionName;
	private boolean updatePermissionCode;
	private boolean updatePermissionMethod;
	private boolean updatePermissionDescription;
	private boolean updatePermissionIcon;
	private boolean updateParentModuleId;
	private boolean updateShoworder;
	private boolean updateType;
	private boolean updateIsDisplay;
	private boolean updateIsEnable;
	private boolean updateIsActivation;
	private boolean updateIsDel;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：PermissionId
	 */
	public SysPermissionQueryVo selectPermissionId() {
		selectFields.add("permission_id");
		return this;
	}

	/**
	 * 设置查询字段：PermissionName
	 */
	public SysPermissionQueryVo selectPermissionName() {
		selectFields.add("permission_name");
		return this;
	}

	/**
	 * 设置查询字段：PermissionCode
	 */
	public SysPermissionQueryVo selectPermissionCode() {
		selectFields.add("permission_code");
		return this;
	}

	/**
	 * 设置查询字段：PermissionMethod
	 */
	public SysPermissionQueryVo selectPermissionMethod() {
		selectFields.add("permission_method");
		return this;
	}

	/**
	 * 设置查询字段：PermissionDescription
	 */
	public SysPermissionQueryVo selectPermissionDescription() {
		selectFields.add("permission_description");
		return this;
	}

	/**
	 * 设置查询字段：PermissionIcon
	 */
	public SysPermissionQueryVo selectPermissionIcon() {
		selectFields.add("permission_icon");
		return this;
	}

	/**
	 * 设置查询字段：ParentModuleId
	 */
	public SysPermissionQueryVo selectParentModuleId() {
		selectFields.add("parent_module_id");
		return this;
	}

	/**
	 * 设置查询字段：Showorder
	 */
	public SysPermissionQueryVo selectShoworder() {
		selectFields.add("showorder");
		return this;
	}

	/**
	 * 设置查询字段：Type
	 */
	public SysPermissionQueryVo selectType() {
		selectFields.add("type");
		return this;
	}

	/**
	 * 设置查询字段：IsDisplay
	 */
	public SysPermissionQueryVo selectIsDisplay() {
		selectFields.add("is_display");
		return this;
	}

	/**
	 * 设置查询字段：IsEnable
	 */
	public SysPermissionQueryVo selectIsEnable() {
		selectFields.add("is_enable");
		return this;
	}

	/**
	 * 设置查询字段：IsActivation
	 */
	public SysPermissionQueryVo selectIsActivation() {
		selectFields.add("is_activation");
		return this;
	}

	/**
	 * 设置查询字段：IsDel
	 */
	public SysPermissionQueryVo selectIsDel() {
		selectFields.add("is_del");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：PermissionId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyPermissionId(boolean isAsc) {
		orderFields.add(new OrderField("permission_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：PermissionName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyPermissionName(boolean isAsc) {
		orderFields.add(new OrderField("permission_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：PermissionCode
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyPermissionCode(boolean isAsc) {
		orderFields.add(new OrderField("permission_code", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：PermissionMethod
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyPermissionMethod(boolean isAsc) {
		orderFields.add(new OrderField("permission_method", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：PermissionDescription
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyPermissionDescription(boolean isAsc) {
		orderFields.add(new OrderField("permission_description", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：PermissionIcon
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyPermissionIcon(boolean isAsc) {
		orderFields.add(new OrderField("permission_icon", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ParentModuleId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyParentModuleId(boolean isAsc) {
		orderFields.add(new OrderField("parent_module_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Showorder
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyShoworder(boolean isAsc) {
		orderFields.add(new OrderField("showorder", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Type
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyType(boolean isAsc) {
		orderFields.add(new OrderField("type", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDisplay
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyIsDisplay(boolean isAsc) {
		orderFields.add(new OrderField("is_display", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsEnable
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyIsEnable(boolean isAsc) {
		orderFields.add(new OrderField("is_enable", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsActivation
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyIsActivation(boolean isAsc) {
		orderFields.add(new OrderField("is_activation", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDel
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysPermissionQueryVo orderbyIsDel(boolean isAsc) {
		orderFields.add(new OrderField("is_del", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return sysPermissionCustom
	 */
	public SysPermissionCustom getSysPermissionCustom() {
		return sysPermissionCustom;
	}

	/**
	 * @param sysPermissionCustom
	 *            要设置的 sysPermissionCustom
	 */
	public void setSysPermissionCustom(SysPermissionCustom sysPermissionCustom) {
		this.sysPermissionCustom = sysPermissionCustom;
	}

	/**
	 * @return permissionNameLike
	 */
	public Boolean isPermissionNameLike() {
		return permissionNameLike;
	}

	/**
	 * @param permissionNameLike
	 *            要设置的permissionNameLike
	 */
	public void setPermissionNameLike(boolean permissionNameLike) {
		this.permissionNameLike = permissionNameLike;
	}

	/**
	 * @return permissionCodeLike
	 */
	public Boolean isPermissionCodeLike() {
		return permissionCodeLike;
	}

	/**
	 * @param permissionCodeLike
	 *            要设置的permissionCodeLike
	 */
	public void setPermissionCodeLike(boolean permissionCodeLike) {
		this.permissionCodeLike = permissionCodeLike;
	}

	/**
	 * @return permissionMethodLike
	 */
	public Boolean isPermissionMethodLike() {
		return permissionMethodLike;
	}

	/**
	 * @param permissionMethodLike
	 *            要设置的permissionMethodLike
	 */
	public void setPermissionMethodLike(boolean permissionMethodLike) {
		this.permissionMethodLike = permissionMethodLike;
	}

	/**
	 * @return permissionDescriptionLike
	 */
	public Boolean isPermissionDescriptionLike() {
		return permissionDescriptionLike;
	}

	/**
	 * @param permissionDescriptionLike
	 *            要设置的permissionDescriptionLike
	 */
	public void setPermissionDescriptionLike(boolean permissionDescriptionLike) {
		this.permissionDescriptionLike = permissionDescriptionLike;
	}

	/**
	 * @return permissionIconLike
	 */
	public Boolean isPermissionIconLike() {
		return permissionIconLike;
	}

	/**
	 * @param permissionIconLike
	 *            要设置的permissionIconLike
	 */
	public void setPermissionIconLike(boolean permissionIconLike) {
		this.permissionIconLike = permissionIconLike;
	}

	/**
	 * @return typeLike
	 */
	public Boolean isTypeLike() {
		return typeLike;
	}

	/**
	 * @param typeLike
	 *            要设置的typeLike
	 */
	public void setTypeLike(boolean typeLike) {
		this.typeLike = typeLike;
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
	 * @return parentModuleIdStart
	 */
	public Integer getParentModuleIdStart() {
		return parentModuleIdStart;
	}

	/**
	 * @param parentModuleIdStart
	 *            要设置的parentModuleIdStart
	 */
	public void setParentModuleIdStart(Integer parentModuleIdStart) {
		this.parentModuleIdStart = parentModuleIdStart;
	}

	/**
	 * @return parentModuleIdEnd
	 */
	public Integer getParentModuleIdEnd() {
		return parentModuleIdEnd;
	}

	/**
	 * @param parentModuleIdEnd
	 *            要设置的parentModuleIdEnd
	 */
	public void setParentModuleIdEnd(Integer parentModuleIdEnd) {
		this.parentModuleIdEnd = parentModuleIdEnd;
	}

	/**
	 * @return permissionIdList
	 */
	public List<Integer> getPermissionIdList() {
		return permissionIdList;
	}

	/**
	 * @param permissionIdList
	 *            要设置的permissionIdList
	 */
	public void setPermissionIdList(List<Integer> permissionIdList) {
		this.permissionIdList = permissionIdList;
	}

	/**
	 * @return updatePermissionName
	 */
	public Boolean isUpdatePermissionName() {
		return updatePermissionName;
	}

	/**
	 * @param updatePermissionName
	 *            要设置的updatePermissionName
	 */
	public void setUpdatePermissionName(boolean updatePermissionName) {
		this.updatePermissionName = updatePermissionName;
	}

	/**
	 * @return updatePermissionCode
	 */
	public Boolean isUpdatePermissionCode() {
		return updatePermissionCode;
	}

	/**
	 * @param updatePermissionCode
	 *            要设置的updatePermissionCode
	 */
	public void setUpdatePermissionCode(boolean updatePermissionCode) {
		this.updatePermissionCode = updatePermissionCode;
	}

	/**
	 * @return updatePermissionMethod
	 */
	public Boolean isUpdatePermissionMethod() {
		return updatePermissionMethod;
	}

	/**
	 * @param updatePermissionMethod
	 *            要设置的updatePermissionMethod
	 */
	public void setUpdatePermissionMethod(boolean updatePermissionMethod) {
		this.updatePermissionMethod = updatePermissionMethod;
	}

	/**
	 * @return updatePermissionDescription
	 */
	public Boolean isUpdatePermissionDescription() {
		return updatePermissionDescription;
	}

	/**
	 * @param updatePermissionDescription
	 *            要设置的updatePermissionDescription
	 */
	public void setUpdatePermissionDescription(boolean updatePermissionDescription) {
		this.updatePermissionDescription = updatePermissionDescription;
	}

	/**
	 * @return updatePermissionIcon
	 */
	public Boolean isUpdatePermissionIcon() {
		return updatePermissionIcon;
	}

	/**
	 * @param updatePermissionIcon
	 *            要设置的updatePermissionIcon
	 */
	public void setUpdatePermissionIcon(boolean updatePermissionIcon) {
		this.updatePermissionIcon = updatePermissionIcon;
	}

	/**
	 * @return updateParentModuleId
	 */
	public Boolean isUpdateParentModuleId() {
		return updateParentModuleId;
	}

	/**
	 * @param updateParentModuleId
	 *            要设置的updateParentModuleId
	 */
	public void setUpdateParentModuleId(boolean updateParentModuleId) {
		this.updateParentModuleId = updateParentModuleId;
	}

	/**
	 * @return updateShoworder
	 */
	public Boolean isUpdateShoworder() {
		return updateShoworder;
	}

	/**
	 * @param updateShoworder
	 *            要设置的updateShoworder
	 */
	public void setUpdateShoworder(boolean updateShoworder) {
		this.updateShoworder = updateShoworder;
	}

	/**
	 * @return updateType
	 */
	public Boolean isUpdateType() {
		return updateType;
	}

	/**
	 * @param updateType
	 *            要设置的updateType
	 */
	public void setUpdateType(boolean updateType) {
		this.updateType = updateType;
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
