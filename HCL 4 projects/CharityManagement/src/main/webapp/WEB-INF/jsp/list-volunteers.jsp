<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Volunteers</title>
<style>
body{
background:url("../resources/image/charity4.jpg")no-repeat center center fixed;
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
  <div class="col-md-offset-1 col-md-10">
   <h2>Charity Management System</h2>
   <hr />

   <input type="button" value="Add Volunteer"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <input type="button" value="Bank Details"
    class="btn btn-primary" />
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Volunteer List</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
       <th>First Name</th>
       <th>Last Name</th>
       <th>Email</th>
       <th>Organisation Name</th>
       <th>Food Donation</th>
       <th>Money Donation</th>
       <th>Mobile No</th>
       <th>Gender</th>
       <th>Action</th>
      </tr>

      <!-- loop over and print our customers -->
      <c:forEach var="tempVolunteer" items="${volunteers}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="/volunteer/updateForm">
        <c:param name="volunteerId" value="${tempVolunteer.id}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="deleteLink" value="/volunteer/delete">
        <c:param name="volunteerId" value="${tempVolunteer.id}" />
       </c:url>

       <tr>
        <td>${tempVolunteer.firstName}</td>
        <td>${tempVolunteer.lastName}</td>
        <td>${tempVolunteer.email}</td>
        <td>${tempVolunteer.organisationName}</td>
        <td>${tempVolunteer.foodDonation}</td>
        <td>${tempVolunteer.moneydonation}</td>
        <td>${tempVolunteer.mobileNo}</td>
        <td>${tempVolunteer.gender}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this volunteer?'))) return false">Delete</a>
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