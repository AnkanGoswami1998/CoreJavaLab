////Creating a calculator with excepion handling
////Ankan Goswami
////17th November

package com.ques4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator { ///// Starting of class

	public static void main(String args[]) {

		try { ///// Try method
			double a, b;
			System.out.println("Enter two numbers....."); //// Numbers by users
			Scanner sc = new Scanner(System.in);
			a = sc.nextDouble();
			b = sc.nextDouble();

			System.out.println("+ = Addition"); //// Calculator menu
			System.out.println("- = Subtraction");
			System.out.println("* = Multiplication");
			System.out.println("/ = Division");
			System.out.println("Enter your choice.....");

			String choice = sc.next(); //// Taking choice of calculation

			switch (choice) { //// SwitchCase
			case "+" -> System.out.println("The Result is: " + (a + b));
			case "-" -> System.out.println("The Result is: " + (a - b));
			case "*" -> System.out.println("The Result is: " + (a * b));
			case "/" -> System.out.println("The Result is: " + (a / b));
			default -> System.out.println("Wrong Input");
			}
		} catch (InputMismatchException | ArithmeticException e) { //// Catch Method
			System.out.println(e.getMessage());
		}

	}

} //// End of class
