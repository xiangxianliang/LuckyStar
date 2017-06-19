package com.gll.ls.core.utils.session;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import com.gll.ls.core.pojo.utils.user.vo.ActiveUserBack;

/**
 * session 接口
 * 
 * @author XL
 *
 */
public interface SessionProvider {

	//
	// name key constants buyer_session
	// value 用户对象
	/**
	 * 往session中设置值
	 * 
	 * @param request
	 * @param name
	 * @param value
	 */
	public void setAttribute(HttpServletRequest request, String name, Serializable value);

	// 从session中取值
	/**
	 * 从session中取值
	 * 
	 * @param request
	 * @param name
	 * @return
	 */
	public Serializable getAttribute(HttpServletRequest request, String name);

	/**
	 * 退出登录
	 * 
	 * @param request
	 */
	public void logout(HttpServletRequest request);

	/**
	 * 获取SessionID
	 */
	public String getSessionId(HttpServletRequest request);

	/**
	 * session 获取 后台用户 用户
	 * 
	 * @param request
	 * @return
	 */
	public ActiveUserBack getActiveUserBackBySession(HttpServletRequest request);

}
