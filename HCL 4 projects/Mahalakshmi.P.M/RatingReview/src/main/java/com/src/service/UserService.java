package com.src.service;

import java.util.List;
import java.util.Optional;

import com.src.entity.User;

public interface UserService {

    public List < User > getUsers();

    public void saveUser(User theUser);

    public Optional<User> getUser(int theId);

    public void deleteUser(User theUser);

}
