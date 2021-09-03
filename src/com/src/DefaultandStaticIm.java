package com.src;


interface Nothing{
	
	default void say()
	{
		System.out.println("this is say");
	}
	
	static void sayHello()
	{
		System.out.println("this is static say hello");
	}
	
	void display();
}

class DefaultMethod implements Nothing{

	@Override
	public void display() {
		System.out.println("this is display");
		
	}
	
}

public class DefaultandStaticIm {

	public static void main(String[] args) {

		DefaultMethod dm=new DefaultMethod();
			dm.display();
			dm.say();
			
			Nothing.sayHello();

	}

}
