
package com.src.entity;

import java.util.Arrays;
import java.util.Objects;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "picture1")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
   @Column(name = "imgname")
    private String imgname;

    @Column(name = "description")
    private String description;

    @Column(name = "takenby")
    private String takenby;
    
    
     public Image() {

    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getImgname() {
		return imgname;
	}


	public void setImgname(String imgname) {
		this.imgname = imgname;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getTakenby() {
		return takenby;
	}


	public void setTakenby(String takenby) {
		this.takenby = takenby;
	}
	
	@Override
	public String toString() {
		return "Image [id=" + id + ", imgname=" + imgname + ", description=" + description + ", takenby=" + takenby
				+ "]";
	}

	}