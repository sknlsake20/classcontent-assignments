package com.src.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contributor")
public class Contributor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "amount_contribution")
    private int amountContribution;
    
    @Column(name= "things_contribution")
    private String thingsContribution;
    
    @Column(name = "mobile_no")
    private long mobileNo;
    

    @Column(name = "email")
    private String email;

    public Contributor() {

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
    
    
    public int getAmountContribution() {
		return amountContribution;
	}

	public void setAmountContribution(int amountContribution) {
		this.amountContribution = amountContribution;
	}

	public String getThingsContribution() {
		return thingsContribution;
	}

	public void setThingsContribution(String thingsContribution) {
		this.thingsContribution = thingsContribution;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	@Override
	public String toString() {
		return "Contributor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", amountContribution="
				+ amountContribution + ", thingsContribution=" + thingsContribution + ", mobileNo=" + mobileNo
				+ ", email=" + email + "]";
	}

   
}
