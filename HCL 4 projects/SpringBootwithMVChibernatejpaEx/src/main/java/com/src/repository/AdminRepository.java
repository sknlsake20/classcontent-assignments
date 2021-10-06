package com.src.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import java.util.List;
import com.src.model.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, String> {

  @Query(value="select * from Admin where username = :username AND password = :password", nativeQuery = true)
  public List<Admin> find(@Param("username") String username, @Param("password") String password);
}
