////ques3= Decimal to binary
//// 29 Dec
//// Ankan Goswami

package com.ques1;

import java.util.Scanner;

public class Convert {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:"); //// input by user
		int i = sc.nextInt();
		System.out.println(Integer.toBinaryString(i)); //// printing the binary number
	}

}
