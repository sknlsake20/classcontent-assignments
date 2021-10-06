package com.src.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.src.entity.Mechanic;
@Repository
public interface MechanicDAO extends CrudRepository<Mechanic,Integer>{

  
}
