package com.gll.ls.web.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理
 * 
 * @author lx
 *
 */
@Controller
@RequestMapping("/home/index")
public class IndexController {

	public static final String H_PATH = "/home/index";

	/**
	 * 首页
	 */
	@RequestMapping(value = "/home.do")
	public String index() {
		return H_PATH + "/home";
	}
}
