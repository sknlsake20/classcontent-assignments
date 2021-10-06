package com.src.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.src.entity.Image;
@Repository
public interface ImageDAO extends CrudRepository<Image,Integer>{

  
}

