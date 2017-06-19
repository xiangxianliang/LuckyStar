package com.gll.ls.core.service.country.ext;

import java.util.List;

import com.gll.ls.core.pojo.country.vo.PctProvinceCustom;
import com.gll.ls.core.pojo.country.vo.PctProvinceQueryVo;
import com.gll.ls.core.service.country.base.PctProvinceServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

public interface PctProvinceService extends PctProvinceServiceBase {

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<PctProvinceCustom> getProvinceListDataGridByQueryVo(PctProvinceQueryVo pctProvinceQueryVo, int rows, int page);

	/**
	 * 添加
	 */
	public Integer addProvinceByQueryVo(PctProvinceQueryVo pctProvinceQueryVo);

	/**
	 * 根据id查询
	 */
	public PctProvinceCustom getProvinceByKey(String provinceCode);

	/**
	 * 根据id更新
	 */
	public Integer updateProvinceByKey(PctProvinceQueryVo pctProvinceQueryVo);

	/**
	 * 根据id删除
	 */
	public Integer deleteProvinceByKey(String provinceCode);

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteProvinceByKeyList(List<String> provinceCodeList);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkProvince(String provinceCode, PctProvinceQueryVo pctProvinceQueryVo);

}
