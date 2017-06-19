<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>Test-Springmvc</title>
</head>
<body>

	<h2>Hello World!</h2>

	<form action="/test/springmvc.do">
		<input type="text" value="中国" name="name" /> <input type="text" value="2015-01-01 09:33:33" name="birthday" /> <input
			type="submit" value="确定">
	</form>

</body>
</html>
