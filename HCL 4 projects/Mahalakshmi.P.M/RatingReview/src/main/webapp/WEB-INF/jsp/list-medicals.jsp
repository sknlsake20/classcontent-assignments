<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Healthcare Service</title>
<style>
body{
background-color:#f5ccff;
}
</style>
</head>
<body>
 
 <h2>User Ratings and Rewiew</h2>
 <br/><br/>
 
   <hr/>
   <input type="button" value="Add Medical Ratings and Review"
    onclick="window.location.href='showMedical'; return false;"/>
    <br/><br/>
 
     <div class="panel-title">Health Care Ratings & ReviewList</div>
  
  <br><br>
   
     <table border = "1">
      <tr>
       <th>mID</th>
       <th>uID</th>
       <th>User Name</th>
       <th>Doctor</th> 
      
       
        <th>Specilization</th>
        <th>Category</th>
        <th>issue</th>
        <th>diagonized</th>
        <th>Treatment</th>
        <th>description</th>
        
        <th>quality</th>
        <th>facility</th>
        <th>satisfaction</th>
        
        
        <th>Hospital</th>
        <th>state</th>
        <th>district</th>
        <th>street_landmark</th>
        <th>pin</th>
        <th>Action</th>
        
        
      </tr>
      <c:forEach var="tempMedical" items="${medicals}">
      
       <c:url var="updateLink" value="/medical/updateForm">
       <c:param name="medicalId" value="${tempMedical.mid}" />
       </c:url>
     
       <c:url var="deleteLink" value="/medical/delete">
        <c:param name="medicalId" value="${tempMedical.mid}" />
       </c:url>

       <tr>
        <td>${tempMedical.mid}</td>
         <td>${tempMedical.uid}</td>
        <td>${tempMedical.uname}</td>
        <td>${tempMedical.doctor}</td>
        
        <td>${tempMedical.specilization}</td>
        <td>${tempMedical.category}</td>
        <td>${tempMedical.issue}</td>
        <td>${tempMedical.diagonized}</td>
        <td>${tempMedical.treatment}</td>
        <td>${tempMedical.description}</td>
        
        <td>${tempMedical.quality}</td>
        <td>${tempMedical.facility}</td>
        <td>${tempMedical.satisfaction}</td>
        
        <td>${tempMedical.hospital}</td> 
        <td>${tempMedical.state}</td>
        <td>${tempMedical.district}</td>
        <td>${tempMedical.street_landmark}</td>
        <td>${tempMedical.pin}</td> 
        <td>
         	<a href="${updateLink}">Update</a>|<a href="${deleteLink}"
         	onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
        </td>
       </tr>
      </c:forEach>
     </table>
     <br>
     <br>
     <br>
     <a href="/RR"><button>Back to rating & review Page</button></a>
     <a href="/"><button>Logout</button></a><br><br>
    </div>
   </div>
  </div>
 </div>
</body>
</html>