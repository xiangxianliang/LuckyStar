package com.gll.ls.core.pojo.country.po;

import java.io.Serializable;

public class PctProvince implements Serializable {
	/**
	 * 省份编码
	 */
	private String provinceCode;

	/**
	 * 省份名称
	 */
	private String provinceName;

	/**
	 * pct_province
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 省份编码
	 * 
	 * @return province_code 省份编码
	 */
	public String getProvinceCode() {
		return provinceCode;
	}

	/**
	 * 省份编码
	 * 
	 * @param provinceCode
	 *            省份编码
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode == null ? null : provinceCode.trim();
	}

	/**
	 * 省份名称
	 * 
	 * @return province_name 省份名称
	 */
	public String getProvinceName() {
		return provinceName;
	}

	/**
	 * 省份名称
	 * 
	 * @param provinceName
	 *            省份名称
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName == null ? null : provinceName.trim();
	}
}