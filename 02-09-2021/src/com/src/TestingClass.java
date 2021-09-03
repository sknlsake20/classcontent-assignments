package com.src;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestingClass {

	public static void main(String[] args) {
		Result res= JUnitCore.runClasses(ArithmeticOperatorsTest.class);		
		if(res.wasSuccessful())
		{
			System.out.println("testing succesful");
		}
		else
		{
			System.out.println("testing failed");
		}
		
		

	}

}
