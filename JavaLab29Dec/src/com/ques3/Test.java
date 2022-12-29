////ques3= Reverse of a string
//// 29 Dec
//// Ankan Goswami

package com.ques3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string"); //// Input by user
		String a = sc.next();
		String b = Reverse.reverseString(a); //// Calling the method
		System.out.println("The reverse string is:" + b);

	}

}
