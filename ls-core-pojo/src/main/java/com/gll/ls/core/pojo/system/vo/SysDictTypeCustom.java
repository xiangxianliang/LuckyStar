package com.gll.ls.core.pojo.system.vo;

import com.gll.ls.core.pojo.system.po.SysDictType;

/**
 * 数据字典
 * 
 * @author XL
 * @Date 2017年4月28日 下午9:43:26
 */
public class SysDictTypeCustom extends SysDictType {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

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

}
