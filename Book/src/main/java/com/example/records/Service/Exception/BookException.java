////25th Jan
////Project on SpringBoot
////Another Exception Class
////Ankan Goswami

package com.example.records.Service.Exception;

import org.springframework.http.HttpStatus;

public class BookException {
	
	 private final String message;
	   private final Throwable throwable;
	   private final HttpStatus httpstatus;
	public BookException(String message, Throwable throwable, HttpStatus httpstatus) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpstatus = httpstatus;
	}
	public String getMessage() {
		return message;
	}
	public Throwable getThrowable() {
		return throwable;
	}
	public HttpStatus getHttpstatus() {
		return httpstatus;
	}

}
