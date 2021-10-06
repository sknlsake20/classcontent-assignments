<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Charity Management Form Handling</title>
<style>
body{
background:url("../resources/image/charity4.jpg");
background-size:cover;
}
</style>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
<div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">Charity Management System</h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add volunteer</div>
    </div>
    <div class="panel-body">
     <form:form action="saveVolunteer" cssClass="form-horizontal"
      method="post" modelAttribute="volunteer">

      <!-- need to associate this data with customer id -->
      <form:hidden path="id" />

      <div class="form-group">
       <label for="firstname" class="col-md-3 control-label">First
        Name</label>
       <div class="col-md-9">
        <form:input path="firstName" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="lastname" class="col-md-3 control-label">Last
        Name</label>
       <div class="col-md-9">
        <form:input path="lastName" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <label for="email" class="col-md-3 control-label">Email</label>
       <div class="col-md-9">
        <form:input path="email" cssClass="form-control" />
       </div>
      </div>
       <div class="form-group">
       <label for="Organisationname" class="col-md-3 control-label">ORGANISATIONNAME</label>
       <div class="col-md-9">
        <form:input path="organisationName" cssClass="form-control" />
       </div>
      </div>
       <div class="form-group">
       <label for="Fooddonation" class="col-md-3 control-label">FOODDONATION</label>
       <div class="col-md-9">
        <form:input path="foodDonation" cssClass="form-control" />
       </div>
      </div>
       <div class="form-group">
       <label for="Moneydonation" class="col-md-3 control-label">MONEYDONATION</label>
       <div class="col-md-9">
        <form:input path="moneydonation" cssClass="form-control" />
       </div>
      </div>
       <div class="form-group">
       <label for="Mobileno" class="col-md-3 control-label">MOBILENO</label>
       <div class="col-md-9">
        <form:input path="mobileNo" cssClass="form-control" />
       </div>
      </div>
       <div class="form-group">
       <label for="gender" class="col-md-3 control-label">GENDER</label>
       <div class="col-md-9">
        <form:input path="gender" cssClass="form-control" />
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
 </div>
</body>
</html>