package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.DatabaseMetaData;



public class RetrieveData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //register driver class
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/personaldb", "shiva", "shiva");
			//create connection
			
			Statement st=con.createStatement(); //create statement
			
			DatabaseMetaData dbmd=con.getMetaData();
			
			System.out.println(dbmd.getDriverName()+" - "+dbmd.getDriverVersion());
			
			String query="select * from student";

			ResultSet rs=st.executeQuery(query);
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println(rsmd.getColumnName(1)+" | "+rsmd.getColumnName(2)+" | "+rsmd.getColumnName(3)+" | "+rsmd.getColumnName(4)+" | "+rsmd.getColumnName(5)+" | "+rsmd.getColumnName(6)+" | ");
			while(rs.next())
			{
				
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3)+" | "+rs.getString(4)+" | "+rs.getString(5)+" | "+rs.getInt(6));
			}
			
			
			st.close();
			con.close();			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
