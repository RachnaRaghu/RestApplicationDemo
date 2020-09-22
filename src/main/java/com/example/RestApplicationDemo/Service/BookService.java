package com.example.RestApplicationDemo.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApplicationDemo.Entity.Book;
import com.example.RestApplicationDemo.repo.BookRepository;

@Service
public class BookService implements IBookService{
	
	@Autowired
	BookRepository bookrepo;

	@Override
	public Book getBookbyId(int id) {
		Book bookId = bookrepo.findById(id).get();
		return bookId;
	}

	@Override
	public void saveBook(Book book) {
		bookrepo.save(book);
		
		
	}
	
	
}
