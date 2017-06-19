package com.gll.ls.core.dao.system.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.system.vo.SysDictTypeQueryVo;
import com.gll.ls.core.pojo.system.vo.SysDictTypeCustom;

public interface SysDictTypeMapperCustom {

	/**
	 * 分页查询
	 * 
	 * @param sysDictTypeQueryVo
	 *            查询 条件 对象
	 */
	public List<SysDictTypeCustom> getSysDictTypeCustomListWithPage(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param sysDictTypeQueryVo
	 *            查询 条件 对象
	 */
	public int getSysDictTypeCustomCount(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param sysDictTypeQueryVo
	 *            查询 条件 对象
	 */
	public List<SysDictTypeCustom> getSysDictTypeCustomListByQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param typeId
	 *            主键
	 */
	public SysDictTypeCustom getSysDictTypeCustomByKey(Integer typeId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param sysDictTypeQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public SysDictTypeCustom getSysDictTypeCustomByKeyWithQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param typeIdList
	 *            主键集合
	 */
	public List<SysDictTypeCustom> getSysDictTypeCustomListByKeyList(@Param("typeIdList") List<Integer> typeIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param sysDictTypeQueryVo
	 *            要查询的主键封装对象
	 */
	public List<SysDictTypeCustom> getSysDictTypeListByKeyListWithQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysDictTypeQueryVo
	 *            添加 的对象
	 */
	public Integer addSysDictTypeCustomByQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 添加
	 * 
	 * @param sysDictTypeCustom
	 *            添加 的对象
	 */
	public Integer addSysDictTypeCustomByCustom(SysDictTypeCustom sysDictTypeCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param typeId
	 *            删除的主键集合
	 */
	public Integer deleteSysDictTypeCustomByKey(Integer typeId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param typeIdList
	 *            删除的主键集合
	 */
	public Integer deleteSysDictTypeCustomByKeyList(@Param("typeIdList") List<Integer> typeIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param sysDictTypeQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateSysDictTypeCustomByKeySelective(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param sysDictTypeQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateSysDictTypeCustomByKeySnapshots(SysDictTypeQueryVo sysDictTypeQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param typeId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysDictTypeCustomByKey(Integer typeId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param typeIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteSysDictTypeCustomByKeyList(@Param("typeIdList") List<Integer> typeIdList);

}
