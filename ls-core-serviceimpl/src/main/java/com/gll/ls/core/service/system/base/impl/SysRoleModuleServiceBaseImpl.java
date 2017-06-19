package com.gll.ls.core.service.system.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysRoleModuleMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysRoleModuleMapper;
import com.gll.ls.core.pojo.system.po.SysRoleModule;
import com.gll.ls.core.pojo.system.po.SysRoleModuleExample;
import com.gll.ls.core.pojo.system.vo.SysRoleModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysRoleModuleQueryVo;
import com.gll.ls.core.service.system.base.SysRoleModuleServiceBase;

@Service
@Transactional
public class SysRoleModuleServiceBaseImpl implements SysRoleModuleServiceBase {

	@Resource
	private SysRoleModuleMapper sysRoleModuleMapper;
	@Resource
	private SysRoleModuleMapperCustom sysRoleModuleMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<SysRoleModuleCustom> getSysRoleModuleCustomListWithPage(SysRoleModuleQueryVo sysRoleModuleQueryVo) {
		return sysRoleModuleMapperCustom.getSysRoleModuleCustomListWithPage(sysRoleModuleQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getSysRoleModuleCustomCount(SysRoleModuleQueryVo sysRoleModuleQueryVo) {
		return sysRoleModuleMapperCustom.getSysRoleModuleCustomCount(sysRoleModuleQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<SysRoleModuleCustom> getSysRoleModuleCustomListByQueryVo(SysRoleModuleQueryVo sysRoleModuleQueryVo) {
		return sysRoleModuleMapperCustom.getSysRoleModuleCustomListByQueryVo(sysRoleModuleQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public SysRoleModuleCustom getSysRoleModuleCustomByKey(Integer roleModuleId) {
		return sysRoleModuleMapperCustom.getSysRoleModuleCustomByKey(roleModuleId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public SysRoleModuleCustom getSysRoleModuleCustomByKeyWithQueryVo(SysRoleModuleQueryVo sysRoleModuleQueryVo) {
		return sysRoleModuleMapperCustom.getSysRoleModuleCustomByKeyWithQueryVo(sysRoleModuleQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<SysRoleModuleCustom> getSysRoleModuleCustomListByKeyList(List<Integer> roleModuleIdList) {
		return sysRoleModuleMapperCustom.getSysRoleModuleCustomListByKeyList(roleModuleIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<SysRoleModuleCustom> getSysRoleModuleListByKeyListWithQueryVo(SysRoleModuleQueryVo sysRoleModuleQueryVo) {
		return sysRoleModuleMapperCustom.getSysRoleModuleListByKeyListWithQueryVo(sysRoleModuleQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysRoleModuleCustomByQueryVo(SysRoleModuleQueryVo sysRoleModuleQueryVo) {
		return sysRoleModuleMapperCustom.addSysRoleModuleCustomByQueryVo(sysRoleModuleQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysRoleModuleCustomByCustom(SysRoleModuleCustom sysRoleModuleCustom) {
		return sysRoleModuleMapperCustom.addSysRoleModuleCustomByCustom(sysRoleModuleCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteSysRoleModuleCustomByKey(Integer roleModuleId) {
		return sysRoleModuleMapperCustom.deleteSysRoleModuleCustomByKey(roleModuleId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteSysRoleModuleCustomByKeyList(List<Integer> roleModuleIdList) {
		return sysRoleModuleMapperCustom.deleteSysRoleModuleCustomByKeyList(roleModuleIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateSysRoleModuleCustomByKeySelective(SysRoleModuleQueryVo sysRoleModuleQueryVo) {
		return sysRoleModuleMapperCustom.updateSysRoleModuleCustomByKeySelective(sysRoleModuleQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateSysRoleModuleCustomByKeySnapshots(SysRoleModuleQueryVo sysRoleModuleQueryVo) {
		return sysRoleModuleMapperCustom.updateSysRoleModuleCustomByKeySnapshots(sysRoleModuleQueryVo);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(SysRoleModuleExample example) {
		return sysRoleModuleMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(SysRoleModuleExample example) {
		return sysRoleModuleMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer roleModuleId) {
		return sysRoleModuleMapper.deleteByPrimaryKey(roleModuleId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(SysRoleModule record) {
		return sysRoleModuleMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(SysRoleModule record) {
		return sysRoleModuleMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<SysRoleModule> selectByExample(SysRoleModuleExample example) {
		return sysRoleModuleMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public SysRoleModule selectByPrimaryKey(Integer roleModuleId) {
		return sysRoleModuleMapper.selectByPrimaryKey(roleModuleId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(SysRoleModule record, SysRoleModuleExample example) {
		return sysRoleModuleMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(SysRoleModule record, SysRoleModuleExample example) {
		return sysRoleModuleMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(SysRoleModule record) {
		return sysRoleModuleMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(SysRoleModule record) {
		return sysRoleModuleMapper.updateByPrimaryKey(record);
	}

}
