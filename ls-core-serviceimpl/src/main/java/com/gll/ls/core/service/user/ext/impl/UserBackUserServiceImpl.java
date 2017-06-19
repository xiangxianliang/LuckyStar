package com.gll.ls.core.service.user.ext.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.user.custom.UserBackUserMapperCustom;
import com.gll.ls.core.dao.user.mapper.UserBackUserMapper;
import com.gll.ls.core.pojo.system.vo.SysUserRoleCustom;
import com.gll.ls.core.pojo.user.vo.UserBackUserCustom;
import com.gll.ls.core.pojo.user.vo.UserBackUserQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.Tree;
import com.gll.ls.core.pojo.utils.user.vo.ActiveUserBack;
import com.gll.ls.core.pojo.utils.user.vo.Permission;
import com.gll.ls.core.service.system.ext.SysModuleService;
import com.gll.ls.core.service.system.ext.SysPermissionService;
import com.gll.ls.core.service.system.ext.SysRoleService;
import com.gll.ls.core.service.system.ext.SysUserRoleService;
import com.gll.ls.core.service.user.base.impl.UserBackUserServiceBaseImpl;
import com.gll.ls.core.service.user.ext.UserBackUserService;
import com.gll.ls.utils.web.result.DataGridResultInfo;

@Service
@Transactional
public class UserBackUserServiceImpl extends UserBackUserServiceBaseImpl implements UserBackUserService {

	@Resource
	private UserBackUserMapper userBackUserMapper;
	@Resource
	private UserBackUserMapperCustom userBackUserMapperCustom;

	@Resource
	private SysRoleService sysRoleService;
	@Resource
	private SysUserRoleService sysUserRoleService;
	@Resource
	private SysModuleService SysModuleService;
	@Resource
	private SysPermissionService sysPermissionService;

	// ============================================================================================

	/**
	 * 分页查询
	 */
	@Override
	public DataGridResultInfo<UserBackUserCustom> getBackUserListDataGridByQueryVo(UserBackUserQueryVo userBackUserQueryVo, int rows, int page) {
		// TODO 设置排序

		UserBackUserCustom t = userBackUserQueryVo.getUserBackUserCustom();
		t.setIsDel(1);// 查询未删除的
		userBackUserQueryVo.setPageSize(rows);// 每页显示个数
		userBackUserQueryVo.setPageNo(page);// 当前页码

		int count = userBackUserMapperCustom.getUserBackUserCustomCount(userBackUserQueryVo);
		List<UserBackUserCustom> list = userBackUserMapperCustom.getUserBackUserCustomListWithPage(userBackUserQueryVo);

		DataGridResultInfo<UserBackUserCustom> resultInfo = new DataGridResultInfo<UserBackUserCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集
		return resultInfo;
	}

	/**
	 * 添加用户 并添加 用户角色
	 */
	@Override
	public Integer addBackUserByQueryVo(UserBackUserQueryVo userBackUserQueryVo, Integer[] roles) {
		// 保存用户 返回用户id
		Integer count = userBackUserMapperCustom.addUserBackUserCustomByQueryVo(userBackUserQueryVo);

		// 返回主键
		Integer userId = userBackUserQueryVo.getUserBackUserCustom().getUserId();

		// 遍历角色 数组 保存 角色 用户关系
		for (Integer role : roles) {
			// 0 跳过 ，0是根节点
			if (role.equals(0)) {
				continue;
			}
			// 封装数据
			SysUserRoleCustom userRoleCustom = new SysUserRoleCustom();
			userRoleCustom.setUserId(userId);
			userRoleCustom.setRoleId(role);
			// 保存
			count += sysUserRoleService.addSysUserRoleCustomByCustom(userRoleCustom);
		}

		return count;
	}

	/**
	 * 根据id查询
	 */
	@Override
	public UserBackUserCustom getBackUserByKey(Integer userId) {
		return userBackUserMapperCustom.getUserBackUserCustomByKey(userId);
	}

	/**
	 * 根据id更新
	 */
	@Override
	public Integer updateBackUserByKey(UserBackUserQueryVo userBackUserQueryVo, Integer[] roles) {
		Integer count = 0;

		// 查询用户角色 进行删除 // 删除后添加新的角色
		Integer userId = userBackUserQueryVo.getUserBackUserCustom().getUserId();
		List<SysUserRoleCustom> userRoleList = sysUserRoleService.getUserRoleListByUserId(userId);
		if (userRoleList.size() > 0) {
			// 删除
			count += sysUserRoleService.deleteRoleByUserId(userBackUserQueryVo.getUserBackUserCustom().getUserId());
		}

		// 更新用户
		userBackUserMapperCustom.updateUserBackUserCustomByKeySelective(userBackUserQueryVo);

		// 遍历角色 数组 保存 角色 用户关系
		for (Integer role : roles) {
			// 0 跳过 ，0是根节点
			if (role.equals(0)) {
				continue;
			}
			// 封装数据
			SysUserRoleCustom userRoleCustom = new SysUserRoleCustom();
			userRoleCustom.setUserId(userId);
			userRoleCustom.setRoleId(role);
			// 保存
			count += sysUserRoleService.addSysUserRoleCustomByCustom(userRoleCustom);
		}

		return count;
	}

