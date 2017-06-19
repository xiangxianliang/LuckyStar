package com.gll.ls.web.controller.system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gll.ls.core.pojo.system.vo.SysDictInfoCustom;
import com.gll.ls.core.pojo.system.vo.SysModuleCustom;
import com.gll.ls.core.pojo.system.vo.SysModuleQueryVo;
import com.gll.ls.core.pojo.utils.tree.vo.Tree;
import com.gll.ls.core.pojo.utils.tree.vo.ZTree;
import com.gll.ls.core.service.system.ext.SysDictInfoService;
import com.gll.ls.core.service.system.ext.SysModuleService;
import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.utils.ConversionUtil;
import com.gll.ls.utils.web.result.DataGridResultInfo;
import com.gll.ls.utils.web.result.ExceptionResultInfo;
import com.gll.ls.utils.web.result.ResultInfo;
import com.gll.ls.utils.web.result.ResultUtil;
import com.gll.ls.utils.web.result.SubmitResultInfo;

/**
 * 模块管理 Controller
 * 
 * @author XL
 * @Date 2017年4月11日 上午9:18:06
 */
@Controller
@RequestMapping("/system/module")
public class ModuleController {

	public static final String M_PATH = "/system/module";

	@Autowired
	private SysModuleService sysModuleService;
	@Autowired
	private SysDictInfoService sysDictInfoService;

	/**
	 * 到模块管理
	 */
	@RequestMapping("/toList.do")
	public String toList() {
		return M_PATH + "/list";
	}

	/**
	 * 查询模块
	 * 
	 * @param sysModuleQueryVo
	 *            查询条件
	 * @param rows
	 *            每页显示个数
	 * @param page
	 *            当前页码
	 * @return
	 */
	@RequestMapping("/list.do")
	public @ResponseBody DataGridResultInfo<SysModuleCustom> list(SysModuleQueryVo sysModuleQueryVo, int rows, int page) {
		// 判空
		sysModuleQueryVo = (null == sysModuleQueryVo ? new SysModuleQueryVo() : sysModuleQueryVo);
		sysModuleQueryVo.setSysModuleCustom((null == sysModuleQueryVo.getSysModuleCustom() ? new SysModuleCustom() : sysModuleQueryVo.getSysModuleCustom()));
		// SysModuleCustom ebModuleCustom = sysModuleQueryVo.getSysModuleCustom();

		DataGridResultInfo<SysModuleCustom> resultInfo = sysModuleService.getModuleListDataGridByQueryVo(sysModuleQueryVo, rows, page);
		return resultInfo;

	}

	/**
	 * 到添加模块
	 */
	@RequestMapping("/toAdd.do")
	public String toAdd(Model model, Integer moduleId) {
		SysModuleCustom p_ms = sysModuleService.getModuleByKey(moduleId);
		model.addAttribute("p_ms", p_ms);

		// 图标 查询数据字典
		List<SysDictInfoCustom> sysDictInfoCustomList = sysDictInfoService.getSysDictInfoCustomByTypeId(2);
		model.addAttribute("sysDictInfoCustomList", sysDictInfoCustomList);
		// 查询 数据字典
		return M_PATH + "/add";
	}

