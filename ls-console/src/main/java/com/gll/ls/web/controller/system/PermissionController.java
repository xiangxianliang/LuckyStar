package com.gll.ls.web.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gll.ls.core.pojo.system.vo.SysDictInfoCustom;
import com.gll.ls.core.pojo.system.vo.SysModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysPermissionCustom;
import com.gll.ls.core.pojo.system.vo.SysPermissionQueryVo;
import com.gll.ls.core.service.system.ext.SysDictInfoService;
import com.gll.ls.core.service.system.ext.SysModuleService;
import com.gll.ls.core.service.system.ext.SysPermissionService;
import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.utils.ConversionUtil;
import com.gll.ls.utils.web.result.DataGridResultInfo;
import com.gll.ls.utils.web.result.ExceptionResultInfo;
import com.gll.ls.utils.web.result.ResultUtil;
import com.gll.ls.utils.web.result.SubmitResultInfo;

/**
 * 权限管理 Controller
 * 
 * @author XL
 * @Date 2017年4月11日 上午9:18:06
 */
@Controller
@RequestMapping("/system/permission")
public class PermissionController {

	public static final String P_PATH = "/system/permission";

	@Autowired
	private SysPermissionService sysPermissionService;
	@Autowired
	private SysModuleService sysModuleService;
	@Autowired
	private SysDictInfoService sysDictInfoService;

	/**
	 * 到权限管理
	 */
	@RequestMapping("/toList.do")
	public String toList() {
		return P_PATH + "/list";
	}

	/**
	 * 查询
	 * 
	 * @param sysPermissionQueryVo
	 *            查询条件
	 * @param rows
	 *            每页显示个数
	 * @param page
	 *            当前页码
	 */
	@RequestMapping("/list.do")
	public @ResponseBody DataGridResultInfo<SysPermissionCustom> list(SysPermissionQueryVo sysPermissionQueryVo, int rows, int page) {
		// 判空
		sysPermissionQueryVo = (null == sysPermissionQueryVo ? new SysPermissionQueryVo() : sysPermissionQueryVo);
		sysPermissionQueryVo
				.setSysPermissionCustom((null == sysPermissionQueryVo.getSysPermissionCustom() ? new SysPermissionCustom() : sysPermissionQueryVo.getSysPermissionCustom()));
		// SysPermissionCustom ebPermissionCustom = sysPermissionQueryVo.getSysPermissionCustom();

		DataGridResultInfo<SysPermissionCustom> resultInfo = sysPermissionService.getPermissionListDataGridByQueryVo(sysPermissionQueryVo, rows, page);

		return resultInfo;

	}

	/**
	 * 到添加
	 */
	@RequestMapping("/toAdd.do")
	public String toAdd(Model model, Integer moduleId) {
		// 查詢 所属的父模块
		SysModuleCustom p_ms = sysModuleService.getSysModuleCustomByKey(moduleId);
		model.addAttribute("p_ms", p_ms);
		// 图标 查询数据字典
		List<SysDictInfoCustom> sysDictInfoCustomList = sysDictInfoService.getSysDictInfoCustomByTypeId(2);
		model.addAttribute("sysDictInfoCustomList", sysDictInfoCustomList);
		// 跳转页面
		return P_PATH + "/add";
	}

	/**
	 * 添加
	 */
	@RequestMapping("/add.do")
	public @ResponseBody SubmitResultInfo add(SysPermissionQueryVo sysPermissionQueryVo) throws ExceptionResultInfo {
		Integer i = sysPermissionService.addPermissionByQueryVo(sysPermissionQueryVo);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 到编辑
	 */
	@RequestMapping("/toEdit.do")
	public String toEdit(Model model, Integer permissionId) {
		// 编辑查询
		SysPermissionCustom sysPermissionCustom = sysPermissionService.getPermissionByKey(permissionId);
		model.addAttribute("sysPermissionCustom", sysPermissionCustom);
		// 图标 查询数据字典
		List<SysDictInfoCustom> sysDictInfoCustomList = sysDictInfoService.getSysDictInfoCustomByTypeId(2);
		model.addAttribute("sysDictInfoCustomList", sysDictInfoCustomList);
		return P_PATH + "/edit";
	}

	/**
	 * 更新
	 */
	@RequestMapping("/edit.do")
	public @ResponseBody SubmitResultInfo edit(SysPermissionQueryVo sysPermissionQueryVo) throws ExceptionResultInfo {
		Integer i = sysPermissionService.updatePermissionByKey(sysPermissionQueryVo);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));

	}

	/**
	 * 删除
	 */
	@RequestMapping("/delete.do")
	public @ResponseBody SubmitResultInfo delete(Integer permissionId) {
		Integer i = sysPermissionService.deletePermissionAndRelationByKey(permissionId);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 删除 多个
	 */
	@RequestMapping("/deletes.do")
	public @ResponseBody SubmitResultInfo deletes(Integer[] permissionIds) {
		Integer i = sysPermissionService.deletePermissionAndRelationByKeys(ConversionUtil.arrayToList(permissionIds));
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 校验权限名称是否存在
	 */
	@RequestMapping("/enablePermission.do")
	public @ResponseBody SubmitResultInfo enablePermission(Integer permissionId, Integer isEnable) {
		Integer i = sysPermissionService.enablePermission(permissionId, isEnable);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	@RequestMapping("/checkPermission.do")
	public @ResponseBody Boolean checkPermission(Integer permissionId, SysPermissionQueryVo sysPermissionQueryVo) {
		Boolean flag = sysPermissionService.checkPermission(permissionId, sysPermissionQueryVo);
		// 返回数据
		return flag;
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