	/**
	 * 根据id删除
	 * 删除用户 连带 删除 关联的用户绑定的角色
	 */
	@Override
	public Integer deleteBackUserAndRoleByKey(Integer userId) {
		// 根据用户 删除用户 的角色
		Integer count = sysUserRoleService.deleteRoleByUserId(userId);
		count += userBackUserMapperCustom.deleteUserBackUserCustomByKey(userId);

		return count;
	}

	/**
	 * 根据id 批量删除
	 * 删除用户 连带 删除 关联的用户绑定的角色
	 */
	@Override
	public Integer deleteBackUserAndRoleByKeyList(List<Integer> userIdList) {
		Integer count = sysUserRoleService.deletedeleteRoleByUserIds(userIdList);
		count += userBackUserMapperCustom.deleteUserBackUserCustomByKeyList(userIdList);
		return count;
	}

	/**
	 * 启用禁用用户
	 */
	@Override
	public Integer enableUserByKey(Integer userId, Integer isEnable) {
		Integer count = 0;
		// 查询 模块 判断 是否有子节点
		UserBackUserCustom userCustomByKey = userBackUserMapperCustom.getUserBackUserCustomByKey(userId);

		// 自己 更新到数据库
		userCustomByKey.setIsEnable(isEnable);
		// 更新到数据库
		count += userBackUserMapper.updateByPrimaryKey(userCustomByKey);

		return count;
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkBackUser(Integer userId, UserBackUserQueryVo userBackUserQueryVo) {
		// TODO 自定义 快照

		List<UserBackUserCustom> list = userBackUserMapperCustom.getUserBackUserCustomListByQueryVo(userBackUserQueryVo);
		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1) {
			if (null == userId) {
				// 存在相同的模块
				return false;
			} else {
				Integer tid = list.get(0).getUserId();
				if (tid.equals(userId)) {
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

	// =============================================================================================

	/**
	 * 获取Active User 在测试
	 */
	@Override
	public ActiveUserBack getActiveUserByUserid(Integer userid) {
		UserBackUserCustom userBackUserCustom = userBackUserMapperCustom.getUserBackUserCustomByKey(userid);
		ActiveUserBack activeUserBack = this.formatActiveUser(userBackUserCustom);
		return activeUserBack;
	}

	/**
	 * 格式化 ActiveUserBase 在用户登录的时候
	 */
	@Override
	public ActiveUserBack formatActiveUser(UserBackUserCustom userBackUserCustom) {
		// 创建Session 用户 拷贝 配置
		ActiveUserBack activeUserBack = new ActiveUserBack();
		BeanUtils.copyProperties(userBackUserCustom, activeUserBack);
		// 查询用户 的 菜单 及其 权限 放入 ActiveUserBack
		Integer userId = activeUserBack.getUserId();

		// 加载用户的菜单 树形结构
		List<Tree> treeList = SysModuleService.getUserModuleTreeByUserId(userId);

		activeUserBack.setTreeList(Tree.formatTree(treeList));
		// 设置用户的 用户的菜单
		if (activeUserBack.getTreeMap() == null) {
			activeUserBack.setTreeMap(new HashMap<Integer, Tree>());
		}
		Map<Integer, Tree> treeMap = activeUserBack.getTreeMap();
		for (Tree tree : treeList) {
			treeMap.put(tree.getId(), tree);
		}

		// 查询用户权限
		List<Permission> permissions = sysPermissionService.getPermissonByUserId(userId);
		activeUserBack.setPermissions(permissions);
		return activeUserBack;
	}

	/**
	 * 后台用户登录
	 */
	@Override
	public UserBackUserCustom getBackUserByLongin(UserBackUserQueryVo userBackUserQueryVo) {
		List<UserBackUserCustom> userBackUserList = userBackUserMapperCustom.getUserBackUserCustomListByQueryVo(userBackUserQueryVo);
		if (userBackUserList.size() == 1) {
			return userBackUserList.get(0);
		} else {
			return null;
		}
	}

	// =============================================================================================

	/**
	 * 
	 */

}
