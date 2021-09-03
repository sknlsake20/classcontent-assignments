package com.src;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str[]=new String[5];
//		System.out.println(str[3].toUpperCase());
		
		String str[]=new String[5];
		str[0]="shiva";
		str[1]="kumar";
		str[3]="ll";
		
		
		for(int i=0;i<5;i++)
		{
		Optional<String> cnull=Optional.ofNullable(str[i]);
		if(cnull.isPresent())
		{
		System.out.println(str[i].toUpperCase());
		}
		else
		{
			System.out.println("value is not given");
		}
		}
	}

}
