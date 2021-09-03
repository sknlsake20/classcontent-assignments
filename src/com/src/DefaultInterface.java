package com.src;

@FunctionalInterface
interface Greetings{
	
	default void hello() {
		System.out.println("hello");
		
	}
	
	static void run()
	{
		System.out.println("run raja run");
	}
	
	void display();
}

class Hindi implements Greetings{

	@Override
	public void display() {

		System.out.println("this is display");
		
		hello();
		
	}
	
	
	
	
}


public class DefaultInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hindi h =new Hindi();
		
		h.display();
		
		Greetings g=()->{
						
		};
		
		
	

	}

}
