package com.example.RestApplicationDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApplicationDemo.Entity.Book;
import com.example.RestApplicationDemo.Service.IBookService;

@RestController
public class BookController {
	
	@Autowired
	IBookService bookService;
	
	@GetMapping(value = "/books/{bookId}")
	public Book getBookById(@PathVariable int bookId) {
		return bookService.getBookbyId(bookId);
		
	}
	
	@PostMapping(value = "/saveBook")
	public int saveBook(Book book) {
		bookService.saveBook(book);
		return book.getBookId();
	}

}
