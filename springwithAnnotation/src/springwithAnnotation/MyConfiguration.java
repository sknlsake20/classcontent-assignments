package springwithAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@Bean(name="std")
	public Student getStudentConstructor()
	{
		return new Student(678,"shiva","hyd");
	}
	
	
	@Bean(name="std1")
	public Student getStudentSetter()
	{
		Student s=new Student();
		s.setStudentid(567);
		s.setStudentname("kumar");
		s.setStudentaddress("sec");
		return s;
	}

}
