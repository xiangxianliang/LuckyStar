package com.gll.ls.core.pojo.system.vo;

import java.util.List;

import com.gll.ls.core.pojo.BaseQuery;

public class SysDictTypeQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private SysDictTypeCustom sysDictTypeCustom;

	// where 条件
	private boolean typeNameLike;
	private boolean typeDescriptionLike;
	private boolean typeRemarkLike;
	private boolean codelengthLike;
	private Integer typeIdStart;
	private Integer typeIdEnd;
	private Integer parentIdStart;
	private Integer parentIdEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> typeIdList;

	// update快照更新 字段
	private boolean updateTypeName;
	private boolean updateTypeDescription;
	private boolean updateTypeRemark;
	private boolean updateShoworder;
	private boolean updateCodelength;
	private boolean updateParentId;
	private boolean updateIsSeaf;
	private boolean updateIsDisplay;
	private boolean updateIsEnable;
	private boolean updateIsActivation;
	private boolean updateIsDel;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：TypeId
	 */
	public SysDictTypeQueryVo selectTypeId() {
		selectFields.add("type_id");
		return this;
	}

	/**
	 * 设置查询字段：TypeName
	 */
	public SysDictTypeQueryVo selectTypeName() {
		selectFields.add("type_name");
		return this;
	}

	/**
	 * 设置查询字段：TypeDescription
	 */
	public SysDictTypeQueryVo selectTypeDescription() {
		selectFields.add("type_description");
		return this;
	}

	/**
	 * 设置查询字段：TypeRemark
	 */
	public SysDictTypeQueryVo selectTypeRemark() {
		selectFields.add("type_remark");
		return this;
	}

	/**
	 * 设置查询字段：Showorder
	 */
	public SysDictTypeQueryVo selectShoworder() {
		selectFields.add("showorder");
		return this;
	}

	/**
	 * 设置查询字段：Codelength
	 */
	public SysDictTypeQueryVo selectCodelength() {
		selectFields.add("codelength");
		return this;
	}

	/**
	 * 设置查询字段：ParentId
	 */
	public SysDictTypeQueryVo selectParentId() {
		selectFields.add("parent_id");
		return this;
	}

	/**
	 * 设置查询字段：IsSeaf
	 */
	public SysDictTypeQueryVo selectIsSeaf() {
		selectFields.add("is_seaf");
		return this;
	}

	/**
	 * 设置查询字段：IsDisplay
	 */
	public SysDictTypeQueryVo selectIsDisplay() {
		selectFields.add("is_display");
		return this;
	}

	/**
	 * 设置查询字段：IsEnable
	 */
	public SysDictTypeQueryVo selectIsEnable() {
		selectFields.add("is_enable");
		return this;
	}

	/**
	 * 设置查询字段：IsActivation
	 */
	public SysDictTypeQueryVo selectIsActivation() {
		selectFields.add("is_activation");
		return this;
	}

	/**
	 * 设置查询字段：IsDel
	 */
	public SysDictTypeQueryVo selectIsDel() {
		selectFields.add("is_del");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：TypeId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyTypeId(boolean isAsc) {
		orderFields.add(new OrderField("type_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：TypeName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyTypeName(boolean isAsc) {
		orderFields.add(new OrderField("type_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：TypeDescription
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyTypeDescription(boolean isAsc) {
		orderFields.add(new OrderField("type_description", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：TypeRemark
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyTypeRemark(boolean isAsc) {
		orderFields.add(new OrderField("type_remark", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Showorder
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyShoworder(boolean isAsc) {
		orderFields.add(new OrderField("showorder", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Codelength
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyCodelength(boolean isAsc) {
		orderFields.add(new OrderField("codelength", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ParentId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyParentId(boolean isAsc) {
		orderFields.add(new OrderField("parent_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsSeaf
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyIsSeaf(boolean isAsc) {
		orderFields.add(new OrderField("is_seaf", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDisplay
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyIsDisplay(boolean isAsc) {
		orderFields.add(new OrderField("is_display", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsEnable
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyIsEnable(boolean isAsc) {
		orderFields.add(new OrderField("is_enable", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsActivation
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyIsActivation(boolean isAsc) {
		orderFields.add(new OrderField("is_activation", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDel
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public SysDictTypeQueryVo orderbyIsDel(boolean isAsc) {
		orderFields.add(new OrderField("is_del", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return sysDictTypeCustom
	 */
	public SysDictTypeCustom getSysDictTypeCustom() {
		return sysDictTypeCustom;
	}

	/**
	 * @param sysDictTypeCustom
	 *            要设置的 sysDictTypeCustom
	 */
	public void setSysDictTypeCustom(SysDictTypeCustom sysDictTypeCustom) {
		this.sysDictTypeCustom = sysDictTypeCustom;
	}

	/**
	 * @return typeNameLike
	 */
	public Boolean isTypeNameLike() {
		return typeNameLike;
	}

	/**
	 * @param typeNameLike
	 *            要设置的typeNameLike
	 */
	public void setTypeNameLike(boolean typeNameLike) {
		this.typeNameLike = typeNameLike;
	}

	/**
	 * @return typeDescriptionLike
	 */
	public Boolean isTypeDescriptionLike() {
		return typeDescriptionLike;
	}

	/**
	 * @param typeDescriptionLike
	 *            要设置的typeDescriptionLike
	 */
	public void setTypeDescriptionLike(boolean typeDescriptionLike) {
		this.typeDescriptionLike = typeDescriptionLike;
	}

	/**
	 * @return typeRemarkLike
	 */
	public Boolean isTypeRemarkLike() {
		return typeRemarkLike;
	}

	/**
	 * @param typeRemarkLike
	 *            要设置的typeRemarkLike
	 */
	public void setTypeRemarkLike(boolean typeRemarkLike) {
		this.typeRemarkLike = typeRemarkLike;
	}

	/**
	 * @return codelengthLike
	 */
	public Boolean isCodelengthLike() {
		return codelengthLike;
	}

	/**
	 * @param codelengthLike
	 *            要设置的codelengthLike
	 */
	public void setCodelengthLike(boolean codelengthLike) {
		this.codelengthLike = codelengthLike;
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
	 * @return typeIdList
	 */
	public List<Integer> getTypeIdList() {
		return typeIdList;
	}

	/**
	 * @param typeIdList
	 *            要设置的typeIdList
	 */
	public void setTypeIdList(List<Integer> typeIdList) {
		this.typeIdList = typeIdList;
	}

	/**
	 * @return updateTypeName
	 */
	public Boolean isUpdateTypeName() {
		return updateTypeName;
	}

	/**
	 * @param updateTypeName
	 *            要设置的updateTypeName
	 */
	public void setUpdateTypeName(boolean updateTypeName) {
		this.updateTypeName = updateTypeName;
	}

	/**
	 * @return updateTypeDescription
	 */
	public Boolean isUpdateTypeDescription() {
		return updateTypeDescription;
	}

	/**
	 * @param updateTypeDescription
	 *            要设置的updateTypeDescription
	 */
	public void setUpdateTypeDescription(boolean updateTypeDescription) {
		this.updateTypeDescription = updateTypeDescription;
	}

	/**
	 * @return updateTypeRemark
	 */
	public Boolean isUpdateTypeRemark() {
		return updateTypeRemark;
	}

	/**
	 * @param updateTypeRemark
	 *            要设置的updateTypeRemark
	 */
	public void setUpdateTypeRemark(boolean updateTypeRemark) {
		this.updateTypeRemark = updateTypeRemark;
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
	 * @return updateCodelength
	 */
	public Boolean isUpdateCodelength() {
		return updateCodelength;
	}

	/**
	 * @param updateCodelength
	 *            要设置的updateCodelength
	 */
	public void setUpdateCodelength(boolean updateCodelength) {
		this.updateCodelength = updateCodelength;
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
