package com.src.model;

public class Book {

	private int bookid;
	private String bookname;
	private String bookauthor;
	private String bookpublisher;
	private double bookprice;
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookpublisher="
				+ bookpublisher + ", bookprice=" + bookprice + "]";
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public String getBookpublisher() {
		return bookpublisher;
	}
	public void setBookpublisher(String bookpublisher) {
		this.bookpublisher = bookpublisher;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	public Book(int bookid, String bookname, String bookauthor, String bookpublisher, double bookprice) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookpublisher = bookpublisher;
		this.bookprice = bookprice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid) {
		super();
		this.bookid = bookid;
	}
	
	
	
}
