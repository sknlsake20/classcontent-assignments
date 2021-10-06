<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Athlete Details</title>
<style>
body {
   background-image:url("https://wallpapercave.com/wp/wp8732964.jpg");
height: 800px; 

 
   background-position: center ;
   background-repeat: no-repeat;
   background-size: cover;
}

</style>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="container">

		<h2 class="text-center">Olympic Record Management 2021</h2>
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="panel-title">Add Athlete Details</div>
			</div>
			<div class="panel-body">
				<form:form action="saveOlympic" cssClass="form-horizontal"
					method="post" modelAttribute="olympic">

					<!-- need to associate this data with customer id -->
					<form:hidden path="id" />

					<div class="form-group">
						<label for="season" class="col-md-3 control-label">Season</label>
						<div class="col-md-9">
							<form:radiobutton path="season" value="summer" />
							Summer
							<form:radiobutton path="season" value="winter" />
							Winter
						</div>
					</div>
					<div class="form-group">
						<label for="name" class="col-md-3 control-label">Athlete
							name</label>
						<div class="col-md-9">
							<form:input path="name" cssClass="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label for="dob" class="col-md-3 control-label">Athlete
							Date Of Birth</label>
						<div class="col-md-9">
							<form:input type="date" path="dob" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="gender" class="col-md-3 control-label">Athlete
							Gender</label>
						<div class="col-md-9">
							<form:radiobutton path="gender" value="male" />
							Male
							<form:radiobutton path="gender" value="female" />
							Female
							<form:radiobutton path="gender" value="transgender" />
							Others
						</div>
					</div>
					<div class="form-group">
						<label for="country" class="col-md-3 control-label">Athlete
							Country</label>
						<div class="col-md-9">
							<form:input path="country" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="height" class="col-md-3 control-label">Athlete
							Height</label>
						<div class="col-md-9">
							<form:input path="height" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="weight" class="col-md-3 control-label">Athlete
							Weight</label>
						<div class="col-md-9">
							<form:input path="weight" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="description" class="col-md-3 control-label">Athlete
							Descritption</label>
						<div class="col-md-9">
							<form:input path="description" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="category" class="col-md-3 control-label">Athlete
							Category</label>
						<div class="col-md-9">
							<form:input path="category" cssClass="form-control" />
						</div>
					</div>
					<div class="form-group">
						<label for="medal" class="col-md-3 control-label">Athlete
							Number of medals</label>
						<div class="col-md-9">
							<form:radiobutton path="medal" value="1" />
							1
							<form:radiobutton path="medal" value="2" />
							2
							<form:radiobutton path="medal" value="3" />
							3
							<form:radiobutton path="medal" value="0" />
							0
						</div>
					</div>
					<div class="form-group">
						<label for="type" class="col-md-3 control-label">Athlete
							medal type</label>
						<div class="col-md-9">
							<form:radiobutton path="type" value="Gold" />
							Gold
							<form:radiobutton path="type" value="Silver" />
							Silver
							<form:radiobutton path="type" value="Bronze" />
							Bronze
							<form:radiobutton path="type" value="None" />
							None
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