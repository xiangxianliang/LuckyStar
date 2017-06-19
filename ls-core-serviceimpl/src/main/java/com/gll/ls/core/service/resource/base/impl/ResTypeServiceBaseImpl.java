package com.gll.ls.core.service.resource.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.resource.custom.ResTypeMapperCustom;
import com.gll.ls.core.dao.resource.mapper.ResTypeMapper;
import com.gll.ls.core.pojo.resource.po.ResType;
import com.gll.ls.core.pojo.resource.po.ResTypeExample;
import com.gll.ls.core.pojo.resource.vo.ResTypeCustom;
import com.gll.ls.core.pojo.resource.vo.ResTypeQueryVo;
import com.gll.ls.core.service.resource.base.ResTypeServiceBase;

@Service
@Transactional
public class ResTypeServiceBaseImpl implements ResTypeServiceBase {

	@Resource
	private ResTypeMapper resTypeMapper;
	@Resource
	private ResTypeMapperCustom resTypeMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<ResTypeCustom> getResTypeCustomListWithPage(ResTypeQueryVo resTypeQueryVo) {
		return resTypeMapperCustom.getResTypeCustomListWithPage(resTypeQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getResTypeCustomCount(ResTypeQueryVo resTypeQueryVo) {
		return resTypeMapperCustom.getResTypeCustomCount(resTypeQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<ResTypeCustom> getResTypeCustomListByQueryVo(ResTypeQueryVo resTypeQueryVo) {
		return resTypeMapperCustom.getResTypeCustomListByQueryVo(resTypeQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public ResTypeCustom getResTypeCustomByKey(Integer typeId) {
		return resTypeMapperCustom.getResTypeCustomByKey(typeId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public ResTypeCustom getResTypeCustomByKeyWithQueryVo(ResTypeQueryVo resTypeQueryVo) {
		return resTypeMapperCustom.getResTypeCustomByKeyWithQueryVo(resTypeQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<ResTypeCustom> getResTypeCustomListByKeyList(List<Integer> typeIdList) {
		return resTypeMapperCustom.getResTypeCustomListByKeyList(typeIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<ResTypeCustom> getResTypeListByKeyListWithQueryVo(ResTypeQueryVo resTypeQueryVo) {
		return resTypeMapperCustom.getResTypeListByKeyListWithQueryVo(resTypeQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addResTypeCustomByQueryVo(ResTypeQueryVo resTypeQueryVo) {
		return resTypeMapperCustom.addResTypeCustomByQueryVo(resTypeQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addResTypeCustomByCustom(ResTypeCustom resTypeCustom) {
		return resTypeMapperCustom.addResTypeCustomByCustom(resTypeCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteResTypeCustomByKey(Integer typeId) {
		return resTypeMapperCustom.deleteResTypeCustomByKey(typeId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteResTypeCustomByKeyList(List<Integer> typeIdList) {
		return resTypeMapperCustom.deleteResTypeCustomByKeyList(typeIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateResTypeCustomByKeySelective(ResTypeQueryVo resTypeQueryVo) {
		return resTypeMapperCustom.updateResTypeCustomByKeySelective(resTypeQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateResTypeCustomByKeySnapshots(ResTypeQueryVo resTypeQueryVo) {
		return resTypeMapperCustom.updateResTypeCustomByKeySnapshots(resTypeQueryVo);
	}

	/**
	 * 根据 主键 更新删除
	 */
	@Override
	public Integer updateDeleteResTypeCustomByKey(Integer typeId) {
		return resTypeMapperCustom.updateDeleteResTypeCustomByKey(typeId);
	}

	/**
	 * 根据 主键 批量 更新删除
	 */
	@Override
	public Integer updateDeleteResTypeCustomByKeyList(List<Integer> typeIdList) {
		return resTypeMapperCustom.updateDeleteResTypeCustomByKeyList(typeIdList);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(ResTypeExample example) {
		return resTypeMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(ResTypeExample example) {
		return resTypeMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer typeId) {
		return resTypeMapper.deleteByPrimaryKey(typeId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(ResType record) {
		return resTypeMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(ResType record) {
		return resTypeMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<ResType> selectByExample(ResTypeExample example) {
		return resTypeMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public ResType selectByPrimaryKey(Integer typeId) {
		return resTypeMapper.selectByPrimaryKey(typeId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(ResType record, ResTypeExample example) {
		return resTypeMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(ResType record, ResTypeExample example) {
		return resTypeMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(ResType record) {
		return resTypeMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(ResType record) {
		return resTypeMapper.updateByPrimaryKey(record);
	}

}
