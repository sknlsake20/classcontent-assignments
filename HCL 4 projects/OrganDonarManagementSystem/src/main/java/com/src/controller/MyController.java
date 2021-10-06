package com.src.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	
	
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	
	
	
	@RequestMapping("/display")
	public String display()
	{
		return "display";
	}
}
