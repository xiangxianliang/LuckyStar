package com.gll.ls.core.service.system.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysRoleMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysRoleMapper;
import com.gll.ls.core.pojo.system.po.SysRole;
import com.gll.ls.core.pojo.system.po.SysRoleExample;
import com.gll.ls.core.pojo.system.vo.SysRoleCustom;
import com.gll.ls.core.pojo.system.vo.SysRoleQueryVo;
import com.gll.ls.core.service.system.base.SysRoleServiceBase;

@Service
@Transactional
public class SysRoleServiceBaseImpl implements SysRoleServiceBase {

	@Resource
	private SysRoleMapper sysRoleMapper;
	@Resource
	private SysRoleMapperCustom sysRoleMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<SysRoleCustom> getSysRoleCustomListWithPage(SysRoleQueryVo sysRoleQueryVo) {
		return sysRoleMapperCustom.getSysRoleCustomListWithPage(sysRoleQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getSysRoleCustomCount(SysRoleQueryVo sysRoleQueryVo) {
		return sysRoleMapperCustom.getSysRoleCustomCount(sysRoleQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<SysRoleCustom> getSysRoleCustomListByQueryVo(SysRoleQueryVo sysRoleQueryVo) {
		return sysRoleMapperCustom.getSysRoleCustomListByQueryVo(sysRoleQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public SysRoleCustom getSysRoleCustomByKey(Integer roleId) {
		return sysRoleMapperCustom.getSysRoleCustomByKey(roleId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public SysRoleCustom getSysRoleCustomByKeyWithQueryVo(SysRoleQueryVo sysRoleQueryVo) {
		return sysRoleMapperCustom.getSysRoleCustomByKeyWithQueryVo(sysRoleQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<SysRoleCustom> getSysRoleCustomListByKeyList(List<Integer> roleIdList) {
		return sysRoleMapperCustom.getSysRoleCustomListByKeyList(roleIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<SysRoleCustom> getSysRoleListByKeyListWithQueryVo(SysRoleQueryVo sysRoleQueryVo) {
		return sysRoleMapperCustom.getSysRoleListByKeyListWithQueryVo(sysRoleQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysRoleCustomByQueryVo(SysRoleQueryVo sysRoleQueryVo) {
		return sysRoleMapperCustom.addSysRoleCustomByQueryVo(sysRoleQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysRoleCustomByCustom(SysRoleCustom sysRoleCustom) {
		return sysRoleMapperCustom.addSysRoleCustomByCustom(sysRoleCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteSysRoleCustomByKey(Integer roleId) {
		return sysRoleMapperCustom.deleteSysRoleCustomByKey(roleId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteSysRoleCustomByKeyList(List<Integer> roleIdList) {
		return sysRoleMapperCustom.deleteSysRoleCustomByKeyList(roleIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateSysRoleCustomByKeySelective(SysRoleQueryVo sysRoleQueryVo) {
		return sysRoleMapperCustom.updateSysRoleCustomByKeySelective(sysRoleQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateSysRoleCustomByKeySnapshots(SysRoleQueryVo sysRoleQueryVo) {
		return sysRoleMapperCustom.updateSysRoleCustomByKeySnapshots(sysRoleQueryVo);
	}

	/**
	 * 根据 主键 更新删除
	 */
	@Override
	public Integer updateDeleteSysRoleCustomByKey(Integer roleId) {
		return sysRoleMapperCustom.updateDeleteSysRoleCustomByKey(roleId);
	}

	/**
	 * 根据 主键 批量 更新删除
	 */
	@Override
	public Integer updateDeleteSysRoleCustomByKeyList(List<Integer> roleIdList) {
		return sysRoleMapperCustom.updateDeleteSysRoleCustomByKeyList(roleIdList);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(SysRoleExample example) {
		return sysRoleMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(SysRoleExample example) {
		return sysRoleMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer roleId) {
		return sysRoleMapper.deleteByPrimaryKey(roleId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(SysRole record) {
		return sysRoleMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(SysRole record) {
		return sysRoleMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<SysRole> selectByExample(SysRoleExample example) {
		return sysRoleMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public SysRole selectByPrimaryKey(Integer roleId) {
		return sysRoleMapper.selectByPrimaryKey(roleId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(SysRole record, SysRoleExample example) {
		return sysRoleMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(SysRole record, SysRoleExample example) {
		return sysRoleMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(SysRole record) {
		return sysRoleMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(SysRole record) {
		return sysRoleMapper.updateByPrimaryKey(record);
	}

}
