package com.src.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.src.model.Student;

@Controller
public class RegistrationController {
	
	@RequestMapping("/regform")
	public String gotoRegistration(Model m)
	{
		Student s=new Student();
		m.addAttribute("student",s);
		
		return "register";
	}
	
	@RequestMapping("/register")
	public String registration(@Valid @ModelAttribute("student") Student s,BindingResult br,Model m)
	{
		if(br.hasErrors())
		{
			System.out.println("i am here");
			return "register";
		}
		else
		{
		m.addAttribute("std",s);
		return "display";
		}
	}

}
