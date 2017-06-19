package com.gll.ls.core.service.system.base;

import java.util.List;

import com.gll.ls.core.pojo.system.po.SysDictType;
import com.gll.ls.core.pojo.system.po.SysDictTypeExample;
import com.gll.ls.core.pojo.system.vo.SysDictTypeCustom;
import com.gll.ls.core.pojo.system.vo.SysDictTypeQueryVo;

public interface SysDictTypeServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysDictTypeQueryVo
	 *            查询 条件 对象
	 */
	public List<SysDictTypeCustom> getSysDictTypeCustomListWithPage(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysDictTypeQueryVo
	 *            查询 条件 对象
	 */
	public int getSysDictTypeCustomCount(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysDictTypeQueryVo
	 *            查询 条件 对象
	 */
	public List<SysDictTypeCustom> getSysDictTypeCustomListByQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param typeId
	 *            主键
	 */
	public SysDictTypeCustom getSysDictTypeCustomByKey(Integer typeId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysDictTypeQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysDictTypeCustom getSysDictTypeCustomByKeyWithQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param typeIdList
	 *            主键集合
	 */
	public List<SysDictTypeCustom> getSysDictTypeCustomListByKeyList(List<Integer> typeIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysDictTypeQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysDictTypeCustom> getSysDictTypeListByKeyListWithQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysDictTypeQueryVo
	 *            添加 的对象
	 */
	public Integer addSysDictTypeCustomByQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysDictTypeCustom
	 *            添加 的对象
	 */
	public Integer addSysDictTypeCustomByCustom(SysDictTypeCustom sysDictTypeCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param typeId
	 *            删除的主键集合
	 */
	public Integer deleteSysDictTypeCustomByKey(Integer typeId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param typeIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysDictTypeCustomByKeyList(List<Integer> typeIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysDictTypeQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysDictTypeCustomByKeySelective(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysDictTypeQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysDictTypeCustomByKeySnapshots(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param typeId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysDictTypeCustomByKey(Integer typeId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param typeIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysDictTypeCustomByKeyList(List<Integer> typeIdList);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(SysDictTypeExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(SysDictTypeExample example);

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
	public int insert(SysDictType record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(SysDictType record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<SysDictType> selectByExample(SysDictTypeExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public SysDictType selectByPrimaryKey(Integer typeId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(SysDictType record, SysDictTypeExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(SysDictType record, SysDictTypeExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(SysDictType record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(SysDictType record);

}
