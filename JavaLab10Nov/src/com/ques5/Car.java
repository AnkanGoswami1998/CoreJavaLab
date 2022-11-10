////Car Details
////Ankan Goswami
//// Lab Test
//// 10th november
package com.ques5;

import java.util.Scanner;

public class Car { //// Starting of class

	public static void main(String args[]) { //// Starting of main

		int i, n; //// Declaring variables

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Cars...");
		n = sc.nextInt(); //// taking number of Cars by the user

		String[] name = new String[n]; //// Declaring arrays
		int[] model = new int[n];
		System.out.println("Enter the names of the cars..");
		for (i = 0; i < n; i++) {
			name[i] = sc.next().toUpperCase(); //// Taking the name of the cars by users
		}
		System.out.println("Enter the models of the cars..");
		for (i = 0; i < n; i++) {
			model[i] = sc.nextInt(); //// Taking the model no by users
		}

		System.out.println("The Car Details are"); //// Printing the details of the cars
		for (i = 0; i < n; i++) {
			System.out.println("Car Name: " + name[i]);
			System.out.println("Model Num: " + model[i]);
		}

	} //// End of main

} //// End of class
