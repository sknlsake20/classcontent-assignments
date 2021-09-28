package com.src.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "customer234")
public class Customer {
	
	
	@Id
	private int customerid;	
	@Column(name = "cmobileno")
	private long customermobileno;
	@Column(name = "cname")
	private String customername;
	@Column(name = "cemailid")
	private String customermailid;
	
	
	public Customer(int customerid, long customermobileno, String customername, String customermailid) {
		super();
		this.customerid = customerid;
		this.customermobileno = customermobileno;
		this.customername = customername;
		this.customermailid = customermailid;
	}
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public long getCustomermobileno() {
		return customermobileno;
	}
	public void setCustomermobileno(long customermobileno) {
		this.customermobileno = customermobileno;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomermailid() {
		return customermailid;
	}
	public void setCustomermailid(String customermailid) {
		this.customermailid = customermailid;
	}
	

}
