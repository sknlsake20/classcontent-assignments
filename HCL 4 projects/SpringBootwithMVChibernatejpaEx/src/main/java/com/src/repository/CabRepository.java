package com.src.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.src.model.Cab;

@Repository
public interface CabRepository extends CrudRepository<Cab, String> {
  public List<Cab> findByLocation(String location);
}
