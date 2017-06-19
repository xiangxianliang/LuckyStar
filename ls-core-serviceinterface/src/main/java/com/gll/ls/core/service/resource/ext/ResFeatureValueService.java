package com.gll.ls.core.service.resource.ext;

import java.util.List;

import com.gll.ls.core.pojo.resource.vo.ResFeatureValueCustom;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueQueryVo;
import com.gll.ls.core.service.resource.base.ResFeatureValueServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

public interface ResFeatureValueService extends ResFeatureValueServiceBase {

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<ResFeatureValueCustom> getFeatureValueListDataGridByQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo, int rows, int page);

	/**
	 * 添加
	 */
	public Integer addFeatureValueByQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo);

	/**
	 * 根据id查询
	 */
	public ResFeatureValueCustom getFeatureValueByKey(Integer featureValueId);

	/**
	 * 根据id更新
	 */
	public Integer updateFeatureValueByKey(ResFeatureValueQueryVo resFeatureValueQueryVo);

	/**
	 * 根据id删除
	 */
	public Integer deleteFeatureValueByKey(Integer featureValueId);

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteFeatureValueByKeyList(List<Integer> featureValueIdList);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkFeatureValue(Integer featureValueId, ResFeatureValueQueryVo resFeatureValueQueryVo);

	// =====================================================================================

	/**
	 * 根据 属性的id 属性项；
	 * 
	 * @param featureId
	 * @return
	 */
	public List<ResFeatureValueCustom> getFeatureValueListByFeatureKey(Integer featureId);

}
