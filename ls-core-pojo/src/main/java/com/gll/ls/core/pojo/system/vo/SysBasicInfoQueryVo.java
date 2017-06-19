package com.gll.ls.core.pojo.system.vo;

import java.util.List;
import com.gll.ls.core.pojo.BaseQuery;

public class SysBasicInfoQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private SysBasicInfoCustom sysBasicInfoCustom;

	// where 条件
	private boolean basicInfoNameLike;
	private boolean basicInfoValueLike;
	private boolean basicInfoTagLike;
	private boolean basicInfoDescriptionLike;
	private boolean basicInfoRemarkLike;
	private Integer basicInfoIdStart;
	private Integer basicInfoIdEnd;
	private Integer basicInfoTypeStart;
	private Integer basicInfoTypeEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> basicInfoIdList;

	// update快照更新 字段
	private boolean updateBasicInfoName;
	private boolean updateBasicInfoValue;
	private boolean updateBasicInfoType;
	private boolean updateBasicInfoTag;
	private boolean updateBasicInfoDescription;
	private boolean updateBasicInfoRemark;
	private boolean updateIsDisplay;
	private boolean updateIsEnable;
	private boolean updateIsActivation;
	private boolean updateIsDel;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：BasicInfoId
	 */
	public SysBasicInfoQueryVo selectBasicInfoId() {
		selectFields.add("basic_info_id");
		return this;
	}

	/**
	 * 设置查询字段：BasicInfoName
	 */
	public SysBasicInfoQueryVo selectBasicInfoName() {
		selectFields.add("basic_info_name");
		return this;
	}

	/**
	 * 设置查询字段：BasicInfoValue
	 */
	public SysBasicInfoQueryVo selectBasicInfoValue() {
		selectFields.add("basic_info_value");
		return this;
	}

	/**
	 * 设置查询字段：BasicInfoType
	 */
	public SysBasicInfoQueryVo selectBasicInfoType() {
		selectFields.add("basic_info_type");
		return this;
	}

	/**
	 * 设置查询字段：BasicInfoTag
	 */
	public SysBasicInfoQueryVo selectBasicInfoTag() {
		selectFields.add("basic_info_tag");
		return this;
	}

	/**
	 * 设置查询字段：BasicInfoDescription
	 */
	public SysBasicInfoQueryVo selectBasicInfoDescription() {
		selectFields.add("basic_info_description");
		return this;
	}

	/**
	 * 设置查询字段：BasicInfoRemark
	 */
	public SysBasicInfoQueryVo selectBasicInfoRemark() {
		selectFields.add("basic_info_remark");
		return this;
	}

	/**
	 * 设置查询字段：IsDisplay
	 */
	public SysBasicInfoQueryVo selectIsDisplay() {
		selectFields.add("is_display");
		return this;
	}

	/**
	 * 设置查询字段：IsEnable
	 */
	public SysBasicInfoQueryVo selectIsEnable() {
		selectFields.add("is_enable");
		return this;
	}

	/**
	 * 设置查询字段：IsActivation
	 */
	public SysBasicInfoQueryVo selectIsActivation() {
		selectFields.add("is_activation");
		return this;
	}

	/**
	 * 设置查询字段：IsDel
	 */
	public SysBasicInfoQueryVo selectIsDel() {
		selectFields.add("is_del");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：BasicInfoId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysBasicInfoQueryVo orderbyBasicInfoId(boolean isAsc) {
		orderFields.add(new OrderField("basic_info_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：BasicInfoName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysBasicInfoQueryVo orderbyBasicInfoName(boolean isAsc) {
		orderFields.add(new OrderField("basic_info_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：BasicInfoValue
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysBasicInfoQueryVo orderbyBasicInfoValue(boolean isAsc) {
		orderFields.add(new OrderField("basic_info_value", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：BasicInfoType
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysBasicInfoQueryVo orderbyBasicInfoType(boolean isAsc) {
		orderFields.add(new OrderField("basic_info_type", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：BasicInfoTag
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysBasicInfoQueryVo orderbyBasicInfoTag(boolean isAsc) {
		orderFields.add(new OrderField("basic_info_tag", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：BasicInfoDescription
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysBasicInfoQueryVo orderbyBasicInfoDescription(boolean isAsc) {
		orderFields.add(new OrderField("basic_info_description", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：BasicInfoRemark
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysBasicInfoQueryVo orderbyBasicInfoRemark(boolean isAsc) {
		orderFields.add(new OrderField("basic_info_remark", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDisplay
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysBasicInfoQueryVo orderbyIsDisplay(boolean isAsc) {
		orderFields.add(new OrderField("is_display", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsEnable
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysBasicInfoQueryVo orderbyIsEnable(boolean isAsc) {
		orderFields.add(new OrderField("is_enable", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsActivation
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysBasicInfoQueryVo orderbyIsActivation(boolean isAsc) {
		orderFields.add(new OrderField("is_activation", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDel
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysBasicInfoQueryVo orderbyIsDel(boolean isAsc) {
		orderFields.add(new OrderField("is_del", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return sysBasicInfoCustom
	 */
	public SysBasicInfoCustom getSysBasicInfoCustom() {
		return sysBasicInfoCustom;
	}

	/**
	 * @param sysBasicInfoCustom
	 *            要设置的 sysBasicInfoCustom
	 */
	public void setSysBasicInfoCustom(SysBasicInfoCustom sysBasicInfoCustom) {
		this.sysBasicInfoCustom = sysBasicInfoCustom;
	}

	/**
	 * @return basicInfoNameLike
	 */
	public Boolean isBasicInfoNameLike() {
		return basicInfoNameLike;
	}

	/**
	 * @param basicInfoNameLike
	 *            要设置的basicInfoNameLike
	 */
	public void setBasicInfoNameLike(boolean basicInfoNameLike) {
		this.basicInfoNameLike = basicInfoNameLike;
	}

	/**
	 * @return basicInfoValueLike
	 */
	public Boolean isBasicInfoValueLike() {
		return basicInfoValueLike;
	}

	/**
	 * @param basicInfoValueLike
	 *            要设置的basicInfoValueLike
	 */
	public void setBasicInfoValueLike(boolean basicInfoValueLike) {
		this.basicInfoValueLike = basicInfoValueLike;
	}

	/**
	 * @return basicInfoTagLike
	 */
	public Boolean isBasicInfoTagLike() {
		return basicInfoTagLike;
	}

	/**
	 * @param basicInfoTagLike
	 *            要设置的basicInfoTagLike
	 */
	public void setBasicInfoTagLike(boolean basicInfoTagLike) {
		this.basicInfoTagLike = basicInfoTagLike;
	}

	/**
	 * @return basicInfoDescriptionLike
	 */
	public Boolean isBasicInfoDescriptionLike() {
		return basicInfoDescriptionLike;
	}

	/**
	 * @param basicInfoDescriptionLike
	 *            要设置的basicInfoDescriptionLike
	 */
	public void setBasicInfoDescriptionLike(boolean basicInfoDescriptionLike) {
		this.basicInfoDescriptionLike = basicInfoDescriptionLike;
	}

	/**
	 * @return basicInfoRemarkLike
	 */
	public Boolean isBasicInfoRemarkLike() {
		return basicInfoRemarkLike;
	}

	/**
	 * @param basicInfoRemarkLike
	 *            要设置的basicInfoRemarkLike
	 */
	public void setBasicInfoRemarkLike(boolean basicInfoRemarkLike) {
		this.basicInfoRemarkLike = basicInfoRemarkLike;
	}

	/**
	 * @return basicInfoIdStart
	 */
	public Integer getBasicInfoIdStart() {
		return basicInfoIdStart;
	}

	/**
	 * @param basicInfoIdStart
	 *            要设置的basicInfoIdStart
	 */
	public void setBasicInfoIdStart(Integer basicInfoIdStart) {
		this.basicInfoIdStart = basicInfoIdStart;
	}

	/**
	 * @return basicInfoIdEnd
	 */
	public Integer getBasicInfoIdEnd() {
		return basicInfoIdEnd;
	}

	/**
	 * @param basicInfoIdEnd
	 *            要设置的basicInfoIdEnd
	 */
	public void setBasicInfoIdEnd(Integer basicInfoIdEnd) {
		this.basicInfoIdEnd = basicInfoIdEnd;
	}

	/**
	 * @return basicInfoTypeStart
	 */
	public Integer getBasicInfoTypeStart() {
		return basicInfoTypeStart;
	}

	/**
	 * @param basicInfoTypeStart
	 *            要设置的basicInfoTypeStart
	 */
	public void setBasicInfoTypeStart(Integer basicInfoTypeStart) {
		this.basicInfoTypeStart = basicInfoTypeStart;
	}

	/**
	 * @return basicInfoTypeEnd
	 */
	public Integer getBasicInfoTypeEnd() {
		return basicInfoTypeEnd;
	}

	/**
	 * @param basicInfoTypeEnd
	 *            要设置的basicInfoTypeEnd
	 */
	public void setBasicInfoTypeEnd(Integer basicInfoTypeEnd) {
		this.basicInfoTypeEnd = basicInfoTypeEnd;
	}

	/**
	 * @return basicInfoIdList
	 */
	public List<Integer> getBasicInfoIdList() {
		return basicInfoIdList;
	}

	/**
	 * @param basicInfoIdList
	 *            要设置的basicInfoIdList
	 */
	public void setBasicInfoIdList(List<Integer> basicInfoIdList) {
		this.basicInfoIdList = basicInfoIdList;
	}

	/**
	 * @return updateBasicInfoName
	 */
	public Boolean isUpdateBasicInfoName() {
		return updateBasicInfoName;
	}

	/**
	 * @param updateBasicInfoName
	 *            要设置的updateBasicInfoName
	 */
	public void setUpdateBasicInfoName(boolean updateBasicInfoName) {
		this.updateBasicInfoName = updateBasicInfoName;
	}

	/**
	 * @return updateBasicInfoValue
	 */
	public Boolean isUpdateBasicInfoValue() {
		return updateBasicInfoValue;
	}

	/**
	 * @param updateBasicInfoValue
	 *            要设置的updateBasicInfoValue
	 */
	public void setUpdateBasicInfoValue(boolean updateBasicInfoValue) {
		this.updateBasicInfoValue = updateBasicInfoValue;
	}

	/**
	 * @return updateBasicInfoType
	 */
	public Boolean isUpdateBasicInfoType() {
		return updateBasicInfoType;
	}

	/**
	 * @param updateBasicInfoType
	 *            要设置的updateBasicInfoType
	 */
	public void setUpdateBasicInfoType(boolean updateBasicInfoType) {
		this.updateBasicInfoType = updateBasicInfoType;
	}

	/**
	 * @return updateBasicInfoTag
	 */
	public Boolean isUpdateBasicInfoTag() {
		return updateBasicInfoTag;
	}

	/**
	 * @param updateBasicInfoTag
	 *            要设置的updateBasicInfoTag
	 */
	public void setUpdateBasicInfoTag(boolean updateBasicInfoTag) {
		this.updateBasicInfoTag = updateBasicInfoTag;
	}

	/**
	 * @return updateBasicInfoDescription
	 */
	public Boolean isUpdateBasicInfoDescription() {
		return updateBasicInfoDescription;
	}

	/**
	 * @param updateBasicInfoDescription
	 *            要设置的updateBasicInfoDescription
	 */
	public void setUpdateBasicInfoDescription(boolean updateBasicInfoDescription) {
		this.updateBasicInfoDescription = updateBasicInfoDescription;
	}

	/**
	 * @return updateBasicInfoRemark
	 */
	public Boolean isUpdateBasicInfoRemark() {
		return updateBasicInfoRemark;
	}

	/**
	 * @param updateBasicInfoRemark
	 *            要设置的updateBasicInfoRemark
	 */
	public void setUpdateBasicInfoRemark(boolean updateBasicInfoRemark) {
		this.updateBasicInfoRemark = updateBasicInfoRemark;
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
