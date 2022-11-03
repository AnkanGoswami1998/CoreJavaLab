/// WAP to add money on PiggieBank
/// Author = Ankan Goswami
/// Date = 03/11/22
package com.ques3;

import java.util.Scanner;

public class Ans {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in); /// input by users
		System.out.println("Enter the added money");
		int extra = sc.nextInt();

		/// AddAmount a = new AddAmount();
		AddAmount a = new AddAmount(extra); /// Calculating total money
		/// a.displayAmount(); /// printing initial money
		a.displayAmount(); /// Printing total money
	} /// end of class

} /// end of main
