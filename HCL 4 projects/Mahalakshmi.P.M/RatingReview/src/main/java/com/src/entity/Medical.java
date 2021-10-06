package com.src.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "medical")
public class Medical {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mid")
	private int mid;

	
	@Column(name = "uid")
	private int uid;
	
	
	@Column(name = "uname")
	private String uname;
	
	@Column(name = "doctor")
	private String doctor;
	
	@Column(name = "hospital")
	private String hospital;
	
	@Column(name = "specilization")
	private String specilization;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "issue")
	private String issue;
	
	@Column(name = "diagonized")
	private String diagonized;
	
	@Column(name = "treatment")
	private String treatment;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "quality")
	private float quality;
	
	@Column(name = "facility")
	private float facility;
	
	@Column(name = "satisfaction")
	private float satisfaction;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "street_landmark")
	private String street_landmark;
	
	@Column(name = "pin")
	private int pin;
public Medical() 
{}
public Medical(int mid, int uid, String uname, String doctor, String hospital, String specilization,
		String category, String issue, String diagonized, String treatment, String description, float quality,
		float facility, float satisfaction, String state, String district, String street_landmark, int pin) {
	super();
	this.mid = mid;
	this.uid = uid;
	this.uname = uname;
	this.doctor = doctor;
	this.hospital = hospital;
	this.specilization = specilization;
	this.category = category;
	this.issue = issue;
	this.diagonized = diagonized;
	this.treatment = treatment;
	this.description = description;
	this.quality = quality;
	this.facility = facility;
	this.satisfaction = satisfaction;
	this.state = state;
	this.district = district;
	this.street_landmark = street_landmark;
	this.pin = pin;
}



public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid= uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getDoctor() {
	return doctor;
}
public void setDoctor(String doctor) {
	this.doctor = doctor;
}
public String getHospital() {
	return hospital;
}
public void setHospital(String hospital) {
	this.hospital = hospital;
}
public String getSpecilization() {
	return specilization;
}
public void setSpecilization(String specilization) {
	this.specilization = specilization;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getIssue() {
	return issue;
}
public void setIssue(String issue) {
	this.issue = issue;
}
public String getDiagonized() {
	return diagonized;
}
public void setDiagonized(String diagonized) {
	this.diagonized = diagonized;
}
public String getTreatment() {
	return treatment;
}
public void setTreatment(String treatment) {
	this.treatment = treatment;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getQuality() {
	return quality;
}
public void setQuality(float quality) {
	this.quality = quality;
}
public float getFacility() {
	return facility;
}
public void setFacility(float facility) {
	this.facility = facility;
}
public float getSatisfaction() {
	return satisfaction;
}
public void setSatisfaction(float satisfaction) {
	this.satisfaction = satisfaction;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getStreet_landmark() {
	return street_landmark;
}
public void setStreet_landmark(String street_landmark) {
	this.street_landmark = street_landmark;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
@Override
public String toString() {
	return "Medical [mid=" + mid + ", user_id=" + uid + ", uname=" + uname + ", doctor=" + doctor + ", hospital="
			+ hospital + ", specilization=" + specilization + ", category=" + category + ", issue=" + issue
			+ ", diagonized=" + diagonized + ", treatment=" + treatment + ", description=" + description + ", quality="
			+ quality + ", facility=" + facility + ", satisfaction=" + satisfaction + ", state=" + state + ", district="
			+ district + ", street_landmark=" + street_landmark + ", pin=" + pin + "]";
}

	
	
	
	


}