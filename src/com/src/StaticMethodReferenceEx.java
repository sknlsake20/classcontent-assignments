package com.src;

@FunctionalInterface
interface Display{
	
	void say();
}

class MethodReference{
	
	public static void something()
	{
		System.out.println("say something");
	}
}

public class StaticMethodReferenceEx {

	public static void main(String[] args) {
		
		Display d=()->System.out.println("print anything");		
		d.say();
		
		Display d1 = MethodReference::something;		
		d1.say();

	}

}
