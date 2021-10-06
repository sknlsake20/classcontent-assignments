<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-color:lightblue;
}
</style>
</head>
<body>
<%
String f=request.getParameter("fname");
String l=request.getParameter("lname");
String u=request.getParameter("uname");
String p=request.getParameter("pwd");
long m=Long.parseLong(request.getParameter("mob"));
String e=request.getParameter("email");
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/New";
	String username="SHRI";
	String password="Shri@123";
	Connection con=DriverManager.getConnection(url, username, password);
	String query="insert into UserDatabase values(?,?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1, f);
	ps.setString(2, l);
	ps.setString(3, u);
	ps.setString(4, p);
	ps.setLong(5, m);
	ps.setString(6, e);
	int i=ps.executeUpdate();
	int flag=0;
	String alphaRegex= ".*[0-9].*";
	if(p.length()<8||(p.contains("@")==false))
	{
		flag=1;
	}
	if(p.matches(alphaRegex)==false)
	{
		flag=1;
	}
	if(i>0&&flag==0) {
		out.println("Updated Sucessfully"+"<br/><a href='/'>Go To Login Page</a>");
	}
	else {
		out.println("Not Updated and invalid password"+"<br/><a href='/register'>Go To Register Page</a>");
	}
	con.close();
} catch (ClassNotFoundException | SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
%>
</body>
</html>