package com.gll.ls.core.dao.resource.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueQueryVo;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueCustom;

public interface ResFeatureValueMapperCustom {

	/**
	 * 分页查询
	 * 
	 * @param resFeatureValueQueryVo
	 *            查询 条件 对象
	 */
	public List<ResFeatureValueCustom> getResFeatureValueCustomListWithPage(ResFeatureValueQueryVo resFeatureValueQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param resFeatureValueQueryVo
	 *            查询 条件 对象
	 */
	public int getResFeatureValueCustomCount(ResFeatureValueQueryVo resFeatureValueQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param resFeatureValueQueryVo
	 *            查询 条件 对象
	 */
	public List<ResFeatureValueCustom> getResFeatureValueCustomListByQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param featureValueId
	 *            主键
	 */
	public ResFeatureValueCustom getResFeatureValueCustomByKey(Integer featureValueId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param resFeatureValueQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public ResFeatureValueCustom getResFeatureValueCustomByKeyWithQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param featureValueIdList
	 *            主键集合
	 */
	public List<ResFeatureValueCustom> getResFeatureValueCustomListByKeyList(@Param("featureValueIdList") List<Integer> featureValueIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param resFeatureValueQueryVo
	 *            要查询的主键封装对象
	 */
	public List<ResFeatureValueCustom> getResFeatureValueListByKeyListWithQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo);

	/**
	 * 添加
	 * 
	 * @param resFeatureValueQueryVo
	 *            添加 的对象
	 */
	public Integer addResFeatureValueCustomByQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo);

	/**
	 * 添加
	 * 
	 * @param resFeatureValueCustom
	 *            添加 的对象
	 */
	public Integer addResFeatureValueCustomByCustom(ResFeatureValueCustom resFeatureValueCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param featureValueId
	 *            删除的主键集合
	 */
	public Integer deleteResFeatureValueCustomByKey(Integer featureValueId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param featureValueIdList
	 *            删除的主键集合
	 */
	public Integer deleteResFeatureValueCustomByKeyList(@Param("featureValueIdList") List<Integer> featureValueIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param resFeatureValueQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateResFeatureValueCustomByKeySelective(ResFeatureValueQueryVo resFeatureValueQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param resFeatureValueQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateResFeatureValueCustomByKeySnapshots(ResFeatureValueQueryVo resFeatureValueQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param featureValueId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteResFeatureValueCustomByKey(Integer featureValueId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param featureValueIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteResFeatureValueCustomByKeyList(@Param("featureValueIdList") List<Integer> featureValueIdList);

}
