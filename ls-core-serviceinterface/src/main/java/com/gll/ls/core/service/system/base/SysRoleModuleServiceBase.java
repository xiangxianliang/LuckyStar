package com.gll.ls.core.service.system.base;

import java.util.List;

import com.gll.ls.core.pojo.system.po.SysRoleModule;
import com.gll.ls.core.pojo.system.po.SysRoleModuleExample;
import com.gll.ls.core.pojo.system.vo.SysRoleModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysRoleModuleQueryVo;

public interface SysRoleModuleServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysRoleModuleQueryVo
	 *            查询 条件 对象
	 */
	public List<SysRoleModuleCustom> getSysRoleModuleCustomListWithPage(SysRoleModuleQueryVo sysRoleModuleQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysRoleModuleQueryVo
	 *            查询 条件 对象
	 */
	public int getSysRoleModuleCustomCount(SysRoleModuleQueryVo sysRoleModuleQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysRoleModuleQueryVo
	 *            查询 条件 对象
	 */
	public List<SysRoleModuleCustom> getSysRoleModuleCustomListByQueryVo(SysRoleModuleQueryVo sysRoleModuleQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param roleModuleId
	 *            主键
	 */
	public SysRoleModuleCustom getSysRoleModuleCustomByKey(Integer roleModuleId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysRoleModuleQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysRoleModuleCustom getSysRoleModuleCustomByKeyWithQueryVo(SysRoleModuleQueryVo sysRoleModuleQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param roleModuleIdList
	 *            主键集合
	 */
	public List<SysRoleModuleCustom> getSysRoleModuleCustomListByKeyList(List<Integer> roleModuleIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysRoleModuleQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysRoleModuleCustom> getSysRoleModuleListByKeyListWithQueryVo(SysRoleModuleQueryVo sysRoleModuleQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysRoleModuleQueryVo
	 *            添加 的对象
	 */
	public Integer addSysRoleModuleCustomByQueryVo(SysRoleModuleQueryVo sysRoleModuleQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysRoleModuleCustom
	 *            添加 的对象
	 */
	public Integer addSysRoleModuleCustomByCustom(SysRoleModuleCustom sysRoleModuleCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param roleModuleId
	 *            删除的主键集合
	 */
	public Integer deleteSysRoleModuleCustomByKey(Integer roleModuleId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param roleModuleIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysRoleModuleCustomByKeyList(List<Integer> roleModuleIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysRoleModuleQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysRoleModuleCustomByKeySelective(SysRoleModuleQueryVo sysRoleModuleQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysRoleModuleQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysRoleModuleCustomByKeySnapshots(SysRoleModuleQueryVo sysRoleModuleQueryVo);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(SysRoleModuleExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(SysRoleModuleExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param roleModuleId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer roleModuleId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(SysRoleModule record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(SysRoleModule record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<SysRoleModule> selectByExample(SysRoleModuleExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public SysRoleModule selectByPrimaryKey(Integer roleModuleId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(SysRoleModule record, SysRoleModuleExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(SysRoleModule record, SysRoleModuleExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(SysRoleModule record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(SysRoleModule record);

}
