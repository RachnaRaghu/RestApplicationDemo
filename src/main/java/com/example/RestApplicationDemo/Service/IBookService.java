package com.example.RestApplicationDemo.Service;

import com.example.RestApplicationDemo.Entity.Book;

public interface IBookService {
	
	
	
	public void saveBook(Book books);

	public Book getBookbyId(int id);

}
