<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-color:aqua;
}
</style>
</head>
<body>
<%
String u=request.getParameter("uname");
String p=request.getParameter("pwd");
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/New";
	String username="SHRI";
	String password="Shri@123";
	Connection con=DriverManager.getConnection(url, username, password);
	String query="select * from UserDatabase where username=? and password=?";
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1, u);
	ps.setString(2, p);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		out.println("<center>Welcome "+u+"<br/><a href='/display'>Click here to go inside</a><center>");	
	}
	else {
		String message="Invalid Username and Password";
		response.sendRedirect("/?msg="+message);	
	}
	con.close();
} catch (ClassNotFoundException | SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
%>
</body>
</html>