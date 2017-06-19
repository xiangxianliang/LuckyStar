package com.gll.ls.core.service.country.base;

import java.util.List;

import com.gll.ls.core.pojo.country.po.PctProvince;
import com.gll.ls.core.pojo.country.po.PctProvinceExample;
import com.gll.ls.core.pojo.country.vo.PctProvinceCustom;
import com.gll.ls.core.pojo.country.vo.PctProvinceQueryVo;

public interface PctProvinceServiceBase {

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
	public List<PctProvinceCustom> getPctProvinceCustomListByKeyList(List<String> provinceCodeList);

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
	public Integer deletePctProvinceCustomByKeyList(List<String> provinceCodeList);

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

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(PctProvinceExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(PctProvinceExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param provinceCode
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(String provinceCode);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(PctProvince record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(PctProvince record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<PctProvince> selectByExample(PctProvinceExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public PctProvince selectByPrimaryKey(String provinceCode);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(PctProvince record, PctProvinceExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(PctProvince record, PctProvinceExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(PctProvince record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(PctProvince record);

}
