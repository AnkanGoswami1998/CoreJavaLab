//// Java lab test:- WAP to check a number palindrome or not
//// 22nd December
//// Ankan Goswami

package com.ques2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int r, c = 0, s = 0; //// Declaring variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt(); /// Taking number from user
		c = num;

		while (num > 0) { //// Logic of palindrome number
			r = num % 10;
			s = (s * 10) + r;
			num = num / 10;
		}
		if (c == s) {
			System.out.println("Its a palindrome number");
		} else {
			System.out.println("Its not a palindrome number");
		}

	} //// End of main

}
