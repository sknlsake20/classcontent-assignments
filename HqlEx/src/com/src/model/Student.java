package com.src.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@Column(name="studentid")
	private int sid;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", smob=" + smob + "]";
	}
	@Column(name="studentname")
	private String sname;
	@Column(name="studentaddress")
	private String saddress;
	@Column(name="studentmobilenumber")
	private long smob;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public long getSmob() {
		return smob;
	}
	public void setSmob(long smob) {
		this.smob = smob;
	}
	
	

}
