package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements StudentDAOImpl {

	
	@Override
	public Connection getConnection() {
		Connection con=null;
		try {
			Class.forName(driverclass);
			con=DriverManager.getConnection(jdbcurl, username, password);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public void insertStudent(Student s) {
	
		String query="insert into student values(?,?,?,?,?,?)";
		try(Connection con=getConnection()){
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, s.getStudentid());
			ps.setString(2, s.getStudentname());
			ps.setLong(3, s.getStudentmobileno());
			ps.setString(4,s.getStudentemailid());
			ps.setString(5, s.getStudentinstname());
			ps.setDouble(6, s.getStudentpercentage());			
			ps.executeUpdate();
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		
	}

	@Override
	public Student selectStudent(int id) {
		
		Student s=null;
		String query="select * from student where stdid=?";
		try(Connection con=getConnection()) {
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				s=new Student();
				s.setStudentid(id);
				s.setStudentname(rs.getString(2));
				s.setStudentmobileno(rs.getLong(3));
				s.setStudentemailid(rs.getString(4));
				s.setStudentinstname(rs.getString(5));
				s.setStudentpercentage(rs.getDouble(6));
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return s;
	}

	@Override
	public List<Student> selectAllStudent() {
		List<Student> studentlist =new ArrayList();
		String query="select * from student";
		try(Connection con = getConnection()) {
			
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Student s=new Student();
				s.setStudentid(rs.getInt(1));
				s.setStudentname(rs.getString(2));
				s.setStudentmobileno(rs.getLong(3));
				s.setStudentemailid(rs.getString(4));
				s.setStudentinstname(rs.getString(5));
				s.setStudentpercentage(rs.getDouble(6));
				
				studentlist.add(s);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return studentlist;
		
	}

	@Override
	public boolean deleteStudent(int id) {
		boolean result=false;
		String query="delete from student where stdid=?";
		try(Connection con=getConnection()) {
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			
			result=ps.executeUpdate()>0;
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	@Override
	public boolean updateStudent(Student s) {
		
		boolean result=false;
		String query="update student set stdname=?,stdmobile=?,stdemailid=?,institutename=?,stdpercentage=? where stdid=?";
		try(Connection con=getConnection()) {
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, s.getStudentname());
			ps.setLong(2, s.getStudentmobileno());
			ps.setString(3, s.getStudentemailid());
			ps.setString(4, s.getStudentinstname());
			ps.setDouble(5, s.getStudentpercentage());
			ps.setInt(6, s.getStudentid());
			result=ps.executeUpdate()>0;
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	
	

}
