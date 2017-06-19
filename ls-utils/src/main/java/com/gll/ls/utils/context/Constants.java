package com.gll.ls.utils.context;

import java.io.Serializable;

import com.gll.ls.utils.utils.ResourcesUtil;

/**
 * 业务常量（常数）
 * Constants == 常数
 * 
 * @author XL
 * @Date 2017-4-9 15:19:38
 *
 */
public class Constants implements Serializable {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 上传图片服务器的地址
	 * "http://192.168.112.101:8080/image-web/";
	 */
	public static final String UPLOAD_IMAGE_URL = ResourcesUtil.system.get("UPLOAD_IMAGE_URL");

	/**
	 * nginx 图片服务器地址
	 * "http://192.168.112.101/";
	 */
	public static final String GET_IMAGE_URL = ResourcesUtil.system.get("GET_IMAGE_URL");

	/**
	 * session
	 * "BUYER_SESSION";
	 */
	public static final String BUYER_SESSION = ResourcesUtil.system.get("BUYER_SESSION");

	/**
	 * session
	 * "PICCODE_SESSION";
	 */
	public static final String PICCODE_SESSION = ResourcesUtil.system.get("PICCODE_SESSION");

	/**
	 * cookie
	 * "BUYER_COOKIE";
	 */
	public static final String BUYER_COOKIE = ResourcesUtil.system.get("BUYER_COOKIE");

	/**
	 * ADDR_COUNT
	 * 5;
	 */
	public static final Integer ADDR_COUNT = Integer.parseInt(ResourcesUtil.system.get("ADDR_COUNT"));

	/**
	 * 用户登录地址
	 * /sso/login/toLogin.do
	 */
	public static final String TOLONGIN = ResourcesUtil.system.get("TOLONGIN");

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
