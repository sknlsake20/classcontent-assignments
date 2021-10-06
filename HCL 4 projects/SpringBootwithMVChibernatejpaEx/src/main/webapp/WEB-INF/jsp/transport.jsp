<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Local Transport form</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h1 align="center">Book Local Transport</h1>
<hr>
<br><br>
<div align="center">
<br><br>
<form:form action="./booktransport" modelAttribute="cab">
<br><br><br>
Enter Location:<form:input path="location"/><br><br>
<input type="submit" class="btn btn-info" value="Go">
</form:form>
</div>
</body>
</html>