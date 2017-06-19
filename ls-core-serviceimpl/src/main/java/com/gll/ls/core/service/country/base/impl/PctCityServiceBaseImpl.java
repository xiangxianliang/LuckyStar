package com.gll.ls.core.service.country.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.country.custom.PctCityMapperCustom;
import com.gll.ls.core.dao.country.mapper.PctCityMapper;
import com.gll.ls.core.pojo.country.po.PctCity;
import com.gll.ls.core.pojo.country.po.PctCityExample;
import com.gll.ls.core.pojo.country.vo.PctCityCustom;
import com.gll.ls.core.pojo.country.vo.PctCityQueryVo;
import com.gll.ls.core.service.country.base.PctCityServiceBase;

@Service
@Transactional
public class PctCityServiceBaseImpl implements PctCityServiceBase {

	@Resource
	private PctCityMapper pctCityMapper;
	@Resource
	private PctCityMapperCustom pctCityMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<PctCityCustom> getPctCityCustomListWithPage(PctCityQueryVo pctCityQueryVo) {
		return pctCityMapperCustom.getPctCityCustomListWithPage(pctCityQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getPctCityCustomCount(PctCityQueryVo pctCityQueryVo) {
		return pctCityMapperCustom.getPctCityCustomCount(pctCityQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<PctCityCustom> getPctCityCustomListByQueryVo(PctCityQueryVo pctCityQueryVo) {
		return pctCityMapperCustom.getPctCityCustomListByQueryVo(pctCityQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public PctCityCustom getPctCityCustomByKey(String cityCode) {
		return pctCityMapperCustom.getPctCityCustomByKey(cityCode);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public PctCityCustom getPctCityCustomByKeyWithQueryVo(PctCityQueryVo pctCityQueryVo) {
		return pctCityMapperCustom.getPctCityCustomByKeyWithQueryVo(pctCityQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<PctCityCustom> getPctCityCustomListByKeyList(List<String> cityCodeList) {
		return pctCityMapperCustom.getPctCityCustomListByKeyList(cityCodeList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<PctCityCustom> getPctCityListByKeyListWithQueryVo(PctCityQueryVo pctCityQueryVo) {
		return pctCityMapperCustom.getPctCityListByKeyListWithQueryVo(pctCityQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addPctCityCustomByQueryVo(PctCityQueryVo pctCityQueryVo) {
		return pctCityMapperCustom.addPctCityCustomByQueryVo(pctCityQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addPctCityCustomByCustom(PctCityCustom pctCityCustom) {
		return pctCityMapperCustom.addPctCityCustomByCustom(pctCityCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deletePctCityCustomByKey(String cityCode) {
		return pctCityMapperCustom.deletePctCityCustomByKey(cityCode);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deletePctCityCustomByKeyList(List<String> cityCodeList) {
		return pctCityMapperCustom.deletePctCityCustomByKeyList(cityCodeList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updatePctCityCustomByKeySelective(PctCityQueryVo pctCityQueryVo) {
		return pctCityMapperCustom.updatePctCityCustomByKeySelective(pctCityQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updatePctCityCustomByKeySnapshots(PctCityQueryVo pctCityQueryVo) {
		return pctCityMapperCustom.updatePctCityCustomByKeySnapshots(pctCityQueryVo);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(PctCityExample example) {
		return pctCityMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(PctCityExample example) {
		return pctCityMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(String cityCode) {
		return pctCityMapper.deleteByPrimaryKey(cityCode);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(PctCity record) {
		return pctCityMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(PctCity record) {
		return pctCityMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<PctCity> selectByExample(PctCityExample example) {
		return pctCityMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public PctCity selectByPrimaryKey(String cityCode) {
		return pctCityMapper.selectByPrimaryKey(cityCode);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(PctCity record, PctCityExample example) {
		return pctCityMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(PctCity record, PctCityExample example) {
		return pctCityMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(PctCity record) {
		return pctCityMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(PctCity record) {
		return pctCityMapper.updateByPrimaryKey(record);
	}

}
