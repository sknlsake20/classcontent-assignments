<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value='/resources/css/index.css'/>" rel="stylesheet">
</head>
<body>
<center>
<label><h1>.....!!! WELCOME TO USER REVIEW & RATINGS !!!.....</h1></label><br>
<label><h2>Already A User?</h2></label>
<form action ="user/login">
<label><h2>User Name:</label><input type="text" name="uname"/></h2>
<label><h2>Pass Word:</label><input type="Password" name="upwd"/></h2>
<br/>
<input type="submit" value="LOGIN"/><br>
</form>

<br></label><h2>New User ?</h2></label>
<a href="/user/showForm"><button>CREATE ACCOUNT</button></a><br><br>


<br><br>
<a href="/user/list"><button>User Section</button></a><br><br><br>
</center>
</body>
</html>