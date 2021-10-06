<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Organ Donar Management</title>
<style>
body{
background: url("../resources/image/donar.png")no-repeat center center fixed;
background-size: cover;
}
</style>
</head>
<body>
<form action="/display">
<br>
<br>
<br>
<h3>Enter Username:<input type="text" name="name"/><br>
</h3>
<h3>Enter Password:<input type="password" name="pwd"/><br>
</h3>
<input type="submit" value="login"/><br>
New User: <a href="/register">Click here</a><br>
</form>
</body>
</html>