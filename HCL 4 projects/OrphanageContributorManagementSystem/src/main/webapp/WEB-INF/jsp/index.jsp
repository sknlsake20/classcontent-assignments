<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/display">
<h3>Enter name:<input type="text" name="name"/><br>
</h3>
<h3>Enter password:<input type="password" name="pwd"/><br>
</h3>
<input type="submit" value="login"/>
New user?<a href="/register">Click here</a><br>

</form>
</body>
</html>