package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO implements BookDAOImpl {

	@Override
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driverclass);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/personaldb", "root","password");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public void insertBooks(Book b) {
		String query="insert into book values(?,?,?,?,?)";
		try (Connection con=getConnection()){
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,b.getBookid());
			ps.setString(2,b.getBookname());
			ps.setString(3,b.getBookauthor());
			ps.setString(4,b.getBookgenre());
			ps.setInt(5,b.getBookcost());
			ps.executeUpdate();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	}

	@Override
	public Book selectBook(int id) {
		Book bok=null;
		String query="select*from book where bookid=?";
		try (Connection con=getConnection()){
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				bok=new Book();
				bok.setBookid(id);
				bok.setBookname(rs.getString(2));
				bok.setBookauthor(rs.getString(3));
				bok.setBookgenre(rs.getString(4));
				bok.setBookcost(rs.getInt(5));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return bok;
	}

	@Override
	public List<Book> SelectAllBook() {
		List<Book>list=new ArrayList();
		String query="Select*from book";
		try (Connection con=getConnection()){
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Book book=new Book();
				book.setBookid(rs.getInt(1));
				book.setBookname(rs.getString(2));
				book.setBookauthor(rs.getString(3));
				book.setBookgenre(rs.getString(4));
				book.setBookcost(rs.getInt(5));
				list.add(book);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean deleteBook(int id) {
		boolean result=false;
		String query="delete from book where bookid=?";
		try (Connection con=getConnection()){
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			result=ps.executeUpdate()>0;
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean updateBook(Book b) {
		boolean result=false;
		String query="update  book set bookname=?,bookauthor=?,bookgenre=?,bookcost=? where bookid=? ";
		try (Connection con=getConnection()){
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,b.getBookname());
			ps.setString(2,b.getBookauthor());
			ps.setString(3,b.getBookgenre());
			ps.setInt(4,b.getBookcost());
			ps.setInt(5,b.getBookid());
			result=ps.executeUpdate()>0;
			
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return result;
	}

}
