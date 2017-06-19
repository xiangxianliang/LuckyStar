package com.gll.ls.core.pojo.resource.vo;

import java.util.List;

import com.gll.ls.core.pojo.BaseQuery;

public class ResFeatureQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private ResFeatureCustom resFeatureCustom;

	// where 条件
	private boolean featureNameLike;
	private boolean featureNamePcLike;
	private boolean featureDescriptionLike;
	private boolean featureRemarkLike;
	private boolean selectValueLike;
	private Integer featureIdStart;
	private Integer featureIdEnd;
	private Integer inputTypeStart;
	private Integer inputTypeEnd;
	private Integer typeIdStart;
	private Integer typeIdEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> featureIdList;

	// update快照更新 字段
	private boolean updateFeatureName;
	private boolean updateFeatureNamePc;
	private boolean updateFeatureDescription;
	private boolean updateFeatureRemark;
	private boolean updateIsSpec;
	private boolean updateIsSelect;
	private boolean updateIsShow;
	private boolean updateInputType;
	private boolean updateSelectValue;
	private boolean updateShoworder;
	private boolean updateTypeId;
	private boolean updateIsDisplay;
	private boolean updateIsEnable;
	private boolean updateIsActivation;
	private boolean updateIsDel;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：FeatureId
	 */
	public ResFeatureQueryVo selectFeatureId() {
		selectFields.add("feature_id");
		return this;
	}

	/**
	 * 设置查询字段：FeatureName
	 */
	public ResFeatureQueryVo selectFeatureName() {
		selectFields.add("feature_name");
		return this;
	}

	/**
	 * 设置查询字段：FeatureNamePc
	 */
	public ResFeatureQueryVo selectFeatureNamePc() {
		selectFields.add("feature_name_pc");
		return this;
	}

	/**
	 * 设置查询字段：FeatureDescription
	 */
	public ResFeatureQueryVo selectFeatureDescription() {
		selectFields.add("feature_description");
		return this;
	}

	/**
	 * 设置查询字段：FeatureRemark
	 */
	public ResFeatureQueryVo selectFeatureRemark() {
		selectFields.add("feature_remark");
		return this;
	}

	/**
	 * 设置查询字段：IsSpec
	 */
	public ResFeatureQueryVo selectIsSpec() {
		selectFields.add("is_spec");
		return this;
	}

	/**
	 * 设置查询字段：IsSelect
	 */
	public ResFeatureQueryVo selectIsSelect() {
		selectFields.add("is_select");
		return this;
	}

	/**
	 * 设置查询字段：IsShow
	 */
	public ResFeatureQueryVo selectIsShow() {
		selectFields.add("is_show");
		return this;
	}

	/**
	 * 设置查询字段：InputType
	 */
	public ResFeatureQueryVo selectInputType() {
		selectFields.add("input_type");
		return this;
	}

	/**
	 * 设置查询字段：SelectValue
	 */
	public ResFeatureQueryVo selectSelectValue() {
		selectFields.add("select_value");
		return this;
	}

	/**
	 * 设置查询字段：Showorder
	 */
	public ResFeatureQueryVo selectShoworder() {
		selectFields.add("showorder");
		return this;
	}

	/**
	 * 设置查询字段：TypeId
	 */
	public ResFeatureQueryVo selectTypeId() {
		selectFields.add("type_id");
		return this;
	}

	/**
	 * 设置查询字段：IsDisplay
	 */
	public ResFeatureQueryVo selectIsDisplay() {
		selectFields.add("is_display");
		return this;
	}

	/**
	 * 设置查询字段：IsEnable
	 */
	public ResFeatureQueryVo selectIsEnable() {
		selectFields.add("is_enable");
		return this;
	}

	/**
	 * 设置查询字段：IsActivation
	 */
	public ResFeatureQueryVo selectIsActivation() {
		selectFields.add("is_activation");
		return this;
	}

	/**
	 * 设置查询字段：IsDel
	 */
	public ResFeatureQueryVo selectIsDel() {
		selectFields.add("is_del");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：FeatureId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyFeatureId(boolean isAsc) {
		orderFields.add(new OrderField("feature_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：FeatureName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyFeatureName(boolean isAsc) {
		orderFields.add(new OrderField("feature_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：FeatureNamePc
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyFeatureNamePc(boolean isAsc) {
		orderFields.add(new OrderField("feature_name_pc", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：FeatureDescription
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyFeatureDescription(boolean isAsc) {
		orderFields.add(new OrderField("feature_description", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：FeatureRemark
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyFeatureRemark(boolean isAsc) {
		orderFields.add(new OrderField("feature_remark", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsSpec
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyIsSpec(boolean isAsc) {
		orderFields.add(new OrderField("is_spec", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsSelect
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyIsSelect(boolean isAsc) {
		orderFields.add(new OrderField("is_select", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsShow
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyIsShow(boolean isAsc) {
		orderFields.add(new OrderField("is_show", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：InputType
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyInputType(boolean isAsc) {
		orderFields.add(new OrderField("input_type", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：SelectValue
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbySelectValue(boolean isAsc) {
		orderFields.add(new OrderField("select_value", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Showorder
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyShoworder(boolean isAsc) {
		orderFields.add(new OrderField("showorder", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：TypeId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyTypeId(boolean isAsc) {
		orderFields.add(new OrderField("type_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDisplay
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyIsDisplay(boolean isAsc) {
		orderFields.add(new OrderField("is_display", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsEnable
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyIsEnable(boolean isAsc) {
		orderFields.add(new OrderField("is_enable", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsActivation
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyIsActivation(boolean isAsc) {
		orderFields.add(new OrderField("is_activation", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDel
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureQueryVo orderbyIsDel(boolean isAsc) {
		orderFields.add(new OrderField("is_del", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return resFeatureCustom
	 */
	public ResFeatureCustom getResFeatureCustom() {
		return resFeatureCustom;
	}

	/**
	 * @param resFeatureCustom
	 *            要设置的 resFeatureCustom
	 */
	public void setResFeatureCustom(ResFeatureCustom resFeatureCustom) {
		this.resFeatureCustom = resFeatureCustom;
	}

	/**
	 * @return featureNameLike
	 */
	public Boolean isFeatureNameLike() {
		return featureNameLike;
	}

	/**
	 * @param featureNameLike
	 *            要设置的featureNameLike
	 */
	public void setFeatureNameLike(boolean featureNameLike) {
		this.featureNameLike = featureNameLike;
	}

	/**
	 * @return featureNamePcLike
	 */
	public Boolean isFeatureNamePcLike() {
		return featureNamePcLike;
	}

	/**
	 * @param featureNamePcLike
	 *            要设置的featureNamePcLike
	 */
	public void setFeatureNamePcLike(boolean featureNamePcLike) {
		this.featureNamePcLike = featureNamePcLike;
	}

	/**
	 * @return featureDescriptionLike
	 */
	public Boolean isFeatureDescriptionLike() {
		return featureDescriptionLike;
	}

	/**
	 * @param featureDescriptionLike
	 *            要设置的featureDescriptionLike
	 */
	public void setFeatureDescriptionLike(boolean featureDescriptionLike) {
		this.featureDescriptionLike = featureDescriptionLike;
	}

	/**
	 * @return featureRemarkLike
	 */
	public Boolean isFeatureRemarkLike() {
		return featureRemarkLike;
	}

	/**
	 * @param featureRemarkLike
	 *            要设置的featureRemarkLike
	 */
	public void setFeatureRemarkLike(boolean featureRemarkLike) {
		this.featureRemarkLike = featureRemarkLike;
	}

	/**
	 * @return selectValueLike
	 */
	public Boolean isSelectValueLike() {
		return selectValueLike;
	}

	/**
	 * @param selectValueLike
	 *            要设置的selectValueLike
	 */
	public void setSelectValueLike(boolean selectValueLike) {
		this.selectValueLike = selectValueLike;
	}

	/**
	 * @return featureIdStart
	 */
	public Integer getFeatureIdStart() {
		return featureIdStart;
	}

	/**
	 * @param featureIdStart
	 *            要设置的featureIdStart
	 */
	public void setFeatureIdStart(Integer featureIdStart) {
		this.featureIdStart = featureIdStart;
	}

	/**
	 * @return featureIdEnd
	 */
	public Integer getFeatureIdEnd() {
		return featureIdEnd;
	}

	/**
	 * @param featureIdEnd
	 *            要设置的featureIdEnd
	 */
	public void setFeatureIdEnd(Integer featureIdEnd) {
		this.featureIdEnd = featureIdEnd;
	}

	/**
	 * @return inputTypeStart
	 */
	public Integer getInputTypeStart() {
		return inputTypeStart;
	}

	/**
	 * @param inputTypeStart
	 *            要设置的inputTypeStart
	 */
	public void setInputTypeStart(Integer inputTypeStart) {
		this.inputTypeStart = inputTypeStart;
	}

	/**
	 * @return inputTypeEnd
	 */
	public Integer getInputTypeEnd() {
		return inputTypeEnd;
	}

	/**
	 * @param inputTypeEnd
	 *            要设置的inputTypeEnd
	 */
	public void setInputTypeEnd(Integer inputTypeEnd) {
		this.inputTypeEnd = inputTypeEnd;
	}

	/**
	 * @return typeIdStart
	 */
	public Integer getTypeIdStart() {
		return typeIdStart;
	}

	/**
	 * @param typeIdStart
	 *            要设置的typeIdStart
	 */
	public void setTypeIdStart(Integer typeIdStart) {
		this.typeIdStart = typeIdStart;
	}

	/**
	 * @return typeIdEnd
	 */
	public Integer getTypeIdEnd() {
		return typeIdEnd;
	}

	/**
	 * @param typeIdEnd
	 *            要设置的typeIdEnd
	 */
	public void setTypeIdEnd(Integer typeIdEnd) {
		this.typeIdEnd = typeIdEnd;
	}

	/**
	 * @return featureIdList
	 */
	public List<Integer> getFeatureIdList() {
		return featureIdList;
	}

	/**
	 * @param featureIdList
	 *            要设置的featureIdList
	 */
	public void setFeatureIdList(List<Integer> featureIdList) {
		this.featureIdList = featureIdList;
	}

	/**
	 * @return updateFeatureName
	 */
	public Boolean isUpdateFeatureName() {
		return updateFeatureName;
	}

	/**
	 * @param updateFeatureName
	 *            要设置的updateFeatureName
	 */
	public void setUpdateFeatureName(boolean updateFeatureName) {
		this.updateFeatureName = updateFeatureName;
	}

	/**
	 * @return updateFeatureNamePc
	 */
	public Boolean isUpdateFeatureNamePc() {
		return updateFeatureNamePc;
	}

	/**
	 * @param updateFeatureNamePc
	 *            要设置的updateFeatureNamePc
	 */
	public void setUpdateFeatureNamePc(boolean updateFeatureNamePc) {
		this.updateFeatureNamePc = updateFeatureNamePc;
	}

	/**
	 * @return updateFeatureDescription
	 */
	public Boolean isUpdateFeatureDescription() {
		return updateFeatureDescription;
	}

	/**
	 * @param updateFeatureDescription
	 *            要设置的updateFeatureDescription
	 */
	public void setUpdateFeatureDescription(boolean updateFeatureDescription) {
		this.updateFeatureDescription = updateFeatureDescription;
	}

	/**
	 * @return updateFeatureRemark
	 */
	public Boolean isUpdateFeatureRemark() {
		return updateFeatureRemark;
	}

	/**
	 * @param updateFeatureRemark
	 *            要设置的updateFeatureRemark
	 */
	public void setUpdateFeatureRemark(boolean updateFeatureRemark) {
		this.updateFeatureRemark = updateFeatureRemark;
	}

	/**
	 * @return updateIsSpec
	 */
	public Boolean isUpdateIsSpec() {
		return updateIsSpec;
	}

	/**
	 * @param updateIsSpec
	 *            要设置的updateIsSpec
	 */
	public void setUpdateIsSpec(boolean updateIsSpec) {
		this.updateIsSpec = updateIsSpec;
	}

	/**
	 * @return updateIsSelect
	 */
	public Boolean isUpdateIsSelect() {
		return updateIsSelect;
	}

	/**
	 * @param updateIsSelect
	 *            要设置的updateIsSelect
	 */
	public void setUpdateIsSelect(boolean updateIsSelect) {
		this.updateIsSelect = updateIsSelect;
	}

	/**
	 * @return updateIsShow
	 */
	public Boolean isUpdateIsShow() {
		return updateIsShow;
	}

	/**
	 * @param updateIsShow
	 *            要设置的updateIsShow
	 */
	public void setUpdateIsShow(boolean updateIsShow) {
		this.updateIsShow = updateIsShow;
	}

	/**
	 * @return updateInputType
	 */
	public Boolean isUpdateInputType() {
		return updateInputType;
	}

	/**
	 * @param updateInputType
	 *            要设置的updateInputType
	 */
	public void setUpdateInputType(boolean updateInputType) {
		this.updateInputType = updateInputType;
	}

	/**
	 * @return updateSelectValue
	 */
	public Boolean isUpdateSelectValue() {
		return updateSelectValue;
	}

	/**
	 * @param updateSelectValue
	 *            要设置的updateSelectValue
	 */
	public void setUpdateSelectValue(boolean updateSelectValue) {
		this.updateSelectValue = updateSelectValue;
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
	 * @return updateTypeId
	 */
	public Boolean isUpdateTypeId() {
		return updateTypeId;
	}

	/**
	 * @param updateTypeId
	 *            要设置的updateTypeId
	 */
	public void setUpdateTypeId(boolean updateTypeId) {
		this.updateTypeId = updateTypeId;
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
