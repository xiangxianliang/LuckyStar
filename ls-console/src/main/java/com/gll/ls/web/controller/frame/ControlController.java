package com.gll.ls.web.controller.frame;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.utils.ResourcesUtil;

/**
 * 后台管理
 */
@Controller
@RequestMapping("/control")
public class ControlController {

	// 跳转入口页面
	@RequestMapping(value = "/index.do")
	public String index(ModelMap model) {

		// 系统代号
		model.addAttribute(Config.VERSION_NAME, ResourcesUtil.system.get(Config.VERSION_NAME));
		// 系统版本号
		model.addAttribute(Config.VERSION_NUMBER_KEY, ResourcesUtil.system.get(Config.VERSION_NUMBER_KEY));
		// 系统版本发布日期
		model.addAttribute(Config.VERSION_DATE_KEY, ResourcesUtil.system.get(Config.VERSION_DATE_KEY));

		// 返回页面
		return "/index";

	}

	// 跳入 默认的 用户登录页面
	@RequestMapping(value = "/welcome.do")
	public String welcome() {
		return "/control/welcome";
	}

	// 头
	@RequestMapping(value = "/top.do")
	public String top() {
		return "/control/top";
	}

	// 跳转身体页面
	@RequestMapping(value = "/main.do")
	public String main() {

		return "/control/main";
	}
}
