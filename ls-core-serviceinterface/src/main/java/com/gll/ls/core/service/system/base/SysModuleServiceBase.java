package com.gll.ls.core.service.system.base;

import java.util.List;

import com.gll.ls.core.pojo.system.po.SysModule;
import com.gll.ls.core.pojo.system.po.SysModuleExample;
import com.gll.ls.core.pojo.system.vo.SysModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysModuleQueryVo;

public interface SysModuleServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysModuleQueryVo
	 *            查询 条件 对象
	 */
	public List<SysModuleCustom> getSysModuleCustomListWithPage(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysModuleQueryVo
	 *            查询 条件 对象
	 */
	public int getSysModuleCustomCount(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysModuleQueryVo
	 *            查询 条件 对象
	 */
	public List<SysModuleCustom> getSysModuleCustomListByQueryVo(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param moduleId
	 *            主键
	 */
	public SysModuleCustom getSysModuleCustomByKey(Integer moduleId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysModuleQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysModuleCustom getSysModuleCustomByKeyWithQueryVo(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param moduleIdList
	 *            主键集合
	 */
	public List<SysModuleCustom> getSysModuleCustomListByKeyList(List<Integer> moduleIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysModuleQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysModuleCustom> getSysModuleListByKeyListWithQueryVo(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysModuleQueryVo
	 *            添加 的对象
	 */
	public Integer addSysModuleCustomByQueryVo(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysModuleCustom
	 *            添加 的对象
	 */
	public Integer addSysModuleCustomByCustom(SysModuleCustom sysModuleCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param moduleId
	 *            删除的主键集合
	 */
	public Integer deleteSysModuleCustomByKey(Integer moduleId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param moduleIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysModuleCustomByKeyList(List<Integer> moduleIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysModuleQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysModuleCustomByKeySelective(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysModuleQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysModuleCustomByKeySnapshots(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param moduleId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysModuleCustomByKey(Integer moduleId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param moduleIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysModuleCustomByKeyList(List<Integer> moduleIdList);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(SysModuleExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(SysModuleExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param moduleId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer moduleId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(SysModule record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(SysModule record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<SysModule> selectByExample(SysModuleExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public SysModule selectByPrimaryKey(Integer moduleId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(SysModule record, SysModuleExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(SysModule record, SysModuleExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(SysModule record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(SysModule record);

}
