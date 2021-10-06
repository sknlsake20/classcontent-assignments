<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Mechanic Details</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="container">

		<h2 class="text-center">Machine Service System with Marine Predators Algorithm Using Geo Location</h2>
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="panel-title">Add Mechanic Details</div>
			</div>
			<div class="panel-body">
				<form:form action="saveMechanic" cssClass="form-horizontal"
					method="post" modelAttribute="mechanic">

					
					<form:hidden path="id" />
					<div class="form-group">
						<label for="name" class="col-md-3 control-label">Mechanic
							name</label>
						<div class="col-md-9">
							<form:input path="name" cssClass="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label for="status" class="col-md-3 control-label">Mechanic
							Status</label>
						<div class="col-md-9">
							<form:input path="status" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="shopname" class="col-md-3 control-label">Mechanic
							Shop name</label>
						<div class="col-md-9">
							<form:input path="shopname" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="workhrs" class="col-md-3 control-label">Mechanic
							Work hours</label>
						<div class="col-md-9">
							<form:input path="workhrs" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="specialization" class="col-md-3 control-label">Mechanic
							specialization</label>
						<div class="col-md-9">
							<form:input path="specialization" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="address" class="col-md-3 control-label">Mechanic
							address</label>
						<div class="col-md-9">
							<form:input path="address" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="latitude" class="col-md-3 control-label">Mechanic
							latitude</label>
						<div class="col-md-9">
							<form:input path="latitude" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="longitude" class="col-md-3 control-label">Mechanic
							longitude</label>
						<div class="col-md-9">
							<form:input path="longitude" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="distance" class="col-md-3 control-label">Mechanic
							distance</label>
						<div class="col-md-9">
								<form:input path="distance" cssClass="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<!-- Button -->
						<div class="col-md-offset-3 col-md-9">
							<form:button cssClass="btn btn-primary">Submit</form:button>
						</div>
					</div>

				</form:form>
			</div>
		</div>
	</div>

</body>
</html>