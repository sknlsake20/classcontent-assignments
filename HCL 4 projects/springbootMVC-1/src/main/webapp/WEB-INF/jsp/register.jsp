<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value='/resources/css/register.css' />" rel="stylesheet">
</head>
<body style="color:#0000ff">
<center>
<form action="/database"><b>
<h1>Enter the Below Details for Registering</h1>
Enter Firstname: <input type="text" name="fname"/><br/>
Enter Lastname: <input type="text" name="lname"/><br/>
Enter Username: <input type="text" name="uname"/><br/>
Enter Password: <input type="password" name="pwd"/><br/>
It should contains Alphabets,Special characters and Numbers<br/>
The length should be greater than 8<br/>
Enter Mobile: <input type="text" name="mob"/><br/>
Enter emailid: <input type="text" name="email"/><br/>
<input type="submit" value="Submit"/><br/></b>
</form>
</center>
</body>
</html>