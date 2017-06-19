<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>user-left</title>
<link rel="stylesheet" type="text/css" href="/ares/third/css/admin.css" />
<script type="text/javascript" src="/ares/jquery/jquery-3.1.1.js" ></script>
</head>
<body class="lbody">
<div class="left">
	<%@ include file="/WEB-INF/back_page/date.jsp" %>
    <ul class="w-lful">
		<li><a href="/user/back/list.do" target="rightFrame">后台用户管理</a></li>
		<li><a href="/user/front/list.do" target="rightFrame">前台用户管理</a></li>
<!-- 		<li><a href="/product/type/list.do" target="rightFrame">类型管理</a></li> -->
<!-- 		<li><a href="/product/feature/list.do" target="rightFrame">属性管理</a></li> -->
    </ul>
</div>
</body>
</html>