/*
 * Number Table Class
 * @Author: Ankan Goswami
 * @Date:26 Oct 2022
 */

//declaring a package
package com.ques4;

import java.util.Scanner; //Declaring Scanner package

///Starting of class
public class NumberTable {

	static void printTable() {

		Scanner sc = new Scanner(System.in);
		int num; /// Declaring variables

		System.out.println("Enter the number"); /// input by users
		num = sc.nextInt();

		for (int i = 1; i <= 10; i++) { /// For loop
			System.out.println(num * i);

		}
	}

	public static void main(String[] args) { /// Starting of main

		printTable(); /// Calling the method

	} //// End of main

} //// End of class
