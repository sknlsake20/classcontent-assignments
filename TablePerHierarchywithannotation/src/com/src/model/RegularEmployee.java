package com.src.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="regemp222")
@AttributeOverrides({
	@AttributeOverride(name="employeeid",column=@Column(name="id")),
	@AttributeOverride(name="employeename",column=@Column(name="name"))
})
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
