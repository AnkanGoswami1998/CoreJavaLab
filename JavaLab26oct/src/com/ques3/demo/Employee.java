/*
 * Student Class
 * @Author:Ankan Goswami
 * @Date:26 Oct 2022
 */

//declaring a package
package com.ques3.demo;

//declaring a class
public class Employee {

	// instance variables
	int sid;
	String name;
	String department;
	float salary;

	// method to get the details
	public void getDetails(int id, String n, String d, float s) {
		sid = id;
		name = n;
		department = d;
		salary = s;

	}

	// method for printing details
	public void printDetails() {
		System.out.println("------Student Details are-------");
		System.out.println("Employee id: " + sid);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Department: " + department);
		System.out.println("Employee Salary: " + salary + " Rupees");

	}
} //// end of class
