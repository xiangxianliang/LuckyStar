package com.gll.ls.core.service.system.base;

import java.util.List;

import com.gll.ls.core.pojo.system.po.SysRolePermission;
import com.gll.ls.core.pojo.system.po.SysRolePermissionExample;
import com.gll.ls.core.pojo.system.vo.SysRolePermissionCustom;
import com.gll.ls.core.pojo.system.vo.SysRolePermissionQueryVo;

public interface SysRolePermissionServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysRolePermissionQueryVo
	 *            查询 条件 对象
	 */
	public List<SysRolePermissionCustom> getSysRolePermissionCustomListWithPage(SysRolePermissionQueryVo sysRolePermissionQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysRolePermissionQueryVo
	 *            查询 条件 对象
	 */
	public int getSysRolePermissionCustomCount(SysRolePermissionQueryVo sysRolePermissionQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysRolePermissionQueryVo
	 *            查询 条件 对象
	 */
	public List<SysRolePermissionCustom> getSysRolePermissionCustomListByQueryVo(SysRolePermissionQueryVo sysRolePermissionQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param rolePermissionId
	 *            主键
	 */
	public SysRolePermissionCustom getSysRolePermissionCustomByKey(Integer rolePermissionId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysRolePermissionQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysRolePermissionCustom getSysRolePermissionCustomByKeyWithQueryVo(SysRolePermissionQueryVo sysRolePermissionQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param rolePermissionIdList
	 *            主键集合
	 */
	public List<SysRolePermissionCustom> getSysRolePermissionCustomListByKeyList(List<Integer> rolePermissionIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysRolePermissionQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysRolePermissionCustom> getSysRolePermissionListByKeyListWithQueryVo(SysRolePermissionQueryVo sysRolePermissionQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysRolePermissionQueryVo
	 *            添加 的对象
	 */
	public Integer addSysRolePermissionCustomByQueryVo(SysRolePermissionQueryVo sysRolePermissionQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysRolePermissionCustom
	 *            添加 的对象
	 */
	public Integer addSysRolePermissionCustomByCustom(SysRolePermissionCustom sysRolePermissionCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param rolePermissionId
	 *            删除的主键集合
	 */
	public Integer deleteSysRolePermissionCustomByKey(Integer rolePermissionId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param rolePermissionIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysRolePermissionCustomByKeyList(List<Integer> rolePermissionIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysRolePermissionQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysRolePermissionCustomByKeySelective(SysRolePermissionQueryVo sysRolePermissionQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysRolePermissionQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysRolePermissionCustomByKeySnapshots(SysRolePermissionQueryVo sysRolePermissionQueryVo);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(SysRolePermissionExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(SysRolePermissionExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param rolePermissionId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer rolePermissionId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(SysRolePermission record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(SysRolePermission record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<SysRolePermission> selectByExample(SysRolePermissionExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public SysRolePermission selectByPrimaryKey(Integer rolePermissionId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(SysRolePermission record, SysRolePermissionExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(SysRolePermission record, SysRolePermissionExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(SysRolePermission record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(SysRolePermission record);

}
