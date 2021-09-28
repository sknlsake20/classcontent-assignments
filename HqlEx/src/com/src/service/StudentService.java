package com.src.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.src.model.Student;

public class StudentService {
	
	public SessionFactory getSessionFactory()
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=metadata.buildSessionFactory();
		return factory;
	}
	
	public List<Student> getAllStudents()
	{
		SessionFactory factory=getSessionFactory();
			Session session=factory.openSession();
		
		Query query=session.createQuery("from Student");	 	
		return query.list();
	}
	
	public void insertStudent(Student s)
	{
		SessionFactory factory=getSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		System.out.println("values got inserted");
		
	}
	
	public int updateStudent(Student s)
	{
		SessionFactory factory=getSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("update Student set sname=:sn,saddress=:sa,smob=:sm where sid=:i");
		
		query.setParameter("sn", s.getSname());
		query.setParameter("sa", s.getSaddress());
		query.setParameter("sm", s.getSmob());
		query.setParameter("i", s.getSid());
		
		
		int status=query.executeUpdate();
		tx.commit();
		
		return status;
	}
	public int deleteStudent(Student s)
	{
		SessionFactory factory=getSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("delete from Student where sid=:i");
		query.setParameter("i", s.getSid());
		int status=query.executeUpdate();
		tx.commit();
		
		return status;
	}
	
	
	public void printAllvalues()
	{
		SessionFactory factory=getSessionFactory();
		
		Session session=factory.openSession();
		Query query=session.createQuery("select count(*) from Student");	
		List<Integer> students=query.list();		
		System.out.println("total number of students :"+students.get(0));
		
		Query query1=session.createQuery("select max(sid) from Student");		
		List<Integer> students1=query1.list();		
		System.out.println("max id is given "+students1.get(0));
		
		Query query2=session.createQuery("select min(sid) from Student");		
		List<Integer> students2=query2.list();		
		System.out.println("min id is given "+students2.get(0));
		
		
		Query query3=session.createQuery("select upper(sname) from Student where sid=24");		
		List<String> students3=query3.list();		
		System.out.println("min id is given "+students3.get(0));
		
		
		
		
	
		
		
	}
}
