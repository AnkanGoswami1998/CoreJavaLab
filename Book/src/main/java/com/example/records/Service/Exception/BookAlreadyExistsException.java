////25th Jan
////Project on SpringBoot
////User Defined Exception Class
////Ankan Goswami

package com.example.records.Service.Exception;

public class BookAlreadyExistsException extends RuntimeException{
	
	 private String message;

	    public BookAlreadyExistsException(String message) {
	        super(message);
	        this.message = message;
	    }

}
