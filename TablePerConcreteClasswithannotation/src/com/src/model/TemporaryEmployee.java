package com.src.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("tememployee")
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
