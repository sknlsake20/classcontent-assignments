package com.src.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;
    
    @Column(name = "opening_time")
    private String opening_time;
    
    @Column(name = "closing_time")
    private String closing_time;

    @Column(name = "email")
    private String email;
    
    @Column(name = "mobilenumber")
    private String mobilenumber;
    

    public Customer() {

    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOpening_time() {
		return opening_time;
	}

	public void setOpening_time(String opening_time) {
		this.opening_time = opening_time;
	}

	public String getClosing_time() {
		return closing_time;
	}

	public void setClosing_time(String closing_time) {
		this.closing_time = closing_time;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", opening_time=" + opening_time
				+ ", closing_time=" + closing_time + ", email=" + email + ", mobilenumber=" + mobilenumber + "]";
	}

   
}
