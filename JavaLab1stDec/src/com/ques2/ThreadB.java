//// Java Ques2 on thread lab test
//// Ankan Goswami
//// 1st December

package com.ques2;

public class ThreadB extends Thread { //// Thread for Green Light

	@Override
	public void run() {

		System.out.println("Green Light");
		System.out.println("Green Light on");
		for (int t = 0; t <= 5; t++) {
			System.out.println("Time" + t);

		}

		System.out.println("Green Light Off");
	}
}
