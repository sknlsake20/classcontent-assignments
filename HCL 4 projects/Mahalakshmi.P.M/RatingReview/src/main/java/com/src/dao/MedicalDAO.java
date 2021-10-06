package com.src.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.src.entity.Medical;
@Repository
public interface MedicalDAO extends CrudRepository<Medical,Integer> {

}
