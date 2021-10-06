package com.src.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "donar")
public class Donar {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int  age;
    
   
    
     @Column(name = "bloodGroup")
    private String  bloodGroup;
    
    @Column(name = "organ_donated")
    private String  organDonated;
    
    @Column(name = "donated_hospital")
    private String  donatedHospital;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getOrganDonated() {
		return organDonated;
	}

	public void setOrganDonated(String organDonated) {
		this.organDonated = organDonated;
	}

	public String getDonatedHospital() {
		return donatedHospital;
	}

	public void setDonatedHospital(String donatedHospital) {
		this.donatedHospital = donatedHospital;
	}

	public Donar() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Donar [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", bloodGroup=" + bloodGroup + ", organDonated=" + organDonated + ", donatedHospital="
				+ donatedHospital + "]";
	}
    
    
    
    

    

}
