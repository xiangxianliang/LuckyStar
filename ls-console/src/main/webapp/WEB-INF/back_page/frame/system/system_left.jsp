<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>product-left</title>
<link rel="stylesheet" type="text/css" href="/ares/third/css/admin.css" />
<script type="text/javascript" src="/ares/jquery/jquery-3.1.1.js" ></script>
</head>
<body class="lbody">
<div class="left">
	<%@ include file="/WEB-INF/back_page/date.jsp" %>
    <ul class="w-lful">
		<li><a href="/system/role/toList.do" target="rightFrame">角色管理</a></li>
		<li><a href="/system/module/toList.do" class="here" target="rightFrame">模块管理</a></li>
		<li><a href="/system/permission/toList.do" class="here" target="rightFrame">权限管理</a></li>
		<li><a href="/system/dictionary/list.do" target="rightFrame">数据字典配置</a></li>
		<li><a href="/system/parameter/list.do" target="rightFrame">系统参数配置</a></li>
    </ul>
</div>
</body>
</html>