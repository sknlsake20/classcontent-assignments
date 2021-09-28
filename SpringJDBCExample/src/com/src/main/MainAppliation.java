package com.src.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.src.dao.BookDao;
import com.src.model.Book;

public class MainAppliation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookDao dao=(BookDao) context.getBean("bookdao");
		
//		int status=dao.saveBook(new Book(678,"cpp","mohil","coimbatore publishers",300));
		
		//int status =dao.updateBook(new Book(234,"advance java","shiva kumar","hyderabad publishers",1000));
		
//		int status =dao.deleteBook(new Book(234));
//		
//		if(status >0)
//		{
//			System.out.println("values deleted successfully");
//		}
//		else
//		{
//			System.out.println("unable to delete");
//		}
		
		
		List<Book> l=dao.displayAllBooks1();
		for(Book books:l)
		{
			System.out.println(l);
		}
		
		
	} 
 
}
