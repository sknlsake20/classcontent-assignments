package com.src.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "volunteer")
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    @Column(name = "organisation_name")
    private String organisationName;
    @Column(name = "food_donation")
    private String foodDonation;
    @Column(name = "money_donation")
    private String moneydonation;
    public String getMoneydonation() {
		return moneydonation;
	}

	public void setMoneydonation(String moneydonation) {
		this.moneydonation = moneydonation;
	}

	@Column(name = "mobileno")
    private String mobileNo;
    @Column(name = "gender")
    private String gender;

    public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getFoodDonation() {
		return foodDonation;
	}

	public void setFoodDonation(String foodDonation) {
		this.foodDonation = foodDonation;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Volunteer() {

    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	@Override
	public String toString() {
		return "Volunteer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", organisationName=" + organisationName + ", foodDonation=" + foodDonation + ", moneydonation="
				+ moneydonation + ", mobileNo=" + mobileNo + ", gender=" + gender + "]";
	}

   

}
