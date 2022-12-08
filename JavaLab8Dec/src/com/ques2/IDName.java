//// Java Lab Test ques no 2(Creating of a contact book)
//// 8th December
//// Ankan Goswami

package com.ques2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class IDName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<Integer, String> m = new TreeMap<>(); //// Making a map
		System.out.println("Enter the Id(123-128)"); //// Taking id from user
		int num = sc.nextInt();
		m.put(123, "Ankan"); //// Putting keys & values inside the map
		m.put(124, "Akash");
		m.put(125, "Keshav");
		m.put(128, "Anil");
		m.put(126, "Abir");
		m.put(127, "Arnab");

		//// System.out.println(m.entrySet());
		System.out.println("The Student name is: " + m.get(num)); //// getting the values of the id given by the user

	}

}
