////ques3= Reverse of a string
//// 29 Dec
//// Ankan Goswami

package com.ques3;

public class Reverse {

	public static String reverseString(String str) {

		char ch[] = str.toCharArray(); //// Logic applied
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;

	}

}
