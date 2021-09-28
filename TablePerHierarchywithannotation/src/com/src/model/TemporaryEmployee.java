package com.src.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="tempemp222")
@AttributeOverrides({
	@AttributeOverride(name="employeeid",column=@Column(name="id")),
	@AttributeOverride(name="employeename",column=@Column(name="name"))
})
public class TemporaryEmployee extends Employee{
	
	private double payperhour;
	private String contracduration;
	public double getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(double payperhour) {
		this.payperhour = payperhour;
	}
	public String getContracduration() {
		return contracduration;
	}
	public void setContracduration(String contracduration) {
		this.contracduration = contracduration;
	}
	public TemporaryEmployee(double payperhour, String contracduration) {
		super();
		this.payperhour = payperhour;
		this.contracduration = contracduration;
	}
	public TemporaryEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
