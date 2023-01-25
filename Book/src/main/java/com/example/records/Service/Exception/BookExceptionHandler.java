////25th Jan
////Project on SpringBoot
////Exception Handling class
////Ankan Goswami

package com.example.records.Service.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BookExceptionHandler {
	@ExceptionHandler(value= {BookNotFoundException.class})
	 public ResponseEntity<Object> handleBlogNotFoundException(BookNotFoundException bookNotFoundException)
	    {
	    	BookException bookException = new BookException(
	    			bookNotFoundException.getMessage(),
	    			bookNotFoundException.getCause(),
	    			HttpStatus.NOT_FOUND);
	    	return new ResponseEntity<>(bookNotFoundException,HttpStatus.NOT_FOUND);
	    }

}
