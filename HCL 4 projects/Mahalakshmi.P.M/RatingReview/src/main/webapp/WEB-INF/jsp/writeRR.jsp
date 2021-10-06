<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="<c:url value="/resources/js/writeRR.js" />"></script>
</head>
<body>

<h2>Write Ratings and Review for Medical service</h2>

<form:form name="writeRR" action="saveMedical" method="post" modelAttribute="medical">

<form:hidden path="mid" />

<fieldset><legend>Details & Description</legend>
<table width="100%">

<tr><td><label> User Id </label></td><td><form:input path="uid" type="text" name="uid"/></td></tr>
<tr><td><label> User Name </label></td><td><form:input path="uname" type="text" name="uname"/></td></tr>

<tr><td><label> Doctor Name </label></td><td><form:input path="doctor" type="text" name="doctor"/></td>
    <td><label> Hospital Name </label></td><td><form:input path="hospital" type="text" name="hospital"/></td></tr>
<tr>
<td><label>Select Specilization</label></td><td><form:select path="specilization" name="specilization"  id="Specilization" width="50%" ></form:select></td>
   <script language="javascript">print_Specilization("Specilization");</script>	
<td><label>Select Category</label></td><td><form:select path="category"  name="category"  id="category"></form:select></td></tr>
   <script language="javascript">print_category("category");</script>	


<tr><td><label>My Issue</label></td><td><form:textarea path="issue" rows="2" cols="25" name="issue" maxlength="50" placeholder="EX : Cough, Fever, Weight loss"></form:textarea></td>
<td><label>Diagonized as</label></td><td><form:textarea path="diagonized" rows="2" cols="25" name="diagonized" maxlength="50" placeholder="EX : Lung Cancer"></form:textarea></td></tr>

<tr><td><label>Treatment</label></td><td><form:textarea path="treatment" rows="2" cols="25" name="treatment" maxlength="50" placeholder="EX : Tablets, Immunotherapy"></form:textarea></td>
<td><label>Description</label></td><td><form:textarea path="description" rows="5" cols="25" name="description" maxlength="50" placeholder="EX : Tablets and imminotheraphy once in 3 months is suggested as first step"></form:textarea></td></tr>

</table>
</fieldset>

<fieldset><legend>REVIEW & RATING</legend>
<table width="100%">
<tr><td>Quality Of Treatement</td><td>Facilities</td><td>Patient Satisfaction</td></tr>
<tr>
<td><span id="range_valueq" style="color:blue;font-weight:bold;"></span><br>
<input type="button" value="-" onClick="sub1q()"/>
0<form:input path="quality" type="range" min="0" max="10" step="0.1" name="quality" value="5" onchange="show_valueq(this.value)"/> 10<input type="button" value="+" onClick="add1q()"></td>


<td><span id="range_valuef" style="color:blue;font-weight:bold text-align:right;"></span><br>
<input type="button" value="-" onClick="sub1f()"/>
0<form:input path="facility"  type="range" min="0" max="10" step="0.1" name="facility" value="5" onchange="show_valuef(this.value)"/> 10<input type="button" value="+" onClick="add1f()"></td>

<td><span id="range_values" style="color:blue;font-weight:bold;"></span><br>
<input type="button" value="-" onClick="sub1s()"/>
0<form:input path="satisfaction" type="range" min="0" max="10" step="0.1" name="satisfaction" value="5" onchange="show_values(this.value)"/> 10<input type="button" value="+" onClick="add1s()"></td>
</tr>

</table>
</fieldset>


<fieldset><legend> Hospital Location</legend>
<table width="80%"><tr>
<td><label>Select State</label></td><td><form:select path="state" onchange="print_district('district',this.selectedIndex);" id="state" name ="state"></form:select></td>
<td><label>Select District</label></td><td><form:select path="district" name ="district" id ="district"><option>First Select State <option/></form:select></td>
		         <script language="javascript">print_state("state");</script>	
</tr>	   
<tr><td><label>street/landmark</label></td><td><form:textarea path="street_landmark" rows="2" cols="25" name="street_landmark" maxlength="50"/></td>
<td><label>Pin Code</label></td><td><form:input path="pin" type="number" name="pin" value="123456"/></td></tr>
</table>
</fieldset>
<input type="submit" value="Post Review">
</form:form>

</body>
</html>