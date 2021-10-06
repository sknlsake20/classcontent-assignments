package com.src.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private int uid;

    @Column(name = "ufullname")
    private String ufullname;

    @Column(name = "umobile")
    private long umobile;
    
    @Column(name = "umail")
    private String umail;

    @Column(name = "uaddress")
    private String uaddress;
    
    @Column(name = "uname")
    private String uname;
    
    @Column(name = "upassword")
    private String upassword;
    
  

	public User(int uid, String ufullname, long umobile, String umail, String uaddress, String uname, String upassword) {
		super();
		this.uid = uid;
		this.ufullname = ufullname;
		this.umobile = umobile;
		this.umail = umail;
		this.uaddress = uaddress;
		this.uname = uname;
		this.upassword = upassword;
	}

	
	
	

	public User() {

    }
	

	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUfullname() {
		return ufullname;
	}


	public void setUfullname(String ufullname) {
		this.ufullname = ufullname;
	}


	public long getUmobile() {
		return umobile;
	}


	public void setUmobile(long umobile) {
		this.umobile = umobile;
	}


	public String getUmail() {
		return umail;
	}


	public void setUmail(String umail) {
		this.umail = umail;
	}


	public String getUaddress() {
		return uaddress;
	}


	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getUpassword() {
		return upassword;
	}


	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}


	@Override
	public String toString() {
		return "User [uid=" + uid + ", ufullname=" + ufullname + ", umobile=" + umobile + ", umail=" + umail
				+ ", uaddress=" + uaddress + ", uname=" + uname + ", upassword=" + upassword + "]";
	}

	
    

    
    
}
