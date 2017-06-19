package com.gll.ls.core.service.country.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.country.custom.PctTownMapperCustom;
import com.gll.ls.core.dao.country.mapper.PctTownMapper;
import com.gll.ls.core.pojo.country.po.PctTown;
import com.gll.ls.core.pojo.country.po.PctTownExample;
import com.gll.ls.core.pojo.country.vo.PctTownCustom;
import com.gll.ls.core.pojo.country.vo.PctTownQueryVo;
import com.gll.ls.core.service.country.base.PctTownServiceBase;

@Service
@Transactional
public class PctTownServiceBaseImpl implements PctTownServiceBase {

	@Resource
	private PctTownMapper pctTownMapper;
	@Resource
	private PctTownMapperCustom pctTownMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<PctTownCustom> getPctTownCustomListWithPage(PctTownQueryVo pctTownQueryVo) {
		return pctTownMapperCustom.getPctTownCustomListWithPage(pctTownQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getPctTownCustomCount(PctTownQueryVo pctTownQueryVo) {
		return pctTownMapperCustom.getPctTownCustomCount(pctTownQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<PctTownCustom> getPctTownCustomListByQueryVo(PctTownQueryVo pctTownQueryVo) {
		return pctTownMapperCustom.getPctTownCustomListByQueryVo(pctTownQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public PctTownCustom getPctTownCustomByKey(String townCode) {
		return pctTownMapperCustom.getPctTownCustomByKey(townCode);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public PctTownCustom getPctTownCustomByKeyWithQueryVo(PctTownQueryVo pctTownQueryVo) {
		return pctTownMapperCustom.getPctTownCustomByKeyWithQueryVo(pctTownQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<PctTownCustom> getPctTownCustomListByKeyList(List<String> townCodeList) {
		return pctTownMapperCustom.getPctTownCustomListByKeyList(townCodeList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<PctTownCustom> getPctTownListByKeyListWithQueryVo(PctTownQueryVo pctTownQueryVo) {
		return pctTownMapperCustom.getPctTownListByKeyListWithQueryVo(pctTownQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addPctTownCustomByQueryVo(PctTownQueryVo pctTownQueryVo) {
		return pctTownMapperCustom.addPctTownCustomByQueryVo(pctTownQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addPctTownCustomByCustom(PctTownCustom pctTownCustom) {
		return pctTownMapperCustom.addPctTownCustomByCustom(pctTownCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deletePctTownCustomByKey(String townCode) {
		return pctTownMapperCustom.deletePctTownCustomByKey(townCode);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deletePctTownCustomByKeyList(List<String> townCodeList) {
		return pctTownMapperCustom.deletePctTownCustomByKeyList(townCodeList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updatePctTownCustomByKeySelective(PctTownQueryVo pctTownQueryVo) {
		return pctTownMapperCustom.updatePctTownCustomByKeySelective(pctTownQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updatePctTownCustomByKeySnapshots(PctTownQueryVo pctTownQueryVo) {
		return pctTownMapperCustom.updatePctTownCustomByKeySnapshots(pctTownQueryVo);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(PctTownExample example) {
		return pctTownMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(PctTownExample example) {
		return pctTownMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(String townCode) {
		return pctTownMapper.deleteByPrimaryKey(townCode);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(PctTown record) {
		return pctTownMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(PctTown record) {
		return pctTownMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<PctTown> selectByExample(PctTownExample example) {
		return pctTownMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public PctTown selectByPrimaryKey(String townCode) {
		return pctTownMapper.selectByPrimaryKey(townCode);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(PctTown record, PctTownExample example) {
		return pctTownMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(PctTown record, PctTownExample example) {
		return pctTownMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(PctTown record) {
		return pctTownMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(PctTown record) {
		return pctTownMapper.updateByPrimaryKey(record);
	}

}
