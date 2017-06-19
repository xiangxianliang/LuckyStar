package com.gll.ls.core.service.country.ext;

import java.util.List;

import com.gll.ls.core.pojo.country.vo.PctTownCustom;
import com.gll.ls.core.pojo.country.vo.PctTownQueryVo;
import com.gll.ls.core.service.country.base.PctTownServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

public interface PctTownService extends PctTownServiceBase {

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<PctTownCustom> getTownListDataGridByQueryVo(PctTownQueryVo pctTownQueryVo, int rows, int page);

	/**
	 * 添加
	 */
	public Integer addTownByQueryVo(PctTownQueryVo pctTownQueryVo);

	/**
	 * 根据id查询
	 */
	public PctTownCustom getTownByKey(String townCode);

	/**
	 * 根据id更新
	 */
	public Integer updateTownByKey(PctTownQueryVo pctTownQueryVo);

	/**
	 * 根据id删除
	 */
	public Integer deleteTownByKey(String townCode);

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteTownByKeyList(List<String> townCodeList);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkTown(String townCode, PctTownQueryVo pctTownQueryVo);

}
