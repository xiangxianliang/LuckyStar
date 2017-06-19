package com.gll.ls.web.controller.system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gll.ls.core.pojo.system.vo.SysDictInfoCustom;
import com.gll.ls.core.pojo.system.vo.SysDictInfoQueryVo;
import com.gll.ls.core.pojo.system.vo.SysDictTypeCustom;
import com.gll.ls.core.pojo.system.vo.SysDictTypeQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.Tree;
import com.gll.ls.core.pojo.utils.tree.vo.ZTree;
import com.gll.ls.core.service.system.ext.SysDictInfoService;
import com.gll.ls.core.service.system.ext.SysDictTypeService;
import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.utils.ConversionUtil;
import com.gll.ls.utils.web.result.DataGridResultInfo;
import com.gll.ls.utils.web.result.ExceptionResultInfo;
import com.gll.ls.utils.web.result.ResultInfo;
import com.gll.ls.utils.web.result.ResultUtil;
import com.gll.ls.utils.web.result.SubmitResultInfo;

/**
 * 字典管理 Controller
 * 
 * @author XL
 * @Date 2017年4月11日 上午9:18:06
 */
@Controller
@RequestMapping("/system/dictionary")
public class DictionaryController {

	public static final String D_PATH = "/system/dictionary";

	@Autowired
	private SysDictTypeService sysDictTypeService;
	@Autowired
	private SysDictInfoService sysDictInfoService;

	/**
	 * 到字典管理
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/toList.do")
	public String toList() {
		return D_PATH + "/list";
	}

	/**
	 * 根据字典 项 查询字典 内容
	 * 
	 * @param sysDictionaryQueryVo
	 *            查询条件
	 * @param rows
	 *            每页显示个数
	 * @param page
	 *            当前页码
	 * @return
	 */
	@RequestMapping("/listType.do")
	public @ResponseBody DataGridResultInfo<SysDictTypeCustom> listType(SysDictTypeQueryVo sysDictTypeQueryVo, int rows, int page) {
		// 判空
		sysDictTypeQueryVo = (null == sysDictTypeQueryVo ? new SysDictTypeQueryVo() : sysDictTypeQueryVo);
		sysDictTypeQueryVo.setSysDictTypeCustom((null == sysDictTypeQueryVo.getSysDictTypeCustom() ? new SysDictTypeCustom() : sysDictTypeQueryVo.getSysDictTypeCustom()));
		// SysDictTypeCustom sysDictTypeCustom = sysDictTypeQueryVo.getSysDictTypeCustom();

		DataGridResultInfo<SysDictTypeCustom> resultType = sysDictTypeService.getDictTypeDataGridByQueryVo(sysDictTypeQueryVo, rows, page);
		return resultType;
	}

	/**
	 * 根据字典 项 查询字典 内容
	 * 
	 * @param sysDictionaryQueryVo
	 *            查询条件
	 * @param rows
	 *            每页显示个数
	 * @param page
	 *            当前页码
	 * @return
	 */
	@RequestMapping("/listInfo.do")
	public @ResponseBody DataGridResultInfo<SysDictInfoCustom> listInfo(SysDictInfoQueryVo sysDictInfoQueryVo, int rows, int page) {
		// 判空
		sysDictInfoQueryVo = (null == sysDictInfoQueryVo ? new SysDictInfoQueryVo() : sysDictInfoQueryVo);
		sysDictInfoQueryVo.setSysDictInfoCustom((null == sysDictInfoQueryVo.getSysDictInfoCustom() ? new SysDictInfoCustom() : sysDictInfoQueryVo.getSysDictInfoCustom()));
		// SysDictInfoCustom sysDictInfoCustom = sysDictInfoQueryVo.getSysDictInfoCustom();

		DataGridResultInfo<SysDictInfoCustom> resultInfo = sysDictInfoService.getDictInfoDataGridByQueryVo(sysDictInfoQueryVo, rows, page);
		return resultInfo;
	}

	/**
	 * 到添加字典项
	 */
	@RequestMapping("/toAddType.do")
	public String toAddType() {
		return D_PATH + "/addType";
	}

