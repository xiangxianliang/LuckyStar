package com.gll.ls.core.pojo.system.vo;

import com.gll.ls.core.pojo.system.po.SysDictInfo;

/**
 * 数据字典
 * 
 * @author XL
 * @Date 2017年4月28日 下午9:42:36
 */
public class SysDictInfoCustom extends SysDictInfo {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 是否可用,1：可用，0不可用
	 * 
	 * @return
	 */
	public String getIsEnableName() {
		if (null != this.getIsEnable()) {
			switch (this.getIsEnable()) {
			case 0:
				return "禁用";
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
	 * 值类型（1：业务字段；0字典字段）
	 * 
	 * @return
	 */
	public String getValueTypeName() {
		if (null != this.getValueType()) {
			switch (this.getValueType()) {
			case 0:
				return "字典字段";
			case 1:
				return "业务字段";
			default:
				return "";
			}
		} else {
			return "";
		}
	}

}
