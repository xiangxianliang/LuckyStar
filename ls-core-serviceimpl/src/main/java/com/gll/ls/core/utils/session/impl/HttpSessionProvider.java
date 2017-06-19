package com.gll.ls.core.utils.session.impl;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.gll.ls.core.pojo.utils.user.vo.ActiveUserBack;
import com.gll.ls.core.utils.session.SessionProvider;
import com.gll.ls.utils.context.Constants;

/**
 * 本地session
 * 
 * @author XL
 *
 */

public class HttpSessionProvider implements SessionProvider {

	@Override
	public void setAttribute(HttpServletRequest request, String name, Serializable value) {

		HttpSession session = request.getSession();// 默认是true，如果request中有session就取，没有就创建 ；cookic中的jessionid
		session.setAttribute(name, value);

	}

	@Override
	public Serializable getAttribute(HttpServletRequest request, String name) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			return (Serializable) session.getAttribute(name);
		}
		return null;
	}

	@Override
	public void logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();// 销毁session
		}
		// Cookie JSessionID

	}

	@Override
	public String getSessionId(HttpServletRequest request) {

		// 获取url中的ID
		// request.getRequestedSessionId();// http://localhost:8080/html/sfsf.shtml?jssionID=
		return request.getSession().getId();
	}

	/**
	 * session 中获取用户
	 */
	@Override
	public ActiveUserBack getActiveUserBackBySession(HttpServletRequest request) {
		// 校验用户的身法是否合法
		ActiveUserBack activeUserBack = (ActiveUserBack) this.getAttribute(request, Constants.BUYER_SESSION);
		return activeUserBack;
	}

}
