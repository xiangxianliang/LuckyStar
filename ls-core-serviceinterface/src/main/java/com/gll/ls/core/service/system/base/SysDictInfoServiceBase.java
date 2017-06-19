package com.gll.ls.core.service.system.base;

import java.util.List;

import com.gll.ls.core.pojo.system.po.SysDictInfo;
import com.gll.ls.core.pojo.system.po.SysDictInfoExample;
import com.gll.ls.core.pojo.system.vo.SysDictInfoCustom;
import com.gll.ls.core.pojo.system.vo.SysDictInfoQueryVo;

public interface SysDictInfoServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysDictInfoQueryVo
	 *            查询 条件 对象
	 */
	public List<SysDictInfoCustom> getSysDictInfoCustomListWithPage(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysDictInfoQueryVo
	 *            查询 条件 对象
	 */
	public int getSysDictInfoCustomCount(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysDictInfoQueryVo
	 *            查询 条件 对象
	 */
	public List<SysDictInfoCustom> getSysDictInfoCustomListByQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param infoId
	 *            主键
	 */
	public SysDictInfoCustom getSysDictInfoCustomByKey(Integer infoId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysDictInfoQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysDictInfoCustom getSysDictInfoCustomByKeyWithQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param infoIdList
	 *            主键集合
	 */
	public List<SysDictInfoCustom> getSysDictInfoCustomListByKeyList(List<Integer> infoIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysDictInfoQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysDictInfoCustom> getSysDictInfoListByKeyListWithQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysDictInfoQueryVo
	 *            添加 的对象
	 */
	public Integer addSysDictInfoCustomByQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysDictInfoCustom
	 *            添加 的对象
	 */
	public Integer addSysDictInfoCustomByCustom(SysDictInfoCustom sysDictInfoCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param infoId
	 *            删除的主键集合
	 */
	public Integer deleteSysDictInfoCustomByKey(Integer infoId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param infoIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysDictInfoCustomByKeyList(List<Integer> infoIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysDictInfoQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysDictInfoCustomByKeySelective(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysDictInfoQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysDictInfoCustomByKeySnapshots(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param infoId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysDictInfoCustomByKey(Integer infoId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param infoIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysDictInfoCustomByKeyList(List<Integer> infoIdList);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(SysDictInfoExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(SysDictInfoExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param infoId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer infoId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(SysDictInfo record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(SysDictInfo record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<SysDictInfo> selectByExample(SysDictInfoExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public SysDictInfo selectByPrimaryKey(Integer infoId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(SysDictInfo record, SysDictInfoExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(SysDictInfo record, SysDictInfoExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(SysDictInfo record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(SysDictInfo record);

}
