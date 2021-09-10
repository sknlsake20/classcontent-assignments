package com.src;

import java.sql.Connection;
import java.util.List;

public interface StudentDAOImpl {
	
	public static final String jdbcurl="jdbc:mysql://localhost:3306/personaldb";
	public static final String driverclass="com.mysql.cj.jdbc.Driver";
	public static final String username = "shiva";
	public static final String password = "shiva";
	
	Connection getConnection();
	void insertStudent(Student s);
	Student selectStudent(int id);
	List<Student> selectAllStudent();
	boolean deleteStudent(int id);
	boolean updateStudent(Student s);

}