	/**
	 * 添加模块
	 */
	@RequestMapping("/add.do")
	public @ResponseBody SubmitResultInfo add(SysModuleQueryVo sysModuleQueryVo) throws ExceptionResultInfo {

		Integer i = sysModuleService.addModuleByQueryVo(sysModuleQueryVo);
		// 返回主键
		Integer moduleId = sysModuleQueryVo.getSysModuleCustom().getModuleId();
		// 封装返回数据
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 });
		resultInfo.getSysdata().put("moduleId", moduleId);
		// 返回数据
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 到 编辑模块
	 */
	@RequestMapping("/toEdit.do")
	public String toEdit(Model model, Integer moduleId) {
		// 查询数据库
		SysModuleCustom sysModuleCustom = sysModuleService.getModuleByKey(moduleId);
		model.addAttribute("sysModuleCustom", sysModuleCustom);
		// 图标 查询数据字典
		List<SysDictInfoCustom> sysDictInfoCustomList = sysDictInfoService.getSysDictInfoCustomByTypeId(2);
		model.addAttribute("sysDictInfoCustomList", sysDictInfoCustomList);
		// 跳转页面
		return M_PATH + "/edit";
	}

	/**
	 * 更新模块
	 */
	@RequestMapping("/edit.do")
	public @ResponseBody SubmitResultInfo edit(SysModuleQueryVo sysModuleQueryVo) throws ExceptionResultInfo {

		Integer i = sysModuleService.updateModuleByKey(sysModuleQueryVo);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));

	}

	/**
	 * 删除模块
	 */
	@RequestMapping("/delete.do")
	public @ResponseBody SubmitResultInfo delete(Integer moduleId) {

		Integer i = sysModuleService.deleteModuleAndRelationByKey(moduleId);
		// 封装数据
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 });
		resultInfo.getSysdata().put("moduleId", moduleId);
		// 返回数据
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 删除模块 多个
	 */
	@RequestMapping("/deletes.do")
	public @ResponseBody SubmitResultInfo deletes(Integer[] moduleIds) {

		Integer i = sysModuleService.deleteModuleAndRelationByKeys(ConversionUtil.arrayToList(moduleIds));
		// 封装数据
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 });
		resultInfo.getSysdata().put("moduleIds", moduleIds);
		// 返回数据
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 启用模块
	 */
	@RequestMapping("/enableModule.do")
	public @ResponseBody SubmitResultInfo enableModule(Integer moduleId, Integer isEnable) {

		Integer i = sysModuleService.enableModuleByKey(moduleId, isEnable);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 校验模块名称是否可以使用
	 */
	@RequestMapping("/checkModule.do")
	public @ResponseBody Boolean checkModule(Integer moduleId, SysModuleQueryVo sysModuleQueryVo) {
		// 判空
		sysModuleQueryVo = (null == sysModuleQueryVo ? new SysModuleQueryVo() : sysModuleQueryVo);
		sysModuleQueryVo.setSysModuleCustom((null == sysModuleQueryVo.getSysModuleCustom() ? new SysModuleCustom() : sysModuleQueryVo.getSysModuleCustom()));
		// SysModuleCustom sysModuleCustom = sysModuleQueryVo.getSysModuleCustom();
		Boolean flag = sysModuleService.checkModule(moduleId, sysModuleQueryVo);
		return flag;
	}

	// ==========================================================================

	/**
	 * 得到模块Tree 树
	 */
	@Deprecated
	@RequestMapping("/getModuleTree.do")
	public @ResponseBody List<Tree> getModuleTree() {
		List<Tree> list = new ArrayList<Tree>();
		Tree tree = sysModuleService.getModuleTree();
		list.add(tree);
		return list;
	}

	/**
	 * 得到模块树 ZTree
	 */
	@RequestMapping("/getModuleZTree.do")
	public @ResponseBody List<ZTree> getModuleZTree() {
		List<ZTree> list = new ArrayList<ZTree>();
		ZTree zTree = sysModuleService.getModuleZTree();
		list.add(zTree);
		return list;
	}

	/**
	 * 得到模块Tree 树 根据特定的ID
	 */
	@Deprecated
	@RequestMapping("/getModuleTreeByParentId.do")
	public @ResponseBody List<Tree> getModuleTreeByParentId(Integer parentId) {
		Tree tree = sysModuleService.getModuleTreeByParentId(parentId);
		List<Tree> list = new ArrayList<Tree>();
		list.add(tree);
		return list;
	}

	/**
	 * 得到模块ZTree 树 根据特定的ID
	 */
	@RequestMapping("/getModuleJSONByModuleId.do")
	public @ResponseBody ZTree getModuleJSONByModuleId(Integer moduleId) {
		ZTree ztree = sysModuleService.getModuleJSONByModuleId(moduleId);
		return ztree;
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
	 */
}
