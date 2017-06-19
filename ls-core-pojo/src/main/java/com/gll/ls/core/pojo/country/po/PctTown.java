package com.gll.ls.core.pojo.country.po;

import java.io.Serializable;

public class PctTown implements Serializable {
	/**
	 * 区县编码
	 */
	private String townCode;

	/**
	 * 区县名称
	 */
	private String townName;

	/**
	 * 所属城市编码
	 */
	private String cityCode;

	/**
	 * pct_town
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 区县编码
	 * 
	 * @return town_code 区县编码
	 */
	public String getTownCode() {
		return townCode;
	}

	/**
	 * 区县编码
	 * 
	 * @param townCode
	 *            区县编码
	 */
	public void setTownCode(String townCode) {
		this.townCode = townCode == null ? null : townCode.trim();
	}

	/**
	 * 区县名称
	 * 
	 * @return town_name 区县名称
	 */
	public String getTownName() {
		return townName;
	}

	/**
	 * 区县名称
	 * 
	 * @param townName
	 *            区县名称
	 */
	public void setTownName(String townName) {
		this.townName = townName == null ? null : townName.trim();
	}

	/**
	 * 所属城市编码
	 * 
	 * @return city_code 所属城市编码
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * 所属城市编码
	 * 
	 * @param cityCode
	 *            所属城市编码
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode == null ? null : cityCode.trim();
	}
}