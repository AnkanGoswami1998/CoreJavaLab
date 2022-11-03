/// WAP to print diamond pattern
/// Author = Ankan Goswami
/// Date = 03/11/22

package com.ques1;

import java.util.Scanner; /// importing scanner package

public class Diamond { /// Start of class

	static void DiamondPattern() { /// Start of mrthod DiamondPattern
		int i, j, k, num; /// Declaing Variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stars"); /// taking input by users
		num = sc.nextInt();
		for (i = 1; i <= num; i++) { /// Rows
			for (j = num; j > i; j--) { /// Space(Coloums)
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("* "); /// Printing Stars
			}
			System.out.println();
		}
		/// Reverse method

		for (i = (num - 1); i >= 1; i--) { /// Rows
			for (j = num; j > i; j--) { /// Coloums
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	} /// End of DiamondPattern

	public static void main(String args[]) {

		DiamondPattern(); /// Calling the method
	} /// end of main
} /// End of class
