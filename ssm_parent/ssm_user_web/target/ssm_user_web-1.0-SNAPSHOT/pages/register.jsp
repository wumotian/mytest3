<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>用户注册</h1>
    <form action="${pageContext.request.contextPath }/user/doRegister" method="post">
		用户名：<input type="text" name="username" value=""><br/>
		密码：<input type="password" name="password" value=""><br/>
		确认密码：<input type="password" name="repassword" value=""><br/>
		手机号：<input type="text" name="telephone" value=""><br/>
		<input type="submit" value="注册">
		<input type="reset" value="取消"/>
	</form>
</body>
</html>