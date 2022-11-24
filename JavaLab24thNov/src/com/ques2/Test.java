//// Testing both class
//// Ankan Goswami
//// 24th November

package com.ques2;

public class Test {

	public static void main(String args[]) {

		Parent p = new Parent();
		Sub s = new Sub(); ///// Creating object of both Class

		p.ShowDetails();
		s.ShowMethod(); //// Calling methods by Objects
		s.ShowDetails();

	}

}
