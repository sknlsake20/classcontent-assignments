package com.src;

import java.util.function.BiFunction;

class Operators{
	
	public static int add(int x,int y)
	{
		return x+y;
	}
	public static int sub(int x,int y)
	{
		return x-y;
	}
	public static int mul(int x,int y)
	{
		return x*y;
	}
	public int div(int x,int y)
	{
		return x/y;
	}
}

public class StaticMethodReference2 {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> bi = Operators::add;
		
		System.out.println(bi.apply(34, 56));
		
		bi=Operators::sub;
		System.out.println(bi.apply(34, 56));
		
		bi=Operators::mul;
		System.out.println(bi.apply(34, 56));
		
		bi=new Operators()::div;
		System.out.println(bi.apply(34, 56));
	}

}
