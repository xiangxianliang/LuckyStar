package com.gll.ls.core.service.resource.ext;

import java.util.List;

import com.gll.ls.core.pojo.resource.vo.ResFeatureCustom;
import com.gll.ls.core.pojo.resource.vo.ResFeatureQueryVo;
import com.gll.ls.core.service.resource.base.ResFeatureServiceBase;
import com.gll.ls.utils.web.result.DataGridResultInfo;

public interface ResFeatureService extends ResFeatureServiceBase {

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<ResFeatureCustom> getFeatureListDataGridByQueryVo(ResFeatureQueryVo resFeatureQueryVo, int rows, int page);

	/**
	 * 添加
	 * 
	 * @param featureValueValues
	 * @param featureValueNames
	 */
	public Integer addFeatureByQueryVo(ResFeatureQueryVo resFeatureQueryVo, String[] featureValueNames, String[] featureValueValues);

	/**
	 * 根据id查询
	 */
	public ResFeatureCustom getFeatureByKey(Integer featureId);

	/**
	 * 根据id更新
	 */
	public Integer updateFeatureByKey(ResFeatureQueryVo resFeatureQueryVo);

	/**
	 * 根据id删除
	 */
	public Integer deleteFeatureByKey(Integer featureId);

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteFeatureByKeyList(List<Integer> featureIdList);

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkFeature(Integer featureId, ResFeatureQueryVo resFeatureQueryVo);

}
