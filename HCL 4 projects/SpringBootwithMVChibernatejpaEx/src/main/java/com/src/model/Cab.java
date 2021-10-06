package com.src.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Cab")
public class Cab {

  @Id
  private String cabno;
  private String location;
  private String cabfare;
	
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="busid")
  private Bus bus;

  public String getCabno() {
    return cabno;
  }

  public void setCabno(String cabno) {
    this.cabno = cabno;
  }
	
  public int getBusid() {
    return bus.getBusid();
  }

  public void setBusid(int bid) {
    this.bus.setBusid(bid);
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getCabfare() {
    return cabfare;
  }
  public void setCabfare(String cabfare) {
    this.cabfare = cabfare;
  }

  public Bus getBus() {
    return bus;
  }

  public void setBus(Bus bus) {
    this.bus = bus;
  }

  public Cab() {
    super();
  }
  public Cab(String cabno, String location, String cabfare, Bus bus) {
    super();
    this.cabno = cabno;
    this.location = location;
    this.cabfare = cabfare;
    this.bus = bus;
  }	
}
