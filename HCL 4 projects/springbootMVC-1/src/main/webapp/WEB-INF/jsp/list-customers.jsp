<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WYP</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<style type="text/css">
body{
background-color:lightyellow;
}
</style>
</head>
<body>
 <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>WYP- Wolverine Yellow Pages</h2>
   <h3 align="right"><a href="/">Logout</a></h3>
   <hr />

   <input type="button" value="Add Customer"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Wolverine Pages Lists</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
       <th>Name</th>
       <th>Address</th>
       <th>Opening Time</th>
       <th>Closing Time</th>
       <th>Email</th>
       <th>Mobile Number</th>
       <th>Action</th>
      </tr>
      <!-- loop over and print our customers -->
      <c:forEach var="tempCustomer" items="${customers}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="/customer/updateForm">
        <c:param name="customerId" value="${tempCustomer.id}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="deleteLink" value="/customer/delete">
        <c:param name="customerId" value="${tempCustomer.id}" />
       </c:url>

       <tr>
        <td>${tempCustomer.name}</td>
        <td>${tempCustomer.address}</td>
        <td>${tempCustomer.opening_time}</td>
        <td>${tempCustomer.closing_time}</td>
        <td>${tempCustomer.email}</td>
        <td>${tempCustomer.mobilenumber}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
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