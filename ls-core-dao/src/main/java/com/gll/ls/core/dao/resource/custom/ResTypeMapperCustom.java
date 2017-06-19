package com.gll.ls.core.dao.resource.custom;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gll.ls.core.pojo.resource.vo.ResTypeQueryVo;
import com.gll.ls.core.pojo.resource.vo.ResTypeCustom;

public interface ResTypeMapperCustom {

	/**
	 * 分页查询
	 * 
	 * @param resTypeQueryVo
	 *            查询 条件 对象
	 */
	public List<ResTypeCustom> getResTypeCustomListWithPage(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 数据总数
	 * 
	 * @param resTypeQueryVo
	 *            查询 条件 对象
	 */
	public int getResTypeCustomCount(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 查询数据集合
	 * 
	 * @param resTypeQueryVo
	 *            查询 条件 对象
	 */
	public List<ResTypeCustom> getResTypeCustomListByQueryVo(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 根据 主键 查找
	 * 
	 * @param typeId
	 *            主键
	 */
	public ResTypeCustom getResTypeCustomByKey(Integer typeId);

	/**
	 * 根据主键查找 带结果查询字段
	 * 
	 * @param resTypeQueryVo
	 *            根据主键查找 带结果查询字段
	 */
	public ResTypeCustom getResTypeCustomByKeyWithQueryVo(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 根据 主键集合 批量查找 List集合
	 * 
	 * @param typeIdList
	 *            主键集合
	 */
	public List<ResTypeCustom> getResTypeCustomListByKeyList(@Param("typeIdList") List<Integer> typeIdList);

	/**
	 * 根据 主键 批量查找
	 * 
	 * @param resTypeQueryVo
	 *            要查询的主键封装对象
	 */
	public List<ResTypeCustom> getResTypeListByKeyListWithQueryVo(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 添加
	 * 
	 * @param resTypeQueryVo
	 *            添加 的对象
	 */
	public Integer addResTypeCustomByQueryVo(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 添加
	 * 
	 * @param resTypeCustom
	 *            添加 的对象
	 */
	public Integer addResTypeCustomByCustom(ResTypeCustom resTypeCustom);

	/**
	 * 根据 主键 删除
	 * 
	 * @param typeId
	 *            删除的主键集合
	 */
	public Integer deleteResTypeCustomByKey(Integer typeId);

	/**
	 * 根据 主键 批量删除
	 * 
	 * @param typeIdList
	 *            删除的主键集合
	 */
	public Integer deleteResTypeCustomByKeyList(@Param("typeIdList") List<Integer> typeIdList);

	/**
	 * 根据 主键 更新
	 * 
	 * @param resTypeQueryVo
	 *            更新的主键&更新的数据
	 */
	public Integer updateResTypeCustomByKeySelective(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 根据 主键 更新 带快照
	 * 
	 * @param resTypeQueryVo
	 *            更新的主键&更新的数据&更新快照字段
	 */
	public Integer updateResTypeCustomByKeySnapshots(ResTypeQueryVo resTypeQueryVo);

	/**
	 * 根据 主键 更新删除
	 * 
	 * @param typeId
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteResTypeCustomByKey(Integer typeId);

	/**
	 * 根据 主键 批量 更新删除
	 * 
	 * @param typeIdList
	 *            更新删除的主键集合
	 */
	public Integer updateDeleteResTypeCustomByKeyList(@Param("typeIdList") List<Integer> typeIdList);

}
