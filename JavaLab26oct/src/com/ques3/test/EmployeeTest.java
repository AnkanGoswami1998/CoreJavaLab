/*
 * Employee report class
 * @Author: Ankan Goswami
 * @Date:26 Oct 2022
 */

//declaring a package
package com.ques3.test;

import java.util.Scanner; //// importing scanner package

//importing employee package
import com.ques3.demo.Employee;

//declaring a class
public class EmployeeTest {

	// main method
	public static void main(String args[]) {

		// creating object of Employee class
		Employee e1 = new Employee();

		// declaring an object of Scanner
		Scanner sc = new Scanner(System.in);

		// declaring variables
		int id;
		String name, department;
		float salary;

		// taking input by users
		System.out.println("Enter the Employee name: ");
		name = sc.nextLine();
		System.out.println("Enter the Employee id: ");
		id = sc.nextInt();
		System.out.println("Enter the Employee department: ");
		department = sc.next();
		System.out.println("Enter the Employee Salary: ");
		salary = sc.nextFloat();

		// call the method getDetails
		e1.getDetails(id, name, department, salary);

		System.out.println("----------------------");
		System.out.println("----------------------");

		e1.printDetails();

		sc.close();

	} //// end of main
} //// end of class
