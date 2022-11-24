//// Automate the University Management System to print details of Student & employees
//// Ankan Goswami
//// 24th November

package com.ques1;

import java.util.Scanner;

public class Test {

	public static void Student() { //// Creating a method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student First name: "); //// Student Details by User
		String first = sc.next();
		System.out.println("Enter Student Last name: ");
		String last = sc.next();
		System.out.println("Enter Student's age: ");
		int age = sc.nextInt();
		System.out.println("Enter Student Course: ");
		String course = sc.next();
		System.out.println("Enter Student ID: ");
		int id = sc.nextInt();
		System.out.println("Student Name: " + first + " " + last); //// Printing StudentDetails
		System.out.println("Student Age: " + age);
		System.out.println("Student Course: " + course);
		System.out.println("Student ID: " + id);
	}

	public static void Employee() { //// Creating a method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee First name: "); //// Employee Details by User
		String first = sc.next();
		System.out.println("Enter Employee Last name: ");
		String last = sc.next();
		System.out.println("Enter Employee's age: ");
		int age = sc.nextInt();
		System.out.println("Enter Employee Salary: ");
		int salary = sc.nextInt();
		System.out.println("Enter Employee Department: ");
		String dept = sc.next();
		System.out.println("Enter Employee Designation: ");
		String des = sc.next();
		System.out.println("Enter Employee ID: ");
		int id = sc.nextInt();
		System.out.println("Employee Name: " + first + " " + last); //// Printing EmployeeDetails
		System.out.println("Employee Age: " + age);
		System.out.println("Employee Salary: " + salary);
		System.out.println("Employee Department: " + dept);
		System.out.println("Employee Designation: " + des);
		System.out.println("Employee ID: " + id);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Student or A Employee....."); //// Choice by user
		System.out.println("1: Student");
		System.out.println("2: Employee");
		System.out.println("Enter your Choice.....");
		int choice = sc.nextInt();
		if (choice == 1) { //// If else Function
			Student(); //// Calling Student method if choice is 1
		} else if (choice == 2) {
			Employee(); //// Calling Employee method if choice is 1
		} else {
			System.out.println("Wrong Input");
		}
	}

} //// End of class
