<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GALLERY</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
 <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>Welcome to gallery</h2>
   <hr />

   <input type="button" value="Add image"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Image List</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
       
       <th>Iamgename</th>
       <th>Description</th>
       <th>Takenby</th>
       <th>Action</th>
       <th>Insert</th>
      
      </tr>

      <!-- loop over and print our images -->
      <c:forEach var="tempImage" items="${images}">

       <!-- construct an "update" link with image id -->
       <c:url var="updateLink" value="/image/updateForm">
        <c:param name="imageId" value="${tempImage.id}" />
       </c:url>

       <!-- construct an "delete" link with image id -->
       <c:url var="deleteLink" value="/image/delete">
        <c:param name="imageId" value="${tempImage.id}" />
       </c:url>

       <tr>
        <td>${tempImage.imgname}</td>
        <td>${tempImage.description}</td>
        <td>${tempImage.takenby}</td>
        

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this image?'))) return false">Delete</a>
         </td>
         <td>
         <!-- display the insert link --> <a href="${uploadLink}"onclick="upload">Insert Image</a>
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