//// User Defined Exceptions or Custom Exceptions
////Creating our own exception of MenuException
////Ankan Goswami
//// 17th Nov
package com.ques3;

public class MenuException extends Exception {

	public MenuException(String str) {

		super(str);
		System.out.println("Invalid input");

	}

}
