package com.gll.ls.core.service.system.base;

import java.util.List;

import com.gll.ls.core.pojo.system.po.SysUserRole;
import com.gll.ls.core.pojo.system.po.SysUserRoleExample;
import com.gll.ls.core.pojo.system.vo.SysUserRoleCustom;
import com.gll.ls.core.pojo.system.vo.SysUserRoleQueryVo;

public interface SysUserRoleServiceBase {

	/**
	 * 分页查询
	 * 
	 * @param sysUserRoleQueryVo
	 *            查询 条件 对象
	 */
	public List<SysUserRoleCustom> getSysUserRoleCustomListWithPage(SysUserRoleQueryVo sysUserRoleQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysUserRoleQueryVo
	 *            查询 条件 对象
	 */
	public int getSysUserRoleCustomCount(SysUserRoleQueryVo sysUserRoleQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysUserRoleQueryVo
	 *            查询 条件 对象
	 */
	public List<SysUserRoleCustom> getSysUserRoleCustomListByQueryVo(SysUserRoleQueryVo sysUserRoleQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param userRoleId
	 *            主键
	 */
	public SysUserRoleCustom getSysUserRoleCustomByKey(Integer userRoleId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysUserRoleQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysUserRoleCustom getSysUserRoleCustomByKeyWithQueryVo(SysUserRoleQueryVo sysUserRoleQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param userRoleIdList
	 *            主键集合
	 */
	public List<SysUserRoleCustom> getSysUserRoleCustomListByKeyList(List<Integer> userRoleIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysUserRoleQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysUserRoleCustom> getSysUserRoleListByKeyListWithQueryVo(SysUserRoleQueryVo sysUserRoleQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysUserRoleQueryVo
	 *            添加 的对象
	 */
	public Integer addSysUserRoleCustomByQueryVo(SysUserRoleQueryVo sysUserRoleQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysUserRoleCustom
	 *            添加 的对象
	 */
	public Integer addSysUserRoleCustomByCustom(SysUserRoleCustom sysUserRoleCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param userRoleId
	 *            删除的主键集合
	 */
	public Integer deleteSysUserRoleCustomByKey(Integer userRoleId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param userRoleIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysUserRoleCustomByKeyList(List<Integer> userRoleIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysUserRoleQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysUserRoleCustomByKeySelective(SysUserRoleQueryVo sysUserRoleQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysUserRoleQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysUserRoleCustomByKeySnapshots(SysUserRoleQueryVo sysUserRoleQueryVo);

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(SysUserRoleExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(SysUserRoleExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param userRoleId
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(Integer userRoleId);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(SysUserRole record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(SysUserRole record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<SysUserRole> selectByExample(SysUserRoleExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public SysUserRole selectByPrimaryKey(Integer userRoleId);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(SysUserRole record, SysUserRoleExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(SysUserRole record, SysUserRoleExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(SysUserRole record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(SysUserRole record);

}
