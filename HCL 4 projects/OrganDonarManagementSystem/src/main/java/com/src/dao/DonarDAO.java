package com.src.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.src.entity.Donar;
@Repository
public interface DonarDAO extends CrudRepository<Donar, Integer> {

}
