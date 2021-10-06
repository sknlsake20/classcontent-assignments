<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
 <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>Users</h2>
   <hr />

   <input type="button" value="Add User"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">User List</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
      	<th>User Id</th>
       <th>Full Name</th>
       <th>Mobile</th>
       <th>Email</th>
       <th>Address</th>
       <th>User Name</th>
       <th>Password</th>
       <th>Action</th>
      </tr>

      <!-- loop over and print our users -->
      <c:forEach var="tempUser" items="${users}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="/user/updateForm">
        <c:param name="userId" value="${tempUser.uid}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="deleteLink" value="/user/delete">
        <c:param name="userId" value="${tempUser.uid}" />
       </c:url>

       <tr>
       <td>${tempUser.uid}</td>
        <td>${tempUser.ufullname}</td>
        <td>${tempUser.umobile}</td>
        <td>${tempUser.umail}</td>
        <td>${tempUser.uaddress}</td>
        <td>${tempUser.uname}</td>
        <td>${tempUser.upassword}</td>
 
        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this user?'))) return false">Delete</a>
        </td>

       </tr>

      </c:forEach>

     </table>
<a href="/"><button>Back to Main Page</button></a><br><br>
    </div>
   </div>
  </div>

 </div>
</body>
</html>