<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Organ Donar Form</title>
<style>
body{
background: url("../resources/image/donar.png")no-repeat center center fixed;
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
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center"><b>ORGAN DONAR MANAGEMENT SYSTEM</b></h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add Donar</div>
    </div>
    <div class="panel-body">
     <form:form action="saveDonar" cssClass="form-horizontal"
      method="post" modelAttribute="donar">

      <!-- need to associate this data with donar id -->
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
       <label for="age" class="col-md-3 control-label">Age</label>
       <div class="col-md-9">
        <form:input path="age" cssClass="form-control" />
       </div>
      </div>
      
      
      
      <div class="form-group">
       <label for="bloodgroup" class="col-md-3 control-label">Blood
        Group</label>
       <div class="col-md-9">
        
        <select name="bloodGroup">
        <option value="A+ve">A+ve</option>
        <option value="A1+ve">A1+ve</option>
        <option value="B+ve">B+ve</option>
        <option value="B-ve">B-ve</option>
        <option value="C+ve">O+ve</option>
        <option value="C-ve">O-ve</option>
        <option value="AB+ve">AB+ve</option>
        </select>
       </div>
      </div>
      
      <div class="form-group">
       <label for="organdonated" class="col-md-3 control-label">Organ
        Donated</label>
       <div class="col-md-9">
       <select name="organDonated">
        <option value="Eye">Eye</option>
        <option value="Liver">Liver</option>
        <option value="Kidney">Kidney</option>
        <option value="Lung">Lung</option>
        <option value="Pancreas">Pancreas</option>
        </select>
        
       </div>
      </div>
      
      <div class="form-group">
       <label for="donatedhospital" class="col-md-3 control-label">Donated
        Hospital</label>
       <div class="col-md-9">
        <form:input path="donatedHospital" cssClass="form-control" />
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