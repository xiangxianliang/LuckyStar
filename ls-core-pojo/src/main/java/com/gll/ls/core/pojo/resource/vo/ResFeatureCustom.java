package com.gll.ls.core.pojo.resource.vo;

import java.util.List;

import com.gll.ls.core.pojo.resource.po.ResFeature;

public class ResFeatureCustom extends ResFeature {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 属性所属的类型
	private String typeName;

	private List<ResFeatureValueCustom> resFeatureValueCustomList;

	// 特殊字段处理============================================

	/**
	 * 是否为规格：0:否;1:是
	 */
	public String getIsSpecName() {
		if (null != this.getIsSpec()) {
			switch (this.getIsSpec()) {
			case 0:
				return "否";
			case 1:
				return "是";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * 是否为筛选：0:否;1:是
	 */
	public String getIsSelectName() {
		if (null != this.getIsSelect()) {
			switch (this.getIsSelect()) {
			case 0:
				return "否";
			case 1:
				return "是";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * 是否前台显示：0:否;1:是
	 */
	public String getIsShowName() {
		if (null != this.getIsShow()) {
			switch (this.getIsShow()) {
			case 0:
				return "否";
			case 1:
				return "是";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * 录入方式：1.树状菜单，2.单选，3.复选，4.文本框
	 */
	public String getInputTypeName() {
		if (null != this.getInputType()) {
			switch (this.getInputType()) {
			case 1:
				return "树状菜单";
			case 2:
				return "单选";
			case 3:
				return "复选";
			case 4:
				return "文本框";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * 是否可见：1：可见；0：不可见
	 * 
	 * @return
	 */
	public String getIsDisplayName() {
		if (null != this.getIsDisplay()) {
			switch (this.getIsDisplay()) {
			case 0:
				return "可见";
			case 1:
				return "不可见";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * 是否启用：1：启用；0：未启用
	 * 
	 * @return
	 */
	public String getIsEnableName() {
		if (null != this.getIsEnable()) {
			switch (this.getIsEnable()) {
			case 0:
				return "启用";
			case 1:
				return "未启用";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * 是否激活：1：激活；0：未激活
	 * 
	 * @return
	 */
	public String getIsActivationName() {
		if (null != this.getIsActivation()) {
			switch (this.getIsActivation()) {
			case 0:
				return "未激活";
			case 1:
				return "激活";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	// ============= get * set ==============================

	/**
	 * @return typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName
	 *            要设置的 typeName
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * @return resFeatureValueCustomList
	 */
	public List<ResFeatureValueCustom> getResFeatureValueCustomList() {
		return resFeatureValueCustomList;
	}

	/**
	 * @param resFeatureValueCustomList
	 *            要设置的 resFeatureValueCustomList
	 */
	public void setResFeatureValueCustomList(List<ResFeatureValueCustom> resFeatureValueCustomList) {
		this.resFeatureValueCustomList = resFeatureValueCustomList;
	}

}
