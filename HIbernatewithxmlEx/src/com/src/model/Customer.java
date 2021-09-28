package com.src.model;

public class Customer {
	
	private int customerid;
	private long customermobileno;
	private String customername;
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
