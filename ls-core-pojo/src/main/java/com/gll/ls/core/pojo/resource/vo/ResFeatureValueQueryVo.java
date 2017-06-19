package com.gll.ls.core.pojo.resource.vo;

import java.util.List;

import com.gll.ls.core.pojo.BaseQuery;

public class ResFeatureValueQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private ResFeatureValueCustom resFeatureValueCustom;

	// where 条件
	private boolean featureValueNameLike;
	private boolean featureValueValueLike;
	private Integer featureValueIdStart;
	private Integer featureValueIdEnd;
	private Integer featureIdStart;
	private Integer featureIdEnd;
	private Integer isDisplayNameStart;
	private Integer isDisplayNameEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> featureValueIdList;

	// update快照更新 字段
	private boolean updateFeatureValueName;
	private boolean updateFeatureValueValue;
	private boolean updateFeatureId;
	private boolean updateIsDisplayName;
	private boolean updateIsDisplay;
	private boolean updateIsEnable;
	private boolean updateIsActivation;
	private boolean updateIsDel;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：FeatureValueId
	 */
	public ResFeatureValueQueryVo selectFeatureValueId() {
		selectFields.add("feature_value_id");
		return this;
	}

	/**
	 * 设置查询字段：FeatureValueName
	 */
	public ResFeatureValueQueryVo selectFeatureValueName() {
		selectFields.add("feature_value_name");
		return this;
	}

	/**
	 * 设置查询字段：FeatureValueValue
	 */
	public ResFeatureValueQueryVo selectFeatureValueValue() {
		selectFields.add("feature_value_value");
		return this;
	}

	/**
	 * 设置查询字段：FeatureId
	 */
	public ResFeatureValueQueryVo selectFeatureId() {
		selectFields.add("feature_id");
		return this;
	}

	/**
	 * 设置查询字段：IsDisplayName
	 */
	public ResFeatureValueQueryVo selectIsDisplayName() {
		selectFields.add("is_display_name");
		return this;
	}

	/**
	 * 设置查询字段：IsDisplay
	 */
	public ResFeatureValueQueryVo selectIsDisplay() {
		selectFields.add("is_display");
		return this;
	}

	/**
	 * 设置查询字段：IsEnable
	 */
	public ResFeatureValueQueryVo selectIsEnable() {
		selectFields.add("is_enable");
		return this;
	}

	/**
	 * 设置查询字段：IsActivation
	 */
	public ResFeatureValueQueryVo selectIsActivation() {
		selectFields.add("is_activation");
		return this;
	}

	/**
	 * 设置查询字段：IsDel
	 */
	public ResFeatureValueQueryVo selectIsDel() {
		selectFields.add("is_del");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：FeatureValueId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureValueQueryVo orderbyFeatureValueId(boolean isAsc) {
		orderFields.add(new OrderField("feature_value_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：FeatureValueName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureValueQueryVo orderbyFeatureValueName(boolean isAsc) {
		orderFields.add(new OrderField("feature_value_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：FeatureValueValue
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureValueQueryVo orderbyFeatureValueValue(boolean isAsc) {
		orderFields.add(new OrderField("feature_value_value", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：FeatureId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureValueQueryVo orderbyFeatureId(boolean isAsc) {
		orderFields.add(new OrderField("feature_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDisplayName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureValueQueryVo orderbyIsDisplayName(boolean isAsc) {
		orderFields.add(new OrderField("is_display_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDisplay
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureValueQueryVo orderbyIsDisplay(boolean isAsc) {
		orderFields.add(new OrderField("is_display", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsEnable
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureValueQueryVo orderbyIsEnable(boolean isAsc) {
		orderFields.add(new OrderField("is_enable", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsActivation
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureValueQueryVo orderbyIsActivation(boolean isAsc) {
		orderFields.add(new OrderField("is_activation", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDel
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public ResFeatureValueQueryVo orderbyIsDel(boolean isAsc) {
		orderFields.add(new OrderField("is_del", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return resFeatureValueCustom
	 */
	public ResFeatureValueCustom getResFeatureValueCustom() {
		return resFeatureValueCustom;
	}

	/**
	 * @param resFeatureValueCustom
	 *            要设置的 resFeatureValueCustom
	 */
	public void setResFeatureValueCustom(ResFeatureValueCustom resFeatureValueCustom) {
		this.resFeatureValueCustom = resFeatureValueCustom;
	}

	/**
	 * @return featureValueNameLike
	 */
	public Boolean isFeatureValueNameLike() {
		return featureValueNameLike;
	}

	/**
	 * @param featureValueNameLike
	 *            要设置的featureValueNameLike
	 */
	public void setFeatureValueNameLike(boolean featureValueNameLike) {
		this.featureValueNameLike = featureValueNameLike;
	}

	/**
	 * @return featureValueValueLike
	 */
	public Boolean isFeatureValueValueLike() {
		return featureValueValueLike;
	}

	/**
	 * @param featureValueValueLike
	 *            要设置的featureValueValueLike
	 */
	public void setFeatureValueValueLike(boolean featureValueValueLike) {
		this.featureValueValueLike = featureValueValueLike;
	}

	/**
	 * @return featureValueIdStart
	 */
	public Integer getFeatureValueIdStart() {
		return featureValueIdStart;
	}

	/**
	 * @param featureValueIdStart
	 *            要设置的featureValueIdStart
	 */
	public void setFeatureValueIdStart(Integer featureValueIdStart) {
		this.featureValueIdStart = featureValueIdStart;
	}

	/**
	 * @return featureValueIdEnd
	 */
	public Integer getFeatureValueIdEnd() {
		return featureValueIdEnd;
	}

	/**
	 * @param featureValueIdEnd
	 *            要设置的featureValueIdEnd
	 */
	public void setFeatureValueIdEnd(Integer featureValueIdEnd) {
		this.featureValueIdEnd = featureValueIdEnd;
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
	 * @return isDisplayNameStart
	 */
	public Integer getIsDisplayNameStart() {
		return isDisplayNameStart;
	}

	/**
	 * @param isDisplayNameStart
	 *            要设置的isDisplayNameStart
	 */
	public void setIsDisplayNameStart(Integer isDisplayNameStart) {
		this.isDisplayNameStart = isDisplayNameStart;
	}

	/**
	 * @return isDisplayNameEnd
	 */
	public Integer getIsDisplayNameEnd() {
		return isDisplayNameEnd;
	}

	/**
	 * @param isDisplayNameEnd
	 *            要设置的isDisplayNameEnd
	 */
	public void setIsDisplayNameEnd(Integer isDisplayNameEnd) {
		this.isDisplayNameEnd = isDisplayNameEnd;
	}

	/**
	 * @return featureValueIdList
	 */
	public List<Integer> getFeatureValueIdList() {
		return featureValueIdList;
	}

	/**
	 * @param featureValueIdList
	 *            要设置的featureValueIdList
	 */
	public void setFeatureValueIdList(List<Integer> featureValueIdList) {
		this.featureValueIdList = featureValueIdList;
	}

	/**
	 * @return updateFeatureValueName
	 */
	public Boolean isUpdateFeatureValueName() {
		return updateFeatureValueName;
	}

	/**
	 * @param updateFeatureValueName
	 *            要设置的updateFeatureValueName
	 */
	public void setUpdateFeatureValueName(boolean updateFeatureValueName) {
		this.updateFeatureValueName = updateFeatureValueName;
	}

	/**
	 * @return updateFeatureValueValue
	 */
	public Boolean isUpdateFeatureValueValue() {
		return updateFeatureValueValue;
	}

	/**
	 * @param updateFeatureValueValue
	 *            要设置的updateFeatureValueValue
	 */
	public void setUpdateFeatureValueValue(boolean updateFeatureValueValue) {
		this.updateFeatureValueValue = updateFeatureValueValue;
	}

	/**
	 * @return updateFeatureId
	 */
	public Boolean isUpdateFeatureId() {
		return updateFeatureId;
	}

	/**
	 * @param updateFeatureId
	 *            要设置的updateFeatureId
	 */
	public void setUpdateFeatureId(boolean updateFeatureId) {
		this.updateFeatureId = updateFeatureId;
	}

	/**
	 * @return updateIsDisplayName
	 */
	public Boolean isUpdateIsDisplayName() {
		return updateIsDisplayName;
	}

	/**
	 * @param updateIsDisplayName
	 *            要设置的updateIsDisplayName
	 */
	public void setUpdateIsDisplayName(boolean updateIsDisplayName) {
		this.updateIsDisplayName = updateIsDisplayName;
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
