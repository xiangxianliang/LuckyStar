package com.gll.ls.core.pojo.system.vo;

import java.util.List;
import com.gll.ls.core.pojo.BaseQuery;

public class SysModuleQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private SysModuleCustom sysModuleCustom;

	// where 条件
	private boolean moduleNameLike;
	private boolean moduleDescriptionLike;
	private boolean moduleUrlLike;
	private boolean moduleIconLike;
	private Integer moduleIdStart;
	private Integer moduleIdEnd;
	private Integer parentIdStart;
	private Integer parentIdEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> moduleIdList;

	// update快照更新 字段
	private boolean updateModuleName;
	private boolean updateModuleDescription;
	private boolean updateParentId;
	private boolean updateModuleUrl;
	private boolean updateModuleIcon;
	private boolean updateShoworder;
	private boolean updateIsSeaf;
	private boolean updateIsDisplay;
	private boolean updateIsEnable;
	private boolean updateIsActivation;
	private boolean updateIsDel;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：ModuleId
	 */
	public SysModuleQueryVo selectModuleId() {
		selectFields.add("module_id");
		return this;
	}

	/**
	 * 设置查询字段：ModuleName
	 */
	public SysModuleQueryVo selectModuleName() {
		selectFields.add("module_name");
		return this;
	}

	/**
	 * 设置查询字段：ModuleDescription
	 */
	public SysModuleQueryVo selectModuleDescription() {
		selectFields.add("module_description");
		return this;
	}

	/**
	 * 设置查询字段：ParentId
	 */
	public SysModuleQueryVo selectParentId() {
		selectFields.add("parent_id");
		return this;
	}

	/**
	 * 设置查询字段：ModuleUrl
	 */
	public SysModuleQueryVo selectModuleUrl() {
		selectFields.add("module_url");
		return this;
	}

	/**
	 * 设置查询字段：ModuleIcon
	 */
	public SysModuleQueryVo selectModuleIcon() {
		selectFields.add("module_icon");
		return this;
	}

	/**
	 * 设置查询字段：Showorder
	 */
	public SysModuleQueryVo selectShoworder() {
		selectFields.add("showorder");
		return this;
	}

	/**
	 * 设置查询字段：IsSeaf
	 */
	public SysModuleQueryVo selectIsSeaf() {
		selectFields.add("is_seaf");
		return this;
	}

	/**
	 * 设置查询字段：IsDisplay
	 */
	public SysModuleQueryVo selectIsDisplay() {
		selectFields.add("is_display");
		return this;
	}

	/**
	 * 设置查询字段：IsEnable
	 */
	public SysModuleQueryVo selectIsEnable() {
		selectFields.add("is_enable");
		return this;
	}

	/**
	 * 设置查询字段：IsActivation
	 */
	public SysModuleQueryVo selectIsActivation() {
		selectFields.add("is_activation");
		return this;
	}

	/**
	 * 设置查询字段：IsDel
	 */
	public SysModuleQueryVo selectIsDel() {
		selectFields.add("is_del");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：ModuleId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyModuleId(boolean isAsc) {
		orderFields.add(new OrderField("module_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ModuleName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyModuleName(boolean isAsc) {
		orderFields.add(new OrderField("module_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ModuleDescription
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyModuleDescription(boolean isAsc) {
		orderFields.add(new OrderField("module_description", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ParentId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyParentId(boolean isAsc) {
		orderFields.add(new OrderField("parent_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ModuleUrl
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyModuleUrl(boolean isAsc) {
		orderFields.add(new OrderField("module_url", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ModuleIcon
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyModuleIcon(boolean isAsc) {
		orderFields.add(new OrderField("module_icon", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Showorder
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyShoworder(boolean isAsc) {
		orderFields.add(new OrderField("showorder", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsSeaf
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyIsSeaf(boolean isAsc) {
		orderFields.add(new OrderField("is_seaf", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDisplay
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyIsDisplay(boolean isAsc) {
		orderFields.add(new OrderField("is_display", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsEnable
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyIsEnable(boolean isAsc) {
		orderFields.add(new OrderField("is_enable", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsActivation
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyIsActivation(boolean isAsc) {
		orderFields.add(new OrderField("is_activation", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDel
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysModuleQueryVo orderbyIsDel(boolean isAsc) {
		orderFields.add(new OrderField("is_del", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return sysModuleCustom
	 */
	public SysModuleCustom getSysModuleCustom() {
		return sysModuleCustom;
	}

	/**
	 * @param sysModuleCustom
	 *            要设置的 sysModuleCustom
	 */
	public void setSysModuleCustom(SysModuleCustom sysModuleCustom) {
		this.sysModuleCustom = sysModuleCustom;
	}

	/**
	 * @return moduleNameLike
	 */
	public Boolean isModuleNameLike() {
		return moduleNameLike;
	}

	/**
	 * @param moduleNameLike
	 *            要设置的moduleNameLike
	 */
	public void setModuleNameLike(boolean moduleNameLike) {
		this.moduleNameLike = moduleNameLike;
	}

	/**
	 * @return moduleDescriptionLike
	 */
	public Boolean isModuleDescriptionLike() {
		return moduleDescriptionLike;
	}

	/**
	 * @param moduleDescriptionLike
	 *            要设置的moduleDescriptionLike
	 */
	public void setModuleDescriptionLike(boolean moduleDescriptionLike) {
		this.moduleDescriptionLike = moduleDescriptionLike;
	}

	/**
	 * @return moduleUrlLike
	 */
	public Boolean isModuleUrlLike() {
		return moduleUrlLike;
	}

	/**
	 * @param moduleUrlLike
	 *            要设置的moduleUrlLike
	 */
	public void setModuleUrlLike(boolean moduleUrlLike) {
		this.moduleUrlLike = moduleUrlLike;
	}

	/**
	 * @return moduleIconLike
	 */
	public Boolean isModuleIconLike() {
		return moduleIconLike;
	}

	/**
	 * @param moduleIconLike
	 *            要设置的moduleIconLike
	 */
	public void setModuleIconLike(boolean moduleIconLike) {
		this.moduleIconLike = moduleIconLike;
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
	 * @return parentIdStart
	 */
	public Integer getParentIdStart() {
		return parentIdStart;
	}

	/**
	 * @param parentIdStart
	 *            要设置的parentIdStart
	 */
	public void setParentIdStart(Integer parentIdStart) {
		this.parentIdStart = parentIdStart;
	}

	/**
	 * @return parentIdEnd
	 */
	public Integer getParentIdEnd() {
		return parentIdEnd;
	}

	/**
	 * @param parentIdEnd
	 *            要设置的parentIdEnd
	 */
	public void setParentIdEnd(Integer parentIdEnd) {
		this.parentIdEnd = parentIdEnd;
	}

	/**
	 * @return moduleIdList
	 */
	public List<Integer> getModuleIdList() {
		return moduleIdList;
	}

	/**
	 * @param moduleIdList
	 *            要设置的moduleIdList
	 */
	public void setModuleIdList(List<Integer> moduleIdList) {
		this.moduleIdList = moduleIdList;
	}

	/**
	 * @return updateModuleName
	 */
	public Boolean isUpdateModuleName() {
		return updateModuleName;
	}

	/**
	 * @param updateModuleName
	 *            要设置的updateModuleName
	 */
	public void setUpdateModuleName(boolean updateModuleName) {
		this.updateModuleName = updateModuleName;
	}

	/**
	 * @return updateModuleDescription
	 */
	public Boolean isUpdateModuleDescription() {
		return updateModuleDescription;
	}

	/**
	 * @param updateModuleDescription
	 *            要设置的updateModuleDescription
	 */
	public void setUpdateModuleDescription(boolean updateModuleDescription) {
		this.updateModuleDescription = updateModuleDescription;
	}

	/**
	 * @return updateParentId
	 */
	public Boolean isUpdateParentId() {
		return updateParentId;
	}

	/**
	 * @param updateParentId
	 *            要设置的updateParentId
	 */
	public void setUpdateParentId(boolean updateParentId) {
		this.updateParentId = updateParentId;
	}

	/**
	 * @return updateModuleUrl
	 */
	public Boolean isUpdateModuleUrl() {
		return updateModuleUrl;
	}

	/**
	 * @param updateModuleUrl
	 *            要设置的updateModuleUrl
	 */
	public void setUpdateModuleUrl(boolean updateModuleUrl) {
		this.updateModuleUrl = updateModuleUrl;
	}

	/**
	 * @return updateModuleIcon
	 */
	public Boolean isUpdateModuleIcon() {
		return updateModuleIcon;
	}

	/**
	 * @param updateModuleIcon
	 *            要设置的updateModuleIcon
	 */
	public void setUpdateModuleIcon(boolean updateModuleIcon) {
		this.updateModuleIcon = updateModuleIcon;
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
	 * @return updateIsSeaf
	 */
	public Boolean isUpdateIsSeaf() {
		return updateIsSeaf;
	}

	/**
	 * @param updateIsSeaf
	 *            要设置的updateIsSeaf
	 */
	public void setUpdateIsSeaf(boolean updateIsSeaf) {
		this.updateIsSeaf = updateIsSeaf;
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
