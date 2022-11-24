////Creating class to print Details
//// Ankan Goswami
//// 24th November
package com.ques3;

public class Test {

	public static void main(String args[]) {

		Employee e = new Employee(); //// Making object of Employee Class
		e.name = "Ankan Goswami"; //// giving the details
		e.age = 23;
		e.num = "7980165487";
		e.adress = "Kolkata";
		e.salary = 50000;

		Manager m = new Manager(); //// Making object of Manager Class
		m.name = "Shakti Shaw"; //// giving details
		m.age = 35;
		m.num = "8320256456";
		m.adress = "Mumbai";
		m.salary = 90000;

		System.out.println("------------Employee Details--------------"); //// Printing the details
		System.out.println("Name: " + e.name);
		System.out.println("Age: " + e.age);
		System.out.println("Phone Number: " + e.num);
		System.out.println("Adress: " + e.adress);
		System.out.println("Salary: " + e.salary);
		System.out.println("------------Manager Details--------------");
		System.out.println("Name: " + m.name);
		System.out.println("Age: " + m.age);
		System.out.println("Phone Number: " + m.num);
		System.out.println("Adress: " + m.adress);
		System.out.println("Salary: " + m.salary);

	}

} //// end of class
