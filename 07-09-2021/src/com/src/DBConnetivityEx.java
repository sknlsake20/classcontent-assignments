package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnetivityEx {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //register driver class
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/personaldb", "shiva", "shiva");
			//create connection
			
			Statement st=con.createStatement(); //create statement			
			
			String query="insert into student values(9999,'rajini',999999999,'rajini@rajini.com','rajini institute',100)";
			int i=st.executeUpdate(query); // execute query
			
			if(i>0)
			{
				System.out.println("values insereted successfully");
			}
			else
			{
				System.out.println("cannot insert values");
			}
			
			st.close();
			con.close();			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
