//// Java Ques2 on thread lab test
//// Ankan Goswami
//// 1st December

package com.ques2;

public class ThreadC extends Thread { //// Thread for Yellow Light

	@Override
	public void run() {

		System.out.println("Yellow Light");
		System.out.println("Yellow Light on");
		for (int t = 0; t <= 2; t++) {
			System.out.println("Time" + t);

			/*
			 * try { Thread.sleep(2000); } catch (InterruptedException e) {
			 * 
			 * System.out.println(e.getMessage()); }
			 */
		}

		System.out.println("Yellow Light Off");
	}

}
