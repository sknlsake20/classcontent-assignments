package com.src;

class MethodReference1{
	
	public static void printStatus()
	{
		System.out.println("this is your thread reference");
		
	}
}

public class ThreadReference {

	public static void main(String[] args) {
		
		Thread t=new Thread(()->System.out.println("runnning"));		
		t.start();
		
		Thread t1=new Thread(MethodReference1::printStatus);
		t1.start();
		
		

	}

}
