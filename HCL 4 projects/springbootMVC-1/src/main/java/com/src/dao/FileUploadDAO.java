package com.src.dao;

import org.springframework.data.repository.CrudRepository;

import com.src.entity.UploadFile;

public interface FileUploadDAO extends CrudRepository<UploadFile,Long>{

}
