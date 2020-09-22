package com.example.RestApplicationDemo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.RestApplicationDemo.Entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
