package com.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticOperatorsTest {
	ArithmeticOperators ao;
	
	@BeforeEach
	public void init()
	{
		ao=new ArithmeticOperators();
	}

	@Test
	void testAdd() {
				
		assertEquals(22,ao.add(45, -23));		
	}
	
	@Test
	void testAreaOfCircle() {
		
		assertNotNull(ao);
		double actual = ao.areaOfCircle(1);		
		assertEquals(Math.PI,actual,"pi value value is not given properly");
		
		String firststrings="preethi";
		String secondstrings="preethi";
		
		assertSame(firststrings, secondstrings);
	}
	
	@Test
	void testDivision() {
		
		assertThrows(ArithmeticException.class,()->ao.division(6, 0),"number divided by zero");
		
	}

}
