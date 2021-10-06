<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Orphanage Contributor System</title>
<style>
body{
background: url("../resources/image/contri.jpeg")no-repeat;
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
  <div class="col-md-offset-1 col-md-10">
   <h2>ORPHANAGE CONTRIBUTOR SYSTEM</h2>
   <hr />

   <input type="button" value="Add Contributor"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <input type="button" value="Logout"
    onclick="window.location.href='logout'; return false;"
    class="btn btn-primary" />
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Contributor List</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
       <th>First Name</th>
       <th>Last Name</th>
       <th>Amount Contribution</th>
       <th>Things Contribution</th>
       <th>Mobile no</th>
       <th>Email</th>
       <th>Action</th>
      </tr>
      

      <!-- loop over and print our contributors -->
      <c:forEach var="tempContributor" items="${contributors}">

       <!-- construct an "update" link with contributor id -->
       <c:url var="updateLink" value="/contributor/updateForm">
        <c:param name="contributorId" value="${tempContributor.id}" />
       </c:url>

       <!-- construct an "delete" link with contributor id -->
       <c:url var="deleteLink" value="/contributor/delete">
        <c:param name="contributorId" value="${tempContributor.id}" />
       </c:url>

       <tr>
        <td>${tempContributor.firstName}</td>
        <td>${tempContributor.lastName}</td>
        <td>${tempContributor.amountContribution}</td>
        <td>${tempContributor.thingsContribution}</td>
        <td>${tempContributor.mobileNo}</td>
        <td>${tempContributor.email}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this contributor?'))) return false">Delete</a>
        </td>

       </tr>

      </c:forEach>

     </table>
     </div>

 </div>
</body>
</html>