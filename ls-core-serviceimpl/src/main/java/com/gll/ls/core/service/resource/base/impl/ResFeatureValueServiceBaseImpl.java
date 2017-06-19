package com.gll.ls.core.service.resource.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.resource.custom.ResFeatureValueMapperCustom;
import com.gll.ls.core.dao.resource.mapper.ResFeatureValueMapper;
import com.gll.ls.core.pojo.resource.po.ResFeatureValue;
import com.gll.ls.core.pojo.resource.po.ResFeatureValueExample;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueCustom;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueQueryVo;
import com.gll.ls.core.service.resource.base.ResFeatureValueServiceBase;

@Service
@Transactional
public class ResFeatureValueServiceBaseImpl implements ResFeatureValueServiceBase {

	@Resource
	private ResFeatureValueMapper resFeatureValueMapper;
	@Resource
	private ResFeatureValueMapperCustom resFeatureValueMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<ResFeatureValueCustom> getResFeatureValueCustomListWithPage(ResFeatureValueQueryVo resFeatureValueQueryVo) {
		return resFeatureValueMapperCustom.getResFeatureValueCustomListWithPage(resFeatureValueQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getResFeatureValueCustomCount(ResFeatureValueQueryVo resFeatureValueQueryVo) {
		return resFeatureValueMapperCustom.getResFeatureValueCustomCount(resFeatureValueQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<ResFeatureValueCustom> getResFeatureValueCustomListByQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo) {
		return resFeatureValueMapperCustom.getResFeatureValueCustomListByQueryVo(resFeatureValueQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public ResFeatureValueCustom getResFeatureValueCustomByKey(Integer featureValueId) {
		return resFeatureValueMapperCustom.getResFeatureValueCustomByKey(featureValueId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public ResFeatureValueCustom getResFeatureValueCustomByKeyWithQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo) {
		return resFeatureValueMapperCustom.getResFeatureValueCustomByKeyWithQueryVo(resFeatureValueQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<ResFeatureValueCustom> getResFeatureValueCustomListByKeyList(List<Integer> featureValueIdList) {
		return resFeatureValueMapperCustom.getResFeatureValueCustomListByKeyList(featureValueIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<ResFeatureValueCustom> getResFeatureValueListByKeyListWithQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo) {
		return resFeatureValueMapperCustom.getResFeatureValueListByKeyListWithQueryVo(resFeatureValueQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addResFeatureValueCustomByQueryVo(ResFeatureValueQueryVo resFeatureValueQueryVo) {
		return resFeatureValueMapperCustom.addResFeatureValueCustomByQueryVo(resFeatureValueQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addResFeatureValueCustomByCustom(ResFeatureValueCustom resFeatureValueCustom) {
		return resFeatureValueMapperCustom.addResFeatureValueCustomByCustom(resFeatureValueCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteResFeatureValueCustomByKey(Integer featureValueId) {
		return resFeatureValueMapperCustom.deleteResFeatureValueCustomByKey(featureValueId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteResFeatureValueCustomByKeyList(List<Integer> featureValueIdList) {
		return resFeatureValueMapperCustom.deleteResFeatureValueCustomByKeyList(featureValueIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateResFeatureValueCustomByKeySelective(ResFeatureValueQueryVo resFeatureValueQueryVo) {
		return resFeatureValueMapperCustom.updateResFeatureValueCustomByKeySelective(resFeatureValueQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateResFeatureValueCustomByKeySnapshots(ResFeatureValueQueryVo resFeatureValueQueryVo) {
		return resFeatureValueMapperCustom.updateResFeatureValueCustomByKeySnapshots(resFeatureValueQueryVo);
	}

	/**
	 * 根据 主键 更新删除
	 */
	@Override
	public Integer updateDeleteResFeatureValueCustomByKey(Integer featureValueId) {
		return resFeatureValueMapperCustom.updateDeleteResFeatureValueCustomByKey(featureValueId);
	}

	/**
	 * 根据 主键 批量 更新删除
	 */
	@Override
	public Integer updateDeleteResFeatureValueCustomByKeyList(List<Integer> featureValueIdList) {
		return resFeatureValueMapperCustom.updateDeleteResFeatureValueCustomByKeyList(featureValueIdList);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(ResFeatureValueExample example) {
		return resFeatureValueMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(ResFeatureValueExample example) {
		return resFeatureValueMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer featureValueId) {
		return resFeatureValueMapper.deleteByPrimaryKey(featureValueId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(ResFeatureValue record) {
		return resFeatureValueMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(ResFeatureValue record) {
		return resFeatureValueMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<ResFeatureValue> selectByExample(ResFeatureValueExample example) {
		return resFeatureValueMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public ResFeatureValue selectByPrimaryKey(Integer featureValueId) {
		return resFeatureValueMapper.selectByPrimaryKey(featureValueId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(ResFeatureValue record, ResFeatureValueExample example) {
		return resFeatureValueMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(ResFeatureValue record, ResFeatureValueExample example) {
		return resFeatureValueMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(ResFeatureValue record) {
		return resFeatureValueMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(ResFeatureValue record) {
		return resFeatureValueMapper.updateByPrimaryKey(record);
	}

}
