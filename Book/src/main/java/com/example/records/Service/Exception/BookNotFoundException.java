////25th Jan
////Project on SpringBoot
////Another User Defined Exception Class
////Ankan Goswami

package com.example.records.Service.Exception;

public class BookNotFoundException extends RuntimeException{
	
	 private String message;

	    public BookNotFoundException(String message) {
	        super(message);
	        this.message = message;
	    }

	    public BookNotFoundException() {
	    }
	    public BookNotFoundException(String message,Throwable cause)
	    {
	    	super(message,cause);
	    }

}
