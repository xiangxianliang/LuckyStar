package com.gll.ls.utils.utils;

import java.util.UUID;

/**
 * 生成激活码工具类
 * 
 * @author XL
 * 
 */
public class UUIDUtil {

	/**
	 * 生成激活码按方法
	 * 
	 * @return 生成的激活码
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}

	// 样例 ed2680fbc3a9479cb2483df904fad630
}