	/**
	 * 到添加字典项
	 */
	@RequestMapping("/toAddInfo.do")
	public String toAddInfo(Model model, Integer typeId) {
		SysDictTypeCustom typeCustom = sysDictTypeService.getSysDictTypeCustomByKey(typeId);
		model.addAttribute("typeCustom", typeCustom);
		return D_PATH + "/addInfo";
	}

	/**
	 * 添加字典 项
	 */
	@RequestMapping("/addType.do")
	public @ResponseBody SubmitResultInfo addType(SysDictTypeQueryVo sysDictTypeQueryVo) throws ExceptionResultInfo {
		// ResultUtil.throwExcepion(ResultUtil.createFail(Config.BACK_MESSAGE, 901, null));

		Integer i = sysDictTypeService.addDictTypeByQueryVo(sysDictTypeQueryVo);

		Integer typeId = sysDictTypeQueryVo.getSysDictTypeCustom().getTypeId();
		// 封装返回数据
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 });
		resultInfo.getSysdata().put("typeId", typeId);
		// 返回数据
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 添加字典 信息
	 */
	@RequestMapping("/addInfo.do")
	public @ResponseBody SubmitResultInfo addInfo(SysDictInfoQueryVo SysDictInfoQueryVo) throws ExceptionResultInfo {
		// ResultUtil.throwExcepion(ResultUtil.createFail(Config.BACK_MESSAGE, 901, null));

		Integer i = sysDictInfoService.addDictInfoByQueryVo(SysDictInfoQueryVo);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 到 编辑字典 项
	 */
	@RequestMapping("/toEditType.do")
	public String toEditType(Model model, Integer typeId) {
		SysDictTypeCustom sysDictTypeCustom = sysDictTypeService.getSysDictTypeCustomByKey(typeId);
		model.addAttribute("sysDictTypeCustom", sysDictTypeCustom);
		return D_PATH + "/editType";
	}

	/**
	 * 到 编辑字典 信息
	 */
	@RequestMapping("/toEditInfo.do")
	public String toEditInfo(Model model, Integer infoId) {
		SysDictInfoCustom sysDictInfoCustom = sysDictInfoService.getSysDictInfoCustomByKey(infoId);

		// 查询字典项的父类型
		SysDictTypeCustom sysDictTypeCustom = sysDictTypeService.getSysDictTypeCustomByKey(sysDictInfoCustom.getTypeId());

		model.addAttribute("sysDictInfoCustom", sysDictInfoCustom);
		model.addAttribute("sysDictTypeCustom", sysDictTypeCustom);
		return D_PATH + "/editInfo";
	}

	/**
	 * 更新字典 项
	 */
	@RequestMapping("/editType.do")
	public @ResponseBody SubmitResultInfo editType(SysDictTypeQueryVo sysDictTypeQueryVo) throws ExceptionResultInfo {

		Integer i = sysDictTypeService.updateDictTypeByKey(sysDictTypeQueryVo);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 更新字典 信息
	 */
	@RequestMapping("/editInfo.do")
	public @ResponseBody SubmitResultInfo editInfo(SysDictInfoQueryVo sysDictInfoQueryVo) throws ExceptionResultInfo {

		Integer i = sysDictInfoService.updateDictInfoByKey(sysDictInfoQueryVo);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 删除字典 项
	 */
	@RequestMapping("/deleteType.do")
	public @ResponseBody SubmitResultInfo deleteType(Integer typeId) {

		Integer i = sysDictTypeService.deleteDictTypeByKey(typeId);
		// 封装返回数据
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 });
		resultInfo.getSysdata().put("typeId", typeId);
		// 返回数据
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 删除字典 项 多个
	 */
	@RequestMapping("/deletesType.do")
	public @ResponseBody SubmitResultInfo deletesType(Integer[] typeIds) {

		Integer i = sysDictTypeService.deleteDictTypeByKeyList(ConversionUtil.arrayToList(typeIds));
		// 封装返回数据
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 });
		resultInfo.getSysdata().put("typeIds", typeIds);
		// 返回数据
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 删除字典 信息
	 */
	@RequestMapping("/deleteInfo.do")
	public @ResponseBody SubmitResultInfo deleteInfo(Integer infoId) {
		Integer i = sysDictInfoService.deleteDictInfoByKey(infoId);

		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 删除字典 信息 多个
	 */
	@RequestMapping("/deletesInfo.do")
	public @ResponseBody SubmitResultInfo deletesInfo(Integer[] infoIds) {
		Integer i = sysDictInfoService.deleteDictInfoByKeyList(ConversionUtil.arrayToList(infoIds));

		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 删除字典 项 多个
	 */
	@RequestMapping("/enableType.do")
	public @ResponseBody SubmitResultInfo enableType(Integer typeId, Integer isEnable) {

		Integer i = sysDictTypeService.enableTypeByKey(typeId, isEnable);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 删除字典 信息 多个
	 */
	@RequestMapping("/enableInfo.do")
	public @ResponseBody SubmitResultInfo enableInfo(Integer infoId, Integer isEnable) {
		Integer i = sysDictInfoService.enableInfoByKey(infoId, isEnable);

		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 得到字典Tree 树
	 * (过时)
	 */
	@Deprecated
	@RequestMapping("/getDictionaryTree.do")
	public @ResponseBody List<Tree> getDictionaryTree() {
		// 数据库查询Ztree
		Tree tree = sysDictTypeService.getDictionaryTree();
		// 封装数据
		ArrayList<Tree> list = new ArrayList<Tree>();
		list.add(tree);
		// 返回
		return list;
	}

	/**
	 * 得到字典Tree 树
	 */
	@RequestMapping("/getDictionaryZTree.do")
	public @ResponseBody List<ZTree> getDictionaryZTree() {
		// 数据库查询Ztree
		ZTree ztree = sysDictTypeService.getDictionaryZTree();
		// 封装数据
		ArrayList<ZTree> list = new ArrayList<ZTree>();
		list.add(ztree);
		// 返回
		return list;
	}

	/**
	 * 根据 字典类型id查询 节点信息
	 * 
	 * @param typeId
	 * @return
	 */
	@Deprecated
	@RequestMapping("/getDictTypeTreeBytypeId.do")
	public @ResponseBody Tree getDictTypeTreeBytypeId(Integer typeId) {
		return sysDictTypeService.getDictTypeTreeBytypeId(typeId);
	}

	/**
	 * 根据 字典类型id查询 节点信息
	 * 
	 * @param typeId
	 * @return
	 */
	@RequestMapping("/getDictTypeZTreeBytypeId.do")
	public @ResponseBody ZTree getDictTypeZTreeBytypeId(Integer typeId) {
		return sysDictTypeService.getDictTypeZTreeBytypeId(typeId);
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	@RequestMapping("/checkDictType.do")
	public @ResponseBody Boolean checkDictType(Integer typeId, SysDictTypeQueryVo sysDictTypeQueryVo) {
		// 数据判空
		sysDictTypeQueryVo = (null == sysDictTypeQueryVo ? new SysDictTypeQueryVo() : sysDictTypeQueryVo);
		sysDictTypeQueryVo.setSysDictTypeCustom((null == sysDictTypeQueryVo.getSysDictTypeCustom() ? new SysDictTypeCustom() : sysDictTypeQueryVo.getSysDictTypeCustom()));
		// SysDictTypeCustom sysDictTypeCustom = sysDictTypeQueryVo.getSysDictTypeCustom();
		Boolean flag = sysDictTypeService.checkDictType(typeId, sysDictTypeQueryVo);
		// 返回数据
		return flag;
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	@RequestMapping("/checkDictInfo.do")
	public @ResponseBody Boolean checkDictInfo(Integer infoId, SysDictInfoQueryVo sysDictInfoQueryVo) {
		// 数据判空
		sysDictInfoQueryVo = (null == sysDictInfoQueryVo ? new SysDictInfoQueryVo() : sysDictInfoQueryVo);
		sysDictInfoQueryVo.setSysDictInfoCustom((null == sysDictInfoQueryVo.getSysDictInfoCustom() ? new SysDictInfoCustom() : sysDictInfoQueryVo.getSysDictInfoCustom()));
		// SysDictInfoCustom sysDictInfoCustom = sysDictInfoQueryVo.getSysDictInfoCustom();
		Boolean flag = sysDictInfoService.checkDictInfo(infoId, sysDictInfoQueryVo);
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
