package com.src.model;

public class Employee {

	private int employeeid;
	private String employeename;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public Employee(int employeeid, String employeename) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
