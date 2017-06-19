package com.gll.ls.core.dao.resource.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gll.ls.core.pojo.resource.vo.ResFeatureCustom;
import com.gll.ls.core.pojo.resource.vo.ResFeatureQueryVo;

public interface ResFeatureMapperCustom {

	/**
	 * 分页查询
	 * 
	 * @param resFeatureQueryVo
	 *            查询 条件 对象
	 */
	public List<ResFeatureCustom> getResFeatureCustomListWithPage(ResFeatureQueryVo resFeatureQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param resFeatureQueryVo
	 *            查询 条件 对象
	 */
	public int getResFeatureCustomCount(ResFeatureQueryVo resFeatureQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param resFeatureQueryVo
	 *            查询 条件 对象
	 */
	public List<ResFeatureCustom> getResFeatureCustomListByQueryVo(ResFeatureQueryVo resFeatureQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param featureId
	 *            主键
	 */
	public ResFeatureCustom getResFeatureCustomByKey(Integer featureId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param resFeatureQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public ResFeatureCustom getResFeatureCustomByKeyWithQueryVo(ResFeatureQueryVo resFeatureQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param featureIdList
	 *            主键集合
	 */
	public List<ResFeatureCustom> getResFeatureCustomListByKeyList(@Param("featureIdList") List<Integer> featureIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param resFeatureQueryVo
	 *            要查询的主键封装对象
	 */
	public List<ResFeatureCustom> getResFeatureListByKeyListWithQueryVo(ResFeatureQueryVo resFeatureQueryVo);

	/**
	 * 添加
	 * 
	 * @param resFeatureQueryVo
	 *            添加 的对象
	 */
	public Integer addResFeatureCustomByQueryVo(ResFeatureQueryVo resFeatureQueryVo);

	/**
	 * 添加
	 * 
	 * @param resFeatureCustom
	 *            添加 的对象
	 */
	public Integer addResFeatureCustomByCustom(ResFeatureCustom resFeatureCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param featureId
	 *            删除的主键集合
	 */
	public Integer deleteResFeatureCustomByKey(Integer featureId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param featureIdList
	 *            删除的主键集合
	 */
	public Integer deleteResFeatureCustomByKeyList(@Param("featureIdList") List<Integer> featureIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param resFeatureQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateResFeatureCustomByKeySelective(ResFeatureQueryVo resFeatureQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param resFeatureQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateResFeatureCustomByKeySnapshots(ResFeatureQueryVo resFeatureQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param featureId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteResFeatureCustomByKey(Integer featureId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param featureIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteResFeatureCustomByKeyList(@Param("featureIdList") List<Integer> featureIdList);

}
