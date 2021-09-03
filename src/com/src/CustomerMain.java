package com.src;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomerMain {


	public static void main(String[] args) {
		TreeSet<Customer> ts =new TreeSet((o1, o2)-> {
						Customer c1 =(Customer)o1;
						Customer c2 =(Customer)o2;						
						return c1.cname.compareTo(c2.cname)>0?-1:1;});
		
		ts.add(new Customer(23,"sk"));
		ts.add(new Customer(56,"kk"));
		ts.add(new Customer(12,"lk"));
		ts.add(new Customer(1,"ik"));
		ts.add(new Customer(90,"ek"));
		ts.add(new Customer(4,"rk"));
		System.out.println(ts);

	}

}
