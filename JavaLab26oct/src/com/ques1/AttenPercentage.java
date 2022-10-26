/*
 * Student Attendence Class
 * @Author: Ankan Goswami
 * @Date:26 Oct 2022
 */

//declaring a package
package com.ques1;

import java.util.Scanner;

public class AttenPercentage {

////method to calculate grade
	public static void CalcPercentage(float attendence, float total) {

		float per;
		per = (attendence / total) * 100; //// Calculating percentage

		printAttendence(per); /// calling method to printAttendence

	} /// end of method

////method to give condition
	public static void printAttendence(float per) {
		if (per >= 75) /// if else conditions
			System.out.println("You are eligible to sit in the exam with " + per + " percent attendence");
		else
			System.out.println("Sorry!!!!you are not eligible to sit in the exam as your attendence is too low");

	}//// end of method

	public static void main(String args[]) //// Starting of main

	{
		Scanner sc = new Scanner(System.in);

		float attendence, total; //// declaring variables

		System.out.println("Enter the number of classes held: ");
		total = sc.nextFloat(); //// giving inputs by users
		System.out.println("Enter the number of classes you attended: ");
		attendence = sc.nextFloat();

		CalcPercentage(attendence, total); /// Calling method to calPercentage

	} //// End Of main
} //// End of class
