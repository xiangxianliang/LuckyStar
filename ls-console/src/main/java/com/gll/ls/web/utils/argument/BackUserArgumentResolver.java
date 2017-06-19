package com.gll.ls.web.utils.argument;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;

import com.gll.ls.core.pojo.utils.user.vo.ActiveUserBack;
import com.gll.ls.utils.context.Constants;

/**
 * 当前用户身份ActiveUser参数解析器
 * 
 * @author XL
 * @Date 2017年4月15日 上午7:52:07
 */
public class BackUserArgumentResolver implements WebArgumentResolver {

	/**
	 * methodParameter存储action方法的参数信息
	 * webRequest是springmvc封装对象，通过此对象获取request和session等域的值
	 */
	public Object resolveArgument(MethodParameter methodParameter, NativeWebRequest webRequest) throws Exception {

		// 如果参数的类型是activeUser从session中取当前用户信息设置到action方法形参上
		if (methodParameter.getParameterType().equals(ActiveUserBack.class)) {

			// 从session中取当前用户信息
			ActiveUserBack activeUserBack = (ActiveUserBack) webRequest.getAttribute(Constants.BUYER_SESSION, WebRequest.SCOPE_SESSION);

			return activeUserBack;// 将参数值向action的方法形参赋值
		}

		return UNRESOLVED;
	}

}
