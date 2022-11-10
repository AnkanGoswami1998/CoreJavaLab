//// Do matrix multiplication 
//// Ankan Goswami
//// Lab Test
//// 10th november

package com.ques4;

import java.util.Scanner;

public class matrixMultiplication { //// Class started

	public static void main(String args[]) { //// Main Started

		int a[][], b[][], c[][], i, j, k; //// Declaring variables
		a = new int[3][3];
		b = new int[3][3];
		c = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First matrix"); //// Enter the matrix numbers

		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				a[i][j] = sc.nextInt();

		System.out.println("Enter Second matrix");

		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				b[i][j] = sc.nextInt();

		for (i = 0; i < 3; i++) { ///// Logic of matrix multiplication
			for (j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (k = 0; k < 3; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("Multiplication Result.............."); //// Printing the multiplication Result
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	} //// End of main

} //// End of class
