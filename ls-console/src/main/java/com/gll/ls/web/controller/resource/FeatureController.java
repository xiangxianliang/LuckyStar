package com.gll.ls.web.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gll.ls.core.pojo.resource.vo.ResFeatureCustom;
import com.gll.ls.core.pojo.resource.vo.ResFeatureQueryVo;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueCustom;
import com.gll.ls.core.pojo.resource.vo.ResFeatureValueQueryVo;
import com.gll.ls.core.pojo.resource.vo.ResTypeCustom;
import com.gll.ls.core.service.resource.ext.ResFeatureService;
import com.gll.ls.core.service.resource.ext.ResTypeService;
import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.utils.ConversionUtil;
import com.gll.ls.utils.web.result.DataGridResultInfo;
import com.gll.ls.utils.web.result.ResultUtil;
import com.gll.ls.utils.web.result.SubmitResultInfo;

/**
 * 属性管理 Controller
 * 
 * @author XL
 * @Date 2017年4月11日 上午9:18:06
 */
@Controller
@RequestMapping("/resource/feature")
public class FeatureController {

	public static final String F_PATH = "/resource/feature";

	@Autowired
	private ResFeatureService resFeatureService;
	@Autowired
	private ResTypeService resTypeService;

	/**
	 * 到属性 列表
	 */
	@RequestMapping("/toList.do")
	public String toList() {
		return F_PATH + "/list";
	}

	/**
	 * 属性管理
	 */
	@RequestMapping("/list.do")
	public @ResponseBody DataGridResultInfo<ResFeatureCustom> list(ResFeatureQueryVo resFeatureQueryVo, int rows, int page) {
		// 判空
		resFeatureQueryVo = (null == resFeatureQueryVo ? new ResFeatureQueryVo() : resFeatureQueryVo);
		resFeatureQueryVo.setResFeatureCustom((null == resFeatureQueryVo.getResFeatureCustom() ? new ResFeatureCustom() : resFeatureQueryVo.getResFeatureCustom()));
		ResFeatureCustom resFeatureCustom = resFeatureQueryVo.getResFeatureCustom();

		// 封装查询参数
		if (null != resFeatureCustom.getFeatureName()) {
			resFeatureQueryVo.setFeatureNameLike(true);
		}

		DataGridResultInfo<ResFeatureCustom> resultInfo = resFeatureService.getFeatureListDataGridByQueryVo(resFeatureQueryVo, rows, page);
		return resultInfo;

	}

	/**
	 * 到添加属性
	 *
	 * @return
	 */
	@RequestMapping("/toAdd.do")
	public String toAdd(ModelMap model, Integer typeId) {
		ResTypeCustom p_tc = resTypeService.getResTypeCustomByKey(typeId);
		model.addAttribute("p_tc", p_tc);
		return F_PATH + "/add";
	}

	/**
	 * 添加属性
	 *
	 * @param resFeature
	 * @return
	 */
	@RequestMapping("/add.do")
	public @ResponseBody SubmitResultInfo add(ResFeatureQueryVo resFeatureQueryVo, String[] featureValueNames, String[] featureValueValues) {
		Integer i = resFeatureService.addFeatureByQueryVo(resFeatureQueryVo, featureValueNames, featureValueValues);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 到 编辑属性
	 *
	 * @param model
	 * @param featureId
	 * @return
	 */
	@RequestMapping("/toEdit.do")
	public String toEdit(Model model, Integer featureId) {
		ResFeatureCustom resFeatureCustom = resFeatureService.getFeatureByKey(featureId);
		model.addAttribute("resFeatureCustom", resFeatureCustom);
		return F_PATH + "/edit";
	}

	/**
	 * 更新属性
	 *
	 * @param resFeature
	 * @return
	 */
	@RequestMapping("/edit.do")
	public @ResponseBody SubmitResultInfo edit(ResFeatureQueryVo resFeatureQueryVo) {
		Integer i = resFeatureService.updateFeatureByKey(resFeatureQueryVo);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 删除属性
	 *
	 * @param featureId
	 * @return
	 */
	@RequestMapping("/delete.do")
	public @ResponseBody SubmitResultInfo delete(Integer featureId) {
		Integer i = resFeatureService.deleteFeatureByKey(featureId);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 删除属性 多个
	 *
	 * @param featureId
	 * @return
	 */
	@RequestMapping("/deletes.do")
	public @ResponseBody SubmitResultInfo deletes(Integer[] featureIds, ResFeatureQueryVo resFeatureQueryVo, RedirectAttributes attr) {
		Integer i = resFeatureService.deleteFeatureByKeyList(ConversionUtil.arrayToList(featureIds));
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	@RequestMapping("/checkFeature.do")
	public @ResponseBody Boolean checkFeature(Integer featureId, ResFeatureQueryVo resFeatureQueryVo) {
		// 数据判空
		resFeatureQueryVo = (null == resFeatureQueryVo ? new ResFeatureQueryVo() : resFeatureQueryVo);
		resFeatureQueryVo.setResFeatureCustom((null == resFeatureQueryVo.getResFeatureCustom() ? new ResFeatureCustom() : resFeatureQueryVo.getResFeatureCustom()));
		// ResFeatureCustom resFeatureCustom = resFeatureQueryVo.getResFeatureCustom();
		Boolean flag = resFeatureService.checkFeature(featureId, resFeatureQueryVo);
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
