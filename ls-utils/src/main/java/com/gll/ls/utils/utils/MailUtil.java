package com.gll.ls.utils.utils;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * 发送邮件的工具类
 * 
 * @author XL
 * 
 */
public class MailUtil {
	/**
	 * 发送邮件的方法
	 * 
	 * @param to
	 *            接受邮件的人
	 * @param code
	 *            发送的激活码内容
	 * @throws MessagingException
	 * @throws AddressException
	 */
	public static void sendMail(String to, String code) throws AddressException, MessagingException {
		Properties props = new Properties();
		props.setProperty("mail.transport.protocol", "smtp");
		// props.setProperty("mail.smtp.host", "smtp.163.com");
		props.setProperty("mail.smtp.host", "192.168.128.51");
		props.setProperty("mail.smtp.auth", "true");
		// props.setProperty("mail.smtp.ssl.enable", "true");
		// props.setProperty("mail.smtp.auth", "false");
		props.setProperty("mail.debug", "true");

		// 1.Session 对象；连接（与邮箱服务的连接）
		Session session = Session.getInstance(props, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// return new PasswordAuthentication("haohuairen8@163.com", "office10086gogo,");
				return new PasswordAuthentication("service@shop.com", "123456");
			}

		});

		// 2.构建邮件信息
		Message message = new MimeMessage(session);
		// 发件人：
		// message.setFrom(new InternetAddress("haohuairen8@163.com"));
		message.setFrom(new InternetAddress("service@shop.com"));
		// 收件人
		message.setRecipient(RecipientType.TO, new InternetAddress(to));
		// 设置主题
		message.setSubject(to + "  ssh案例测激活邮件");

		StringBuilder sb = new StringBuilder();
		sb.append("<h1>来自shop官网的激活邮件<h1>");
		sb.append("<hr/>");
		sb.append("点击如下连接激活账户,如果不能点击请复制到浏览器地址栏访问:<a href='http://192.168.111.10/shop_1/user_active?code=" + code + "' >http://192.168.111.10/shop_1/user_active?code=");
		sb.append(code);
		sb.append("</a>");

		// 设置邮件内容
		message.setContent(sb.toString(), "text/html;charset=utf-8");

		Transport trans = session.getTransport();
		trans.send(message);

	}

	public static void main(String[] args) throws AddressException, MessagingException {
		sendMail("aaa@163.com", "123456123456");
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
