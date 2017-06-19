package com.gll.ls.core.dao.system.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.system.vo.SysUserRoleQueryVo;
import com.gll.ls.core.pojo.system.vo.SysUserRoleCustom;

public interface SysUserRoleMapperCustom {

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
	public List<SysUserRoleCustom> getSysUserRoleCustomListByKeyList(@Param("userRoleIdList") List<Integer> userRoleIdList);

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
	public Integer deleteSysUserRoleCustomByKeyList(@Param("userRoleIdList") List<Integer> userRoleIdList);

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

}
