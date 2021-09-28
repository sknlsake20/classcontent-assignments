package com.src;

public class FactoryMethodClass {
	
	Shape s;

	public FactoryMethodClass(Shape s) {
		super();
		this.s = s;
	}
	
	
	
	public void draw()
	{
		s.drawShape();
	}

}
