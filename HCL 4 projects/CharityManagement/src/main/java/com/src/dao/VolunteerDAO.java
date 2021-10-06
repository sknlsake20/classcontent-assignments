package com.src.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.src.entity.Volunteer;
@Repository
public interface VolunteerDAO extends CrudRepository<Volunteer, Integer> {

}
