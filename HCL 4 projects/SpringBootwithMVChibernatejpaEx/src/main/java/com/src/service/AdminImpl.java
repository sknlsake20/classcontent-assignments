package com.src.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.src.model.Admin;
import com.src.repository.AdminRepository;

@Service
public class AdminImpl {
	
  @Autowired
  AdminRepository adminrepo;
	
  public List<Admin> getUser(String username, String password) {	
    Admin a = new Admin();
    a.setUsername(username);
    a.setPassword(password);
    return adminrepo.find(username, password);
  }
}
