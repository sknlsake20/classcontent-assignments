package com.src.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.src.entity.Customer;
@Repository
public interface CustomerDAO extends CrudRepository<Customer,Integer>{
  
}
