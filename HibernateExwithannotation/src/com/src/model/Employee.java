package com.src.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="emp420")
public class Employee {
	
	@Id
	private int employeeid;
	private String employeefname;
	private String employeemname;
	private String employeelname;
	private String employeeaddress;
	private double employeesalary;
	
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeefname() {
		return employeefname;
	}
	public void setEmployeefname(String employeefname) {
		this.employeefname = employeefname;
	}
	public String getEmployeemname() {
		return employeemname;
	}
	public void setEmployeemname(String employeemname) {
		this.employeemname = employeemname;
	}
	public String getEmployeelname() {
		return employeelname;
	}
	public void setEmployeelname(String employeelname) {
		this.employeelname = employeelname;
	}
	public String getEmployeeaddress() {
		return employeeaddress;
	}
	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}
	public double getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}
	
	

}
