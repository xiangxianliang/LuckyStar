<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    	<c:forEach items="${menu_left }" var="menu">
		<li><a href="${menu.url }" class="here" target="rightFrame">${menu.menuname }</a></li>    	
    	</c:forEach>
    </ul>
</div>
</body>
</html>