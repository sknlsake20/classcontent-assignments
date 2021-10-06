<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div align="center" class="container-sm border">
<h1>List of Buses</h1><br><br>
<table border="1" width="80%" class="table table-bordered">
<tr align="center" style="color:red">
<th>BUSID</th>
<th>BUS NAME</th>
<th>SOURCE</th>
<th>DESTINATION</th>
<th>BUS TYPE</th>
<th>BUS TIME</th>
<th>DATE</th>
<th>BUS FARE</th>
</tr>

<c:forEach var="bus" items="${bus}">
<tr align="center">
<td>${bus.busid}</td>
<td>${bus.busname}</td>
<td>${bus.source}</td>
<td>${bus.destination}</td>
<td>${bus.bustype}</td>
<td>${bus.time}</td>
<td>${bus.date}</td>
<td>${bus.fare}</td>
<td><a href="./showtransport"><b  class="btn btn-primary">Need Local Transport?</b></a></td>
<td><a href="./success"><b  class="btn btn-primary">Book</b></a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>