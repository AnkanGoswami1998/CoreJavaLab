//// Ques2 =wap to find sum of digits
//// 29th Dec
//// Ankan Goswami

package com.ques2;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {

		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();

		while (n > 0) {

			//// Find the last digit
			int digit = n % 10;

			//// add last digit to the variable sum;
			sum = sum + digit;

			//// removes the last digit from the number
			n = n / 10;
		}

		//// print the result
		System.out.println("Sum of digits: " + sum);

	}

}
