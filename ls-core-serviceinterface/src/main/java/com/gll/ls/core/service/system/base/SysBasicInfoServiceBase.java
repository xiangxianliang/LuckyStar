package com.gll.ls.core.service.system.base;

import java.util.List;

import com.gll.ls.core.pojo.system.po.SysBasicInfo;
import com.gll.ls.core.pojo.system.po.SysBasicInfoExample;
import com.gll.ls.core.pojo.system.vo.SysBasicInfoCustom;
import com.gll.ls.core.pojo.system.vo.SysBasicInfoQueryVo;

public interface SysBasicInfoServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysBasicInfoQueryVo
	 *            查询 条件 对象
	 */
	public List<SysBasicInfoCustom> getSysBasicInfoCustomListWithPage(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysBasicInfoQueryVo
	 *            查询 条件 对象
	 */
	public int getSysBasicInfoCustomCount(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysBasicInfoQueryVo
	 *            查询 条件 对象
	 */
	public List<SysBasicInfoCustom> getSysBasicInfoCustomListByQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param basicInfoId
	 *            主键
	 */
	public SysBasicInfoCustom getSysBasicInfoCustomByKey(Integer basicInfoId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysBasicInfoQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysBasicInfoCustom getSysBasicInfoCustomByKeyWithQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param basicInfoIdList
	 *            主键集合
	 */
	public List<SysBasicInfoCustom> getSysBasicInfoCustomListByKeyList(List<Integer> basicInfoIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysBasicInfoQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysBasicInfoCustom> getSysBasicInfoListByKeyListWithQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysBasicInfoQueryVo
	 *            添加 的对象
	 */
	public Integer addSysBasicInfoCustomByQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysBasicInfoCustom
	 *            添加 的对象
	 */
	public Integer addSysBasicInfoCustomByCustom(SysBasicInfoCustom sysBasicInfoCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param basicInfoId
	 *            删除的主键集合
	 */
	public Integer deleteSysBasicInfoCustomByKey(Integer basicInfoId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param basicInfoIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysBasicInfoCustomByKeyList(List<Integer> basicInfoIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysBasicInfoQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysBasicInfoCustomByKeySelective(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysBasicInfoQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysBasicInfoCustomByKeySnapshots(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param basicInfoId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysBasicInfoCustomByKey(Integer basicInfoId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param basicInfoIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysBasicInfoCustomByKeyList(List<Integer> basicInfoIdList);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(SysBasicInfoExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(SysBasicInfoExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param basicInfoId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer basicInfoId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(SysBasicInfo record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(SysBasicInfo record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<SysBasicInfo> selectByExample(SysBasicInfoExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public SysBasicInfo selectByPrimaryKey(Integer basicInfoId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(SysBasicInfo record, SysBasicInfoExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(SysBasicInfo record, SysBasicInfoExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(SysBasicInfo record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(SysBasicInfo record);

}
