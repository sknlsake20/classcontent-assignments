package com.src.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Application;

@Controller
public class MyController {
	private static final Logger LOGGER = LogManager.getLogger(Application.class);
	 
	
	
	@RequestMapping("/")
	public String mainpage()
	{
		LogManager.getLogger(Application.class);
		return "index";
	}
	@RequestMapping("/RR")
	public String rrpage()
	{	LogManager.getLogger(Application.class);
		return "indexForRR";
	}
}
