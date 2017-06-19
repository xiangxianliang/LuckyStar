package com.gll.ls.utils.web.cookie;

import javax.servlet.http.Cookie;

/**
 * Cookie 操作工具类
 * 
 * @author XL
 * @Date 2017年4月17日 下午5:56:57
 */
public class CookieUtil {

	/**
	 * 设置cookie
	 * 
	 * @param obj
	 * @return Cookie
	 */
	public static Cookie setCookie(String cookieKey, String cookieStr) {
		// 购物车长进Cookie中，对象转JSON
		Cookie cookie = new Cookie(cookieKey, cookieStr);
		// 设置Cookie
		// 关闭浏览器也要有Cookie // 默认 -1 关闭浏览器就没有 // 销毁cookie 0 马上就没有 //单位秒
		cookie.setMaxAge(Integer.MAX_VALUE);
		// cookie路径问题
		// 默认：/shopping //其他页面必须要以shopping开始
		cookie.setPath("/");
		return cookie;
	}

	/**
	 * 清除 cookie
	 * 
	 * @return Cookie
	 */
	public static Cookie clearCookie(String cookieKey) {
		// 购物车长进Cookie中，对象转JSON
		Cookie cookie = new Cookie(cookieKey, null);
		// 设置Cookie
		// 关闭浏览器也要有Cookie // 默认 -1 关闭浏览器就没有 // 销毁cookie 0 马上就没有 //单位秒
		cookie.setMaxAge(0);
		// cookie路径问题
		// 默认：/shopping //其他页面必须要以shopping开始
		cookie.setPath("/");
		return cookie;
	}

}
