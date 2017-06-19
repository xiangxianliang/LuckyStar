package com.gll.ls.web.controller.sso;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gll.ls.core.pojo.user.vo.UserBackUserCustom;
import com.gll.ls.core.pojo.user.vo.UserBackUserQueryVo;
import com.gll.ls.core.pojo.utils.user.vo.ActiveUserBack;
import com.gll.ls.core.service.user.ext.UserBackUserService;
import com.gll.ls.core.utils.session.SessionProvider;
import com.gll.ls.utils.context.Constants;
import com.gll.ls.utils.reg.RegExpression;

/**
 * 跳转登陆
 * 登陆
 */
@Controller
@RequestMapping(value = "/sso/login")
public class LoginController {

	public static final String L_PATH = "/sso/login";

	// 注入
	@Autowired
	private SessionProvider sessionProvider;
	@Autowired
	private UserBackUserService userBackUserService;

	@RequestMapping("/toLogin.do")
	public String toLogin() {
		return L_PATH + "/login";
	}

	/**
	 * 1:验证码是否为null
	 * 2:验证码 是否正确
	 * 3:用户是否为NUll
	 * 4:密码是否为NUll
	 * 5:用户是否正确
	 * 6密码是否正确
	 * Md5 纯生Md5
	 * 放进Session 跳转ReturnUrl
	 *
	 */
	@RequestMapping(value = "/login.do", method = RequestMethod.POST) // POST
	public String login(String username, String password, String captcha, String returnUrl, HttpServletRequest request, ModelMap model) {

		model.addAttribute("returnUrl", returnUrl);

		// // 1:验证码是否为null
		// if (StringUtils.isBlank(captcha)) {
		// model.addAttribute("error", "请填写验证码！");
		// return "user/login/login";
		// }

		// // j:jsessionID,
		// // 2:验证码
		// String piccode = (String) sessionProvider.getAttribute(request, Constants.PICCODE_SESSION);
		// if (!StringUtils.equalsIgnoreCase(piccode, captcha)) {
		// model.addAttribute("error", "验证码输出错误！");
		// return "/user/login/login";
		// }

		// 3:用户是否为NUll
		if (StringUtils.isEmpty(username) && StringUtils.isBlank(username)) {
			model.addAttribute("error", "请输入用户名!");
			return L_PATH + "/login";
		}

		// 密码是否为NUll
		if (StringUtils.isEmpty(password) && StringUtils.isBlank(password)) {
			model.addAttribute("error", "请输入密码!");
			return L_PATH + "/login";
		}

		// 5:用户是否正确
		UserBackUserQueryVo userBackUserQueryVo = new UserBackUserQueryVo();
		UserBackUserCustom ebuc = new UserBackUserCustom();
		// username 匹配到 email
		if (RegExpression.metchesStr(username, RegExpression.EMAIL_REG)) {
			ebuc.setEmail(username);

		} else if (RegExpression.metchesStr(username, RegExpression.CALLPHONE_REG)) {
			// username 匹配到 手机号
			ebuc.setPhone(username);

		} else {
			ebuc.setUsername(username);
		}

		// 6密码是否正确
		if (!StringUtils.isNotBlank(password) && !RegExpression.metchesStr(password, RegExpression.PASSWORD_REG)) {
			model.addAttribute("error", "密码错误~！");
			return L_PATH + "/login";
		} else {
			ebuc.setPassword(password);
		}
		userBackUserQueryVo.setUserBackUserCustom(ebuc);
		// 查询数据库 检索用户
		UserBackUserCustom userBackUserCustom = userBackUserService.getBackUserByLongin(userBackUserQueryVo);

		if (null == userBackUserCustom) {
			model.addAttribute("error", "用户密码输出错误！");
			return L_PATH + "/login";
		}
		// 格式化 active user
		ActiveUserBack activeUserBack = userBackUserService.formatActiveUser(userBackUserCustom);

		// 放进Session 跳转ReturnUrl
		sessionProvider.setAttribute(request, Constants.BUYER_SESSION, activeUserBack);

		// 跳转url为空
		if (StringUtils.isBlank(returnUrl)) {
			return "redirect:/control/index.do";
		}
		return "redirect:" + returnUrl;
	}

	/**
	 * 用户登出
	 * 
	 * @return
	 */
	@RequestMapping("/logout.do")
	public String logout(HttpServletRequest request) {
		sessionProvider.logout(request);
		return "redirect:/sso/login/toLogin.do";
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
	 */

}
