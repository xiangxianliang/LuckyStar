package com.gll.ls.core.service.country.base;

import java.util.List;

import com.gll.ls.core.pojo.country.po.PctCity;
import com.gll.ls.core.pojo.country.po.PctCityExample;
import com.gll.ls.core.pojo.country.vo.PctCityCustom;
import com.gll.ls.core.pojo.country.vo.PctCityQueryVo;

public interface PctCityServiceBase {

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
	public List<PctCityCustom> getPctCityCustomListByKeyList(List<String> cityCodeList);

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
	public Integer deletePctCityCustomByKeyList(List<String> cityCodeList);

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

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(PctCityExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(PctCityExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param cityCode
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(String cityCode);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(PctCity record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(PctCity record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<PctCity> selectByExample(PctCityExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public PctCity selectByPrimaryKey(String cityCode);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(PctCity record, PctCityExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(PctCity record, PctCityExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(PctCity record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(PctCity record);

}
