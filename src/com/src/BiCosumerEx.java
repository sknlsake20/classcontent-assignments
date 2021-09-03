package com.src;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiCosumerEx {

	public static void main(String[] args) {
		
		
		BiConsumer bi=(o1,o2)->{
			String s1=(String)o1;
			String s2=(String)o2;
			System.out.println(s1.concat(s2));
		};
		
		bi.accept("shiva", " kumar");
		
		bi=(o1,o2)->{
			Integer s1=(Integer)o1;
			Integer s2=(Integer)o2;
			System.out.println("addition="+(s1+s2));
		};
		
		bi.accept(45, 78);
		
		bi=(o1,o2)->{
			Customer s1=(Customer)o1;
			Customer s2=(Customer)o2;
			System.out.println("addition="+(s1.price+s2.price));
		};
		
		bi.accept(new Customer(34,"gk",45.67), new Customer(67,"pk",78.67));
		
		Comparator bi1=(o1,o2)->{
			Customer s1=(Customer)o1;
			Customer s2=(Customer)o2;
			return s1.cname.compareTo(s2.cname)>0?-1:1;
		};
		
		TreeSet<Customer> ts =new TreeSet(bi1);
		ts.add(new Customer(23,"sk"));
		ts.add(new Customer(56,"kk"));
		ts.add(new Customer(12,"lk"));
		ts.add(new Customer(1,"ik"));
		ts.add(new Customer(90,"ek"));
		ts.add(new Customer(4,"rk"));
		System.out.println(ts);
	}

}
