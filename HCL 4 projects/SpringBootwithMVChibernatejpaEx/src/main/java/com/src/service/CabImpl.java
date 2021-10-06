package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.repository.CabRepository;
import com.src.model.Cab;

@Service
public class CabImpl {
	
  @Autowired
  CabRepository cabrepo;
	
  public List<Cab> getList(String location) {
    Cab c = new Cab();
    c.setLocation(location);
    return cabrepo.findByLocation(location);
  }
}
