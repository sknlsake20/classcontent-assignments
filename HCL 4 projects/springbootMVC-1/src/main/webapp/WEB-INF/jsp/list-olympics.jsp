<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {
   background-image:url("https://wallpapercave.com/wp/wp8732964.jpg");
height: 800px; 

 
   background-position: center ;
   background-repeat: no-repeat;
   background-size: cover;
}

</style>
<title>Olympic 2021 Records</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
 <div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>Olympic Record Management 2021</h2>
			<hr />
			<p align="right" >Click here to  <a href='/logout'>logout</a> </p>
			<input type="button" value="Add Athlete"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> <br /> <br />
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Athlete's List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							
							<th>Season</th>
							<th>Athlete name</th>
							<th>Athlete Date Of Birth</th>
							<th>Athlete Gender</th>
							<th>Athlete Country</th>
							<th>Athlete Height</th>
							<th>Athlete Weight</th>
							<th>Athlete Descritption</th>
							<th>Athlete Category</th>
							<th>Athlete Number of medals</th>
							<th>Athlete medal type</th>
							<th>Actions</th>
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempOlympic" items="${olympics}">

							<!-- construct an "update" link with customer id -->
							<c:url var="updateLink" value="/olympic/updateForm">
								<c:param name="olympicId" value="${tempOlympic.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/olympic/delete">
								<c:param name="olympicId" value="${tempOlympic.id}" />
							</c:url>

							<tr>
								
								<td>${tempOlympic.season}</td>
								<td>${tempOlympic.name}</td>
								<td>${tempOlympic.dob}</td>
								<td>${tempOlympic.gender}</td>
								<td>${tempOlympic.country}</td>
								<td>${tempOlympic.height}</td>
								<td>${tempOlympic.weight}</td>
								<td>${tempOlympic.description}</td>
								<td>${tempOlympic.category}</td>
								<td>${tempOlympic.medal}</td>
								<td>${tempOlympic.type}</td>
								<td>
									<!-- display the update link --> <a href="${updateLink}">Update
										</a> |<br> <a href="${deleteLink}"
									onclick="if (!(confirm('Are you sure you want to delete this olympic?'))) return false">Delete
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