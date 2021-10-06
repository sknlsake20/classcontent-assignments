package com.src.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Bus")
public class Bus {
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="busid")
  private int busid;
  private String busname;
  private String source;
  private String destination;
  private String bustype;
  private String time;
  private Date date;
  private int fare;
	
  @OneToMany(mappedBy = "bus",cascade = CascadeType.ALL)
  private List<Cab> cab;
	
  public Bus() {
    super();
  }
			
  public Bus(int busid, String busname, String source, String destination, String bustype, String time, Date date,
    int fare, List<Cab> cab) {
      super();
      this.busid = busid;
      this.busname = busname;
      this.source = source;
      this.destination = destination;
      this.bustype = bustype;
      this.time = time;
      this.date = date;
      this.fare = fare;
      this.cab = cab;
  }
	
  public List<Cab> getCab() {
    return cab;
  }

  public void setCab(List<Cab> cab) {
     this.cab = cab;
  }

  public int getFare() {
    return fare;
  }

  public void setFare(int fare) {
    this.fare = fare;
  }

  public int getBusid() {
    return busid;
  }
  public void setBusid(int busid) {
    this.busid = busid;
  }
  public String getBusname() {
    return busname;
  }
  public void setBusname(String busname) {
    this.busname = busname;
  }
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }
  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
  }
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }
  public String getBustype() {
    return bustype;
  }
  public void setBustype(String bustype) {
    this.bustype = bustype;
  }
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
}
