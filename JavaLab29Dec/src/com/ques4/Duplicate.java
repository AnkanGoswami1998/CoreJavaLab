////ques4 = Duplicates in a string
//// 29 Dec
//// Ankan Goswami

package com.ques4;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) { //// main started

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in); //// input by user
		String a = sc.next();
		char[] c = a.toCharArray();
		System.out.println("The String is: " + a);
		System.out.println("Duplicate charracters in above String are: "); //// printing the duplicates
		for (int i = 0; i < a.length(); i++) { //// logic of duplicates
			for (int j = i + 1; j < a.length(); j++) {
				if (c[i] == c[j]) {
					System.out.println(c[j]);

				}
			}
		}

	}

}
