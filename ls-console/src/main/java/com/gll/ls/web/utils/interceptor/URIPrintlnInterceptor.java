package com.gll.ls.web.utils.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理上下文
 * 处理Session
 * 处理全局
 * 用户身份校验
 * 
 * @author XL
 *
 */
public class URIPrintlnInterceptor implements HandlerInterceptor {

	/**
	 * 执行时机：进入action方法前
	 * 使用场景：用户的认证，用户的授权
	 * 
	 * 方法前
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		System.out.print("（URIPrintlnInterceptor）拦截器=======================================IP:");
		String uri = request.getRequestURI();

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

		System.out.println(loginIp + "========================URI:" + uri);

		return true;

	}

	/**
	 * 执行时机：进入action方法，在返回modelandvalue之前
	 * 使用场景：在这里统一对数据进行处理，比如添加菜单进行导航
	 * 
	 * 方法后
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {

	}

	/**
	 * 执行时机：action方法执行完成已经返回modelandview
	 * 使用场景：统一的处理系统异常，统一记录系统日志，监控action方法执行的时间，在preHandle记录，开始时间，在afterCompletion记录结束时间
	 * 
	 * 页面渲染后
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

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
	 */

}
