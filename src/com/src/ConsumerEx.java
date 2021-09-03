
// accept n number of elements and find out sum of all elements
package com.src;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerEx {

	public static void main(String[] args) {
		
	Scanner name = new Scanner(System.in);
		
		System.out.println("enter number of elements to be accept :");
		int n=name.nextInt();
		Integer array[]=new Integer[n];		
		for(int i=0;i<n;i++)
		{
			array[i]=name.nextInt();
		}
		
		Consumer<Integer[]> c = (a)->{
			int sum=0;
			for(int x:a)
			{
				sum+=x;
			}
			System.out.println("sum of all element is "+sum);
		};
		
		c.accept(array);
		
		
		Predicate<Integer> p=(x)->x>10?true:false;
		
		p.test(67); //true
		
		p.test(-56); //false
		
	}

}
