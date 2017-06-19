<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/back_page/head.jsp" %>
<html>
<head>
<title>Test-springmvc</title>
</head>
<body>

	<h2>Hello World!</h2>
	
	<c:forEach items="${ebFrontUserList }" var="user">
		${user.userId }----${user.username }----${user.password }
	
	</c:forEach>
	
</body>
</html>
