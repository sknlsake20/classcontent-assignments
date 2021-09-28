package com.src;

public class shapeGiver {

	public static void main(String[] args) {

		Shape s=new Rectangle();
		
		
//		s.drawShape(); // rectangle
//		
//		s=new Triangle();
//		s.drawShape();// trinagle
//		
//		s=new Circle();
//		
//		s.drawShape();// circle
		
		
		FactoryMethodClass fmc=new FactoryMethodClass(s);		
		fmc.draw();

	}

}
