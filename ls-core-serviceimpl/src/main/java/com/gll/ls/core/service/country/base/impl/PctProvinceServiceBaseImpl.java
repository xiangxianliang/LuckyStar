package com.gll.ls.core.service.country.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.country.custom.PctProvinceMapperCustom;
import com.gll.ls.core.dao.country.mapper.PctProvinceMapper;
import com.gll.ls.core.pojo.country.po.PctProvince;
import com.gll.ls.core.pojo.country.po.PctProvinceExample;
import com.gll.ls.core.pojo.country.vo.PctProvinceCustom;
import com.gll.ls.core.pojo.country.vo.PctProvinceQueryVo;
import com.gll.ls.core.service.country.base.PctProvinceServiceBase;

@Service
@Transactional
public class PctProvinceServiceBaseImpl implements PctProvinceServiceBase {

	@Resource
	private PctProvinceMapper pctProvinceMapper;
	@Resource
	private PctProvinceMapperCustom pctProvinceMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<PctProvinceCustom> getPctProvinceCustomListWithPage(PctProvinceQueryVo pctProvinceQueryVo) {
		return pctProvinceMapperCustom.getPctProvinceCustomListWithPage(pctProvinceQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getPctProvinceCustomCount(PctProvinceQueryVo pctProvinceQueryVo) {
		return pctProvinceMapperCustom.getPctProvinceCustomCount(pctProvinceQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<PctProvinceCustom> getPctProvinceCustomListByQueryVo(PctProvinceQueryVo pctProvinceQueryVo) {
		return pctProvinceMapperCustom.getPctProvinceCustomListByQueryVo(pctProvinceQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public PctProvinceCustom getPctProvinceCustomByKey(String provinceCode) {
		return pctProvinceMapperCustom.getPctProvinceCustomByKey(provinceCode);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public PctProvinceCustom getPctProvinceCustomByKeyWithQueryVo(PctProvinceQueryVo pctProvinceQueryVo) {
		return pctProvinceMapperCustom.getPctProvinceCustomByKeyWithQueryVo(pctProvinceQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<PctProvinceCustom> getPctProvinceCustomListByKeyList(List<String> provinceCodeList) {
		return pctProvinceMapperCustom.getPctProvinceCustomListByKeyList(provinceCodeList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<PctProvinceCustom> getPctProvinceListByKeyListWithQueryVo(PctProvinceQueryVo pctProvinceQueryVo) {
		return pctProvinceMapperCustom.getPctProvinceListByKeyListWithQueryVo(pctProvinceQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addPctProvinceCustomByQueryVo(PctProvinceQueryVo pctProvinceQueryVo) {
		return pctProvinceMapperCustom.addPctProvinceCustomByQueryVo(pctProvinceQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addPctProvinceCustomByCustom(PctProvinceCustom pctProvinceCustom) {
		return pctProvinceMapperCustom.addPctProvinceCustomByCustom(pctProvinceCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deletePctProvinceCustomByKey(String provinceCode) {
		return pctProvinceMapperCustom.deletePctProvinceCustomByKey(provinceCode);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deletePctProvinceCustomByKeyList(List<String> provinceCodeList) {
		return pctProvinceMapperCustom.deletePctProvinceCustomByKeyList(provinceCodeList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updatePctProvinceCustomByKeySelective(PctProvinceQueryVo pctProvinceQueryVo) {
		return pctProvinceMapperCustom.updatePctProvinceCustomByKeySelective(pctProvinceQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updatePctProvinceCustomByKeySnapshots(PctProvinceQueryVo pctProvinceQueryVo) {
		return pctProvinceMapperCustom.updatePctProvinceCustomByKeySnapshots(pctProvinceQueryVo);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(PctProvinceExample example) {
		return pctProvinceMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(PctProvinceExample example) {
		return pctProvinceMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(String provinceCode) {
		return pctProvinceMapper.deleteByPrimaryKey(provinceCode);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(PctProvince record) {
		return pctProvinceMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(PctProvince record) {
		return pctProvinceMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<PctProvince> selectByExample(PctProvinceExample example) {
		return pctProvinceMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public PctProvince selectByPrimaryKey(String provinceCode) {
		return pctProvinceMapper.selectByPrimaryKey(provinceCode);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(PctProvince record, PctProvinceExample example) {
		return pctProvinceMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(PctProvince record, PctProvinceExample example) {
		return pctProvinceMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(PctProvince record) {
		return pctProvinceMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(PctProvince record) {
		return pctProvinceMapper.updateByPrimaryKey(record);
	}

}
