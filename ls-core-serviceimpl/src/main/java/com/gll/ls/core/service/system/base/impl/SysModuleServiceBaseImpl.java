package com.gll.ls.core.service.system.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysModuleMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysModuleMapper;
import com.gll.ls.core.pojo.system.po.SysModule;
import com.gll.ls.core.pojo.system.po.SysModuleExample;
import com.gll.ls.core.pojo.system.vo.SysModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysModuleQueryVo;
import com.gll.ls.core.service.system.base.SysModuleServiceBase;

@Service
@Transactional
public class SysModuleServiceBaseImpl implements SysModuleServiceBase {

	@Resource
	private SysModuleMapper sysModuleMapper;
	@Resource
	private SysModuleMapperCustom sysModuleMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<SysModuleCustom> getSysModuleCustomListWithPage(SysModuleQueryVo sysModuleQueryVo) {
		return sysModuleMapperCustom.getSysModuleCustomListWithPage(sysModuleQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getSysModuleCustomCount(SysModuleQueryVo sysModuleQueryVo) {
		return sysModuleMapperCustom.getSysModuleCustomCount(sysModuleQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<SysModuleCustom> getSysModuleCustomListByQueryVo(SysModuleQueryVo sysModuleQueryVo) {
		return sysModuleMapperCustom.getSysModuleCustomListByQueryVo(sysModuleQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public SysModuleCustom getSysModuleCustomByKey(Integer moduleId) {
		return sysModuleMapperCustom.getSysModuleCustomByKey(moduleId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public SysModuleCustom getSysModuleCustomByKeyWithQueryVo(SysModuleQueryVo sysModuleQueryVo) {
		return sysModuleMapperCustom.getSysModuleCustomByKeyWithQueryVo(sysModuleQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<SysModuleCustom> getSysModuleCustomListByKeyList(List<Integer> moduleIdList) {
		return sysModuleMapperCustom.getSysModuleCustomListByKeyList(moduleIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<SysModuleCustom> getSysModuleListByKeyListWithQueryVo(SysModuleQueryVo sysModuleQueryVo) {
		return sysModuleMapperCustom.getSysModuleListByKeyListWithQueryVo(sysModuleQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysModuleCustomByQueryVo(SysModuleQueryVo sysModuleQueryVo) {
		return sysModuleMapperCustom.addSysModuleCustomByQueryVo(sysModuleQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysModuleCustomByCustom(SysModuleCustom sysModuleCustom) {
		return sysModuleMapperCustom.addSysModuleCustomByCustom(sysModuleCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteSysModuleCustomByKey(Integer moduleId) {
		return sysModuleMapperCustom.deleteSysModuleCustomByKey(moduleId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteSysModuleCustomByKeyList(List<Integer> moduleIdList) {
		return sysModuleMapperCustom.deleteSysModuleCustomByKeyList(moduleIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateSysModuleCustomByKeySelective(SysModuleQueryVo sysModuleQueryVo) {
		return sysModuleMapperCustom.updateSysModuleCustomByKeySelective(sysModuleQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateSysModuleCustomByKeySnapshots(SysModuleQueryVo sysModuleQueryVo) {
		return sysModuleMapperCustom.updateSysModuleCustomByKeySnapshots(sysModuleQueryVo);
	}

	/**
	 * 根据 主键 更新删除
	 */
	@Override
	public Integer updateDeleteSysModuleCustomByKey(Integer moduleId) {
		return sysModuleMapperCustom.updateDeleteSysModuleCustomByKey(moduleId);
	}

	/**
	 * 根据 主键 批量 更新删除
	 */
	@Override
	public Integer updateDeleteSysModuleCustomByKeyList(List<Integer> moduleIdList) {
		return sysModuleMapperCustom.updateDeleteSysModuleCustomByKeyList(moduleIdList);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(SysModuleExample example) {
		return sysModuleMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(SysModuleExample example) {
		return sysModuleMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer moduleId) {
		return sysModuleMapper.deleteByPrimaryKey(moduleId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(SysModule record) {
		return sysModuleMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(SysModule record) {
		return sysModuleMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<SysModule> selectByExample(SysModuleExample example) {
		return sysModuleMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public SysModule selectByPrimaryKey(Integer moduleId) {
		return sysModuleMapper.selectByPrimaryKey(moduleId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(SysModule record, SysModuleExample example) {
		return sysModuleMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(SysModule record, SysModuleExample example) {
		return sysModuleMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(SysModule record) {
		return sysModuleMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(SysModule record) {
		return sysModuleMapper.updateByPrimaryKey(record);
	}

}
