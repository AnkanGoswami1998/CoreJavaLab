//// Java Lab Test ques no 3(Creating criteria of ABC company salary increment)
//// 8th December
//// Ankan Goswami

package com.ques3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ABC {

	public static void main(String[] args) { //// main started

		Scanner sc = new Scanner(System.in);
		Map<String, Integer> m = new TreeMap<>(); //// Making a map
		m.put("ANKAN", 2);//// Putting names & years of work inside the map
		m.put("AKASH", 4);
		m.put("KESHAV", 5);
		m.put("ANIL", 6);
		m.put("ABIR", 1);
		m.put("ARNAB", 3);
		System.out.println("Enter the name of the Employee"); //// Getting the name of employee by the company
		String name = sc.next().toUpperCase();
		int y = m.get(name);
		if (y > 3) { //// if else program to see if the employe eligible for the increment or not
			System.out.println("Congratulations,You have achieved the 10% Salary increment.");
		} else {
			System.out.print("You have to work " + (3 - y) + " year/years more to get this increment");
		}

	} //// main ended

}
