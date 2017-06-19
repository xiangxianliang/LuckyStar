package com.gll.ls.core.dao.system.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.system.vo.SysBasicInfoQueryVo;
import com.gll.ls.core.pojo.system.vo.SysBasicInfoCustom;

public interface SysBasicInfoMapperCustom {

	/**
	 * 分页查询
	 * 
	 * @param sysBasicInfoQueryVo
	 *            查询 条件 对象
	 */
	public List<SysBasicInfoCustom> getSysBasicInfoCustomListWithPage(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysBasicInfoQueryVo
	 *            查询 条件 对象
	 */
	public int getSysBasicInfoCustomCount(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysBasicInfoQueryVo
	 *            查询 条件 对象
	 */
	public List<SysBasicInfoCustom> getSysBasicInfoCustomListByQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param basicInfoId
	 *            主键
	 */
	public SysBasicInfoCustom getSysBasicInfoCustomByKey(Integer basicInfoId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysBasicInfoQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysBasicInfoCustom getSysBasicInfoCustomByKeyWithQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param basicInfoIdList
	 *            主键集合
	 */
	public List<SysBasicInfoCustom> getSysBasicInfoCustomListByKeyList(@Param("basicInfoIdList") List<Integer> basicInfoIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysBasicInfoQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysBasicInfoCustom> getSysBasicInfoListByKeyListWithQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysBasicInfoQueryVo
	 *            添加 的对象
	 */
	public Integer addSysBasicInfoCustomByQueryVo(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysBasicInfoCustom
	 *            添加 的对象
	 */
	public Integer addSysBasicInfoCustomByCustom(SysBasicInfoCustom sysBasicInfoCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param basicInfoId
	 *            删除的主键集合
	 */
	public Integer deleteSysBasicInfoCustomByKey(Integer basicInfoId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param basicInfoIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysBasicInfoCustomByKeyList(@Param("basicInfoIdList") List<Integer> basicInfoIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysBasicInfoQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysBasicInfoCustomByKeySelective(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysBasicInfoQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysBasicInfoCustomByKeySnapshots(SysBasicInfoQueryVo sysBasicInfoQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param basicInfoId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysBasicInfoCustomByKey(Integer basicInfoId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param basicInfoIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysBasicInfoCustomByKeyList(@Param("basicInfoIdList") List<Integer> basicInfoIdList);

}
