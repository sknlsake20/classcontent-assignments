package com.src.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.src.model.Student;
import com.src.service.StudentService;

import java.util.Scanner;
public class StudentMainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentService ss=new StudentService();
		int choice;
		do {
		System.out.println("choose from following options:");
		System.out.println("1. display all students");
		System.out.println("2. Add student");
		System.out.println("3. update student");
		System.out.println("4. delete student");
		System.out.println("5. everythin");
		System.out.println("6.exit");
		choice = sc.nextInt();
		
		 
		switch(choice)
		{
			case 1:
			{
			List students=ss.getAllStudents();
			students.stream().forEach(System.out::println);
			break;
			}
			case 2:
			{
				Student s=new Student();
				System.out.println("enter student id :");				
				s.setSid(sc.nextInt());
				System.out.println("enter student name :");				
				s.setSname(sc.next());
				System.out.println("enter student address :");				
				s.setSaddress(sc.next());
				System.out.println("enter student mobile :");				
				s.setSmob(sc.nextLong());				
				ss.insertStudent(s);				
				break;
			}
			
			case 3:
			{
				Student s=new Student();
				System.out.println("enter student id :");				
				s.setSid(sc.nextInt());
				System.out.println("enter student name :");				
				s.setSname(sc.next());
				System.out.println("enter student address :");				
				s.setSaddress(sc.next());
				System.out.println("enter student mobile :");				
				s.setSmob(sc.nextLong());				
				int status=ss.updateStudent(s);
				
				if(status>0)
				{
					System.out.println("values updated");
				}
				else
				{
					System.out.println("invalid id");
				}
				break;
			}
			case 4:
			{
				Student s=new Student();
				System.out.println("enter student id :");				
							s.setSid(sc.nextInt());
				int status=ss.deleteStudent(s);
				
				if(status>0)
				{
					System.out.println("values deleted");
				}
				else
				{
					System.out.println("invalid id");
				}
				break;
			}
			case 5:
			{
				ss.printAllvalues();
				break;
			}
			case 6:
			{
				System.out.println("bye bye");
				break;
			}
			default:
			{
				System.out.println("invalid entry");
			}
		}
		}while(choice!=5);
		
	}

}
