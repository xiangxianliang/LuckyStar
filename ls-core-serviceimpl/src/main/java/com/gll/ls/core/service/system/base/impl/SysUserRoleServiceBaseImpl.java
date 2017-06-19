package com.gll.ls.core.service.system.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysUserRoleMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysUserRoleMapper;
import com.gll.ls.core.pojo.system.po.SysUserRole;
import com.gll.ls.core.pojo.system.po.SysUserRoleExample;
import com.gll.ls.core.pojo.system.vo.SysUserRoleCustom;
import com.gll.ls.core.pojo.system.vo.SysUserRoleQueryVo;
import com.gll.ls.core.service.system.base.SysUserRoleServiceBase;

@Service
@Transactional
public class SysUserRoleServiceBaseImpl implements SysUserRoleServiceBase {

	@Resource
	private SysUserRoleMapper sysUserRoleMapper;
	@Resource
	private SysUserRoleMapperCustom sysUserRoleMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<SysUserRoleCustom> getSysUserRoleCustomListWithPage(SysUserRoleQueryVo sysUserRoleQueryVo) {
		return sysUserRoleMapperCustom.getSysUserRoleCustomListWithPage(sysUserRoleQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getSysUserRoleCustomCount(SysUserRoleQueryVo sysUserRoleQueryVo) {
		return sysUserRoleMapperCustom.getSysUserRoleCustomCount(sysUserRoleQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<SysUserRoleCustom> getSysUserRoleCustomListByQueryVo(SysUserRoleQueryVo sysUserRoleQueryVo) {
		return sysUserRoleMapperCustom.getSysUserRoleCustomListByQueryVo(sysUserRoleQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public SysUserRoleCustom getSysUserRoleCustomByKey(Integer userRoleId) {
		return sysUserRoleMapperCustom.getSysUserRoleCustomByKey(userRoleId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public SysUserRoleCustom getSysUserRoleCustomByKeyWithQueryVo(SysUserRoleQueryVo sysUserRoleQueryVo) {
		return sysUserRoleMapperCustom.getSysUserRoleCustomByKeyWithQueryVo(sysUserRoleQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<SysUserRoleCustom> getSysUserRoleCustomListByKeyList(List<Integer> userRoleIdList) {
		return sysUserRoleMapperCustom.getSysUserRoleCustomListByKeyList(userRoleIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<SysUserRoleCustom> getSysUserRoleListByKeyListWithQueryVo(SysUserRoleQueryVo sysUserRoleQueryVo) {
		return sysUserRoleMapperCustom.getSysUserRoleListByKeyListWithQueryVo(sysUserRoleQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysUserRoleCustomByQueryVo(SysUserRoleQueryVo sysUserRoleQueryVo) {
		return sysUserRoleMapperCustom.addSysUserRoleCustomByQueryVo(sysUserRoleQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysUserRoleCustomByCustom(SysUserRoleCustom sysUserRoleCustom) {
		return sysUserRoleMapperCustom.addSysUserRoleCustomByCustom(sysUserRoleCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteSysUserRoleCustomByKey(Integer userRoleId) {
		return sysUserRoleMapperCustom.deleteSysUserRoleCustomByKey(userRoleId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteSysUserRoleCustomByKeyList(List<Integer> userRoleIdList) {
		return sysUserRoleMapperCustom.deleteSysUserRoleCustomByKeyList(userRoleIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateSysUserRoleCustomByKeySelective(SysUserRoleQueryVo sysUserRoleQueryVo) {
		return sysUserRoleMapperCustom.updateSysUserRoleCustomByKeySelective(sysUserRoleQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateSysUserRoleCustomByKeySnapshots(SysUserRoleQueryVo sysUserRoleQueryVo) {
		return sysUserRoleMapperCustom.updateSysUserRoleCustomByKeySnapshots(sysUserRoleQueryVo);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(SysUserRoleExample example) {
		return sysUserRoleMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(SysUserRoleExample example) {
		return sysUserRoleMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer userRoleId) {
		return sysUserRoleMapper.deleteByPrimaryKey(userRoleId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(SysUserRole record) {
		return sysUserRoleMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(SysUserRole record) {
		return sysUserRoleMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<SysUserRole> selectByExample(SysUserRoleExample example) {
		return sysUserRoleMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public SysUserRole selectByPrimaryKey(Integer userRoleId) {
		return sysUserRoleMapper.selectByPrimaryKey(userRoleId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(SysUserRole record, SysUserRoleExample example) {
		return sysUserRoleMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(SysUserRole record, SysUserRoleExample example) {
		return sysUserRoleMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(SysUserRole record) {
		return sysUserRoleMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(SysUserRole record) {
		return sysUserRoleMapper.updateByPrimaryKey(record);
	}

}
