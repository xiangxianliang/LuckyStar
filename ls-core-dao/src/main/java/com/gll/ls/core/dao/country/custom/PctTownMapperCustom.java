package com.gll.ls.core.dao.country.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gll.ls.core.pojo.country.vo.PctTownCustom;
import com.gll.ls.core.pojo.country.vo.PctTownQueryVo;

public interface PctTownMapperCustom {

	/**
	 * 分页查询
	 * 
	 * @param pctTownQueryVo
	 *            查询 条件 对象
	 */
	public List<PctTownCustom> getPctTownCustomListWithPage(PctTownQueryVo pctTownQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param pctTownQueryVo
	 *            查询 条件 对象
	 */
	public int getPctTownCustomCount(PctTownQueryVo pctTownQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param pctTownQueryVo
	 *            查询 条件 对象
	 */
	public List<PctTownCustom> getPctTownCustomListByQueryVo(PctTownQueryVo pctTownQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param townCode
	 *            主键
	 */
	public PctTownCustom getPctTownCustomByKey(String townCode);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param pctTownQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public PctTownCustom getPctTownCustomByKeyWithQueryVo(PctTownQueryVo pctTownQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param townCodeList
	 *            主键集合
	 */
	public List<PctTownCustom> getPctTownCustomListByKeyList(@Param("townCodeList") List<String> townCodeList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param pctTownQueryVo
	 *            要查询的主键封装对象
	 */
	public List<PctTownCustom> getPctTownListByKeyListWithQueryVo(PctTownQueryVo pctTownQueryVo);

	/**
	 * 添加
	 * 
	 * @param pctTownQueryVo
	 *            添加 的对象
	 */
	public Integer addPctTownCustomByQueryVo(PctTownQueryVo pctTownQueryVo);

	/**
	 * 添加
	 * 
	 * @param pctTownCustom
	 *            添加 的对象
	 */
	public Integer addPctTownCustomByCustom(PctTownCustom pctTownCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param townCode
	 *            删除的主键集合
	 */
	public Integer deletePctTownCustomByKey(String townCode);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param townCodeList
	 *            删除的主键集合
	 */
	public Integer deletePctTownCustomByKeyList(@Param("townCodeList") List<String> townCodeList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param pctTownQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updatePctTownCustomByKeySelective(PctTownQueryVo pctTownQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param pctTownQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updatePctTownCustomByKeySnapshots(PctTownQueryVo pctTownQueryVo);

}
