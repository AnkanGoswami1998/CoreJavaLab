//// Java Lab Test ques no 1(Creating of a contact book)
//// 8th December
//// Ankan Goswami

package com.ques1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Contact {

	public static void main(String[] args) { //// Main Started

		Set<String> s1 = new TreeSet<>(); //// Creating Three set
		Set<String> s2 = new TreeSet<>();
		Set<String> s3 = new TreeSet<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name,Phone no,Email ID"); //// Taking inputs by users
		String n1 = sc.next();
		String p1 = sc.next();
		String e1 = sc.next();
		System.out.println("Enter Name,Phone no,Email ID");
		String n2 = sc.next();
		String p2 = sc.next();
		String e2 = sc.next();
		System.out.println("Enter Name,Phone no,Email ID");
		String n3 = sc.next();
		String p3 = sc.next();
		String e3 = sc.next();

		s1.add(n1); //// Adding the details in the sets
		s1.add(p1);
		s1.add(e1);
		s2.add(n2);
		s2.add(p2);
		s2.add(e2);
		s3.add(n3);
		s3.add(p3);
		s3.add(e3);

		System.out.println("---------The Details Are------------"); //// Printing the details
		System.out.println("[PhoneNumber,Name,  Email]");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	} //// main ended

}
