package com.src.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.src.model.Book;

public class BookDao implements BookDaoInterface{

	private JdbcTemplate jdbctemp;
	
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	@Override
	public int saveBook(Book b) {
		String query="insert into Book values("+b.getBookid()+",'"+b.getBookname()+"','"+b.getBookauthor()+"',"
				+ "'"+b.getBookpublisher()+"',"+b.getBookprice()+")";		
		return jdbctemp.update(query);
	}

	

	@Override
	public int updateBook(Book b) {
		String query="update book set bookname='"+b.getBookname()+"',bookauthor='"+b.getBookauthor()+"',"
				+ "bookpublisher='"+b.getBookpublisher()+"',bookprice="+b.getBookprice()+" where bookid="+b.getBookid();
		return jdbctemp.update(query);
	}

	@Override
	public int deleteBook(Book b) {
		String query="delete from book where bookid="+b.getBookid();
		return jdbctemp.update(query);
	}

	@Override
	public List<Book> displayAllBooks() {
			return jdbctemp.query("select * from book", new RowMapper<Book>() {
			public Book mapRow(ResultSet rs,int row) throws SQLException {
				Book b=new Book();
				b.setBookid(rs.getInt(1));
				b.setBookname(rs.getString(2));
				b.setBookauthor(rs.getString(3));
				b.setBookpublisher(rs.getString(4));
				b.setBookprice(rs.getDouble(5));
				return b;
			}
		});		
	}
	
	public List<Book> displayAllBooks1() {
			return jdbctemp.query("select * from book", (rs,row)->{
				Book b=new Book();
				b.setBookid(rs.getInt(1));
				b.setBookname(rs.getString(2));
				b.setBookauthor(rs.getString(3));
				b.setBookpublisher(rs.getString(4));
				b.setBookprice(rs.getDouble(5));
				return b;
			
		});
		
	}

}
