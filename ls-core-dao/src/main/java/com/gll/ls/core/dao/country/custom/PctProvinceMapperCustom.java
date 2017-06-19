package com.gll.ls.core.dao.country.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gll.ls.core.pojo.country.vo.PctProvinceCustom;
import com.gll.ls.core.pojo.country.vo.PctProvinceQueryVo;

public interface PctProvinceMapperCustom {

	/**
	 * 分页查询
	 * 
	 * @param pctProvinceQueryVo
	 *            查询 条件 对象
	 */
	public List<PctProvinceCustom> getPctProvinceCustomListWithPage(PctProvinceQueryVo pctProvinceQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param pctProvinceQueryVo
	 *            查询 条件 对象
	 */
	public int getPctProvinceCustomCount(PctProvinceQueryVo pctProvinceQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param pctProvinceQueryVo
	 *            查询 条件 对象
	 */
	public List<PctProvinceCustom> getPctProvinceCustomListByQueryVo(PctProvinceQueryVo pctProvinceQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param provinceCode
	 *            主键
	 */
	public PctProvinceCustom getPctProvinceCustomByKey(String provinceCode);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param pctProvinceQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public PctProvinceCustom getPctProvinceCustomByKeyWithQueryVo(PctProvinceQueryVo pctProvinceQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param provinceCodeList
	 *            主键集合
	 */
	public List<PctProvinceCustom> getPctProvinceCustomListByKeyList(@Param("provinceCodeList") List<String> provinceCodeList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param pctProvinceQueryVo
	 *            要查询的主键封装对象
	 */
	public List<PctProvinceCustom> getPctProvinceListByKeyListWithQueryVo(PctProvinceQueryVo pctProvinceQueryVo);

	/**
	 * 添加
	 * 
	 * @param pctProvinceQueryVo
	 *            添加 的对象
	 */
	public Integer addPctProvinceCustomByQueryVo(PctProvinceQueryVo pctProvinceQueryVo);

	/**
	 * 添加
	 * 
	 * @param pctProvinceCustom
	 *            添加 的对象
	 */
	public Integer addPctProvinceCustomByCustom(PctProvinceCustom pctProvinceCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param provinceCode
	 *            删除的主键集合
	 */
	public Integer deletePctProvinceCustomByKey(String provinceCode);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param provinceCodeList
	 *            删除的主键集合
	 */
	public Integer deletePctProvinceCustomByKeyList(@Param("provinceCodeList") List<String> provinceCodeList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param pctProvinceQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updatePctProvinceCustomByKeySelective(PctProvinceQueryVo pctProvinceQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param pctProvinceQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updatePctProvinceCustomByKeySnapshots(PctProvinceQueryVo pctProvinceQueryVo);

}
