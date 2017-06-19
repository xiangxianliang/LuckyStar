package com.gll.ls.core.service.resource.base;

import java.util.List;

import com.gll.ls.core.pojo.resource.po.ResFeature;
import com.gll.ls.core.pojo.resource.po.ResFeatureExample;
import com.gll.ls.core.pojo.resource.vo.ResFeatureCustom;
import com.gll.ls.core.pojo.resource.vo.ResFeatureQueryVo;

public interface ResFeatureServiceBase {

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
	public List<ResFeatureCustom> getResFeatureCustomListByKeyList(List<Integer> featureIdList);

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
	public Integer deleteResFeatureCustomByKeyList(List<Integer> featureIdList);

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
	public Integer updateDeleteResFeatureCustomByKeyList(List<Integer> featureIdList);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(ResFeatureExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(ResFeatureExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param featureId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer featureId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(ResFeature record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(ResFeature record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<ResFeature> selectByExample(ResFeatureExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public ResFeature selectByPrimaryKey(Integer featureId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(ResFeature record, ResFeatureExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(ResFeature record, ResFeatureExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(ResFeature record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(ResFeature record);

}
