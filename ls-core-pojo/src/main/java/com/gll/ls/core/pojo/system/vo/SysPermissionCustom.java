package com.gll.ls.core.pojo.system.vo;

import com.gll.ls.core.pojo.system.po.SysPermission;

/**
 * 系统权限
 * 
 * @author XL
 * @Date 2017年4月23日 下午12:12:02
 */
public class SysPermissionCustom extends SysPermission {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	private String parentModuleName;

	private SysModuleCustom sysModuleCustom;

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
				return "不可用";
			case 1:
				return "可用";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

	// ================= get * set ========================

	/**
	 * @return parentModuleName
	 */
	public String getParentModuleName() {
		return parentModuleName;
	}

	/**
	 * @param parentModuleName
	 *            要设置的 parentModuleName
	 */
	public void setParentModuleName(String parentModuleName) {
		this.parentModuleName = parentModuleName;
	}

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

}