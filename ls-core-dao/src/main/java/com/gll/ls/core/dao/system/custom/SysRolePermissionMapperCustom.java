package com.gll.ls.core.dao.system.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.system.vo.SysRolePermissionQueryVo;
import com.gll.ls.core.pojo.system.vo.SysRolePermissionCustom;

public interface SysRolePermissionMapperCustom {

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
	public List<SysRolePermissionCustom> getSysRolePermissionCustomListByKeyList(@Param("rolePermissionIdList") List<Integer> rolePermissionIdList);

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
	public Integer deleteSysRolePermissionCustomByKeyList(@Param("rolePermissionIdList") List<Integer> rolePermissionIdList);

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

}
