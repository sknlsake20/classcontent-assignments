package com.src;

public class Book 
{
	private int bookid;
	private String bookname;
	private String bookauthor;
	private String bookgenre;
	private int bookcost;
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
	public String getBookgenre() {
		return bookgenre;
	}
	public void setBookgenre(String bookgenre) {
		this.bookgenre = bookgenre;
	}
	public int getBookcost() {
		return bookcost;
	}
	public void setBookcost(int bookcost) {
		this.bookcost = bookcost;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookgenre="
				+ bookgenre + ", bookcost=" + bookcost + "]";
	}

	

}
