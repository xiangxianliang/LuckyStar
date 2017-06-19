package com.gll.ls.web.utils.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.gll.ls.core.pojo.utils.user.vo.ActiveUserBack;
import com.gll.ls.core.service.user.ext.UserBackUserService;
import com.gll.ls.core.utils.session.SessionProvider;
import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.context.Constants;
import com.gll.ls.utils.utils.ResourcesUtil;

/**
 * 处理上下文
 * 处理Session
 * 处理全局
 * 用户身份校验
 * 
 * @author XL
 *
 */
public class BackLoginInterceptor implements HandlerInterceptor {

	@Autowired
	private SessionProvider sessionProvider;
	@Autowired
	private UserBackUserService userBackUserService;

	private Integer adminId;

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	/**
	 * 常量 拦截规则
	 */
	public static final String INTERCEPTOR_URL = "/buyer";
	public static List<String> open_urls;

	/**
	 * 执行时机：进入action方法前
	 * 使用场景：用户的认证，用户的授权
	 * 
	 * 方法前
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		// 是否拦截
		// 用户请求路径
		// 请求路径 http://localhost:8080/buyer/index.shtml
		// request.getRequestURI(); uri : /buyer/index.shtml
		// url : http://localhost:8080/buyer/index.shtml
		String uri = request.getRequestURI();

		System.out.print("（FrontLoginInterceptor）拦截器========URI:" + uri + "========");

		// 校验用户访问的是否是公开资源地址
		if (open_urls == null) {
			open_urls = ResourcesUtil.gekeyList(Config.AUTHORITY_BACK_ANONYMOUS_ACTIONS);
		}
		for (String open_url : open_urls) {
			if (uri.indexOf(open_url) >= 0) {
				System.out.println("（访问的公开地址）=========================");
				// 访问的是公开地址放行
				return true;
			}
		}

		// 不是公开地址进行拦截
		if (adminId != null) {
			System.out.print("（Admin注入登陆）拦截器===========");
			// 校验用户的身法是否合法
			ActiveUserBack activeUserBack = sessionProvider.getActiveUserBackBySession(request);
			if (activeUserBack == null) {
				System.out.println("（查询数据库登录！）==============AdminID:" + adminId);
				activeUserBack = userBackUserService.getActiveUserByUserid(adminId);
				sessionProvider.setAttribute(request, Constants.BUYER_SESSION, activeUserBack);
			}
			request.setAttribute("isLogin", true);
			return true;

		} else {
			System.out.println("（普通用户登录）拦截器=====================================");
			boolean flag = false;
			// 校验用户的身法是否合法
			ActiveUserBack activeUserBack = sessionProvider.getActiveUserBackBySession(request);
			if (activeUserBack == null) {
				response.sendRedirect(Constants.TOLONGIN + "?returnURL=" + request.getParameter("returnURL"));
				return false;
			}

			// 用户已经登录放行
			flag = true;
			request.setAttribute("isLogin", flag);
			return true;

		}
	}

	/**
	 * 执行时机：进入action方法，在返回modelandvalue之前
	 * 使用场景：在这里统一对数据进行处理，比如添加菜单进行导航
	 * 
	 * 方法后
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

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
