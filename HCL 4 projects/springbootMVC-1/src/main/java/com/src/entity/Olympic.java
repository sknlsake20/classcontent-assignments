package com.src.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "olympic")
public class Olympic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    
    @Column(name = "athleteid")
    private int id;
    
    @Column(name = "season")
    private String season; 

    @Column(name = "athletename")
    private String name;
    
    @Column(name = "athletedob")
    private String dob;

    @Column(name = "athletegender")
    private String gender;

    @Column(name = "country")
    private String country;
    
    @Column(name = "athleteheight")
    private int height;
    
    @Column(name = "athleteweight")
    private int weight;
    
    @Column(name = "athletedesc")
    private String description;
    
    @Column(name = "athletecategory")
    private String category;
    
    @Column(name = "athletemedal")
    private String medal;
    
    @Column(name = "athletemedaltype")
    private String type;

    public Olympic() {

    }

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMedal() {
		return medal;
	}

	public void setMedal(String medal) {
		this.medal = medal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Olympic(String season, int id, String name, String dob, String gender, String country, int height,
			int weight, String description, String category, String medal, String type) {
		super();
		this.season = season;
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.country = country;
		this.height = height;
		this.weight = weight;
		this.description = description;
		this.category = category;
		this.medal = medal;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Olympic [season=" + season + ", id=" + id + ", name=" + name + ", dob=" + dob + ", gender=" + gender
				+ ", country=" + country + ", height=" + height + ", weight=" + weight + ", description=" + description
				+ ", category=" + category + ", medal=" + medal + ", type=" + type + "]";
	}

   
}
