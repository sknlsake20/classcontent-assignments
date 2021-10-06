<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div align="center">
<h1>Book Ticket Form</h1>
<hr>
<br><br>
<form:form action="./showticket" modelAttribute="bus">
<table width="50%" height="70%" border="1">

<tr align="center">
<td>Enter Source:</td>
<td><form:input path="source"/></td>
</tr>
<tr align="center">
<td>Enter Destination:</td>
<td><form:input path="destination"/></td>
</tr>
<tr align="center">
<td>Enter Date:</td>
<td><form:input path="date"/></td>
</tr>


</table>
<br><br>
<input type="submit" class="btn btn-info" value="search"/>
</form:form>
</div>
</body>
</html>