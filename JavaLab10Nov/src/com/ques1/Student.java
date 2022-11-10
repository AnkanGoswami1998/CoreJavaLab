////Student Details
////Ankan Goswami
//// Lab Test
//// 10th november
package com.ques1;

import java.util.Scanner;

public class Student { //// Starting of class

	public static void main(String args[]) { //// Starting of main

		String[] name = new String[3]; //// Declaring arrays & variables
		int[] roll = new int[3];
		int[] marks = new int[3];
		int i;

		Scanner sc = new Scanner(System.in); //// Taking name of stdents by user
		System.out.println("Enter The Names");
		for (i = 0; i < 3; i++) {
			name[i] = sc.next().toUpperCase();
		}

		System.out.println("Enter the Roll numbers"); //// Taking Roll No of stdents by user
		for (i = 0; i < 3; i++) {
			roll[i] = sc.nextInt();
		}

		System.out.println("Enter the Marks"); //// Taking Marks of stdents by user
		for (i = 0; i < 3; i++) {
			marks[i] = sc.nextInt();
		}

		System.out.println("The Student Details are......."); //// Printing the details
		for (i = 0; i < 6; i++) {
			System.out.println("Name: " + name[i]);
			System.out.println("Roll No: " + roll[i]);
			System.out.println("Marks: " + marks[i]);
		}

	} //// End of class

} //// End of main
