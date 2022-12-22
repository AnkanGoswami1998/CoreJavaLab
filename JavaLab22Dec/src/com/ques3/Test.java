////Creating class to print Details
//// Ankan Goswami
//// 22nd December
package com.ques3;

public class Test {

	public static void main(String[] args) {

		Employee e = new Employee();//// Making object of Employee Class
		e.name = "Ankan Goswami";//// giving details
		e.age = 22;
		e.phone = "7980165544";
		e.adress = "Kolkata";
		e.salary = 40000;

		Manager m = new Manager();//// Making object of Manager Class
		m.name = "Pranav Shaw"; //// giving details
		m.age = 45;
		m.phone = "8325646456";
		m.adress = "Mumbai";
		m.salary = 85000;

		System.out.println("------------Employee Details--------------"); //// Printing the details
		System.out.println("Name: " + e.name);
		System.out.println("Age: " + e.age);
		System.out.println("Phone Number: " + e.phone);
		System.out.println("Adress: " + e.adress);
		System.out.println("Salary: " + e.salary);
		System.out.println("------------Manager Details--------------");
		System.out.println("Name: " + m.name);
		System.out.println("Age: " + m.age);
		System.out.println("Phone Number: " + m.phone);
		System.out.println("Adress: " + m.adress);
		System.out.println("Salary: " + m.salary);

	}

}
