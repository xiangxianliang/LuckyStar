package com.gll.ls.core.utils.mail.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.gll.ls.core.utils.mail.MailService;

/**
 * 发送 邮件 实现类
 * 
 * @author XL
 * @Date 2017年4月16日 下午4:39:25
 */
public class MailServiceImpl implements MailService {

	@Resource
	private MailSender mailSender;

	// ============================================================================================

	/**
	 * 发送邮件激活邮件
	 */
	@Override
	public void sendActivationMail(String code, String id, String mailTo) {

		StringBuilder sb = new StringBuilder();
		sb.append("<h1>来自shop官网的激活邮件<h1>");
		sb.append("<hr/>");
		sb.append("<br/>");
		sb.append("点击如下连接激活账户,如果不能点击请复制到浏览器地址栏访问:<a href='http://localhost:9280/profile/create/activationUser.shtml?id=").append(id)
				.append("&code=").append(code).append("'>点击激活用户</a>");
		System.out.println(sb.toString());
		// /profile/create/register.shtml
		sendMail(mailTo, "用户激活邮件", sb.toString());
	}

	/**
	 * 发送邮件
	 */
	@Override
	public void sendMail(String mailTo, String subject, String info) {

		SimpleMailMessage smm = new SimpleMailMessage();
		// 必须设置
		smm.setFrom("haohuairen88@163.com");
		// 接受的设置
		smm.setTo(mailTo);// "haohuairen8@163.com"
		// 设置主题
		smm.setSubject(subject);// 主体
		// 发送邮件的内容
		smm.setText(info);
		// 即时发送
		smm.setSentDate(new Date());
		// 3.发送email
		mailSender.send(smm);
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
	 */
}
