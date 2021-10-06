package com.src.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.UserDAO;
import com.src.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List < User > getUsers() {
        return (List<User>) userDAO.findAll();
    }

    @Override
    @Transactional
    public void saveUser(User theUser) {
        userDAO.save(theUser);
    }

    @Override
    @Transactional
    public Optional<User> getUser(int theId) {
        return userDAO.findById(theId);
    }

    @Override
    @Transactional
    public void deleteUser(User theUser) {
        userDAO.delete(theUser);
    }
    
}
