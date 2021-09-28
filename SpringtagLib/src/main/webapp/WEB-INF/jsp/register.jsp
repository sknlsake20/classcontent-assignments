<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.myclass{
background-color: yellow;
color: red;
}
</style>
</head>
<body>

<form:form action="./register" modelAttribute="student">
enter student id : <form:input path="studentid"/> <form:errors path="studentid" cssClass="myclass"/><br>
enter student name : <form:input path="studentname"/><form:errors path="studentname" cssClass="myclass"/><br>
Gender :  <form:radiobutton name="gender" path="studentgender" value="male"/> Male <form:radiobutton name="gender" path="studentgender" value="male"/> FeMale<br>
enter student address : <form:textarea path="studentaddress"/><br>
select your country: 
<form:select path="studentcountry">
	<form:option value="">select</form:option>
	<form:option  value="India">India</form:option>
	<form:option value="Srilanka">Srilanka</form:option>
	<form:option value="China">China</form:option>
	<form:option value="USA">USA</form:option>	
</form:select>

<input type="submit" value="register"/>
</form:form>
</body>
</html>