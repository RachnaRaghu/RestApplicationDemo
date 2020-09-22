package com.example.RestApplicationDemo;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;

import com.example.RestApplicationDemo.Controller.BookController;
import com.example.RestApplicationDemo.Entity.Book;
import com.example.RestApplicationDemo.Service.IBookService;


@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
@WebMvcTest(BookController.class)
@AutoConfigureMockMvc
public class BookControllerTest {


    @Autowired
	MockMvc mvc;

	
	BookController bookController;
	@MockBean
	IBookService bookService;
	
	
	@BeforeEach
	public void setUp()
	{
		bookController = new BookController();
		ReflectionTestUtils.setField(bookController, "bookService", bookService);
	}
	
	@Test
	public void getBookByIdTest() throws Exception {
		Book book = new Book();
		book.setBookId(8);
		book.setBookName("SpringApplication");
		when(bookService.getBookbyId(anyInt())).thenReturn(book);
		
       
		mvc.perform(get("/books/4")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk());
			   
	}
	
	
}
