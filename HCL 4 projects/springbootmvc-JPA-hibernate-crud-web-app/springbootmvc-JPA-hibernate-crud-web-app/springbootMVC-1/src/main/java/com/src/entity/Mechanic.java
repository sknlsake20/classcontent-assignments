package com.src.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mechanic")
public class Mechanic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    
    @Column(name = "mechanicid")
    private int id;
    
    @Column(name = "mechanicname")
    private String name;
    
    @Column(name = "mechanicstatus")
    private String status;

    @Column(name = "mechanicshopname")
    private String shopname;

    @Column(name = "mechanicworkhrs")
    private String workhrs;
    
    @Column(name = "mechanicspecialization")
    private String specialization;
    
    @Column(name = "mechanicaddress")
    private String address;
    
    @Column(name = "latitude")
    private double latitude;
    
    @Column(name = "longitude")
    private  double longitude;
    
    @Column(name = "distance")
    private int distance;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getWorkhrs() {
		return workhrs;
	}

	public void setWorkhrs(String workhrs) {
		this.workhrs = workhrs;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Mechanic() {
		
	}

	@Override
	public String toString() {
		return "Mechanic [id=" + id + ", name=" + name + ", status=" + status + ", shopname=" + shopname + ", workhrs="
				+ workhrs + ", specialization=" + specialization + ", address=" + address + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", distance=" + distance + "]";
	}

   

   
}
