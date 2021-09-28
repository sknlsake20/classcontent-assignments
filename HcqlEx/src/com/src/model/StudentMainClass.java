package com.src.model;


import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class StudentMainClass {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=metadata.buildSessionFactory();
		
		Session session=factory.openSession();
		Criteria c=session.createCriteria(Student.class);
		
		c.addOrder(Order.desc("sid"));
		List students=c.list();
		
		students.stream().forEach(System.out::println);
		
		
		c.add(Restrictions.gt("sid",500));
		
		List students1 =c.list();
		students1.stream().forEach(System.out::println);
		
		
		c.setProjection(Projections.property("sname"));
		List students2=c.list();
		students2.stream().forEach(System.out::println);
		
		TypedQuery query = session.getNamedQuery("findStudentById");		
		query.setParameter("name", 24);		
		List list=query.getResultList();
		
		list.stream().forEach(System.out::println);
		
		

	}

}
