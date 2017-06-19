package com.gll.ls.utils.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 生成数字
 * 
 * @author XL
 *
 */
public class GenerateNumeral {

	/**
	 * 生成商品的商品编号
	 * 
	 * @return
	 */
	public static String generateItemNum() {
		return new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS").format(new Date());
	}

	/**
	 * 生成订单的订单编号
	 * 
	 * @return
	 */
	public static String generateOrderNum() {
		return new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS").format(new Date());
	}

}
