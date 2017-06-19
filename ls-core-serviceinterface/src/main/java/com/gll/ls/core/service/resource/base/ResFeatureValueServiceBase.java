package com.gll.ls.core.service.resource.base;

import java.util.List;

import com.gll.ls.core.pojo.resource.po.ResFeatureValue;
import com.gll.ls.core.pojo.resource.po.ResFeatureValueExample;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueCustom;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueQueryVo;

public interface ResFeatureValueServiceBase {

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
	public List<ResFeatureValueCustom> getResFeatureValueCustomListByKeyList(List<Integer> featureValueIdList);

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
	public Integer deleteResFeatureValueCustomByKeyList(List<Integer> featureValueIdList);

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
	public Integer updateDeleteResFeatureValueCustomByKeyList(List<Integer> featureValueIdList);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(ResFeatureValueExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(ResFeatureValueExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param featureValueId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer featureValueId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(ResFeatureValue record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(ResFeatureValue record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<ResFeatureValue> selectByExample(ResFeatureValueExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public ResFeatureValue selectByPrimaryKey(Integer featureValueId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(ResFeatureValue record, ResFeatureValueExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(ResFeatureValue record, ResFeatureValueExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(ResFeatureValue record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(ResFeatureValue record);

}
