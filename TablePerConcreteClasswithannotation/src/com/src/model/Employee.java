package com.src.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp420")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tabletype",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("employee")
public class Employee {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
