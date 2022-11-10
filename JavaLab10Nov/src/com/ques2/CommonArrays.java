////Common Elements of Array 
//// Ankan Goswami
//// Lab Test
//// 10th november
package com.ques2;

import java.util.Scanner;

public class CommonArrays { ///// Start of class

	public static void main(String args[]) { ///// Main Started
		int[] a = new int[6]; //// Declaring variable &array size
		int[] b = new int[6];
		int i, j;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Six Elements of the First Array...."); //// Taking array elements by users
		for (i = 0; i < 6; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Six Elements of the Second Array...."); //// Taking array elements by users
		for (i = 0; i < 6; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("The Common Elements are......."); //// Printing the common elements of two Arrays
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				if (a[i] == b[j])
					System.out.print(a[i] + " "); //// Common elements printed

			}
		}
	}

}
