package com.gll.ls.web.controller.system;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gll.ls.core.pojo.system.vo.SysRoleCustom;
import com.gll.ls.core.pojo.system.vo.SysRoleQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.Tree;
import com.gll.ls.core.pojo.utils.user.vo.ActiveUserBack;
import com.gll.ls.core.service.system.ext.SysRoleService;
import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.utils.ConversionUtil;
import com.gll.ls.utils.web.result.DataGridResultInfo;
import com.gll.ls.utils.web.result.ExceptionResultInfo;
import com.gll.ls.utils.web.result.ResultUtil;
import com.gll.ls.utils.web.result.SubmitResultInfo;

/**
 * 角色管理 Controller
 * 
 * @author XL
 * @Date 2017年4月11日 上午9:18:06
 */
@Controller
@RequestMapping("/system/role")
public class RoleController {

	public static final String R_PATH = "/system/role";

	@Autowired
	private SysRoleService sysRoleService;

	/**
	 * 到角色管理
	 */
	@RequestMapping("/toList.do")
	public String toList() {
		return R_PATH + "/list";
	}

	/**
	 * 查询
	 */
	@RequestMapping("/list.do")
	public @ResponseBody DataGridResultInfo<SysRoleCustom> list(SysRoleQueryVo sysRoleQueryVo, Integer rows, Integer page) {
		// 判空
		sysRoleQueryVo = (null == sysRoleQueryVo ? new SysRoleQueryVo() : sysRoleQueryVo);
		sysRoleQueryVo.setSysRoleCustom((null == sysRoleQueryVo.getSysRoleCustom() ? new SysRoleCustom() : sysRoleQueryVo.getSysRoleCustom()));
		SysRoleCustom ebRoleCustom = sysRoleQueryVo.getSysRoleCustom();

		if (StringUtils.isNotBlank(ebRoleCustom.getRoleName())) {
			sysRoleQueryVo.setRoleNameLike(true);
		}

		DataGridResultInfo<SysRoleCustom> resultInfo = sysRoleService.getRoleListDataGridByQueryVo(sysRoleQueryVo, rows, page);
		return resultInfo;

	}

	/**
	 * 到添加
	 */
	@RequestMapping("/toAdd.do")
	public String toAdd(Model model) {
		return R_PATH + "/add";
	}

	/**
	 * 添加
	 */
	@RequestMapping("/add.do")
	public @ResponseBody SubmitResultInfo add(SysRoleQueryVo sysRoleQueryVo) throws ExceptionResultInfo {

		sysRoleService.addRoleByQueryVo(sysRoleQueryVo);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 906, null));
	}

	/**
	 * 到编辑
	 */
	@RequestMapping("/toEdit.do")
	public String toEdit(Model model, Integer roleId) {
		SysRoleCustom sysRoleCustom = sysRoleService.getSysRoleCustomByKey(roleId);
		model.addAttribute("sysRoleCustom", sysRoleCustom);
		return R_PATH + "/edit";
	}

	/**
	 * 更新
	 */
	@RequestMapping("/edit.do")
	public @ResponseBody SubmitResultInfo edit(SysRoleQueryVo sysRoleQueryVo) throws ExceptionResultInfo {

		Integer i = sysRoleService.updateRoleByKey(sysRoleQueryVo);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 906, null));

	}

	/**
	 * 删除
	 */
	@RequestMapping("/delete.do")
	public @ResponseBody SubmitResultInfo delete(Integer roleId) {

		Integer i = sysRoleService.deleteRoleAndRelationByKey(roleId);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 906, null));
	}

	/**
	 * 删除 批量
	 */
	@RequestMapping("/deletes.do")
	public @ResponseBody SubmitResultInfo deletes(Integer[] roleIds) {

		Integer i = sysRoleService.deleteRoleAndRelationByKeys(ConversionUtil.arrayToList(roleIds));
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 启用模块
	 */
	@RequestMapping("/enableRole.do")
	public @ResponseBody SubmitResultInfo enableRole(Integer roleId, Integer isEnable) {

		Integer i = sysRoleService.enableRoleByKey(roleId, isEnable);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 到 分配权限
	 */
	@RequestMapping("/toDistrbution.do")
	public String toDistrbution(Model model, Integer roleId) {
		SysRoleCustom sysRoleCustom = sysRoleService.getSysRoleCustomByKey(roleId);
		model.addAttribute("sysRoleCustom", sysRoleCustom);
		return R_PATH + "/dist";
	}

	/**
	 * 角色 绑定权限 更新权限 分配权限
	 */
	@RequestMapping("/updateRoleDist.do")
	public @ResponseBody SubmitResultInfo updateRoleDist(Integer roleId, Integer[] mids, Integer[] pids) {
		sysRoleService.updateRoleDist(roleId, mids, pids);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 906, null));
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	@RequestMapping("/checkRole.do")
	public @ResponseBody Boolean checkRole(Integer roleId, SysRoleQueryVo sysRoleQueryVo) {
		// 数据判空
		sysRoleQueryVo = (null == sysRoleQueryVo ? new SysRoleQueryVo() : sysRoleQueryVo);
		sysRoleQueryVo.setSysRoleCustom((null == sysRoleQueryVo.getSysRoleCustom() ? new SysRoleCustom() : sysRoleQueryVo.getSysRoleCustom()));
		// SysRoleCustom sysRoleCustom = sysRoleQueryVo.getSysRoleCustom();
		Boolean flag = sysRoleService.checkRole(roleId, sysRoleQueryVo);
		// 返回数据
		return flag;
	}

	// ===========================================================================================

	/**
	 * 得到Tree 树 递归实现 (分配权限 用到)
	 */
	@RequestMapping("/getModulePermissionTree.do")
	public @ResponseBody List<Tree> getPermissionTree(Integer roleId) {
		List<Tree> list = sysRoleService.getModulePermissionTree(roleId);
		return list;
	}

	// ==========================================================================================

	/**
	 * 用户 添加 时 用到得 到Tree 树
	 */
	@RequestMapping("/getRoleTree.do")
	public @ResponseBody List<Tree> getRoleTree() {
		List<Tree> tree = sysRoleService.getRoleTree();
		return tree;

	}

	/**
	 * 用户编辑 时 用到得 到Tree 树
	 */
	@RequestMapping("/getRoleCheckedTree.do")
	public @ResponseBody List<Tree> getRoleCheckedTree(ActiveUserBack activeUserBack) {
		List<Tree> tree = sysRoleService.getRoleCheckedByUserId(activeUserBack.getUserId());
		return tree;
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
