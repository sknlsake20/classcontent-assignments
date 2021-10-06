<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Booking System</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
</head>
<body>
<div align="center"  class="container-sm border">
 <h2>Save Bus</h2><br><br>
 <form:form action="./savebus" modelAttribute="bus">
 <table border="1" width="30%" class="table table-bordered">
  <tr>
  <td>Enter BusName:</td>
  <td><form:input path="busname"/></td></tr>
  <tr>
  <td>Enter Source:</td>
  <td><form:input path="source"/></td></tr>
  <tr>
  <td>Enter Destination:</td>
  <td><form:input path="destination"/></td></tr>
  <tr>
  <td>Enter BusType:</td>
  <td><form:input path="bustype"/></td></tr>
  <tr>
  <td>Enter Time:</td>
  <td> <form:input path="time"/></td></tr>
  <tr>
  <td>Enter Date:</td>
  <td><form:input path="date"/></td></tr>
  <tr>
  <td>Enter fare:</td>
  <td><form:input path="fare"/></td></tr>
  </table>
    <input type="submit" class="btn btn-info" value="Add">
  </form:form>
</div>
</body>
</html>