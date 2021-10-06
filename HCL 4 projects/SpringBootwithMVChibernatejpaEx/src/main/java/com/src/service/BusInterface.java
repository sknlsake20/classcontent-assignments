package com.src.service;

import java.sql.Date;
import java.util.List;
import com.src.model.Bus;

public interface BusInterface {
  public List<Bus> getAllBuses();
  public void addBus(Bus b);
  public Bus getBus(int busid);
  public void removeBus(Bus b);
  public void updateBus(Bus b);
  public List<Bus> showList(String source, String destination, Date date);
}
