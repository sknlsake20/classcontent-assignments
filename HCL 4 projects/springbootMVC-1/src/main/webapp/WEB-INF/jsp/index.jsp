<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value='/resources/css/index.css' />" rel="stylesheet">
</head>
<body>
<center>
<h1>Welcome to Wolverine Yellow Pages</h1><b>
<form action="/login">
Enter Username: <input type="text" name="uname"/><br/>
Enter password: <input type="password" name="pwd"/><br/>
<input type="submit" value="Login"/><br/>
New User: <a href="/register">Click here</a></b>
</form>
</center>
</body>
</html>