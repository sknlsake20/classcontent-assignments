package com.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 

public class StreamEx {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(new People("pooja",10,17));
        al.add(new People("priya",20,19));
        al.add(new People("nithya",30,20));
        Stream s=al.stream();
        List l=(List)s.filter((o)->((People)o).age>18).collect(Collectors.toList());
        Stream s1=al.stream();
        List ul=(List)s1.map((o)->{
        	People p =(People)o;
        	p.age=p.age+4;
        	return p;
        	}).collect(Collectors.toList());
        System.out.println(l);
        System.out.println(ul);
        
        
        
    }

 

}
class People
{
    String name;
    int id;
    int age;
    public People(String name, int id,int age) {
        this.name=name;
        this.id=id;
        this.age=age;
    }
    public String  toString()
    {
        return "Name:"+name+" Id:"+id+" Age:"+age;
    }
}