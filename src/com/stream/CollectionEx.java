package com.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionEx {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList();

		l.add(67);
		l.add(22);		
		l.add(45);
		l.add(2);
		l.add(89);
		l.add(40);
		l.add(21);
		
		System.out.println(l);
		
		List<Integer> l1=new ArrayList();
		
		Iterator<Integer> it=l.iterator();
		
		while(it.hasNext())
		{
			Integer m = it.next();
			if(m%2==0)
			{
				l1.add(m);
			}
		}
		
		System.out.println(l1);		
		Stream s= l.stream();		
		List ll=(List) s.filter((o)->(Integer)o%2==0).collect(Collectors.toList());
		System.out.println(ll);
		
	}

}
