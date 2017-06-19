package com.gll.ls.web.controller.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gll.ls.core.pojo.resource.vo.ResTypeCustom;
import com.gll.ls.core.pojo.resource.vo.ResTypeQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.ZTree;
import com.gll.ls.core.service.resource.ext.ResTypeService;
import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.utils.ConversionUtil;
import com.gll.ls.utils.web.result.DataGridResultInfo;
import com.gll.ls.utils.web.result.ResultInfo;
import com.gll.ls.utils.web.result.ResultUtil;
import com.gll.ls.utils.web.result.SubmitResultInfo;

/**
 * 类型管理 Controller
 * 
 * @author XL
 * @Date 2017年4月11日 上午9:18:06
 */
@Controller
@RequestMapping("/resource/type")
public class TypeController {

	public static final String T_PATH = "/resource/type";

	@Autowired
	private ResTypeService resTypeService;

	/**
	 * 到添加类型
	 *
	 * @return
	 */
	@RequestMapping("/toList.do")
	public String toList() {
		return T_PATH + "/list";
	}

	/**
	 * 类型管理
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/list.do")
	public @ResponseBody DataGridResultInfo<ResTypeCustom> list(ResTypeQueryVo resTypeQueryVo, int rows, int page) {
		// 判空
		resTypeQueryVo = (null == resTypeQueryVo ? new ResTypeQueryVo() : resTypeQueryVo);
		resTypeQueryVo.setResTypeCustom((null == resTypeQueryVo.getResTypeCustom() ? new ResTypeCustom() : resTypeQueryVo.getResTypeCustom()));
		ResTypeCustom resTypeCustom = resTypeQueryVo.getResTypeCustom();

		if (null != resTypeCustom.getTypeName()) {
			resTypeQueryVo.setTypeNameLike(true);
		}
		// 返回数据
		DataGridResultInfo<ResTypeCustom> resultInfo = resTypeService.getTypeListDataGridByQueryVo(resTypeQueryVo, rows, page);
		return resultInfo;
	}

	/**
	 * 到添加类型
	 *
	 * @return
	 */
	@RequestMapping("/toAdd.do")
	public String toAdd(Model model, Integer typeId) {
		ResTypeCustom p_tc = resTypeService.getTypeByKey(typeId);
		model.addAttribute("p_tc", p_tc);
		return T_PATH + "/add";
	}

	/**
	 * 添加类型
	 *
	 * @param resType
	 * @return
	 */
	@RequestMapping("/add.do")
	public @ResponseBody SubmitResultInfo add(ResTypeQueryVo resTypeQueryVo) {
		Integer i = resTypeService.addTypeByQueryVo(resTypeQueryVo);

		Integer typeId = resTypeQueryVo.getResTypeCustom().getTypeId();
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 });
		resultInfo.getSysdata().put("typeId", typeId);
		// 返回数据
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 到 编辑类型
	 *
	 * @param model
	 * @param typeId
	 * @return
	 */
	@RequestMapping("/toEdit.do")
	public String toEdit(Model model, Integer typeId) {
		ResTypeCustom resTypeCustom = resTypeService.getTypeByKey(typeId);
		model.addAttribute("resTypeCustom", resTypeCustom);
		return T_PATH + "/edit";
	}

	/**
	 * 更新类型
	 *
	 * @param resType
	 * @return
	 */
	@RequestMapping("/edit.do")
	public @ResponseBody SubmitResultInfo edit(ResTypeQueryVo resTypeQueryVo) {
		Integer i = resTypeService.updateTypeByKey(resTypeQueryVo);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 删除类型
	 *
	 * @param typeId
	 * @return
	 */
	@RequestMapping("/delete.do")
	public @ResponseBody SubmitResultInfo delete(Integer typeId) {
		Integer i = resTypeService.deleteTypeByKey(typeId);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));

	}

	/**
	 * 删除类型
	 *
	 * @param typeId
	 * @return
	 */
	@RequestMapping("/deletes.do")
	public @ResponseBody SubmitResultInfo deletes(Integer[] typeIds) {
		Integer i = resTypeService.deleteTypeByKeyList(ConversionUtil.arrayToList(typeIds));
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));

	}

	/**
	 * 启用树
	 */
	@RequestMapping("/updateTypeEnable.do")
	public @ResponseBody SubmitResultInfo updateTypeSelect(Integer[] typeIds) {
		Integer i = resTypeService.updateTypeEnable(ConversionUtil.arrayToList(typeIds));
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 校验模块名称是否可以使用
	 */
	@RequestMapping("/checkType.do")
	public @ResponseBody Boolean checkType(Integer typeId, ResTypeQueryVo resTypeQueryVo) {
		return resTypeService.checkType(typeId, resTypeQueryVo);
	}

	// =======================================================================================================================

	// /**
	// * 得到Tree 树
	// */
	// @Deprecated
	// @RequestMapping("/getTypeTree.do")
	// public @ResponseBody List<Tree> getTypeTree() {
	// List<Tree> treeList = resTypeService.getTypeTree();
	// return treeList;
	// }
	//
	// /**
	// * 得到Tree 树
	// */
	// @Deprecated
	// @RequestMapping("/getTypeTreeByManager.do")
	// public @ResponseBody List<Tree> getTypeTreeByRoot() {
	// Tree tree = resTypeService.getTypeTreeByManager();
	// List<Tree> treeList = new ArrayList<Tree>();
	// treeList.add(tree);
	// return treeList;
	// }

	/**
	 * 得到模块树 ZTree
	 */
	@RequestMapping("/getTypeZTree.do")
	public @ResponseBody List<ZTree> getTypeZTree() {
		List<ZTree> list = new ArrayList<ZTree>();
		ZTree zTree = resTypeService.getTypeZTree();
		list.add(zTree);
		return list;
	}

	/**
	 * 得到模块树 ZTree
	 */
	@RequestMapping("/getEnableTypeZTree.do")
	public @ResponseBody List<ZTree> getEnableTypeZTree() {
		List<ZTree> list = new ArrayList<ZTree>();
		ZTree zTree = resTypeService.getEnableTypeZTree();
		list.add(zTree);
		return list;
	}

	/**
	 * 得到模块Tree 树 根据特定的ID
	 */
	@RequestMapping("/getTypeJSONByTypeId.do")
	public @ResponseBody ZTree getTypeJSONByTypeId(Integer typeId) {
		ZTree ztree = resTypeService.getModuleJSONByModuleId(typeId);
		return ztree;
	}

	/**
	 * 得到选中的ZTree （属性管理用到）
	 */
	@RequestMapping("/getSelectTypeZTree.do")
	public @ResponseBody List<ZTree> getSelectTypeZTree() {
		List<ZTree> list = new ArrayList<ZTree>();
		ZTree zTree = resTypeService.getSelectTypeZTree();
		list.add(zTree);
		return list;
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
