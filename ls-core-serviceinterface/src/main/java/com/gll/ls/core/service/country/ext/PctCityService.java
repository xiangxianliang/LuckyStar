package com.gll.ls.core.service.country.ext;

import java.util.List;

import com.gll.ls.core.pojo.country.vo.PctCityCustom;
import com.gll.ls.core.pojo.country.vo.PctCityQueryVo;
import com.gll.ls.core.service.country.base.PctCityServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

public interface PctCityService extends PctCityServiceBase {

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<PctCityCustom> getCityListDataGridByQueryVo(PctCityQueryVo pctCityQueryVo, int rows, int page);

	/**
	 * 添加
	 */
	public Integer addCityByQueryVo(PctCityQueryVo pctCityQueryVo);

	/**
	 * 根据id查询
	 */
	public PctCityCustom getCityByKey(String cityCode);

	/**
	 * 根据id更新
	 */
	public Integer updateCityByKey(PctCityQueryVo pctCityQueryVo);

	/**
	 * 根据id删除
	 */
	public Integer deleteCityByKey(String cityCode);

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteCityByKeyList(List<String> cityCodeList);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkCity(String cityCode, PctCityQueryVo pctCityQueryVo);

}
