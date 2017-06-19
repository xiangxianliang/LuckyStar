package com.gll.ls.core.service.resource.base;

import java.util.List;

import com.gll.ls.core.pojo.resource.po.ResType;
import com.gll.ls.core.pojo.resource.po.ResTypeExample;
import com.gll.ls.core.pojo.resource.vo.ResTypeCustom;
import com.gll.ls.core.pojo.resource.vo.ResTypeQueryVo;

public interface ResTypeServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param resTypeQueryVo
	 *            查询 条件 对象
	 */
	public List<ResTypeCustom> getResTypeCustomListWithPage(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param resTypeQueryVo
	 *            查询 条件 对象
	 */
	public int getResTypeCustomCount(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param resTypeQueryVo
	 *            查询 条件 对象
	 */
	public List<ResTypeCustom> getResTypeCustomListByQueryVo(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param typeId
	 *            主键
	 */
	public ResTypeCustom getResTypeCustomByKey(Integer typeId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param resTypeQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public ResTypeCustom getResTypeCustomByKeyWithQueryVo(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param typeIdList
	 *            主键集合
	 */
	public List<ResTypeCustom> getResTypeCustomListByKeyList(List<Integer> typeIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param resTypeQueryVo
	 *            要查询的主键封装对象
	 */
	public List<ResTypeCustom> getResTypeListByKeyListWithQueryVo(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 添加
	 * 
	 * @param resTypeQueryVo
	 *            添加 的对象
	 */
	public Integer addResTypeCustomByQueryVo(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 添加
	 * 
	 * @param resTypeCustom
	 *            添加 的对象
	 */
	public Integer addResTypeCustomByCustom(ResTypeCustom resTypeCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param typeId
	 *            删除的主键集合
	 */
	public Integer deleteResTypeCustomByKey(Integer typeId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param typeIdList
	 *            删除的主键集合
	 */
	public Integer deleteResTypeCustomByKeyList(List<Integer> typeIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param resTypeQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateResTypeCustomByKeySelective(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param resTypeQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateResTypeCustomByKeySnapshots(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param typeId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteResTypeCustomByKey(Integer typeId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param typeIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteResTypeCustomByKeyList(List<Integer> typeIdList);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(ResTypeExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(ResTypeExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param typeId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer typeId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(ResType record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(ResType record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<ResType> selectByExample(ResTypeExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public ResType selectByPrimaryKey(Integer typeId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(ResType record, ResTypeExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(ResType record, ResTypeExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(ResType record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(ResType record);

}
