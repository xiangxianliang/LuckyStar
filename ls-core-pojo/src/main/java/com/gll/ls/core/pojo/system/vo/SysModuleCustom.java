package com.gll.ls.core.pojo.system.vo;

import com.gll.ls.core.pojo.system.po.SysModule;

/**
 * 
 * @author XL
 * @Date 2017年4月23日 下午12:06:26
 */
public class SysModuleCustom extends SysModule {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	private String parentName;// 父名字

	/**
	 * 是否可用,1：可用，0不可用
	 * 
	 * @return
	 */
	public String getIsSeafName() {
		if (null != this.getIsSeaf()) {
			switch (this.getIsSeaf()) {
			case 0:
				return "目录节点";
			case 1:
				return "叶子节点";
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
				return "不可见";
			case 1:
				return "可见";
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
				return "未启用";
			case 1:
				return "启用";
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

	// ================= get * set ========================

	/**
	 * @return parentName
	 */
	public String getParentName() {
		return parentName;
	}

	/**
	 * @param parentName
	 *            要设置的 parentName
	 */
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

}
