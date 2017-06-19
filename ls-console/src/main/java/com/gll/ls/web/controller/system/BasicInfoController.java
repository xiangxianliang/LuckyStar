package com.gll.ls.web.controller.system;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gll.ls.core.pojo.system.vo.SysBasicInfoCustom;
import com.gll.ls.core.pojo.system.vo.SysBasicInfoQueryVo;
import com.gll.ls.core.service.system.ext.SysBasicInfoService;
import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.utils.ConversionUtil;
import com.gll.ls.utils.web.result.DataGridResultInfo;
import com.gll.ls.utils.web.result.ExceptionResultInfo;
import com.gll.ls.utils.web.result.ResultUtil;
import com.gll.ls.utils.web.result.SubmitResultInfo;

/**
 * 基本信息管理 Controller
 * 
 * @author XL
 * @Date 2017年4月11日 上午9:18:06
 */
@Controller
@RequestMapping("/system/basic")
public class BasicInfoController {

	public static final String B_PATH = "/system/basic";

	@Autowired
	private SysBasicInfoService sysBasicInfoService;

	/**
	 * 到基本管理
	 */
	@RequestMapping("/toList.do")
	public String toList() {
		return B_PATH + "/list";
	}

	/**
	 * 基本查询
	 */
	@RequestMapping("/list.do")
	public @ResponseBody DataGridResultInfo<SysBasicInfoCustom> list(SysBasicInfoQueryVo sysBasicInfoQueryVo, Integer rows, Integer page) {
		// 判空
		sysBasicInfoQueryVo = (null == sysBasicInfoQueryVo ? new SysBasicInfoQueryVo() : sysBasicInfoQueryVo);
		sysBasicInfoQueryVo.setSysBasicInfoCustom((null == sysBasicInfoQueryVo.getSysBasicInfoCustom() ? new SysBasicInfoCustom() : sysBasicInfoQueryVo.getSysBasicInfoCustom()));
		SysBasicInfoCustom ebBasicInfoCustom = sysBasicInfoQueryVo.getSysBasicInfoCustom();
		if (StringUtils.isNotBlank(ebBasicInfoCustom.getBasicInfoName())) {
			sysBasicInfoQueryVo.setBasicInfoNameLike(true);
		}

		DataGridResultInfo<SysBasicInfoCustom> resultInfo = sysBasicInfoService.getBasicInfoDataGridByQueryVo(sysBasicInfoQueryVo, rows, page);

		return resultInfo;

	}

	/**
	 * 到基本添加
	 */
	@RequestMapping("/toAdd.do")
	public String toAdd(Model model) {
		return B_PATH + "/add";
	}

	/**
	 * 基本信息添加
	 */
	@RequestMapping("/add.do")
	public @ResponseBody SubmitResultInfo add(SysBasicInfoQueryVo sysBasicInfoQueryVo) throws ExceptionResultInfo {
		Integer i = sysBasicInfoService.addBasicInfoByQueryVo(sysBasicInfoQueryVo);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 到基本编辑
	 */
	@RequestMapping("/toEdit.do")
	public String toEdit(Model model, Integer basicInfoId) {
		SysBasicInfoCustom sysBasicInfoCustom = sysBasicInfoService.getSysBasicInfoCustomByKey(basicInfoId);
		model.addAttribute("sysBasicInfoCustom", sysBasicInfoCustom);
		return B_PATH + "/edit";
	}

	/**
	 * 到基本信息更新
	 */
	@RequestMapping("/edit.do")
	public @ResponseBody SubmitResultInfo edit(SysBasicInfoQueryVo sysBasicInfoQueryVo) throws ExceptionResultInfo {
		Integer i = sysBasicInfoService.updateBasicInfoByKey(sysBasicInfoQueryVo);

		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));

	}

	/**
	 * 基本信息删除
	 */
	@RequestMapping("/delete.do")
	public @ResponseBody SubmitResultInfo delete(Integer basicInfoId) {
		Integer i = sysBasicInfoService.deleteBasicInfoByKey(basicInfoId);

		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 基本信息 删除 批量
	 */
	@RequestMapping("/deletes.do")
	public @ResponseBody SubmitResultInfo deletes(Integer[] basicInfoIds) {
		Integer i = sysBasicInfoService.deleteBasicInfoByKeyList(ConversionUtil.arrayToList(basicInfoIds));

		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 启用 禁用
	 */
	@RequestMapping("/enableBasicInfoByKey.do")
	public @ResponseBody SubmitResultInfo enableBasicInfoByKey(Integer basicInfoId, Integer isEnable) {

		Integer i = sysBasicInfoService.enableBasicInfoByKey(basicInfoId, isEnable);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	@RequestMapping("/checkBasicInfo.do")
	public @ResponseBody Boolean checkBasicInfo(Integer basicInfoId, SysBasicInfoQueryVo sysBasicInfoQueryVo) {
		// 数据判空
		sysBasicInfoQueryVo = (null == sysBasicInfoQueryVo ? new SysBasicInfoQueryVo() : sysBasicInfoQueryVo);
		sysBasicInfoQueryVo.setSysBasicInfoCustom((null == sysBasicInfoQueryVo.getSysBasicInfoCustom() ? new SysBasicInfoCustom() : sysBasicInfoQueryVo.getSysBasicInfoCustom()));
		// SysBasicInfoCustom sysBasicInfoCustom = sysBasicInfoQueryVo.getSysBasicInfoCustom();
		Boolean flag = sysBasicInfoService.checkBasicInfo(basicInfoId, sysBasicInfoQueryVo);
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
