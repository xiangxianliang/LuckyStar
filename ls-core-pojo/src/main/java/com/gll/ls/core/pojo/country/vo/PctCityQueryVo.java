package com.gll.ls.core.pojo.country.vo;

import java.util.List;

import com.gll.ls.core.pojo.BaseQuery;

public class PctCityQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private PctCityCustom pctCityCustom;

	// where 条件
	private boolean cityNameLike;
	private boolean provinceCodeLike;

	// 根据 主键 批量查找 字段
	private List<Integer> cityCodeList;

	// update快照更新 字段
	private boolean updateCityName;
	private boolean updateProvinceCode;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：CityCode
	 */
	public PctCityQueryVo selectCityCode() {
		selectFields.add("city_code");
		return this;
	}

	/**
	 * 设置查询字段：CityName
	 */
	public PctCityQueryVo selectCityName() {
		selectFields.add("city_name");
		return this;
	}

	/**
	 * 设置查询字段：ProvinceCode
	 */
	public PctCityQueryVo selectProvinceCode() {
		selectFields.add("province_code");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：CityCode
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public PctCityQueryVo orderbyCityCode(boolean isAsc) {
		orderFields.add(new OrderField("city_code", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：CityName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public PctCityQueryVo orderbyCityName(boolean isAsc) {
		orderFields.add(new OrderField("city_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ProvinceCode
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public PctCityQueryVo orderbyProvinceCode(boolean isAsc) {
		orderFields.add(new OrderField("province_code", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return pctCityCustom
	 */
	public PctCityCustom getPctCityCustom() {
		return pctCityCustom;
	}

	/**
	 * @param pctCityCustom
	 *            要设置的 pctCityCustom
	 */
	public void setPctCityCustom(PctCityCustom pctCityCustom) {
		this.pctCityCustom = pctCityCustom;
	}

	/**
	 * @return cityNameLike
	 */
	public Boolean isCityNameLike() {
		return cityNameLike;
	}

	/**
	 * @param cityNameLike
	 *            要设置的cityNameLike
	 */
	public void setCityNameLike(boolean cityNameLike) {
		this.cityNameLike = cityNameLike;
	}

	/**
	 * @return provinceCodeLike
	 */
	public Boolean isProvinceCodeLike() {
		return provinceCodeLike;
	}

	/**
	 * @param provinceCodeLike
	 *            要设置的provinceCodeLike
	 */
	public void setProvinceCodeLike(boolean provinceCodeLike) {
		this.provinceCodeLike = provinceCodeLike;
	}

	/**
	 * @return cityCodeList
	 */
	public List<Integer> getCityCodeList() {
		return cityCodeList;
	}

	/**
	 * @param cityCodeList
	 *            要设置的cityCodeList
	 */
	public void setCityCodeList(List<Integer> cityCodeList) {
		this.cityCodeList = cityCodeList;
	}

	/**
	 * @return updateCityName
	 */
	public Boolean isUpdateCityName() {
		return updateCityName;
	}

	/**
	 * @param updateCityName
	 *            要设置的updateCityName
	 */
	public void setUpdateCityName(boolean updateCityName) {
		this.updateCityName = updateCityName;
	}

	/**
	 * @return updateProvinceCode
	 */
	public Boolean isUpdateProvinceCode() {
		return updateProvinceCode;
	}

	/**
	 * @param updateProvinceCode
	 *            要设置的updateProvinceCode
	 */
	public void setUpdateProvinceCode(boolean updateProvinceCode) {
		this.updateProvinceCode = updateProvinceCode;
	}

}
