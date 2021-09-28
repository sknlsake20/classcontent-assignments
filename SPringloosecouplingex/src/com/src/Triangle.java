package com.src;

interface Shape
{
	public void drawShape();
}

public class Triangle implements Shape{
	
	public void drawShape()
	{
		System.out.println("draw a triangle");
	}

}

class Circle implements Shape{
	
	public void drawShape()
	{
		System.out.println("draw a circle");
	}

}
class Rectangle implements Shape{
	
	public void drawShape()
	{
		System.out.println("draw a Rectangle");
	}

}
class Square implements Shape{
	
	public void drawShape()
	{
		System.out.println("draw a square");
	}

}