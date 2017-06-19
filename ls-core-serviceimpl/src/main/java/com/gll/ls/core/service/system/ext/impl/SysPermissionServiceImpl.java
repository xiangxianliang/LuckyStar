package com.gll.ls.core.service.system.ext.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.system.custom.SysPermissionMapperCustom;
import com.gll.ls.core.dao.system.extended.SysPermissionMapperExtended;
import com.gll.ls.core.dao.system.mapper.SysPermissionMapper;
import com.gll.ls.core.pojo.system.vo.SysModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysPermissionCustom;
import com.gll.ls.core.pojo.system.vo.SysPermissionQueryVo;
import com.gll.ls.core.pojo.utils.user.vo.Permission;
import com.gll.ls.core.service.system.base.impl.SysPermissionServiceBaseImpl;
import com.gll.ls.core.service.system.ext.SysModuleService;
import com.gll.ls.core.service.system.ext.SysPermissionService;
import com.gll.ls.core.service.system.ext.SysRolePermissionService;
import com.gll.ls.utils.utils.MD5Util;
import com.gll.ls.utils.web.result.DataGridResultInfo;

/**
 * 权限Service
 * 
 * @author XL
 * @Date 2sysPermissionMapper.17年4月23日 下午12:54:24
 */
@Service
@Transactional
public class SysPermissionServiceImpl extends SysPermissionServiceBaseImpl implements SysPermissionService {

	@Resource
	private SysPermissionMapper sysPermissionMapper;
	@Resource
	private SysPermissionMapperCustom sysPermissionMapperCustom;
	@Resource
	private SysPermissionMapperExtended sysPermissionMapperExtended;

	@Resource
	private SysModuleService sysModuleService;
	@Resource
	private SysRolePermissionService SysRolePermissionService;// 角色与权限关联表

	// ==================================================================================================================

	/**
	 * 分页查询
	 */
	@Override
	public DataGridResultInfo<SysPermissionCustom> getPermissionListDataGridByQueryVo(SysPermissionQueryVo sysPermissionQueryVo, int rows, int page) {
		// 封装查询条件
		SysPermissionCustom pc = sysPermissionQueryVo.getSysPermissionCustom();
		pc.setIsDel(1);// 查询未删除的
		sysPermissionQueryVo.setPageSize(rows);// 每页显示个数
		sysPermissionQueryVo.setPageNo(page);// 当前页码

		int count = sysPermissionMapperCustom.getSysPermissionCustomCount(sysPermissionQueryVo);
		List<SysPermissionCustom> list = sysPermissionMapperCustom.getSysPermissionCustomListWithPage(sysPermissionQueryVo);

		SysModuleCustom moduleCustom = sysModuleService.getSysModuleCustomByKey(pc.getParentModuleId());

		if (moduleCustom != null) {
			for (SysPermissionCustom spc : list) {
				spc.setParentModuleName(moduleCustom.getModuleName());
			}
		} else {
			for (SysPermissionCustom spc : list) {
				spc.setParentModuleName("系统根节点");
			}
		}

		DataGridResultInfo<SysPermissionCustom> resultInfo = new DataGridResultInfo<SysPermissionCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集

		return resultInfo;
	}

	/**
	 * 添加权限
	 */
	@Override
	public Integer addPermissionByQueryVo(SysPermissionQueryVo sysPermissionQueryVo) {
		SysPermissionCustom permissionCustom = sysPermissionQueryVo.getSysPermissionCustom();
		// 使用 hash算法 哈希权限方法
		permissionCustom.setPermissionCode(MD5Util.md5(permissionCustom.getPermissionMethod()));

		Integer index = sysPermissionMapperCustom.addSysPermissionCustomByQueryVo(sysPermissionQueryVo);

		return index;
	}

	/**
	 * 到编辑查询 根据主键查询 权限 几区父模块
	 */
	@Override
	public SysPermissionCustom getPermissionByKey(Integer permissionId) {
		SysPermissionCustom spc = sysPermissionMapperCustom.getSysPermissionCustomByKey(permissionId);
		Integer moduleId = spc.getParentModuleId();

		if (moduleId != 0) {
			SysModuleCustom moduleCustom = sysModuleService.getSysModuleCustomByKey(moduleId);
			spc.setParentModuleName(moduleCustom.getModuleName());
		} else {
			spc.setParentModuleName("系统菜单");
		}
		return spc;

	}

