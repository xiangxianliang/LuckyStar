package com.gll.ls.core.utils.mail;

/**
 * mail 发送邮件
 * 
 * @author XL
 * @Date 2017年4月16日 下午4:37:53
 */
public interface MailService {

	/**
	 * 发送邮件
	 * 
	 * @param mailTo
	 *            发送到邮件的地址
	 * @param subject
	 *            发送的主题
	 * @param info
	 *            发送的内容
	 */
	public void sendMail(String mailTo, String subject, String info);

	/**
	 * 发送激活邮件
	 * 
	 * @param code
	 *            激活码
	 * @param id
	 *            用户ID
	 * @param mailTo
	 *            邮件的目的地
	 */
	public void sendActivationMail(String code, String id, String mailTo);

}
