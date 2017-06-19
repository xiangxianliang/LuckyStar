package com.gll.ls.core.dao.system.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.system.vo.SysDictInfoQueryVo;
import com.gll.ls.core.pojo.system.vo.SysDictInfoCustom;

public interface SysDictInfoMapperCustom {

	/**
	 * 分页查询
	 * 
	 * @param sysDictInfoQueryVo
	 *            查询 条件 对象
	 */
	public List<SysDictInfoCustom> getSysDictInfoCustomListWithPage(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysDictInfoQueryVo
	 *            查询 条件 对象
	 */
	public int getSysDictInfoCustomCount(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysDictInfoQueryVo
	 *            查询 条件 对象
	 */
	public List<SysDictInfoCustom> getSysDictInfoCustomListByQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param infoId
	 *            主键
	 */
	public SysDictInfoCustom getSysDictInfoCustomByKey(Integer infoId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysDictInfoQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysDictInfoCustom getSysDictInfoCustomByKeyWithQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param infoIdList
	 *            主键集合
	 */
	public List<SysDictInfoCustom> getSysDictInfoCustomListByKeyList(@Param("infoIdList") List<Integer> infoIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysDictInfoQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysDictInfoCustom> getSysDictInfoListByKeyListWithQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysDictInfoQueryVo
	 *            添加 的对象
	 */
	public Integer addSysDictInfoCustomByQueryVo(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysDictInfoCustom
	 *            添加 的对象
	 */
	public Integer addSysDictInfoCustomByCustom(SysDictInfoCustom sysDictInfoCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param infoId
	 *            删除的主键集合
	 */
	public Integer deleteSysDictInfoCustomByKey(Integer infoId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param infoIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysDictInfoCustomByKeyList(@Param("infoIdList") List<Integer> infoIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysDictInfoQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysDictInfoCustomByKeySelective(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysDictInfoQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysDictInfoCustomByKeySnapshots(SysDictInfoQueryVo sysDictInfoQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param infoId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysDictInfoCustomByKey(Integer infoId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param infoIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysDictInfoCustomByKeyList(@Param("infoIdList") List<Integer> infoIdList);

}
