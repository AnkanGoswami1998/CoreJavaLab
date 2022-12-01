//// Java Ques3 on thread lab test
//// Ankan Goswami
//// 1st December
package com.ques3;

public class Test {

	public static void main(String[] args) throws InterruptedException { ///// Is to execute those threads
		// TODO Auto-generated method stub

		Vechile1 v1 = new Vechile1();
		Vechile2 v2 = new Vechile2();
		Vechile3 v3 = new Vechile3();
		Vechile4 v4 = new Vechile4();
		Vechile5 v5 = new Vechile5();

		v1.start(); //// Starting first thread

		v1.sleep(5000);

		v2.start(); //// Starting Second thread

		v2.sleep(5000);

		v3.start();//// Starting Third thread
		v3.sleep(5000);
		v4.start();//// Starting Fourth thread
		v4.sleep(5000);
		v5.start();//// Starting fifth thread
		v5.sleep(5000);

	}

}
