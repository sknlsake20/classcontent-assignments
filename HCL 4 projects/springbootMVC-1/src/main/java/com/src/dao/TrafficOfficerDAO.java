package com.src.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.src.entity.TrafficOfficer;
@Repository
public interface TrafficOfficerDAO extends CrudRepository<TrafficOfficer,Integer>{

  
}
