package com.gll.ls.utils.reg;

import org.apache.commons.lang3.StringUtils;

/**
 * 整的表达式
 * 
 * @author XL
 * @Date 2017年4月15日 上午7:15:51
 */
public class RegExpression {

	/**
	 * 整数或者小数：^[0-9]+\.{0,1}[0-9]{0,2}$
	 * 只能输入数字："^[0-9]*$"。
	 * 只能输入n位的数字："^\d{n}$"。
	 * 只能输入至少n位的数字："^\d{n,}$"。
	 * 只能输入m~n位的数字：。"^\d{m,n}$"
	 * 只能输入零和非零开头的数字："^(0|[1-9][0-9]*)$"。
	 * 只能输入有两位小数的正实数："^[0-9]+(.[0-9]{2})?$"。
	 * 只能输入有1~3位小数的正实数："^[0-9]+(.[0-9]{1,3})?$"。
	 * 只能输入非零的正整数："^\+?[1-9][0-9]*$"。
	 * 只能输入非零的负整数："^\-[1-9][]0-9"*$。
	 * 只能输入长度为3的字符："^.{3}$"。
	 * 只能输入由26个英文字母组成的字符串："^[A-Za-z]+$"。
	 * 只能输入由26个大写英文字母组成的字符串："^[A-Z]+$"。
	 * 只能输入由26个小写英文字母组成的字符串："^[a-z]+$"。
	 * 只能输入由数字和26个英文字母组成的字符串："^[A-Za-z0-9]+$"。
	 * 只能输入由数字、26个英文字母或者下划线组成的字符串："^\w+$"。
	 * 验证用户密码："^[a-zA-Z]\w{5,17}$"正确格式为：以字母开头，长度在6~18之间，只能包含字符、数字和下划线。
	 * 验证是否含有^%&',;=?$\"等字符："[^%&',;=?$\x22]+"。
	 * 只能输入汉字："^[\u4e00-\u9fa5]{0,}$"
	 * 验证Email地址："^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$"。
	 * 验证InternetURL："^http://([\w-]+\.)+[\w-]+(/[\w-./?%&=]*)?$"。
	 * 验证电话号码："^(\(\d{3,4}-)|\d{3.4}-)?\d{7,8}$"正确格式为："XXX-XXXXXXX"、"XXXX-XXXXXXXX"、"XXX-XXXXXXX"、"XXX-XXXXXXXX"、"XXXXXXX"和"XXXXXXXX"。
	 * 验证身份证号（15位或18位数字）："^\d{15}|\d{18}$"。
	 * 验证一年的12个月："^(0?[1-9]|1[0-2])$"正确格式为："01"～"09"和"1"～"12"。
	 * 验证一个月的31天："^((0?[1-9])|((1|2)[0-9])|30|31)$"正确格式为；"01"～"09"和"1"～"31"。
	 * 匹配中文字符的正则表达式： [\u4e00-\u9fa5]
	 * 匹配双字节字符(包括汉字在内)：[^\x00-\xff]
	 * 应用：计算字符串的长度（一个双字节字符长度计2，ASCII字符计1）
	 * String.prototype.len=function(){return this.replace(/[^\x00-\xff]/g,"aa").length;}
	 * 匹配空行的正则表达式：\n[\s| ]*\r
	 * 匹配html标签的正则表达式：<(.*)>(.*)<\/(.*)>|<(.*)\/>
	 * 匹配首尾空格的正则表达式：(^\s*)|(\s*$)
	 */

	public static final String EMAIL_REG = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"; // 验证Email地址：
	public static final String CALLPHONE_REG = "^[1]([3][0-9]{1}|59|58|88|89)[0-9]{8}$"; // 手机号
	public static final String PASSWORD_REG = "^[a-zA-Z0-9]\\w{5,17}$"; // 验证用户密码：正确格式为：以字母开头，长度在6~18之间，只能包含字符、数字和下划线。

	public static final String www = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www1 = "^[0-9]*$"; // 整数或者小数：
	public static final String www2 = "^\\d{n}$"; // 整数或者小数：
	public static final String www3 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www4 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www5 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www6 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www7 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www8 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www9 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www10 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www11 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www12 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www13 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www14 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www15 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：
	public static final String www16 = "^[0-9]+\\.{0,1}[0-9]{0,2}$"; // 整数或者小数：

	/**
	 * 正则表达式匹配
	 */
	public static boolean metchesStr(String str, String reg) {
		if (StringUtils.isEmpty(str)) {
			return false;
		}
		return str.matches(reg);
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
	 * 
	 */
}
