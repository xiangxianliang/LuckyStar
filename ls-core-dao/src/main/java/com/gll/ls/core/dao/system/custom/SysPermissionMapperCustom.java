package com.gll.ls.core.dao.system.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.system.vo.SysPermissionQueryVo;
import com.gll.ls.core.pojo.system.vo.SysPermissionCustom;

public interface SysPermissionMapperCustom {

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
	public List<SysPermissionCustom> getSysPermissionCustomListByKeyList(@Param("permissionIdList") List<Integer> permissionIdList);

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
	public Integer deleteSysPermissionCustomByKeyList(@Param("permissionIdList") List<Integer> permissionIdList);

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
	public Integer updateDeleteSysPermissionCustomByKeyList(@Param("permissionIdList") List<Integer> permissionIdList);

}
