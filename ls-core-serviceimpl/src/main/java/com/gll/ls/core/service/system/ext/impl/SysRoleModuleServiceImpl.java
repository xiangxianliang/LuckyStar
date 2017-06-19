package com.gll.ls.core.service.system.ext.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysRoleModuleMapperCustom;
import com.gll.ls.core.dao.system.mapper.SysRoleModuleMapper;
import com.gll.ls.core.pojo.system.po.SysRoleModuleExample;
import com.gll.ls.core.pojo.system.vo.SysRoleModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysRoleModuleQueryVo;
import com.gll.ls.core.service.system.base.impl.SysRoleModuleServiceBaseImpl;
import com.gll.ls.core.service.system.ext.SysRoleModuleService;

/**
 * 角色 模块
 * 
 * @author XL
 * @Date 2sysRoleModuleMapper.17年4月23日 下午12:59:1sysRoleModuleMapper.
 */
@Service
@Transactional
public class SysRoleModuleServiceImpl extends SysRoleModuleServiceBaseImpl implements SysRoleModuleService {

	@Resource
	private SysRoleModuleMapper sysRoleModuleMapper;
	@Resource
	private SysRoleModuleMapperCustom sysRoleModuleMapperCustom;

	// ==================================================================================================================

	/**
	 * 根据 模块id 删除 角色-模块 关联关系
	 * 
	 * @param moduleId
	 * @return
	 */
	@Override
	public Integer deleteRoleModuleByModuleId(Integer moduleId) {
		// 封装查询条件
		SysRoleModuleExample example = new SysRoleModuleExample();
		SysRoleModuleExample.Criteria criteria = example.createCriteria();
		criteria.andModuleIdEqualTo(moduleId);
		// 进行删除
		Integer count = sysRoleModuleMapper.deleteByExample(example);
		return count;
	}

	/**
	 * 根据 角色 id 删除 角色-模块 关联关系
	 */
	@Override
	public Integer deleteRoleModuleByRoleId(Integer roleId) {
		// 封装查询条件
		SysRoleModuleExample example = new SysRoleModuleExample();
		SysRoleModuleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(roleId);
		// 进行删除
		Integer count = sysRoleModuleMapper.deleteByExample(example);
		return count;
	}

	/**
	 * 根据 角色 id 查询 角色-模块 关联关系
	 */
	@Override
	public List<SysRoleModuleCustom> getRoleModuleListByRoleId(Integer roleId) {

		// 设置查询条件
		SysRoleModuleCustom rm_custom = new SysRoleModuleCustom();
		rm_custom.setRoleId(roleId);
		SysRoleModuleQueryVo vo = new SysRoleModuleQueryVo();
		vo.setSysRoleModuleCustom(rm_custom);
		// 查询
		List<SysRoleModuleCustom> roleModuleList = sysRoleModuleMapperCustom.getSysRoleModuleCustomListByQueryVo(vo);
		return roleModuleList;
	}

	// ==================================================================================================================

}