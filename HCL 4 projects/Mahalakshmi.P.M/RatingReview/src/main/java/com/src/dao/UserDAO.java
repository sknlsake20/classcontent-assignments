package com.src.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.src.entity.User;
@Repository
public interface UserDAO extends CrudRepository<User,Integer>{

  
}