	/**
	 * 更新权限
	 */
	@Override
	public Integer updatePermissionByKey(SysPermissionQueryVo sysPermissionQueryVo) {

		SysPermissionCustom permissionCustom = sysPermissionQueryVo.getSysPermissionCustom();
		// 使用 hash算法 哈希权限方法
		permissionCustom.setPermissionCode(MD5Util.md5(permissionCustom.getPermissionMethod()));

		Integer index = sysPermissionMapperCustom.updateSysPermissionCustomByKeySelective(sysPermissionQueryVo);

		return index;
	}

	/**
	 * 根据权限id 删除 权限 及其关联的 角色与权限表
	 */
	@Override
	public Integer deletePermissionAndRelationByKey(Integer permissionId) {
		// 1.根据 权限id删除 删除 角色-权限表
		Integer count = SysRolePermissionService.deleteRolePermissionByPermissionId(permissionId);
		// 删除 权限表数据数据
		count += sysPermissionMapperCustom.deleteSysPermissionCustomByKey(permissionId);
		return count;
	}

	/**
	 * 根据权限id List 删除 权限 及其关联的 角色与权限表
	 */
	@Override
	public Integer deletePermissionAndRelationByKeys(List<Integer> permissionIdList) {
		Integer count = 0;
		for (Integer permissionId : permissionIdList) {
			// 1.根据 权限id删除 删除 角色-权限表
			count += SysRolePermissionService.deleteRolePermissionByPermissionId(permissionId);
		}
		// 删除 权限表数据数据
		count += sysPermissionMapperCustom.deleteSysPermissionCustomByKeyList(permissionIdList);
		return count;
	}

	/**
	 * 启用权限
	 */
	@Override
	public Integer enablePermission(Integer permissionId, Integer isEnable) {
		// 查询数据库
		SysPermissionCustom spc = sysPermissionMapperCustom.getSysPermissionCustomByKey(permissionId);
		// 设置 数据
		spc.setIsEnable(isEnable);
		// 更新到 数据库
		Integer i = sysPermissionMapper.updateByPrimaryKey(spc);
		return i;
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkPermission(Integer permissionId, SysPermissionQueryVo sysPermissionQueryVo) {
		List<SysPermissionCustom> list = sysPermissionMapperCustom.getSysPermissionCustomListByQueryVo(sysPermissionQueryVo);
		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1) {
			if (null == permissionId) {
				// 存在相同的模块
				return false;
			} else {
				Integer tid = list.get(0).getPermissionId();
				if (tid.equals(permissionId)) {
					// id 相同， 并且size() 是1 return 可以使用
					return true;
				} else {
					// 存在相同的模块
					return false;
				}
			}
		}
		// 其他情况
		return false;
	}

	// ==================================================================================================================

	/**
	 * 根据用户的id 查询用户的 操作 权限 SQL实现
	 */
	@Override
	public List<Permission> getPermissonByUserId(Integer userId) {
		List<Permission> list = sysPermissionMapperExtended.getPermissonByUserId(userId);
		return list;
	}

	/**
	 * 根据模块id 删除 权限 及其关联的 角色-权限 表
	 */
	@Override
	public Integer deletePermissionAndRelationByModuleId(Integer moduleId) {
		Integer count = 0;
		// 设置查询条件
		SysPermissionCustom p_Custom = new SysPermissionCustom();
		p_Custom.setParentModuleId(moduleId);// 所属的父模块id
		SysPermissionQueryVo vo = new SysPermissionQueryVo();
		vo.setSysPermissionCustom(p_Custom);

		List<SysPermissionCustom> permissionList = sysPermissionMapperCustom.getSysPermissionCustomListByQueryVo(vo);
		if (permissionList != null && permissionList.size() > 0) {
			for (SysPermissionCustom spc : permissionList) {
				Integer permissionId = spc.getPermissionId();
				// 删除数据
				count += this.deletePermissionAndRelationByKey(permissionId);
			}
		}
		return count;
	}

	/**
	 * 根据 模块ID 查询出全部的权限
	 */
	@Override
	public List<SysPermissionCustom> getPermissionListByMid(Integer mid) {
		// 设置查询条件
		SysPermissionCustom p_Custom = new SysPermissionCustom();
		p_Custom.setParentModuleId(mid);// 所属的父模块id
		p_Custom.setIsDel(1);// 查询未删除的
		p_Custom.setIsActivation(1);// 查询已经启动的
		p_Custom.setIsEnable(1);// 查询启用的权限
		SysPermissionQueryVo vo = new SysPermissionQueryVo();
		vo.setSysPermissionCustom(p_Custom);

		List<SysPermissionCustom> permissionList = sysPermissionMapperCustom.getSysPermissionCustomListByQueryVo(vo);
		return permissionList;
	}

	// ==================================================================================================================

}