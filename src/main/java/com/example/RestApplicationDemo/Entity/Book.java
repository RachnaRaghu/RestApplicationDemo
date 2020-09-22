package com.example.RestApplicationDemo.Entity;

import javax.persistence.Entity;

@Entity
public class Book {
	private int bookId;
	private String BookName;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", BookName=" + BookName + "]";
	}
	
	
	

}
