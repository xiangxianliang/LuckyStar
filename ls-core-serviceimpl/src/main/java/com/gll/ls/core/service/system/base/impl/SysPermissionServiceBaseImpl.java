package com.gll.ls.core.service.system.base.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysPermissionMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysPermissionMapper;
import com.gll.ls.core.pojo.system.po.SysPermission;
import com.gll.ls.core.pojo.system.po.SysPermissionExample;
import com.gll.ls.core.pojo.system.vo.SysPermissionCustom;
import com.gll.ls.core.pojo.system.vo.SysPermissionQueryVo;
import com.gll.ls.core.service.system.base.SysPermissionServiceBase;

@Service
@Transactional
public class SysPermissionServiceBaseImpl implements SysPermissionServiceBase {

	@Resource
	private SysPermissionMapper sysPermissionMapper;
	@Resource
	private SysPermissionMapperCustom sysPermissionMapperCustom;

	/**
	 * 分页查询
	 */
	@Override
	public List<SysPermissionCustom> getSysPermissionCustomListWithPage(SysPermissionQueryVo sysPermissionQueryVo) {
		return sysPermissionMapperCustom.getSysPermissionCustomListWithPage(sysPermissionQueryVo);
	}

	/**
	 * 数据总数
	 */
	@Override
	public int getSysPermissionCustomCount(SysPermissionQueryVo sysPermissionQueryVo) {
		return sysPermissionMapperCustom.getSysPermissionCustomCount(sysPermissionQueryVo);
	}

	/**
	 * 查询数据集合
	 */
	@Override
	public List<SysPermissionCustom> getSysPermissionCustomListByQueryVo(SysPermissionQueryVo sysPermissionQueryVo) {
		return sysPermissionMapperCustom.getSysPermissionCustomListByQueryVo(sysPermissionQueryVo);
	}

	/**
	 * 根据 主键 查找
	 */
	@Override
	public SysPermissionCustom getSysPermissionCustomByKey(Integer permissionId) {
		return sysPermissionMapperCustom.getSysPermissionCustomByKey(permissionId);
	}

	/**
	 * 根据主键查找 带结果查询字段
	 */
	@Override
	public SysPermissionCustom getSysPermissionCustomByKeyWithQueryVo(SysPermissionQueryVo sysPermissionQueryVo) {
		return sysPermissionMapperCustom.getSysPermissionCustomByKeyWithQueryVo(sysPermissionQueryVo);
	}

	/**
	 * 根据 主键集合 批量查找 List集合
	 */
	@Override
	public List<SysPermissionCustom> getSysPermissionCustomListByKeyList(List<Integer> permissionIdList) {
		return sysPermissionMapperCustom.getSysPermissionCustomListByKeyList(permissionIdList);
	}

	/**
	 * 根据 主键 批量查找
	 */
	@Override
	public List<SysPermissionCustom> getSysPermissionListByKeyListWithQueryVo(SysPermissionQueryVo sysPermissionQueryVo) {
		return sysPermissionMapperCustom.getSysPermissionListByKeyListWithQueryVo(sysPermissionQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysPermissionCustomByQueryVo(SysPermissionQueryVo sysPermissionQueryVo) {
		return sysPermissionMapperCustom.addSysPermissionCustomByQueryVo(sysPermissionQueryVo);
	}

	/**
	 * 添加
	 */
	@Override
	public Integer addSysPermissionCustomByCustom(SysPermissionCustom sysPermissionCustom) {
		return sysPermissionMapperCustom.addSysPermissionCustomByCustom(sysPermissionCustom);
	}

	/**
	 * 根据 主键 删除
	 */
	@Override
	public Integer deleteSysPermissionCustomByKey(Integer permissionId) {
		return sysPermissionMapperCustom.deleteSysPermissionCustomByKey(permissionId);
	}

	/**
	 * 根据 主键 批量删除
	 */
	@Override
	public Integer deleteSysPermissionCustomByKeyList(List<Integer> permissionIdList) {
		return sysPermissionMapperCustom.deleteSysPermissionCustomByKeyList(permissionIdList);
	}

	/**
	 * 根据 主键 更新
	 */
	@Override
	public Integer updateSysPermissionCustomByKeySelective(SysPermissionQueryVo sysPermissionQueryVo) {
		return sysPermissionMapperCustom.updateSysPermissionCustomByKeySelective(sysPermissionQueryVo);
	}

	/**
	 * 根据 主键 更新 带快照
	 */
	@Override
	public Integer updateSysPermissionCustomByKeySnapshots(SysPermissionQueryVo sysPermissionQueryVo) {
		return sysPermissionMapperCustom.updateSysPermissionCustomByKeySnapshots(sysPermissionQueryVo);
	}

	/**
	 * 根据 主键 更新删除
	 */
	@Override
	public Integer updateDeleteSysPermissionCustomByKey(Integer permissionId) {
		return sysPermissionMapperCustom.updateDeleteSysPermissionCustomByKey(permissionId);
	}

	/**
	 * 根据 主键 批量 更新删除
	 */
	@Override
	public Integer updateDeleteSysPermissionCustomByKeyList(List<Integer> permissionIdList) {
		return sysPermissionMapperCustom.updateDeleteSysPermissionCustomByKeyList(permissionIdList);
	}

	// ==============================================================================
	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int countByExample(SysPermissionExample example) {
		return sysPermissionMapper.countByExample(example);
	}

	/**
	 * 根据条件 删除
	 */
	@Override
	public int deleteByExample(SysPermissionExample example) {
		return sysPermissionMapper.deleteByExample(example);
	}

	/**
	 * 根据条件 统计数量
	 */
	@Override
	public int deleteByPrimaryKey(Integer permissionId) {
		return sysPermissionMapper.deleteByPrimaryKey(permissionId);
	}

	/**
	 * 插入数据（硬插入）
	 */
	@Override
	public int insert(SysPermission record) {
		return sysPermissionMapper.insert(record);
	}

	/**
	 * 选择型插入 直插入非空字段
	 */
	@Override
	public int insertSelective(SysPermission record) {
		return sysPermissionMapper.insertSelective(record);
	}

	/**
	 * 根据条件查询 list
	 */
	@Override
	public List<SysPermission> selectByExample(SysPermissionExample example) {
		return sysPermissionMapper.selectByExample(example);
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public SysPermission selectByPrimaryKey(Integer permissionId) {
		return sysPermissionMapper.selectByPrimaryKey(permissionId);
	}

	/**
	 * 根据条件更新（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByExampleSelective(SysPermission record, SysPermissionExample example) {
		return sysPermissionMapper.updateByExampleSelective(record, example);
	}

	/**
	 * 根据条件更新（硬更新：null覆盖非空数据）
	 */
	@Override
	public int updateByExample(SysPermission record, SysPermissionExample example) {
		return sysPermissionMapper.updateByExample(record, example);
	}

	/**
	 * 更新主键数据（软更新：null字段不会被更新）
	 */
	@Override
	public int updateByPrimaryKeySelective(SysPermission record) {
		return sysPermissionMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 更新主键数据（硬更新：null覆盖非空数据）对象
	 */
	@Override
	public int updateByPrimaryKey(SysPermission record) {
		return sysPermissionMapper.updateByPrimaryKey(record);
	}

}
