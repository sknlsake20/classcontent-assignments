package com.src.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.src.entity.Olympic;
@Repository
public interface OlympicDAO extends CrudRepository<Olympic,Integer>{

  
}
