//// Java lab test:- WAP to check a number prime or not
//// 22nd December
//// Ankan Goswami

package com.ques1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) { //// Main Started

		int c = 0; //// Declaring variable
		Scanner sc = new Scanner(System.in); //// Taking number from user
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) { //// Logic of prime number
			if (num % i == 0) { //// it the divide the number from 1 to that number see how many times the
								//// reminder is 0
				c++;
			}
		}
		if (c == 2) { //// If the reminder is 2 times then its a prime number
			System.out.println("Its a prime number");
		} else { //// otherwise its not a prime number
			System.out.println("Its not a prime number");
		}

	} /// end of main

}
