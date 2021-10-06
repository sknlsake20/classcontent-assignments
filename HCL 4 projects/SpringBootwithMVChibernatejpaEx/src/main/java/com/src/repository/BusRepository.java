package com.src.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.src.model.Bus;

@Repository
public interface BusRepository extends CrudRepository<Bus, Integer> {
	
  @Query(value = "select * from bus where source = :source AND destination = :destination AND date = :date", nativeQuery = true)
  public List<Bus> find(@Param("source") String source,@Param("destination") String destination,@Param("date") Date date);
	
}

