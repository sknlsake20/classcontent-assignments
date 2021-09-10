package com.src;
import java.util.List;
import java.util.Scanner;
public class MainApplication {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Welcome to Student management system :");
		System.out.println("choose from following option :");
		System.out.println("1. Add Student");
		System.out.println("2. Get Student");
		System.out.println("3. All Student details");
		System.out.println("4. Delete Student");
		System.out.println("5. Update Student");
		System.out.println("6. Exit");
		
		choice=sc.nextInt();
		StudentDAOImpl stdao= new StudentDAO();
		switch (choice) {
		case 1:
			{
					System.out.println("enter student id, name, mobile no, emailid, institute name, percenatage");
					Student s=new Student();
					s.setStudentid(sc.nextInt());
					s.setStudentname(sc.next());
					s.setStudentmobileno(sc.nextLong());
					s.setStudentemailid(sc.next());
					s.setStudentinstname(sc.next());
					s.setStudentpercentage(sc.nextDouble());					
					stdao.insertStudent(s);
					
					System.out.println("student addedd successfully");
					
					
			break;
			}
			
		case 2:
		{
				System.out.println("enter student id");
				int id=sc.nextInt();
				Student s=stdao.selectStudent(id);
				System.out.println(s.getStudentid()+" | "+s.getStudentname()+" | "+s.getStudentmobileno()+" | "+s.getStudentemailid()+" | "+s.getStudentinstname()+" | "+s.getStudentpercentage());
				
				
		break;
		}
		case 3:
		{
				
				List<Student> students=stdao.selectAllStudent();
				students.stream().forEach(System.out::println);
				
				
		break;
		}
		case 4:
		{
				System.out.println("enter student id");
				int id=sc.nextInt();
				boolean res=stdao.deleteStudent(id);
				
				if(res)
				{
					System.out.println("student deleted successfully");
				}
				else
				{
					System.out.println("no student with that id");
				}
				
		break;
		}
		case 5:
		{
			System.out.println("enter student id, name, mobile no, emailid, institute name, percenatage");
			Student s=new Student();
			s.setStudentid(sc.nextInt());
			s.setStudentname(sc.next());
			s.setStudentmobileno(sc.nextLong());
			s.setStudentemailid(sc.next());
			s.setStudentinstname(sc.next());
			s.setStudentpercentage(sc.nextDouble());
			System.out.println(s.getStudentid());
			boolean res=stdao.updateStudent(s);
			
			if(res)
			{
			System.out.println("student updated successfully");
			}
			else
			{
				System.out.println("invalid id given");
			}
				
		break;
		}
		case 6:
		{
			System.out.println("good bye");
		break;
		}
			

		default:
				System.out.println("invalid entry");
			break;
		}		
		}while(choice!=6);
		

	}

}
