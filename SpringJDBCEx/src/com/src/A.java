package com.src;

public class A {
	B b;
	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}

	public A() {
		super();
		System.out.println("a object is getting created");
		// TODO Auto-generated constructor stub
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	

}

class B
{

	public B() {
		super();
		System.out.println("this is b object");
	}
	
	
}