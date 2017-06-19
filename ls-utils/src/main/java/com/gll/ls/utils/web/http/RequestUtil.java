package com.gll.ls.utils.web.http;

import javax.servlet.http.HttpServletRequest;

/**
 * Http 工具
 * 
 * @author XL
 * @Date 2017年4月13日 下午5:57:55
 */
public class RequestUtil {

	/**
	 * 获取工具
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @return IP
	 */
	public static String getIP(HttpServletRequest request) {
		// 得到ip
		// HttpServletRequest request = getRequest();
		String loginIp = request.getHeader("x-forwarded-for");
		if (loginIp == null || loginIp.length() == 0 || "unknown".equalsIgnoreCase(loginIp)) {
			loginIp = request.getHeader("Proxy-Client-IP");
		}
		if (loginIp == null || loginIp.length() == 0 || "unknown".equalsIgnoreCase(loginIp)) {
			loginIp = request.getHeader("WL-Proxy-Client-IP");
		}
		if (loginIp == null || loginIp.length() == 0 || "unknown".equalsIgnoreCase(loginIp)) {
			loginIp = request.getRemoteAddr();
		}
		return loginIp;
	}
}
