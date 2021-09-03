package com.src;

public class Customer implements Comparable{
	
	int cid;
	String cname;
	double price;
	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	
	}
	
	
	public Customer(int cid, String cname, double price) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.price = price;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Customer c = (Customer)o;
		if(c.cid>this.cid)
		{
			return -1;
		}
		else
		{
			return 1;
		}
		
	}
	
	

}
