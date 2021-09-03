package com.src;


import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;


public class MainClass {
	
	private static Logger logger= Logger.getLogger(MainClass.class); 

	public static void main(String[] args) throws IOException {
		
		//Layout layout = new SimpleLayout();	
		//Layout layout = new HTMLLayout();
		//Layout layout = new XMLLayout();
		//Layout layout = new PatternLayout("%p : %d{yy-mm-dd hh:mm:ss} - %C %M : %m %L %n ");
		//Appender appender = new ConsoleAppender(layout);		
		//Appender appender = new FileAppender(layout,"D:\\HCL4\\02-09-2021\\loginformation.log");
		//logger.addAppender(appender);
			
			logger.debug("student object created");
			logger.info("information printed");
			logger.warn("warning message printed");
			logger.error("error message printed");
			logger.fatal("fatal message printed");
			

	}

}
