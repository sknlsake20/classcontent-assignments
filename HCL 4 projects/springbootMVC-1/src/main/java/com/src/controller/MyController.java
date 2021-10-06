package com.src.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


@Controller
public class MyController {
	
	
	@RequestMapping("/")
	public String display()
	{
		return "index";
	}
	@RequestMapping("/register")
	public String display1()
	{
		return "register";
	}
	@RequestMapping("/login")
	public String display2()
	{
		return "login";
	}
	@RequestMapping("/display")
	public String display3()
	{
		return "display";
	}
	@RequestMapping("/database")
	public String display4()
	{
		return "database";
	}

}
