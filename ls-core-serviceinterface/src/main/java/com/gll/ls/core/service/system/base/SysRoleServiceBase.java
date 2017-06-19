package com.gll.ls.core.service.system.base;

import java.util.List;

import com.gll.ls.core.pojo.system.po.SysRole;
import com.gll.ls.core.pojo.system.po.SysRoleExample;
import com.gll.ls.core.pojo.system.vo.SysRoleCustom;
import com.gll.ls.core.pojo.system.vo.SysRoleQueryVo;

public interface SysRoleServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysRoleQueryVo
	 *            查询 条件 对象
	 */
	public List<SysRoleCustom> getSysRoleCustomListWithPage(SysRoleQueryVo sysRoleQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysRoleQueryVo
	 *            查询 条件 对象
	 */
	public int getSysRoleCustomCount(SysRoleQueryVo sysRoleQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysRoleQueryVo
	 *            查询 条件 对象
	 */
	public List<SysRoleCustom> getSysRoleCustomListByQueryVo(SysRoleQueryVo sysRoleQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param roleId
	 *            主键
	 */
	public SysRoleCustom getSysRoleCustomByKey(Integer roleId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysRoleQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysRoleCustom getSysRoleCustomByKeyWithQueryVo(SysRoleQueryVo sysRoleQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param roleIdList
	 *            主键集合
	 */
	public List<SysRoleCustom> getSysRoleCustomListByKeyList(List<Integer> roleIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysRoleQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysRoleCustom> getSysRoleListByKeyListWithQueryVo(SysRoleQueryVo sysRoleQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysRoleQueryVo
	 *            添加 的对象
	 */
	public Integer addSysRoleCustomByQueryVo(SysRoleQueryVo sysRoleQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysRoleCustom
	 *            添加 的对象
	 */
	public Integer addSysRoleCustomByCustom(SysRoleCustom sysRoleCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param roleId
	 *            删除的主键集合
	 */
	public Integer deleteSysRoleCustomByKey(Integer roleId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param roleIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysRoleCustomByKeyList(List<Integer> roleIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysRoleQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysRoleCustomByKeySelective(SysRoleQueryVo sysRoleQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysRoleQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysRoleCustomByKeySnapshots(SysRoleQueryVo sysRoleQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param roleId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysRoleCustomByKey(Integer roleId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param roleIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysRoleCustomByKeyList(List<Integer> roleIdList);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(SysRoleExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(SysRoleExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param roleId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer roleId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(SysRole record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(SysRole record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<SysRole> selectByExample(SysRoleExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public SysRole selectByPrimaryKey(Integer roleId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(SysRole record, SysRoleExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(SysRole record, SysRoleExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(SysRole record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(SysRole record);

}
