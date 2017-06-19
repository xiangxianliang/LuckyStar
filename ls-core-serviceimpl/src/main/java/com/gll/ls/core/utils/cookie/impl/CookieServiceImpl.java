package com.gll.ls.core.utils.cookie.impl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.gll.ls.core.utils.cookie.CookieService;
import com.gll.ls.utils.utils.ResourcesUtil;

/**
 * cookie 服务Service
 * 
 * @author XL
 * @Date 2017年4月21日 下午3:05:35
 */
public class CookieServiceImpl implements CookieService {

	private static String cookiekey = ResourcesUtil.system.get("Cookie_test_key");
	private static String cookievalue = ResourcesUtil.system.get("Cookie_test_value");

	/**
	 * 校验COOKIE 增加
	 */
	@Override
	public String validCookie_add(HttpServletRequest request, HttpServletResponse response) {
		Cookie cookie = new Cookie(cookiekey, cookievalue);
		// 不要理解成cookie存储位置
		cookie.setPath(request.getContextPath());// 设置作用域
		response.addCookie(cookie);// 发送cookie到客户端
		return "yes";

	}

	/**
	 * 校验 cookie 获取
	 */
	@Override
	public String validCookie_get(HttpServletRequest request, HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();// 从客户端读取Cookie
		if (cookies != null && cookies.length > 0) {
			for (Cookie c : cookies) {
				String name = c.getName();
				String value = c.getValue();
				if (StringUtils.equals(name, cookiekey) && StringUtils.equals(value, cookievalue)) {
					return "yes";
				}
			}
		}
		return "no";
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
