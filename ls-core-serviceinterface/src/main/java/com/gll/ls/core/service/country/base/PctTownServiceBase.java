package com.gll.ls.core.service.country.base;

import java.util.List;

import com.gll.ls.core.pojo.country.po.PctTown;
import com.gll.ls.core.pojo.country.po.PctTownExample;
import com.gll.ls.core.pojo.country.vo.PctTownCustom;
import com.gll.ls.core.pojo.country.vo.PctTownQueryVo;

public interface PctTownServiceBase {

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
	public List<PctTownCustom> getPctTownCustomListByKeyList(List<String> townCodeList);

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
	public Integer deletePctTownCustomByKeyList(List<String> townCodeList);

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

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int countByExample(PctTownExample example);

	/**
	 * 根据条件 删除
	 * 
	 * @param example
	 *            删除条件
	 * @return 影响的行数
	 */
	public int deleteByExample(PctTownExample example);

	/**
	 * 根据条件 统计数量
	 * 
	 * @param townCode
	 *            主键
	 * @return 影响的行数
	 */
	public int deleteByPrimaryKey(String townCode);

	/**
	 * 插入数据（硬插入）
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insert(PctTown record);

	/**
	 * 选择型插入 直插入非空字段
	 * 
	 * @param record
	 *            插入数据 对象
	 * @return 影响的行数
	 */
	public int insertSelective(PctTown record);

	/**
	 * 根据条件查询 list
	 * 
	 * @param example
	 *            查询条件 对象
	 * @return List<>集合
	 */
	public List<PctTown> selectByExample(PctTownExample example);

	/**
	 * 根据主键查询
	 * 
	 * @param featureId
	 *            主键
	 * @return 单个对象
	 */
	public PctTown selectByPrimaryKey(String townCode);

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExampleSelective(PctTown record, PctTownExample example);

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 * 
	 * @param record
	 *            更新内容
	 * @param example
	 *            where条件 对象
	 * @return 影响的行数
	 */
	public int updateByExample(PctTown record, PctTownExample example);

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKeySelective(PctTown record);

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 * 
	 * @param example
	 *            查询条件
	 * @return 返回数量
	 */
	public int updateByPrimaryKey(PctTown record);

}
