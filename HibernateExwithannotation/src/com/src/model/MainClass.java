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

		StandardServiceRegistry ssr = 
				new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();		
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e=new Employee();
		e.setEmployeeid(345);
		e.setEmployeefname("rajini");
		e.setEmployeemname("kanth");
		e.setEmployeelname("shivajirao");
		e.setEmployeeaddress("chennai, TN-500060");
		e.setEmployeesalary(999999999);
		
		session.save(e);
		t.commit();
		System.out.println("values got inserted successfully");
		
		
	}

}
