package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	
	private static final Logger LOGGER=LogManager.getLogger(Application.class);
	
	public static void main(String[] args)
	{
		ApplicationContext ctx=(ApplicationContext) SpringApplication.run(Application.class, args);
		
		LOGGER.info("info log message");
		LOGGER.debug("debug log message");
		LOGGER.error("error log message");
		
	}

}
