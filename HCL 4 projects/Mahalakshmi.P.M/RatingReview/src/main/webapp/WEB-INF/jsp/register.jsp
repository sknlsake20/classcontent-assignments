<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Register new account/user</title>
<script src="<c:url value="/resources/js/validation.js" />"></script>
</head>
<body>
<form:form action="saveUser" method="post" modelAttribute="user" name="registerform" onsubmit="return validateForm();">

<form:hidden path="uid" />

 <table> 
<tr><td><label>Full Name:</label></td><td><form:input type="text" name="fullname" path="ufullname"/></td></tr>
<tr><td><label>Mobile No:</label></td><td><form:input type="number" name="mobile" path="umobile"/></td></tr>
<tr> <td><label>Mail Id:</label></td><td><form:input type="text" name="mail" id="mail" path="umail" placeholder="a@gmail.com"/></td></tr>
<tr><td><label>Address:</label></td><td><form:textarea rows="5" cols="16.5" name="address" path="uaddress" maxlength="50" placeholder="Enter Your Address Here"/></td></tr>
<tr><td><label>User Name:</label></td><td><form:input type="text" name="uname" path="uname"/></td></tr>
<tr><td><label>Pass Word:</label></td><td><form:input type="Password" name="upwd" path="upassword"/></td></tr>
<tr><td><label>ReType PassWord:</label></td><td><input type="Password" name="repwd"/></td></tr>
</table>
<input type="submit" value="Register"/><br>
</form:form>
</body>
</html>