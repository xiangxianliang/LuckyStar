<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>登录_巴巴爸爸</title>
</head>
<body>
	
	<div class="w loc">
		<div class="h-title" id="logo">
			<div class="h-logo l">
				<img src="/ares/png/img/pic/logo-1.png" />
			</div>
			<div class="l" style="margin: 13px 10px; font-size: 20px; font-family: '微软雅黑'; letter-spacing: 2px">
				欢迎登录
			</div>
		</div>
	</div>
	
	<div class="sign">
		<div class="l ad420x205">
			<a href="#" title="title">
				<img src="/ares/png/img/pic/ppp0.jpg" width="400" height="400" />
			</a>
		</div>
		<div class="r">
			<h2 title="登录新巴巴运动网">登录新巴巴运动网</h2>
			
			<form id="jvForm" action="/user/back/login.do" method="post">
				<input type="hidden" name="returnUrl" value="${param.returnUrl}" />
				<ul class="uls form">
					
					<li id="errorName" class="errorTip" 
						<c:if test="${empty error }"> 
							style="display: none" 
						</c:if> >${error }
					</li> 
						
					<li>
						<label for="username">用户名：</label> 
						<span class="bg_text">
							<input type="text" id="username" name="username" value="admin" maxLength="25" />
						</span>
					</li>
					<li>
						<label for="password">密 码：</label>
						<span class="bg_text">
							<input type="password" id="password" name="password" value="123456" maxLength="25" />
						</span>
					</li>
					<li>
						<label for="captcha">验证码：</label>
						<span class="bg_text small">
							<input type="text" id="captcha"	name="captcha" maxLength="7" />
						</span>
						<img src="/getImage.img" onclick="this.src='/getImage.img?d='+new Date()" class="code" alt="换一张" />
						<a href="javascript:void(0);" onclick="$('.code').attr('src','/getImage.img?d='+new Date())" title="换一张">换一张</a>
					</li>
					<li>
						<label for="">&nbsp;</label>
						<input type="submit" value="登 录" class="hand btn66x23" />
						<a href="#" title="忘记密码？">忘记密码？</a>
					</li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>