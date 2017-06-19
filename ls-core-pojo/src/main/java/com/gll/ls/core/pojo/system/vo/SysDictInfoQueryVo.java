package com.gll.ls.core.pojo.system.vo;

import java.util.Date;
import java.util.List;

import com.gll.ls.core.pojo.BaseQuery;

public class SysDictInfoQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private SysDictInfoCustom sysDictInfoCustom;

	// where 条件
	private boolean infoValueLike;
	private boolean infoDescriptionLike;
	private boolean infoRemarkLike;
	private Integer infoIdStart;
	private Integer infoIdEnd;
	private Integer typeIdStart;
	private Integer typeIdEnd;
	private Date updatetimeStart;
	private Date updatetimeEnd;
	private Integer valueTypeStart;
	private Integer valueTypeEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> infoIdList;

	// update快照更新 字段
	private boolean updateTypeId;
	private boolean updateInfoValue;
	private boolean updateInfoDescription;
	private boolean updateInfoRemark;
	private boolean updateUpdatetime;
	private boolean updateValueType;
	private boolean updateShoworder;
	private boolean updateIsDisplay;
	private boolean updateIsEnable;
	private boolean updateIsActivation;
	private boolean updateIsDel;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：InfoId
	 */
	public SysDictInfoQueryVo selectInfoId() {
		selectFields.add("info_id");
		return this;
	}

	/**
	 * 设置查询字段：TypeId
	 */
	public SysDictInfoQueryVo selectTypeId() {
		selectFields.add("type_id");
		return this;
	}

	/**
	 * 设置查询字段：InfoValue
	 */
	public SysDictInfoQueryVo selectInfoValue() {
		selectFields.add("info_value");
		return this;
	}

	/**
	 * 设置查询字段：InfoDescription
	 */
	public SysDictInfoQueryVo selectInfoDescription() {
		selectFields.add("info_description");
		return this;
	}

	/**
	 * 设置查询字段：InfoRemark
	 */
	public SysDictInfoQueryVo selectInfoRemark() {
		selectFields.add("info_remark");
		return this;
	}

	/**
	 * 设置查询字段：Updatetime
	 */
	public SysDictInfoQueryVo selectUpdatetime() {
		selectFields.add("updatetime");
		return this;
	}

	/**
	 * 设置查询字段：ValueType
	 */
	public SysDictInfoQueryVo selectValueType() {
		selectFields.add("value_type");
		return this;
	}

	/**
	 * 设置查询字段：Showorder
	 */
	public SysDictInfoQueryVo selectShoworder() {
		selectFields.add("showorder");
		return this;
	}

	/**
	 * 设置查询字段：IsDisplay
	 */
	public SysDictInfoQueryVo selectIsDisplay() {
		selectFields.add("is_display");
		return this;
	}

	/**
	 * 设置查询字段：IsEnable
	 */
	public SysDictInfoQueryVo selectIsEnable() {
		selectFields.add("is_enable");
		return this;
	}

	/**
	 * 设置查询字段：IsActivation
	 */
	public SysDictInfoQueryVo selectIsActivation() {
		selectFields.add("is_activation");
		return this;
	}

	/**
	 * 设置查询字段：IsDel
	 */
	public SysDictInfoQueryVo selectIsDel() {
		selectFields.add("is_del");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：InfoId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyInfoId(boolean isAsc) {
		orderFields.add(new OrderField("info_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：TypeId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyTypeId(boolean isAsc) {
		orderFields.add(new OrderField("type_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：InfoValue
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyInfoValue(boolean isAsc) {
		orderFields.add(new OrderField("info_value", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：InfoDescription
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyInfoDescription(boolean isAsc) {
		orderFields.add(new OrderField("info_description", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：InfoRemark
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyInfoRemark(boolean isAsc) {
		orderFields.add(new OrderField("info_remark", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Updatetime
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyUpdatetime(boolean isAsc) {
		orderFields.add(new OrderField("updatetime", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ValueType
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyValueType(boolean isAsc) {
		orderFields.add(new OrderField("value_type", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Showorder
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyShoworder(boolean isAsc) {
		orderFields.add(new OrderField("showorder", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDisplay
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyIsDisplay(boolean isAsc) {
		orderFields.add(new OrderField("is_display", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsEnable
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyIsEnable(boolean isAsc) {
		orderFields.add(new OrderField("is_enable", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsActivation
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyIsActivation(boolean isAsc) {
		orderFields.add(new OrderField("is_activation", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDel
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictInfoQueryVo orderbyIsDel(boolean isAsc) {
		orderFields.add(new OrderField("is_del", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return sysDictInfoCustom
	 */
	public SysDictInfoCustom getSysDictInfoCustom() {
		return sysDictInfoCustom;
	}

	/**
	 * @param sysDictInfoCustom
	 *            要设置的 sysDictInfoCustom
	 */
	public void setSysDictInfoCustom(SysDictInfoCustom sysDictInfoCustom) {
		this.sysDictInfoCustom = sysDictInfoCustom;
	}

	/**
	 * @return infoValueLike
	 */
	public Boolean isInfoValueLike() {
		return infoValueLike;
	}

	/**
	 * @param infoValueLike
	 *            要设置的infoValueLike
	 */
	public void setInfoValueLike(boolean infoValueLike) {
		this.infoValueLike = infoValueLike;
	}

	/**
	 * @return infoDescriptionLike
	 */
	public Boolean isInfoDescriptionLike() {
		return infoDescriptionLike;
	}

	/**
	 * @param infoDescriptionLike
	 *            要设置的infoDescriptionLike
	 */
	public void setInfoDescriptionLike(boolean infoDescriptionLike) {
		this.infoDescriptionLike = infoDescriptionLike;
	}

	/**
	 * @return infoRemarkLike
	 */
	public Boolean isInfoRemarkLike() {
		return infoRemarkLike;
	}

	/**
	 * @param infoRemarkLike
	 *            要设置的infoRemarkLike
	 */
	public void setInfoRemarkLike(boolean infoRemarkLike) {
		this.infoRemarkLike = infoRemarkLike;
	}

	/**
	 * @return infoIdStart
	 */
	public Integer getInfoIdStart() {
		return infoIdStart;
	}

	/**
	 * @param infoIdStart
	 *            要设置的infoIdStart
	 */
	public void setInfoIdStart(Integer infoIdStart) {
		this.infoIdStart = infoIdStart;
	}

	/**
	 * @return infoIdEnd
	 */
	public Integer getInfoIdEnd() {
		return infoIdEnd;
	}

	/**
	 * @param infoIdEnd
	 *            要设置的infoIdEnd
	 */
	public void setInfoIdEnd(Integer infoIdEnd) {
		this.infoIdEnd = infoIdEnd;
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
	 * @return updatetimeStart
	 */
	public Date getUpdatetimeStart() {
		return updatetimeStart;
	}

	/**
	 * @param updatetimeStart
	 *            要设置的updatetimeStart
	 */
	public void setUpdatetimeStart(Date updatetimeStart) {
		this.updatetimeStart = updatetimeStart;
	}

	/**
	 * @return updatetimeEnd
	 */
	public Date getUpdatetimeEnd() {
		return updatetimeEnd;
	}

	/**
	 * @param updatetimeEnd
	 *            要设置的updatetimeEnd
	 */
	public void setUpdatetimeEnd(Date updatetimeEnd) {
		this.updatetimeEnd = updatetimeEnd;
	}

	/**
	 * @return valueTypeStart
	 */
	public Integer getValueTypeStart() {
		return valueTypeStart;
	}

	/**
	 * @param valueTypeStart
	 *            要设置的valueTypeStart
	 */
	public void setValueTypeStart(Integer valueTypeStart) {
		this.valueTypeStart = valueTypeStart;
	}

	/**
	 * @return valueTypeEnd
	 */
	public Integer getValueTypeEnd() {
		return valueTypeEnd;
	}

	/**
	 * @param valueTypeEnd
	 *            要设置的valueTypeEnd
	 */
	public void setValueTypeEnd(Integer valueTypeEnd) {
		this.valueTypeEnd = valueTypeEnd;
	}

	/**
	 * @return infoIdList
	 */
	public List<Integer> getInfoIdList() {
		return infoIdList;
	}

	/**
	 * @param infoIdList
	 *            要设置的infoIdList
	 */
	public void setInfoIdList(List<Integer> infoIdList) {
		this.infoIdList = infoIdList;
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
	 * @return updateInfoValue
	 */
	public Boolean isUpdateInfoValue() {
		return updateInfoValue;
	}

	/**
	 * @param updateInfoValue
	 *            要设置的updateInfoValue
	 */
	public void setUpdateInfoValue(boolean updateInfoValue) {
		this.updateInfoValue = updateInfoValue;
	}

	/**
	 * @return updateInfoDescription
	 */
	public Boolean isUpdateInfoDescription() {
		return updateInfoDescription;
	}

	/**
	 * @param updateInfoDescription
	 *            要设置的updateInfoDescription
	 */
	public void setUpdateInfoDescription(boolean updateInfoDescription) {
		this.updateInfoDescription = updateInfoDescription;
	}

	/**
	 * @return updateInfoRemark
	 */
	public Boolean isUpdateInfoRemark() {
		return updateInfoRemark;
	}

	/**
	 * @param updateInfoRemark
	 *            要设置的updateInfoRemark
	 */
	public void setUpdateInfoRemark(boolean updateInfoRemark) {
		this.updateInfoRemark = updateInfoRemark;
	}

	/**
	 * @return updateUpdatetime
	 */
	public Boolean isUpdateUpdatetime() {
		return updateUpdatetime;
	}

	/**
	 * @param updateUpdatetime
	 *            要设置的updateUpdatetime
	 */
	public void setUpdateUpdatetime(boolean updateUpdatetime) {
		this.updateUpdatetime = updateUpdatetime;
	}

	/**
	 * @return updateValueType
	 */
	public Boolean isUpdateValueType() {
		return updateValueType;
	}

	/**
	 * @param updateValueType
	 *            要设置的updateValueType
	 */
	public void setUpdateValueType(boolean updateValueType) {
		this.updateValueType = updateValueType;
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
