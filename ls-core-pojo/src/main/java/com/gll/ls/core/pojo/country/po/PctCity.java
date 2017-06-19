package com.gll.ls.core.pojo.country.po;

import java.io.Serializable;

public class PctCity implements Serializable {
	/**
	 * 城市编码
	 */
	private String cityCode;

	/**
	 * 城市名称
	 */
	private String cityName;

	/**
	 * 所属省份编码
	 */
	private String provinceCode;

	/**
	 * pct_city
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 城市编码
	 * 
	 * @return city_code 城市编码
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * 城市编码
	 * 
	 * @param cityCode
	 *            城市编码
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode == null ? null : cityCode.trim();
	}

	/**
	 * 城市名称
	 * 
	 * @return city_name 城市名称
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * 城市名称
	 * 
	 * @param cityName
	 *            城市名称
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName == null ? null : cityName.trim();
	}

	/**
	 * 所属省份编码
	 * 
	 * @return province_code 所属省份编码
	 */
	public String getProvinceCode() {
		return provinceCode;
	}

	/**
	 * 所属省份编码
	 * 
	 * @param provinceCode
	 *            所属省份编码
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode == null ? null : provinceCode.trim();
	}
}