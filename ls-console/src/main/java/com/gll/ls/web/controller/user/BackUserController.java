package com.gll.ls.web.controller.user;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gll.ls.core.pojo.user.vo.UserBackUserCustom;
import com.gll.ls.core.pojo.user.vo.UserBackUserQueryVo;
import com.gll.ls.core.service.user.ext.UserBackUserService;
import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.utils.ConversionUtil;
import com.gll.ls.utils.web.http.RequestUtil;
import com.gll.ls.utils.web.result.DataGridResultInfo;
import com.gll.ls.utils.web.result.ExceptionResultInfo;
import com.gll.ls.utils.web.result.ResultInfo;
import com.gll.ls.utils.web.result.ResultUtil;
import com.gll.ls.utils.web.result.SubmitResultInfo;

/**
 * 用户管理 Controller
 * 
 * @author XL
 * @Date 2017年4月11日 上午9:18:06
 */
@Controller
@RequestMapping("/user/back")
public class BackUserController {

	public static final String B_PATH = "/user/back";

	@Autowired
	private UserBackUserService userBackUserService;

	/**
	 * 到用户管理页面
	 */
	@RequestMapping("/toList.do")
	public String toList() {
		return B_PATH + "/list";
	}

	/**
	 * 用户管理
	 */
	@RequestMapping("/list.do")
	public @ResponseBody DataGridResultInfo<UserBackUserCustom> list(UserBackUserQueryVo userBackUserQueryVo, int rows, int page) {
		// 判空
		userBackUserQueryVo = (null == userBackUserQueryVo ? new UserBackUserQueryVo() : userBackUserQueryVo);
		userBackUserQueryVo.setUserBackUserCustom((null == userBackUserQueryVo.getUserBackUserCustom() ? new UserBackUserCustom() : userBackUserQueryVo.getUserBackUserCustom()));
		// UserBackUserCustom ebModuleCustom = userBackUserQueryVo.getUserBackUserCustom();

		DataGridResultInfo<UserBackUserCustom> resultInfo = userBackUserService.getBackUserListDataGridByQueryVo(userBackUserQueryVo, rows, page);
		return resultInfo;

	}

	/**
	 * 到添加用户
	 */
	@RequestMapping("/toAdd.do")
	public String toAdd() {
		return B_PATH + "/add";
	}

	/**
	 * 添加用户
	 */
	@RequestMapping("/add.do")
	public @ResponseBody SubmitResultInfo add(UserBackUserQueryVo userBackUserQueryVo, Integer[] roles, HttpServletRequest request) throws ExceptionResultInfo {

		// 判空
		userBackUserQueryVo = (null == userBackUserQueryVo ? new UserBackUserQueryVo() : userBackUserQueryVo);
		userBackUserQueryVo.setUserBackUserCustom((null == userBackUserQueryVo.getUserBackUserCustom() ? new UserBackUserCustom() : userBackUserQueryVo.getUserBackUserCustom()));
		UserBackUserCustom userBackUserCustom = userBackUserQueryVo.getUserBackUserCustom();

		if (!StringUtils.equals(userBackUserCustom.getPassword(), userBackUserCustom.getRegpassword())) {
			System.out.println("======================================================");
			// 封装后
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.BACK_MESSAGE, 123, null));
		}

		userBackUserCustom.setRegisterTime(new Date());// 注册时间
		userBackUserCustom.setRegisterIp(RequestUtil.getIP(request));// 注册IP
		userBackUserCustom.setLoginCount(0);// 登陆次数 0

		// 服务层调用方法
		Integer i = userBackUserService.addBackUserByQueryVo(userBackUserQueryVo, roles);

		// 封装返回数据
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 });
		// 返回数据
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 编辑用户
	 */
	@RequestMapping("/toEdit.do")
	public String toEdit(Model model, Integer userId) {
		UserBackUserCustom userBackUserCustom = userBackUserService.getUserBackUserCustomByKey(userId);
		model.addAttribute("userBackUserCustom", userBackUserCustom);
		// 跳转页面
		return B_PATH + "/edit";
	}

	/**
	 * 更新用户
	 */
	@RequestMapping("/edit.do")
	public @ResponseBody SubmitResultInfo edit(UserBackUserQueryVo userBackUserQueryVo, Integer[] roles) {
		Integer i = userBackUserService.updateBackUserByKey(userBackUserQueryVo, roles);
		// 封装返回数据
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 });
		// 返回数据
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 删除用户
	 */
	@RequestMapping("/delete.do")
	public @ResponseBody SubmitResultInfo delete(Integer userId, UserBackUserQueryVo userBackUserQueryVo) {
		// Integer i = userBackUserService.deleteUserBackUserByKey(userId);
		// 删除用户 连带 删除 关联的用户绑定的角色
		Integer i = userBackUserService.deleteBackUserAndRoleByKey(userId);

		// 封装返回数据
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 });
		// 返回数据
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 删除用户 多个
	 */
	@RequestMapping("/deletes.do")
	public @ResponseBody SubmitResultInfo deletes(Integer[] userIds, UserBackUserQueryVo userBackUserQueryVo) {
		Integer i = userBackUserService.deleteBackUserAndRoleByKeyList(ConversionUtil.arrayToList(userIds));

		// 封装返回数据
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 });
		// 返回数据
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 启用模块
	 */
	@RequestMapping("/enableUser.do")
	public @ResponseBody SubmitResultInfo enableUser(Integer userId, Integer isEnable) {

		Integer i = userBackUserService.enableUserByKey(userId, isEnable);
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	@RequestMapping("/checkBackUser.do")
	public @ResponseBody Boolean checkBackUser(Integer userId, UserBackUserQueryVo userBackUserQueryVo) {
		// 数据判空
		userBackUserQueryVo = (null == userBackUserQueryVo ? new UserBackUserQueryVo() : userBackUserQueryVo);
		userBackUserQueryVo.setUserBackUserCustom((null == userBackUserQueryVo.getUserBackUserCustom() ? new UserBackUserCustom() : userBackUserQueryVo.getUserBackUserCustom()));
		// UserBackUserCustom userBackUserCustom = userBackUserQueryVo.getUserBackUserCustom();
		Boolean flag = userBackUserService.checkBackUser(userId, userBackUserQueryVo);
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
