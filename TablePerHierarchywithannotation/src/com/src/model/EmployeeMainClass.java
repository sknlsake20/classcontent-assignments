package com.src.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class EmployeeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=meta.getSessionFactoryBuilder().build();


		Session session=factory.openSession();

		Transaction t=session.beginTransaction();
		
		Employee e =new Employee();
		e.setEmployeename("shiva");
		RegularEmployee re =new RegularEmployee();
		
		re.setEmployeename("sarvesh");
		re.setEmployeesalary(100000);
		re.setEmployeebonus(5000);
		
		TemporaryEmployee te=new TemporaryEmployee();
		te.setEmployeename("mohil");
		te.setContracduration("3 months");
		te.setPayperhour(2000);
		
		session.save(e);
		session.save(re);
		session.save(te);
		
		t.commit();
		System.out.println("values got inserted");
		session.close();
		
		
	}

}
