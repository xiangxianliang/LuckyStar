package com.gll.ls.core.pojo.system.po;

import java.io.Serializable;

public class SysDictType implements Serializable {
	/**
	 * 字典类型代码
	 */
	private Integer typeId;

	/**
	 * 字典类型名称
	 */
	private String typeName;

	/**
	 * 字典类型描述
	 */
	private String typeDescription;

	/**
	 * 备注
	 */
	private String typeRemark;

	/**
	 * 排序
	 */
	private Integer showorder;

	/**
	 * dictcode的字符长度
	 */
	private String codelength;

	/**
	 * 父类型的id
	 */
	private Integer parentId;

	/**
	 * 是否叶子节点：1：叶子节点；0：目录节点
	 */
	private Integer isSeaf;

	/**
	 * 是否可见：1：可见；0：不可见
	 */
	private Integer isDisplay;

	/**
	 * 是否启用：1：启用；0：未启用
	 */
	private Integer isEnable;

	/**
	 * 是否激活：1：激活；0：未激活
	 */
	private Integer isActivation;

	/**
	 * 是否删除：1：未删除；0：删除
	 */
	private Integer isDel;

	/**
	 * sys_dict_type
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 字典类型代码
	 * 
	 * @return type_id 字典类型代码
	 */
	public Integer getTypeId() {
		return typeId;
	}

	/**
	 * 字典类型代码
	 * 
	 * @param typeId
	 *            字典类型代码
	 */
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	/**
	 * 字典类型名称
	 * 
	 * @return type_name 字典类型名称
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * 字典类型名称
	 * 
	 * @param typeName
	 *            字典类型名称
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName == null ? null : typeName.trim();
	}

	/**
	 * 字典类型描述
	 * 
	 * @return type_description 字典类型描述
	 */
	public String getTypeDescription() {
		return typeDescription;
	}

	/**
	 * 字典类型描述
	 * 
	 * @param typeDescription
	 *            字典类型描述
	 */
	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription == null ? null : typeDescription.trim();
	}

	/**
	 * 备注
	 * 
	 * @return type_remark 备注
	 */
	public String getTypeRemark() {
		return typeRemark;
	}

	/**
	 * 备注
	 * 
	 * @param typeRemark
	 *            备注
	 */
	public void setTypeRemark(String typeRemark) {
		this.typeRemark = typeRemark == null ? null : typeRemark.trim();
	}

	/**
	 * 排序
	 * 
	 * @return showorder 排序
	 */
	public Integer getShoworder() {
		return showorder;
	}

	/**
	 * 排序
	 * 
	 * @param showorder
	 *            排序
	 */
	public void setShoworder(Integer showorder) {
		this.showorder = showorder;
	}

	/**
	 * dictcode的字符长度
	 * 
	 * @return codelength dictcode的字符长度
	 */
	public String getCodelength() {
		return codelength;
	}

	/**
	 * dictcode的字符长度
	 * 
	 * @param codelength
	 *            dictcode的字符长度
	 */
	public void setCodelength(String codelength) {
		this.codelength = codelength == null ? null : codelength.trim();
	}

	/**
	 * 父类型的id
	 * 
	 * @return parent_id 父类型的id
	 */
	public Integer getParentId() {
		return parentId;
	}

	/**
	 * 父类型的id
	 * 
	 * @param parentId
	 *            父类型的id
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
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
	 * 是否启用：1：启用；0：未启用
	 * 
	 * @return is_enable 是否启用：1：启用；0：未启用
	 */
	public Integer getIsEnable() {
		return isEnable;
	}

	/**
	 * 是否启用：1：启用；0：未启用
	 * 
	 * @param isEnable
	 *            是否启用：1：启用；0：未启用
	 */
	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

	/**
	 * 是否激活：1：激活；0：未激活
	 * 
	 * @return is_activation 是否激活：1：激活；0：未激活
	 */
	public Integer getIsActivation() {
		return isActivation;
	}

	/**
	 * 是否激活：1：激活；0：未激活
	 * 
	 * @param isActivation
	 *            是否激活：1：激活；0：未激活
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