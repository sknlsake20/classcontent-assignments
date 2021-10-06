<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uname=request.getParameter("uname");
String upwd= request.getParameter("upwd");

try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/mydb";
	String username="Mahalakshmi";
	String password="9442169769";
	Connection con=DriverManager.getConnection(url, username, password);
	String query="select * from user where uname=? and upassword=? ";
	PreparedStatement st = con.prepareStatement(query);	

	st.setString(1, uname);
	st.setString(2, upwd);
    
	ResultSet rs = st.executeQuery();
   
	if(rs.next())
	{
	out.println(".........!!! Welcome "+uname+" !!!.........");	
		 %>
			<br>
	        <a href="/RR"><button>Continue to User Ratings And Review </button></a><br><br>
		<% 	
	}
	else
	{
		out.println("Invalid user name and password");
		//response.sendRedirect("index.jsp");
		%>
		<br>
        <a href="/"><button>Back to Main Page</button></a><br><br>
		<% 	
	}
	con.close();
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%>
</body>
</html>