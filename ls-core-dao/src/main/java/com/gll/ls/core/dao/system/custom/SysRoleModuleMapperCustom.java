package com.gll.ls.core.dao.system.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.system.vo.SysRoleModuleQueryVo;
import com.gll.ls.core.pojo.system.vo.SysRoleModuleCustom;

public interface SysRoleModuleMapperCustom {

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
	public List<SysRoleModuleCustom> getSysRoleModuleCustomListByKeyList(@Param("roleModuleIdList") List<Integer> roleModuleIdList);

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
	public Integer deleteSysRoleModuleCustomByKeyList(@Param("roleModuleIdList") List<Integer> roleModuleIdList);

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

}
