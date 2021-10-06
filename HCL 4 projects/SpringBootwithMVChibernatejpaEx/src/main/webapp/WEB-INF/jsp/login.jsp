<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div align="center">
<h2>Login Page</h2>
<hr><br><br><br>
<form:form action="./showlogin" modelAttribute="admin">
<table border="1" width="50%">
<tr align="center">
<td>Enter Username:</td>
<td><form:input path="username"/>
</tr>
<tr align="center">
<td>Enter Password:</td>
<td><form:password path="password"/></td>
</tr>
</table><br><br>
<input type="submit" class="btn btn-info" value="login">
</form:form>
</div>
</body>
</html>