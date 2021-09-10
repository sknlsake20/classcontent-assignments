package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

public class PreparedStatementEx {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		System.out.println("enter student id, name, mobileno,emailid,institutename, percentage:");
		
		int id=name.nextInt();
		name.nextLine();
		String sname=name.nextLine();		
		long mob=name.nextLong();
		name.nextLine();
		String emailid=name.nextLine();
		name.nextLine();
		String insname=name.nextLine();		
		double perc=name.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //register driver class
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/personaldb", "shiva", "shiva");
			//create connection
			String query="insert into student values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, id);
			ps.setString(2, sname);
			ps.setLong(3, mob);
			ps.setString(4,emailid);
			ps.setString(5, insname);
			ps.setDouble(6, perc);	
			
			int i=ps.executeUpdate(); // execute query
			
			if(i>0)
			{
				System.out.println("values insereted successfully");
			}
			else
			{
				System.out.println("cannot insert values");
			}
			
			ps.close();
			con.close();			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
