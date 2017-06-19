package com.gll.ls.core.service.system.ext.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysRolePermissionMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysRolePermissionMapper;
import com.gll.ls.core.pojo.system.po.SysRolePermissionExample;
import com.gll.ls.core.pojo.system.vo.SysRolePermissionCustom;
import com.gll.ls.core.pojo.system.vo.SysRolePermissionQueryVo;
import com.gll.ls.core.service.system.base.impl.SysRolePermissionServiceBaseImpl;
import com.gll.ls.core.service.system.ext.SysRolePermissionService;

/**
 * 角色 权限
 * 
 * @author XL
 * @Date 2sysRolePermissionMapper.17年4月23日 下午1:sysRolePermissionMapper.sysRolePermissionMapper.:25
 */
@Service
@Transactional
public class SysRolePermissionServiceImpl extends SysRolePermissionServiceBaseImpl implements SysRolePermissionService {
	@Resource
	private SysRolePermissionMapper sysRolePermissionMapper;
	@Resource
	private SysRolePermissionMapperCustom sysRolePermissionMapperCustom;

	// ==================================================================================================================

	/**
	 * 根据 权限id删除 删除 角色-权限表
	 */
	@Override
	public Integer deleteRolePermissionByPermissionId(Integer permissionId) {

		// 封装条件
		SysRolePermissionExample example = new SysRolePermissionExample();
		SysRolePermissionExample.Criteria criteria = example.createCriteria();
		criteria.andPermissionIdEqualTo(permissionId);
		// 进行删除
		Integer count = sysRolePermissionMapper.deleteByExample(example);
		return count;
	}

	/**
	 * 根据 角色 id 删除 角色-权限 关联关系
	 */
	@Override
	public Integer deleteRolePermissionByRoleId(Integer roleId) {
		// 封装条件
		SysRolePermissionExample example = new SysRolePermissionExample();
		SysRolePermissionExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		// 进行删除
		Integer count = sysRolePermissionMapper.deleteByExample(example);
		return count;
	}

	/**
	 * 根据 角色 id 查询 角色-权限 关联关系
	 */
	@Override
	public List<SysRolePermissionCustom> getRolePermissionListByRoleId(Integer roleId) {
		// 设置查询条件
		SysRolePermissionCustom rp_custom = new SysRolePermissionCustom();
		rp_custom.setRoleId(roleId);
		SysRolePermissionQueryVo vo = new SysRolePermissionQueryVo();
		vo.setSysRolePermissionCustom(rp_custom);
		// 查询
		List<SysRolePermissionCustom> rolePermissionCustoms = sysRolePermissionMapperCustom.getSysRolePermissionCustomListByQueryVo(vo);
		return rolePermissionCustoms;
	}

	// ==================================================================================================================

	// ==================================================================================================================

}