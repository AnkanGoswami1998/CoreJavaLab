////25th Jan
////Project on SpringBoot
////Controller Class
////Ankan Goswami

package com.example.records.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.records.Entity.Book;
import com.example.records.Service.BookService;
import com.example.records.Service.Exception.BookAlreadyExistsException;
import com.example.records.Service.Exception.BookNotFoundException;

@RestController
public class BookController {
	
	
	@Autowired
	private BookService bs;
	
	public BookController(BookService bs) {
		this.bs = bs;
	}
	
	//// To get all Book Details
	@GetMapping("/view")
	public ResponseEntity<List> getAllBoks() throws BookNotFoundException{
		return new ResponseEntity<List>((List)bs.getAllBooks(),HttpStatus.OK);
	}
	
	//// To add new Book Details
	 @PostMapping("/add")
	    public ResponseEntity saveBook(@RequestBody Book b) throws BookAlreadyExistsException {
	        Book savedBook = bs.saveBook(b);
	        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);

	    }
	 
	 //// To get Book Details by Id
	 @GetMapping("/get/{id}")
		public ResponseEntity getBookById(@PathVariable int id) throws BookNotFoundException{
			return new ResponseEntity(bs.getBookById(id),HttpStatus.OK);
		}


}
