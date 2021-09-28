package com.src.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Student {
	
	@Min(value=3,message="must be greater than 0")
	private int studentid;
	@Size(min = 2,message="required")
	private String studentname;	
	
	private String studentaddress;
	private String studentgender;
	private String studentcountry;
	
	
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentaddress=" + studentaddress
				+ ", studentgender=" + studentgender + ", studentcountry=" + studentcountry + "]";
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public String getStudentgender() {
		return studentgender;
	}
	public void setStudentgender(String studentgender) {
		this.studentgender = studentgender;
	}
	public String getStudentcountry() {
		return studentcountry;
	}
	public void setStudentcountry(String studentcountry) {
		this.studentcountry = studentcountry;
	}
	public Student(int studentid, String studentname, String studentaddress, String studentgender,
			String studentcountry) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentaddress = studentaddress;
		this.studentgender = studentgender;
		this.studentcountry = studentcountry;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
