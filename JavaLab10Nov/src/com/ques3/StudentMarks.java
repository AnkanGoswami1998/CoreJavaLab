//// Student Rank
//// Ankan Goswami
//// Lab Test
//// 10th november
package com.ques3;

import java.util.Scanner;

public class StudentMarks { //// Starting of class

	public static void main(String args[]) { /// Starting of main

		int n, total = 0, percentage; //// Declaring variables

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects:"); //// Taking the number of the subjects by the user
		n = sc.nextInt();

		int marks[] = new int[n];
		System.out.println("Enter the marks of student"); //// Taking the marks of the student
		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
			total = total + marks[i];

		}
		percentage = total / n; //// Calculating the percentage

		System.out.println("Your total number is: " + total);
		System.out.println("Your percentage is: " + percentage);

		if (percentage >= 80) { //// Checking the rank
			System.out.println("Your rank is A");
		} else if (percentage >= 60) {
			System.out.println("Your rank is B");
		} else if (percentage >= 40) {
			System.out.println("Your rank is C");
		} else {
			System.out.println("You have failed the examination");

		} //// End of main

	} //// End of class

}
