/////5 Functions of Strings in java
///// Ankan Goswami
///// 17th November

package com.ques2;

import java.util.Scanner;

public class Strings {

	public static void main(String args[]) { //// Starting of main

		Scanner sc = new Scanner(System.in); //// Scanner object
		System.out.println("Enter a word");
		String word = sc.next(); //// Input by user
		String name = "Anudip";

		System.out.println(name.concat(" Foundation")); //// joining of two strings using concat
		System.out.println(word.toUpperCase()); //// Convert the whole string in upper case
		System.out.println(word.length()); ///// to print the length of the string
		System.out.println(word.charAt(3));///// to know the value of the string at index 3
		System.out.println(name.indexOf('d'));///// to the index number of a certain letter in a string
		System.out.println(name.equals(word));///// to see two strings are equal or not
		System.out.println(name.replace('u', 'o'));///// to replace a letter in a string
	}
}
