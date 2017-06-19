package com.gll.ls.core.dao.system.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.system.vo.SysModuleQueryVo;
import com.gll.ls.core.pojo.system.vo.SysModuleCustom;

public interface SysModuleMapperCustom {

	/**
	 * 分页查询
	 * 
	 * @param sysModuleQueryVo
	 *            查询 条件 对象
	 */
	public List<SysModuleCustom> getSysModuleCustomListWithPage(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysModuleQueryVo
	 *            查询 条件 对象
	 */
	public int getSysModuleCustomCount(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysModuleQueryVo
	 *            查询 条件 对象
	 */
	public List<SysModuleCustom> getSysModuleCustomListByQueryVo(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param moduleId
	 *            主键
	 */
	public SysModuleCustom getSysModuleCustomByKey(Integer moduleId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysModuleQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysModuleCustom getSysModuleCustomByKeyWithQueryVo(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param moduleIdList
	 *            主键集合
	 */
	public List<SysModuleCustom> getSysModuleCustomListByKeyList(@Param("moduleIdList") List<Integer> moduleIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysModuleQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysModuleCustom> getSysModuleListByKeyListWithQueryVo(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysModuleQueryVo
	 *            添加 的对象
	 */
	public Integer addSysModuleCustomByQueryVo(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysModuleCustom
	 *            添加 的对象
	 */
	public Integer addSysModuleCustomByCustom(SysModuleCustom sysModuleCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param moduleId
	 *            删除的主键集合
	 */
	public Integer deleteSysModuleCustomByKey(Integer moduleId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param moduleIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysModuleCustomByKeyList(@Param("moduleIdList") List<Integer> moduleIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysModuleQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysModuleCustomByKeySelective(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysModuleQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysModuleCustomByKeySnapshots(SysModuleQueryVo sysModuleQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param moduleId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysModuleCustomByKey(Integer moduleId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param moduleIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysModuleCustomByKeyList(@Param("moduleIdList") List<Integer> moduleIdList);

}
