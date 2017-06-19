package com.gll.ls.web.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 错误页面 跳转
 * 
 * @author lx
 *
 */
@Controller
@RequestMapping("/error")
public class ErrorController {

	// 到无权限页面
	@RequestMapping(value = "/refuse.do")
	public String refuse() {
		return "/error/refuse";
	}

}
