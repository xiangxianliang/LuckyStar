package com.gll.ls.core.pojo.resource.po;

import java.io.Serializable;

public class ResType implements Serializable {
	/**
	 * ID
	 */
	private Integer typeId;

	/**
	 * 名称
	 */
	private String typeName;

	/**
	 * 拼音码
	 */
	private String typeNamePc;

	/**
	 * 描述
	 */
	private String typeDescription;

	/**
	 * 备注。
	 */
	private String typeRemark;

	/**
	 * 图标
	 */
	private String typeIcon;

	/**
	 * 排序字段
	 */
	private Integer showorder;

	/**
	 * 是否叶子节点：1：叶子节点；0：目录节点
	 */
	private Integer isSeaf;

	/**
	 * 父ID
	 */
	private Integer parentId;

	/**
	 * 是否可以选择（用于添加商品）：1可以选择 0不可以选择
	 */
	private Integer isSelect;

	/**
	 * 是否可见：1：可见；0：不可见
	 */
	private Integer isDisplay;

	/**
	 * 使用启用：1：启用；0：未启用
	 */
	private Integer isEnable;

	/**
	 * 是否可用：1：可用；0：不可用
	 */
	private Integer isActivation;

	/**
	 * 是否删除：1：未删除；0：删除
	 */
	private Integer isDel;

	/**
	 * res_type
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 * 
	 * @return type_id ID
	 */
	public Integer getTypeId() {
		return typeId;
	}

	/**
	 * ID
	 * 
	 * @param typeId
	 *            ID
	 */
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	/**
	 * 名称
	 * 
	 * @return type_name 名称
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * 名称
	 * 
	 * @param typeName
	 *            名称
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName == null ? null : typeName.trim();
	}

	/**
	 * 拼音码
	 * 
	 * @return type_name_pc 拼音码
	 */
	public String getTypeNamePc() {
		return typeNamePc;
	}

	/**
	 * 拼音码
	 * 
	 * @param typeNamePc
	 *            拼音码
	 */
	public void setTypeNamePc(String typeNamePc) {
		this.typeNamePc = typeNamePc == null ? null : typeNamePc.trim();
	}

	/**
	 * 描述
	 * 
	 * @return type_description 描述
	 */
	public String getTypeDescription() {
		return typeDescription;
	}

	/**
	 * 描述
	 * 
	 * @param typeDescription
	 *            描述
	 */
	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription == null ? null : typeDescription.trim();
	}

	/**
	 * 备注。
	 * 
	 * @return type_remark 备注。
	 */
	public String getTypeRemark() {
		return typeRemark;
	}

	/**
	 * 备注。
	 * 
	 * @param typeRemark
	 *            备注。
	 */
	public void setTypeRemark(String typeRemark) {
		this.typeRemark = typeRemark == null ? null : typeRemark.trim();
	}

	/**
	 * 图标
	 * 
	 * @return type_icon 图标
	 */
	public String getTypeIcon() {
		return typeIcon;
	}

	/**
	 * 图标
	 * 
	 * @param typeIcon
	 *            图标
	 */
	public void setTypeIcon(String typeIcon) {
		this.typeIcon = typeIcon == null ? null : typeIcon.trim();
	}

	/**
	 * 排序字段
	 * 
	 * @return showorder 排序字段
	 */
	public Integer getShoworder() {
		return showorder;
	}

	/**
	 * 排序字段
	 * 
	 * @param showorder
	 *            排序字段
	 */
	public void setShoworder(Integer showorder) {
		this.showorder = showorder;
	}

	/**
	 * 是否叶子节点：1：叶子节点；0：目录节点
	 * 
	 * @return is_seaf 是否叶子节点：1：叶子节点；0：目录节点
	 */
	public Integer getIsSeaf() {
		return isSeaf;
	}

	/**
	 * 是否叶子节点：1：叶子节点；0：目录节点
	 * 
	 * @param isSeaf
	 *            是否叶子节点：1：叶子节点；0：目录节点
	 */
	public void setIsSeaf(Integer isSeaf) {
		this.isSeaf = isSeaf;
	}

	/**
	 * 父ID
	 * 
	 * @return parent_id 父ID
	 */
	public Integer getParentId() {
		return parentId;
	}

	/**
	 * 父ID
	 * 
	 * @param parentId
	 *            父ID
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	/**
	 * 是否可以选择（用于添加商品）：1可以选择 0不可以选择
	 * 
	 * @return is_select 是否可以选择（用于添加商品）：1可以选择 0不可以选择
	 */
	public Integer getIsSelect() {
		return isSelect;
	}

	/**
	 * 是否可以选择（用于添加商品）：1可以选择 0不可以选择
	 * 
	 * @param isSelect
	 *            是否可以选择（用于添加商品）：1可以选择 0不可以选择
	 */
	public void setIsSelect(Integer isSelect) {
		this.isSelect = isSelect;
	}

	/**
	 * 是否可见：1：可见；0：不可见
	 * 
	 * @return is_display 是否可见：1：可见；0：不可见
	 */
	public Integer getIsDisplay() {
		return isDisplay;
	}

	/**
	 * 是否可见：1：可见；0：不可见
	 * 
	 * @param isDisplay
	 *            是否可见：1：可见；0：不可见
	 */
	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}

	/**
	 * 使用启用：1：启用；0：未启用
	 * 
	 * @return is_enable 使用启用：1：启用；0：未启用
	 */
	public Integer getIsEnable() {
		return isEnable;
	}

	/**
	 * 使用启用：1：启用；0：未启用
	 * 
	 * @param isEnable
	 *            使用启用：1：启用；0：未启用
	 */
	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

	/**
	 * 是否可用：1：可用；0：不可用
	 * 
	 * @return is_activation 是否可用：1：可用；0：不可用
	 */
	public Integer getIsActivation() {
		return isActivation;
	}

	/**
	 * 是否可用：1：可用；0：不可用
	 * 
	 * @param isActivation
	 *            是否可用：1：可用；0：不可用
	 */
	public void setIsActivation(Integer isActivation) {
		this.isActivation = isActivation;
	}

	/**
	 * 是否删除：1：未删除；0：删除
	 * 
	 * @return is_del 是否删除：1：未删除；0：删除
	 */
	public Integer getIsDel() {
		return isDel;
	}

	/**
	 * 是否删除：1：未删除；0：删除
	 * 
	 * @param isDel
	 *            是否删除：1：未删除；0：删除
	 */
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
}