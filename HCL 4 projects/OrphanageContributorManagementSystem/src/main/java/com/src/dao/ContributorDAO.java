package com.src.dao;

import org.springframework.data.repository.CrudRepository;

import com.src.entity.Contributor;

public interface ContributorDAO extends CrudRepository<Contributor, Integer> {

}
