package springwithAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Student s=context.getBean("std",Student.class);
		System.out.println(s);
		
		Student s1=context.getBean("std1",Student.class);
		System.out.println(s1);
	}

}
