package com.src.dao;

import java.util.List;

import com.src.model.Book;

public interface BookDaoInterface {
	
	public int saveBook(Book b);
	public int updateBook(Book b);
	public int deleteBook(Book b);
	public List<Book> displayAllBooks();

}
