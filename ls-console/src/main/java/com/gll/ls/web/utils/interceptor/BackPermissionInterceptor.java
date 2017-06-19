package com.gll.ls.web.utils.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.gll.ls.core.pojo.utils.user.vo.ActiveUserBack;
import com.gll.ls.core.utils.session.SessionProvider;
import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.utils.MD5Util;
import com.gll.ls.utils.utils.ResourcesUtil;
import com.gll.ls.utils.web.result.ResultUtil;

/**
 * 权限拦截器
 * 
 * @author XL
 *
 */
public class BackPermissionInterceptor implements HandlerInterceptor {

	@Autowired
	private SessionProvider sessionProvider;

	/**
	 * 常量 拦截规则
	 */
	public static List<String> open_urls;
	public static List<String> common_urls;

	/**
	 * 权限拦截方法
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		// 初始化需要的资源
		if (open_urls == null) {// 获得公开权限
			open_urls = ResourcesUtil.gekeyList(Config.AUTHORITY_BACK_ANONYMOUS_ACTIONS);
		}
		if (common_urls == null) { // 获取公共权限
			common_urls = ResourcesUtil.gekeyList(Config.AUTHORITY_BACK_COMMON_ACTIONS);
		}
		// 用户访问的url
		String uri = request.getRequestURI();
		String code = MD5Util.md5(uri);
		System.out.print("（PermissionInterceptor）拦截器======Code:" + code + "======URI:" + uri + "========");

		// 校验用户访问的是否是公开资源地址
		for (String open_url : open_urls) {
			if (uri.indexOf(open_url) >= 0) {
				System.out.println("（访问的公开地址）=========================");
				// 访问的是公开地址放行
				return true;
			}
		}

		// 校验是否是公共权限
		for (String common_url : common_urls) {
			if (uri.indexOf(common_url) >= 0) {
				System.out.println("（访问的公共地址）=========================");
				// 访问的是公共权限地址放行
				return true;
			}
		}

		// 校验用户操作权限
		ActiveUserBack activeUserBack = sessionProvider.getActiveUserBackBySession(request);
		String[] permissionCode = activeUserBack.getPermissionCode();// 从session中那道用户的操作权限
		for (String pCode : permissionCode) {
			if (code.equalsIgnoreCase(pCode)) {
				System.out.println("（访问的有权限地址地址）=========================");
				// 访问的是用户权限地址放行
				return true;
			}
		}

		// 提示用户误操作权限
		System.out.println("（访问的无权限地址地址）=========================");
		ResultUtil.throwExcepion(ResultUtil.createFail(Config.BACK_MESSAGE, 105, null)); // 跳转到误操作权限的页面
		// request.getRequestDispatcher(Config.REFUSE).forward(request, response);
		return false;

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}

}
