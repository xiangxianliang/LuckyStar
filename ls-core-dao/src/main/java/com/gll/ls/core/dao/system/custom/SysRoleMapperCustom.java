package com.gll.ls.core.dao.system.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.system.vo.SysRoleQueryVo;
import com.gll.ls.core.pojo.system.vo.SysRoleCustom;

public interface SysRoleMapperCustom {

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
	public List<SysRoleCustom> getSysRoleCustomListByKeyList(@Param("roleIdList") List<Integer> roleIdList);

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
	public Integer deleteSysRoleCustomByKeyList(@Param("roleIdList") List<Integer> roleIdList);

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
	public Integer updateDeleteSysRoleCustomByKeyList(@Param("roleIdList") List<Integer> roleIdList);

}
