package com.gll.ls.core.service.system.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysRolePermissionMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysRolePermissionMapper;
import com.gll.ls.core.pojo.system.po.SysRolePermission;
import com.gll.ls.core.pojo.system.po.SysRolePermissionExample;
import com.gll.ls.core.pojo.system.vo.SysRolePermissionCustom;
import com.gll.ls.core.pojo.system.vo.SysRolePermissionQueryVo;
import com.gll.ls.core.service.system.base.SysRolePermissionServiceBase;

@Service
@Transactional
public class SysRolePermissionServiceBaseImpl implements SysRolePermissionServiceBase {

	@Resource
	private SysRolePermissionMapper sysRolePermissionMapper;
	@Resource
	private SysRolePermissionMapperCustom sysRolePermissionMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<SysRolePermissionCustom> getSysRolePermissionCustomListWithPage(SysRolePermissionQueryVo sysRolePermissionQueryVo) {
		return sysRolePermissionMapperCustom.getSysRolePermissionCustomListWithPage(sysRolePermissionQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getSysRolePermissionCustomCount(SysRolePermissionQueryVo sysRolePermissionQueryVo) {
		return sysRolePermissionMapperCustom.getSysRolePermissionCustomCount(sysRolePermissionQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<SysRolePermissionCustom> getSysRolePermissionCustomListByQueryVo(SysRolePermissionQueryVo sysRolePermissionQueryVo) {
		return sysRolePermissionMapperCustom.getSysRolePermissionCustomListByQueryVo(sysRolePermissionQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public SysRolePermissionCustom getSysRolePermissionCustomByKey(Integer rolePermissionId) {
		return sysRolePermissionMapperCustom.getSysRolePermissionCustomByKey(rolePermissionId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public SysRolePermissionCustom getSysRolePermissionCustomByKeyWithQueryVo(SysRolePermissionQueryVo sysRolePermissionQueryVo) {
		return sysRolePermissionMapperCustom.getSysRolePermissionCustomByKeyWithQueryVo(sysRolePermissionQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<SysRolePermissionCustom> getSysRolePermissionCustomListByKeyList(List<Integer> rolePermissionIdList) {
		return sysRolePermissionMapperCustom.getSysRolePermissionCustomListByKeyList(rolePermissionIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<SysRolePermissionCustom> getSysRolePermissionListByKeyListWithQueryVo(SysRolePermissionQueryVo sysRolePermissionQueryVo) {
		return sysRolePermissionMapperCustom.getSysRolePermissionListByKeyListWithQueryVo(sysRolePermissionQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysRolePermissionCustomByQueryVo(SysRolePermissionQueryVo sysRolePermissionQueryVo) {
		return sysRolePermissionMapperCustom.addSysRolePermissionCustomByQueryVo(sysRolePermissionQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysRolePermissionCustomByCustom(SysRolePermissionCustom sysRolePermissionCustom) {
		return sysRolePermissionMapperCustom.addSysRolePermissionCustomByCustom(sysRolePermissionCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteSysRolePermissionCustomByKey(Integer rolePermissionId) {
		return sysRolePermissionMapperCustom.deleteSysRolePermissionCustomByKey(rolePermissionId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteSysRolePermissionCustomByKeyList(List<Integer> rolePermissionIdList) {
		return sysRolePermissionMapperCustom.deleteSysRolePermissionCustomByKeyList(rolePermissionIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateSysRolePermissionCustomByKeySelective(SysRolePermissionQueryVo sysRolePermissionQueryVo) {
		return sysRolePermissionMapperCustom.updateSysRolePermissionCustomByKeySelective(sysRolePermissionQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateSysRolePermissionCustomByKeySnapshots(SysRolePermissionQueryVo sysRolePermissionQueryVo) {
		return sysRolePermissionMapperCustom.updateSysRolePermissionCustomByKeySnapshots(sysRolePermissionQueryVo);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(SysRolePermissionExample example) {
		return sysRolePermissionMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(SysRolePermissionExample example) {
		return sysRolePermissionMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer rolePermissionId) {
		return sysRolePermissionMapper.deleteByPrimaryKey(rolePermissionId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(SysRolePermission record) {
		return sysRolePermissionMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(SysRolePermission record) {
		return sysRolePermissionMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<SysRolePermission> selectByExample(SysRolePermissionExample example) {
		return sysRolePermissionMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public SysRolePermission selectByPrimaryKey(Integer rolePermissionId) {
		return sysRolePermissionMapper.selectByPrimaryKey(rolePermissionId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(SysRolePermission record, SysRolePermissionExample example) {
		return sysRolePermissionMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(SysRolePermission record, SysRolePermissionExample example) {
		return sysRolePermissionMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(SysRolePermission record) {
		return sysRolePermissionMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(SysRolePermission record) {
		return sysRolePermissionMapper.updateByPrimaryKey(record);
	}

}
