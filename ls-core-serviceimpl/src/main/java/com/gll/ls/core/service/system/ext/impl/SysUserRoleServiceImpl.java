package com.gll.ls.core.service.system.ext.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysUserRoleMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysUserRoleMapper;
import com.gll.ls.core.pojo.system.po.SysUserRoleExample;
import com.gll.ls.core.pojo.system.vo.SysUserRoleCustom;
import com.gll.ls.core.pojo.system.vo.SysUserRoleQueryVo;
import com.gll.ls.core.service.system.base.impl.SysUserRoleServiceBaseImpl;
import com.gll.ls.core.service.system.ext.SysUserRoleService;

/**
 * 用户 角色
 * 
 * @author XL
 * @Date 2sysUserRoleMapper.17年4月23日 下午1:sysUserRoleMapper.3:14
 */
@Service
@Transactional
public class SysUserRoleServiceImpl extends SysUserRoleServiceBaseImpl implements SysUserRoleService {
	@Resource
	private SysUserRoleMapper sysUserRoleMapper;
	@Resource
	private SysUserRoleMapperCustom sysUserRoleMapperCustom;

	// ==================================================================================================================

	/**
	 * 根据 用户id 查询用户-角色关系表
	 */
	@Override
	public List<SysUserRoleCustom> getUserRoleListByUserId(Integer userId) {

		// 封装查询条件
		SysUserRoleCustom ur_custom = new SysUserRoleCustom();
		ur_custom.setUserId(userId);
		SysUserRoleQueryVo vo = new SysUserRoleQueryVo();
		vo.setSysUserRoleCustom(ur_custom);
		// 查询
		List<SysUserRoleCustom> list = sysUserRoleMapperCustom.getSysUserRoleCustomListByQueryVo(vo);
		return list;
	}

	/**
	 * 删除关联表（用户-角色） 根据角色id
	 */
	@Override
	public Integer deleteUserRoleByRoleId(Integer roleId) {
		// 封装删除 的条件
		SysUserRoleExample example = new SysUserRoleExample();
		SysUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		// 进行删除
		Integer count = sysUserRoleMapper.deleteByExample(example);

		return count;

	}

	/**
	 * 删除角色 by 用户ID List
	 */
	@Override
	public Integer deletedeleteRoleByUserIds(List<Integer> userIdList) {
		Integer count = 0;
		for (Integer userId : userIdList) {
			count += this.deleteRoleByUserId(userId);
		}
		return count;
	}

	/**
	 * 删除角色 by 用户ID
	 */
	@Override
	public Integer deleteRoleByUserId(Integer userId) {

		// 封装删除 的条件
		SysUserRoleExample example = new SysUserRoleExample();
		SysUserRoleExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		// 进行删除
		Integer count = sysUserRoleMapper.deleteByExample(example);

		return count;
	}

	// ==================================================================================================================

}