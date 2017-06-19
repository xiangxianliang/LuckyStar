package com.gll.ls.core.utils.cookie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * cookie Service
 * 
 * @author XL
 * @Date 2017年4月21日 下午3:06:28
 */
public interface CookieService {

	/**
	 * 校验 cooke是否可以使用
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @param response
	 *            HttpServletResponse
	 * @return yes or no
	 */
	public String validCookie_add(HttpServletRequest request, HttpServletResponse response);

	public String validCookie_get(HttpServletRequest request, HttpServletResponse response);
}
