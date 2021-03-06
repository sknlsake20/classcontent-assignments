package com.src.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainClass {

	public static void main(String[] args) {

		
StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
SessionFactory factory=meta.getSessionFactoryBuilder().build();


Session session=factory.openSession();

Transaction t=session.beginTransaction();

Customer c =new Customer(123,8989898,"shiva","shiva@shiva.com");//transient state

session.save(c); // Persistent state

t.commit();// database state
System.out.println("values inserted successfully");
factory.close();
session.close();


	}

}
