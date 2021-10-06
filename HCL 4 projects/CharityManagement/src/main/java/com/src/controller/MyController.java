package com.src.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	@RequestMapping("display")
	public String display()
	{
		return "display";
	}
	@RequestMapping("register")
	public String register()
	{
		return "register";
	}

}
