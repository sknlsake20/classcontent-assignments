package com.src.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/hello")
	public String display()
	{
		return "hello";
	}
	
	
	@RequestMapping("/helloeverone")
	public String display1()
	{
		return "helloworld";
	}
}
