///// Applying the created exception in this programme
///// Ankan Goswami
///// 17th Nov

package com.ques3;

import java.util.Scanner;

public class GameMenu {

	static void checkMenu(int num) throws MenuException {

		if (num > 3) {
			throw new MenuException(" "); ///// Applying user defined Exception
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1 = Start");
		System.out.println("2 = Continue");
		System.out.println("3 = Quit");
		System.out.println("Enter Your Choice....");
		int choice = sc.nextInt();

		try {
			switch (choice) {
			case 1 -> System.out.println("Starting the game...........");
			case 2 -> System.out.println("Continuing the game.........");
			case 3 -> System.out.println("Quiting......");
			}
			checkMenu(choice);
		} catch (Exception e) { ////// If we put other values than 1,2 or 3 it will show invalid output
			System.out.println(e.getMessage());
		}

	}

}
