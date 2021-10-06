package com.src.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.model.Bus;
import com.src.repository.BusRepository;

@Service
public class BusImpl implements BusInterface{
	
  @Autowired
  BusRepository busrepo;
  
  @Override
  public List<Bus> getAllBuses() {
    List<Bus> b = new ArrayList<>();
    busrepo.findAll().forEach(bus->b.add(bus));
    return b;
  }

  @Override
  public void addBus(Bus b) {
    busrepo.save(b);	
  }
  
  @Override
  public Bus getBus(int busid) {
    return busrepo.findById(busid).get();
  }

  @Override
  public void removeBus(Bus b) {
    busrepo.deleteById(b.getBusid());	
  }

  @Override
  public void updateBus(Bus b) {
    busrepo.save(b);
  }

  public List<Bus> showList(String source , String destination , Date date) {
    Bus b = new Bus();
    b.setSource(source);
    b.setDestination(destination);
    b.setDate(date);
    return busrepo.find(source, destination, date);
  }
}
