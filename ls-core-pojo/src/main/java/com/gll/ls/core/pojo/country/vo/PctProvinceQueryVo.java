package com.gll.ls.core.pojo.country.vo;

import java.util.List;

import com.gll.ls.core.pojo.BaseQuery;

public class PctProvinceQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private PctProvinceCustom pctProvinceCustom;

	// where 条件
	private boolean provinceNameLike;

	// 根据 主键 批量查找 字段
	private List<Integer> provinceCodeList;

	// update快照更新 字段
	private boolean updateProvinceName;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：ProvinceCode
	 */
	public PctProvinceQueryVo selectProvinceCode() {
		selectFields.add("province_code");
		return this;
	}

	/**
	 * 设置查询字段：ProvinceName
	 */
	public PctProvinceQueryVo selectProvinceName() {
		selectFields.add("province_name");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：ProvinceCode
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public PctProvinceQueryVo orderbyProvinceCode(boolean isAsc) {
		orderFields.add(new OrderField("province_code", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ProvinceName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public PctProvinceQueryVo orderbyProvinceName(boolean isAsc) {
		orderFields.add(new OrderField("province_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return pctProvinceCustom
	 */
	public PctProvinceCustom getPctProvinceCustom() {
		return pctProvinceCustom;
	}

	/**
	 * @param pctProvinceCustom
	 *            要设置的 pctProvinceCustom
	 */
	public void setPctProvinceCustom(PctProvinceCustom pctProvinceCustom) {
		this.pctProvinceCustom = pctProvinceCustom;
	}

	/**
	 * @return provinceNameLike
	 */
	public Boolean isProvinceNameLike() {
		return provinceNameLike;
	}

	/**
	 * @param provinceNameLike
	 *            要设置的provinceNameLike
	 */
	public void setProvinceNameLike(boolean provinceNameLike) {
		this.provinceNameLike = provinceNameLike;
	}

	/**
	 * @return provinceCodeList
	 */
	public List<Integer> getProvinceCodeList() {
		return provinceCodeList;
	}

	/**
	 * @param provinceCodeList
	 *            要设置的provinceCodeList
	 */
	public void setProvinceCodeList(List<Integer> provinceCodeList) {
		this.provinceCodeList = provinceCodeList;
	}

	/**
	 * @return updateProvinceName
	 */
	public Boolean isUpdateProvinceName() {
		return updateProvinceName;
	}

	/**
	 * @param updateProvinceName
	 *            要设置的updateProvinceName
	 */
	public void setUpdateProvinceName(boolean updateProvinceName) {
		this.updateProvinceName = updateProvinceName;
	}

}
