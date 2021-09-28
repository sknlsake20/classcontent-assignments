package com.src.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regemployee")
public class RegularEmployee extends Employee {
	
	private double employeesalary;
	private int employeebonus;
	
	
	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}
	public int getEmployeebonus() {
		return employeebonus;
	}
	public void setEmployeebonus(int employeebonus) {
		this.employeebonus = employeebonus;
	}
	public RegularEmployee(int employeeid, String employeename, double employeesalary, int employeebonus) {
		
		this.employeesalary = employeesalary;
		this.employeebonus = employeebonus;
	}
	
	
	
}
