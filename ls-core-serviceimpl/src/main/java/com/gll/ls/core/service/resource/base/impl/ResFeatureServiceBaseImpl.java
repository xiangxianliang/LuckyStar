package com.gll.ls.core.service.resource.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.resource.custom.ResFeatureMapperCustom;
import com.gll.ls.core.dao.resource.mapper.ResFeatureMapper;
import com.gll.ls.core.pojo.resource.po.ResFeature;
import com.gll.ls.core.pojo.resource.po.ResFeatureExample;
import com.gll.ls.core.pojo.resource.vo.ResFeatureCustom;
import com.gll.ls.core.pojo.resource.vo.ResFeatureQueryVo;
import com.gll.ls.core.service.resource.base.ResFeatureServiceBase;

@Service
@Transactional
public class ResFeatureServiceBaseImpl implements ResFeatureServiceBase {

	@Resource
	private ResFeatureMapper resFeatureMapper;
	@Resource
	private ResFeatureMapperCustom resFeatureMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<ResFeatureCustom> getResFeatureCustomListWithPage(ResFeatureQueryVo resFeatureQueryVo) {
		return resFeatureMapperCustom.getResFeatureCustomListWithPage(resFeatureQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getResFeatureCustomCount(ResFeatureQueryVo resFeatureQueryVo) {
		return resFeatureMapperCustom.getResFeatureCustomCount(resFeatureQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<ResFeatureCustom> getResFeatureCustomListByQueryVo(ResFeatureQueryVo resFeatureQueryVo) {
		return resFeatureMapperCustom.getResFeatureCustomListByQueryVo(resFeatureQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public ResFeatureCustom getResFeatureCustomByKey(Integer featureId) {
		return resFeatureMapperCustom.getResFeatureCustomByKey(featureId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public ResFeatureCustom getResFeatureCustomByKeyWithQueryVo(ResFeatureQueryVo resFeatureQueryVo) {
		return resFeatureMapperCustom.getResFeatureCustomByKeyWithQueryVo(resFeatureQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<ResFeatureCustom> getResFeatureCustomListByKeyList(List<Integer> featureIdList) {
		return resFeatureMapperCustom.getResFeatureCustomListByKeyList(featureIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<ResFeatureCustom> getResFeatureListByKeyListWithQueryVo(ResFeatureQueryVo resFeatureQueryVo) {
		return resFeatureMapperCustom.getResFeatureListByKeyListWithQueryVo(resFeatureQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addResFeatureCustomByQueryVo(ResFeatureQueryVo resFeatureQueryVo) {
		return resFeatureMapperCustom.addResFeatureCustomByQueryVo(resFeatureQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addResFeatureCustomByCustom(ResFeatureCustom resFeatureCustom) {
		return resFeatureMapperCustom.addResFeatureCustomByCustom(resFeatureCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteResFeatureCustomByKey(Integer featureId) {
		return resFeatureMapperCustom.deleteResFeatureCustomByKey(featureId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteResFeatureCustomByKeyList(List<Integer> featureIdList) {
		return resFeatureMapperCustom.deleteResFeatureCustomByKeyList(featureIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateResFeatureCustomByKeySelective(ResFeatureQueryVo resFeatureQueryVo) {
		return resFeatureMapperCustom.updateResFeatureCustomByKeySelective(resFeatureQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateResFeatureCustomByKeySnapshots(ResFeatureQueryVo resFeatureQueryVo) {
		return resFeatureMapperCustom.updateResFeatureCustomByKeySnapshots(resFeatureQueryVo);
	}

	/**
	 * 根据 主键 更新删除
	 */
	@Override
	public Integer updateDeleteResFeatureCustomByKey(Integer featureId) {
		return resFeatureMapperCustom.updateDeleteResFeatureCustomByKey(featureId);
	}

	/**
	 * 根据 主键 批量 更新删除
	 */
	@Override
	public Integer updateDeleteResFeatureCustomByKeyList(List<Integer> featureIdList) {
		return resFeatureMapperCustom.updateDeleteResFeatureCustomByKeyList(featureIdList);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(ResFeatureExample example) {
		return resFeatureMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(ResFeatureExample example) {
		return resFeatureMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer featureId) {
		return resFeatureMapper.deleteByPrimaryKey(featureId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(ResFeature record) {
		return resFeatureMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(ResFeature record) {
		return resFeatureMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<ResFeature> selectByExample(ResFeatureExample example) {
		return resFeatureMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public ResFeature selectByPrimaryKey(Integer featureId) {
		return resFeatureMapper.selectByPrimaryKey(featureId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(ResFeature record, ResFeatureExample example) {
		return resFeatureMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(ResFeature record, ResFeatureExample example) {
		return resFeatureMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(ResFeature record) {
		return resFeatureMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(ResFeature record) {
		return resFeatureMapper.updateByPrimaryKey(record);
	}

}
