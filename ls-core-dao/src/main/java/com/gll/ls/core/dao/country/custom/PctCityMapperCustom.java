package com.gll.ls.core.dao.country.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gll.ls.core.pojo.country.vo.PctCityCustom;
import com.gll.ls.core.pojo.country.vo.PctCityQueryVo;

public interface PctCityMapperCustom {

	/**
	 * 分页查询
	 * 
	 * @param pctCityQueryVo
	 *            查询 条件 对象
	 */
	public List<PctCityCustom> getPctCityCustomListWithPage(PctCityQueryVo pctCityQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param pctCityQueryVo
	 *            查询 条件 对象
	 */
	public int getPctCityCustomCount(PctCityQueryVo pctCityQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param pctCityQueryVo
	 *            查询 条件 对象
	 */
	public List<PctCityCustom> getPctCityCustomListByQueryVo(PctCityQueryVo pctCityQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param cityCode
	 *            主键
	 */
	public PctCityCustom getPctCityCustomByKey(String cityCode);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param pctCityQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public PctCityCustom getPctCityCustomByKeyWithQueryVo(PctCityQueryVo pctCityQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param cityCodeList
	 *            主键集合
	 */
	public List<PctCityCustom> getPctCityCustomListByKeyList(@Param("cityCodeList") List<String> cityCodeList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param pctCityQueryVo
	 *            要查询的主键封装对象
	 */
	public List<PctCityCustom> getPctCityListByKeyListWithQueryVo(PctCityQueryVo pctCityQueryVo);

	/**
	 * 添加
	 * 
	 * @param pctCityQueryVo
	 *            添加 的对象
	 */
	public Integer addPctCityCustomByQueryVo(PctCityQueryVo pctCityQueryVo);

	/**
	 * 添加
	 * 
	 * @param pctCityCustom
	 *            添加 的对象
	 */
	public Integer addPctCityCustomByCustom(PctCityCustom pctCityCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param cityCode
	 *            删除的主键集合
	 */
	public Integer deletePctCityCustomByKey(String cityCode);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param cityCodeList
	 *            删除的主键集合
	 */
	public Integer deletePctCityCustomByKeyList(@Param("cityCodeList") List<String> cityCodeList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param pctCityQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updatePctCityCustomByKeySelective(PctCityQueryVo pctCityQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param pctCityQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updatePctCityCustomByKeySnapshots(PctCityQueryVo pctCityQueryVo);

}
