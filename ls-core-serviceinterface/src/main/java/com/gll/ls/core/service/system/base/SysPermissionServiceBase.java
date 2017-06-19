package com.gll.ls.core.service.system.base;

import java.util.List;

import com.gll.ls.core.pojo.system.po.SysPermission;
import com.gll.ls.core.pojo.system.po.SysPermissionExample;
import com.gll.ls.core.pojo.system.vo.SysPermissionCustom;
import com.gll.ls.core.pojo.system.vo.SysPermissionQueryVo;

public interface SysPermissionServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysPermissionQueryVo
	 *            查询 条件 对象
	 */
	public List<SysPermissionCustom> getSysPermissionCustomListWithPage(SysPermissionQueryVo sysPermissionQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysPermissionQueryVo
	 *            查询 条件 对象
	 */
	public int getSysPermissionCustomCount(SysPermissionQueryVo sysPermissionQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysPermissionQueryVo
	 *            查询 条件 对象
	 */
	public List<SysPermissionCustom> getSysPermissionCustomListByQueryVo(SysPermissionQueryVo sysPermissionQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param permissionId
	 *            主键
	 */
	public SysPermissionCustom getSysPermissionCustomByKey(Integer permissionId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysPermissionQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysPermissionCustom getSysPermissionCustomByKeyWithQueryVo(SysPermissionQueryVo sysPermissionQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param permissionIdList
	 *            主键集合
	 */
	public List<SysPermissionCustom> getSysPermissionCustomListByKeyList(List<Integer> permissionIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysPermissionQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysPermissionCustom> getSysPermissionListByKeyListWithQueryVo(SysPermissionQueryVo sysPermissionQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysPermissionQueryVo
	 *            添加 的对象
	 */
	public Integer addSysPermissionCustomByQueryVo(SysPermissionQueryVo sysPermissionQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysPermissionCustom
	 *            添加 的对象
	 */
	public Integer addSysPermissionCustomByCustom(SysPermissionCustom sysPermissionCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param permissionId
	 *            删除的主键集合
	 */
	public Integer deleteSysPermissionCustomByKey(Integer permissionId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param permissionIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysPermissionCustomByKeyList(List<Integer> permissionIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysPermissionQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysPermissionCustomByKeySelective(SysPermissionQueryVo sysPermissionQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysPermissionQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysPermissionCustomByKeySnapshots(SysPermissionQueryVo sysPermissionQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param permissionId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysPermissionCustomByKey(Integer permissionId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param permissionIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysPermissionCustomByKeyList(List<Integer> permissionIdList);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(SysPermissionExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(SysPermissionExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param permissionId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer permissionId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(SysPermission record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(SysPermission record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<SysPermission> selectByExample(SysPermissionExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public SysPermission selectByPrimaryKey(Integer permissionId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(SysPermission record, SysPermissionExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(SysPermission record, SysPermissionExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(SysPermission record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(SysPermission record);

}
