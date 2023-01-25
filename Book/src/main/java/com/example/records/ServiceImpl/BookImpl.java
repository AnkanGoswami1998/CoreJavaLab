////25th Jan
////Project on SpringBoot
////Service impletentation class which implements methods of Service Interface
////Ankan Goswami

package com.example.records.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.records.Entity.Book;
import com.example.records.Repository.BookRepository;
import com.example.records.Service.BookService;
import com.example.records.Service.Exception.BookNotFoundException;

@Service
public class BookImpl implements BookService {

	@Autowired
	private BookRepository br;  //// Creating object of BookRepository
	@Override
	public Book saveBook(Book b) {  //// to add books
		
	
		return br.save(b);
	}

	@Override
	public List getAllBooks() {  //// to get all books
		
		return (List) br.findAll();
	}

	@Override
	public Book getBookById(int id) { ////to get book by id
		
		if(br.findById(id).isEmpty()) {
			throw new BookNotFoundException("Book Not Found");
			
		}
		
		return br.findById(id).get();
	}

}
