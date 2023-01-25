////25th Jan
////Project on SpringBoot
////Service Interface 
////Ankan Goswami

package com.example.records.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.records.Entity.Book;
import com.example.records.Service.Exception.BookAlreadyExistsException;
import com.example.records.Service.Exception.BookNotFoundException;

@Component
public interface BookService {
	

	 //// Creating Different methods
    Book saveBook(Book b) throws BookAlreadyExistsException;
    List getAllBooks() throws BookNotFoundException; 
    Book getBookById(int id) throws BookNotFoundException;

}
