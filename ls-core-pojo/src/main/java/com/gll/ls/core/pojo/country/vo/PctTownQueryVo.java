package com.gll.ls.core.pojo.country.vo;

import java.util.List;

import com.gll.ls.core.pojo.BaseQuery;

public class PctTownQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private PctTownCustom pctTownCustom;

	// where 条件
	private boolean townNameLike;
	private boolean cityCodeLike;

	// 根据 主键 批量查找 字段
	private List<Integer> townCodeList;

	// update快照更新 字段
	private boolean updateTownName;
	private boolean updateCityCode;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：TownCode
	 */
	public PctTownQueryVo selectTownCode() {
		selectFields.add("town_code");
		return this;
	}

	/**
	 * 设置查询字段：TownName
	 */
	public PctTownQueryVo selectTownName() {
		selectFields.add("town_name");
		return this;
	}

	/**
	 * 设置查询字段：CityCode
	 */
	public PctTownQueryVo selectCityCode() {
		selectFields.add("city_code");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：TownCode
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public PctTownQueryVo orderbyTownCode(boolean isAsc) {
		orderFields.add(new OrderField("town_code", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：TownName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public PctTownQueryVo orderbyTownName(boolean isAsc) {
		orderFields.add(new OrderField("town_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：CityCode
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public PctTownQueryVo orderbyCityCode(boolean isAsc) {
		orderFields.add(new OrderField("city_code", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return pctTownCustom
	 */
	public PctTownCustom getPctTownCustom() {
		return pctTownCustom;
	}

	/**
	 * @param pctTownCustom
	 *            要设置的 pctTownCustom
	 */
	public void setPctTownCustom(PctTownCustom pctTownCustom) {
		this.pctTownCustom = pctTownCustom;
	}

	/**
	 * @return townNameLike
	 */
	public Boolean isTownNameLike() {
		return townNameLike;
	}

	/**
	 * @param townNameLike
	 *            要设置的townNameLike
	 */
	public void setTownNameLike(boolean townNameLike) {
		this.townNameLike = townNameLike;
	}

	/**
	 * @return cityCodeLike
	 */
	public Boolean isCityCodeLike() {
		return cityCodeLike;
	}

	/**
	 * @param cityCodeLike
	 *            要设置的cityCodeLike
	 */
	public void setCityCodeLike(boolean cityCodeLike) {
		this.cityCodeLike = cityCodeLike;
	}

	/**
	 * @return townCodeList
	 */
	public List<Integer> getTownCodeList() {
		return townCodeList;
	}

	/**
	 * @param townCodeList
	 *            要设置的townCodeList
	 */
	public void setTownCodeList(List<Integer> townCodeList) {
		this.townCodeList = townCodeList;
	}

	/**
	 * @return updateTownName
	 */
	public Boolean isUpdateTownName() {
		return updateTownName;
	}

	/**
	 * @param updateTownName
	 *            要设置的updateTownName
	 */
	public void setUpdateTownName(boolean updateTownName) {
		this.updateTownName = updateTownName;
	}

	/**
	 * @return updateCityCode
	 */
	public Boolean isUpdateCityCode() {
		return updateCityCode;
	}

	/**
	 * @param updateCityCode
	 *            要设置的updateCityCode
	 */
	public void setUpdateCityCode(boolean updateCityCode) {
		this.updateCityCode = updateCityCode;
	}

}
