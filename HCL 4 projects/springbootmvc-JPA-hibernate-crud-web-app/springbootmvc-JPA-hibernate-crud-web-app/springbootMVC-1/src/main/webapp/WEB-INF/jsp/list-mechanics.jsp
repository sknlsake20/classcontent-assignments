<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Machine Service System with Marine Predators Algorithm Using Geo Location</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
 <div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>Machine Service System with Marine Predators Algorithm Using Geo Location </h2>
			<hr />
			<p align="right" >Click here to  <a href='/logout'>logout</a> </p>
			<input type="button" value="Add Mechanic Details"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> <br /> <br />
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Athlete's List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							
							
							<th>Mechanic name</th>
							<th>Mechanic status</th>
							<th>Mechanic  shopname</th>
							<th>Mechanic Work hours</th>
							<th>Mechanic Specialization</th>
							<th>Mechanic Address</th>
							<th>Mechanic latitude</th>
							<th>Mechanic longitude</th>
							<th>Mechanic Distance</th>
							<th>Actions</th>
						</tr>

						
						<c:forEach var="tempMechanic" items="${mechanics}">

							
							<c:url var="updateLink" value="/mechanic/updateForm">
								<c:param name="mechanicId" value="${tempMechanic.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/mechanic/delete">
								<c:param name="mechanicId" value="${tempMechanic.id}" />
							</c:url>

							<tr>
								
								<td>${tempMechanic.name}</td>
								<td>${tempMechanic.status}</td>
								<td>${tempMechanic. shopname}</td>
								<td>${tempMechanic.workhrs}</td>
								<td>${tempMechanic.specialization}</td>
								<td>${tempMechanic.address}</td>
								<td>${tempMechanic.latitude}</td>
								<td>${tempMechanic.longitude}</td>
								<td>${tempMechanic.distance}</td>
								
								<td>
									<!-- display the update link --> <a href="${updateLink}">Update
										</a> |<br> <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this mechanic records?'))) return false">Delete
										</a>
								</td>

							</tr>

						</c:forEach>

					</table>

				</div>
			</div>
		</div>

	</div>
</body>
</html>