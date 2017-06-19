package com.gll.ls.core.service.system.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysDictTypeMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysDictTypeMapper;
import com.gll.ls.core.pojo.system.po.SysDictType;
import com.gll.ls.core.pojo.system.po.SysDictTypeExample;
import com.gll.ls.core.pojo.system.vo.SysDictTypeCustom;
import com.gll.ls.core.pojo.system.vo.SysDictTypeQueryVo;
import com.gll.ls.core.service.system.base.SysDictTypeServiceBase;

@Service
@Transactional
public class SysDictTypeServiceBaseImpl implements SysDictTypeServiceBase {

	@Resource
	private SysDictTypeMapper sysDictTypeMapper;
	@Resource
	private SysDictTypeMapperCustom sysDictTypeMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<SysDictTypeCustom> getSysDictTypeCustomListWithPage(SysDictTypeQueryVo sysDictTypeQueryVo) {
		return sysDictTypeMapperCustom.getSysDictTypeCustomListWithPage(sysDictTypeQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getSysDictTypeCustomCount(SysDictTypeQueryVo sysDictTypeQueryVo) {
		return sysDictTypeMapperCustom.getSysDictTypeCustomCount(sysDictTypeQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<SysDictTypeCustom> getSysDictTypeCustomListByQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo) {
		return sysDictTypeMapperCustom.getSysDictTypeCustomListByQueryVo(sysDictTypeQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public SysDictTypeCustom getSysDictTypeCustomByKey(Integer typeId) {
		return sysDictTypeMapperCustom.getSysDictTypeCustomByKey(typeId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public SysDictTypeCustom getSysDictTypeCustomByKeyWithQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo) {
		return sysDictTypeMapperCustom.getSysDictTypeCustomByKeyWithQueryVo(sysDictTypeQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<SysDictTypeCustom> getSysDictTypeCustomListByKeyList(List<Integer> typeIdList) {
		return sysDictTypeMapperCustom.getSysDictTypeCustomListByKeyList(typeIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<SysDictTypeCustom> getSysDictTypeListByKeyListWithQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo) {
		return sysDictTypeMapperCustom.getSysDictTypeListByKeyListWithQueryVo(sysDictTypeQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysDictTypeCustomByQueryVo(SysDictTypeQueryVo sysDictTypeQueryVo) {
		return sysDictTypeMapperCustom.addSysDictTypeCustomByQueryVo(sysDictTypeQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysDictTypeCustomByCustom(SysDictTypeCustom sysDictTypeCustom) {
		return sysDictTypeMapperCustom.addSysDictTypeCustomByCustom(sysDictTypeCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteSysDictTypeCustomByKey(Integer typeId) {
		return sysDictTypeMapperCustom.deleteSysDictTypeCustomByKey(typeId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteSysDictTypeCustomByKeyList(List<Integer> typeIdList) {
		return sysDictTypeMapperCustom.deleteSysDictTypeCustomByKeyList(typeIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateSysDictTypeCustomByKeySelective(SysDictTypeQueryVo sysDictTypeQueryVo) {
		return sysDictTypeMapperCustom.updateSysDictTypeCustomByKeySelective(sysDictTypeQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateSysDictTypeCustomByKeySnapshots(SysDictTypeQueryVo sysDictTypeQueryVo) {
		return sysDictTypeMapperCustom.updateSysDictTypeCustomByKeySnapshots(sysDictTypeQueryVo);
	}

	/**
	 * 根据 主键 更新删除
	 */
	@Override
	public Integer updateDeleteSysDictTypeCustomByKey(Integer typeId) {
		return sysDictTypeMapperCustom.updateDeleteSysDictTypeCustomByKey(typeId);
	}

	/**
	 * 根据 主键 批量 更新删除
	 */
	@Override
	public Integer updateDeleteSysDictTypeCustomByKeyList(List<Integer> typeIdList) {
		return sysDictTypeMapperCustom.updateDeleteSysDictTypeCustomByKeyList(typeIdList);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(SysDictTypeExample example) {
		return sysDictTypeMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(SysDictTypeExample example) {
		return sysDictTypeMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer typeId) {
		return sysDictTypeMapper.deleteByPrimaryKey(typeId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(SysDictType record) {
		return sysDictTypeMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(SysDictType record) {
		return sysDictTypeMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<SysDictType> selectByExample(SysDictTypeExample example) {
		return sysDictTypeMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public SysDictType selectByPrimaryKey(Integer typeId) {
		return sysDictTypeMapper.selectByPrimaryKey(typeId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(SysDictType record, SysDictTypeExample example) {
		return sysDictTypeMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(SysDictType record, SysDictTypeExample example) {
		return sysDictTypeMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(SysDictType record) {
		return sysDictTypeMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(SysDictType record) {
		return sysDictTypeMapper.updateByPrimaryKey(record);
	}

}
