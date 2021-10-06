<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booked List</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div align="center" class="container-sm border">
<h1>Booked Cab</h1><br><br>
<table border="1" width="70%" class="table table-bordered">
<tr align="center" style="color:red">
<th>CAB NUMBER</th>
<th>CAB FARE</th>
<th>LOCATION</th>
<th>BUS ID</th>
</tr>

<c:forEach var="cab" items="${cab}">
<tr align="center">
<td>${cab.cabno}</td>
<td>${cab.cabfare}</td>
<td>${cab.location}</td>
<td>${cab.busid}</td>
<td><a href="./success"><b  class="btn btn-primary">Book</b></a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>