package com.src.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Application;
import com.src.entity.User;
import com.src.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger LOGGER = LogManager.getLogger(Application.class);
	 

    @Autowired
    private UserService userService;
    
    @GetMapping("/login")
    public String checklogin() {
    	LogManager.getLogger(Application.class);
       return "login";
    }
    
    
    @GetMapping("/list")
    public String listCustomers(Model theModel) {
    	LogManager.getLogger(Application.class);
    	
        List <User > theUsers = userService.getUsers();
        theModel.addAttribute("users", theUsers);
        return "list-users";
    }
    
    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
    	LogManager.getLogger(Application.class);
        User theUser = new User();
        theModel.addAttribute("user", theUser);
        return "register";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User theUser) {
    	LogManager.getLogger(Application.class);
    	userService.saveUser(theUser);
        return "redirect:/user/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("userId") int theId,
        Model theModel) {
    	LogManager.getLogger(Application.class);
        Optional<User> theUser = userService.getUser(theId);
        theModel.addAttribute("user", theUser);
        return "register";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam("userId") int theId) {
    	LogManager.getLogger(Application.class);
    	User u =new User();
    	u.setUid(theId);
        userService.deleteUser(u);
        return "redirect:/user/list";
    }
   
    
}
