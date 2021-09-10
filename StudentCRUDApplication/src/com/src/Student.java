package com.src;

public class Student {
private int studentid;
private String studentname;
private long studentmobileno;
private String studentemailid;
private String studentinstname;
private double studentpercentage;
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
public long getStudentmobileno() {
	return studentmobileno;
}
public void setStudentmobileno(long studentmobileno) {
	this.studentmobileno = studentmobileno;
}
public String getStudentemailid() {
	return studentemailid;
}
public void setStudentemailid(String studentemailid) {
	this.studentemailid = studentemailid;
}
public String getStudentinstname() {
	return studentinstname;
}
public void setStudentinstname(String studentinstname) {
	this.studentinstname = studentinstname;
}
public double getStudentpercentage() {
	return studentpercentage;
}
public void setStudentpercentage(double studentpercentage) {
	this.studentpercentage = studentpercentage;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentmobileno=" + studentmobileno
			+ ", studentemailid=" + studentemailid + ", studentinstname=" + studentinstname + ", studentpercentage="
			+ studentpercentage + "]";
}
 

}
