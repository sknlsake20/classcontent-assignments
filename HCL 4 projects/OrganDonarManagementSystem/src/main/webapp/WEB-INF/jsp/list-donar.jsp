<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Organ Donar System</title>
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
  <div class="col-md-offset-1 col-md-10">
   <h2 class="text-center"><b>ORGAN DONAR MANAGEMENT SYSTEM</b></h2>
   <hr />

   <input type="button" value="Add Donar"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>
    
   
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Donar List</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
       <th>First Name</th>
       <th>Last Name</th>
       <th>Age</th>
       <th>Blood Group</th>
       <th>Organ Donated</th>
       <th>Donated Hospital</th>
       <th>Action</th>
      </tr>

      <!-- loop over and print our donars -->
      <c:forEach var="tempDonar" items="${donars}">
      
      
       <!-- construct an "update" link with donar id -->
       <c:url var="updateLink" value="/donar/updateForm">
        <c:param name="donarId" value="${tempDonar.id}" />
       </c:url>

       <!-- construct an "delete" link with donar id -->
       <c:url var="deleteLink" value="/donar/delete">
        <c:param name="donarId" value="${tempDonar.id}" />
       </c:url>
       
       
       
       

       <tr>
        <td>${tempDonar.firstName}</td>
        <td>${tempDonar.lastName}</td>
        <td>${tempDonar.age}</td>
        <td>${tempDonar.bloodGroup}</td>
        <td>${tempDonar.organDonated}</td>
        <td>${tempDonar.donatedHospital}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this donar?'))) return false">Delete</a>
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