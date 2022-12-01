//// Java Ques2 on thread lab test
//// Ankan Goswami
//// 1st December

package com.ques2;

public class ThreadA extends Thread { //// Thread for Red Light

	@Override
	public void run() {

		System.out.println("Red Light");
		System.out.println("Red Light On");
		for (int t = 0; t <= 3; t++) {
			System.out.println("Time" + t);

			try {
				Thread.sleep(3000); //// For 3 seconds
			} catch (InterruptedException e) {

				System.out.println(e.getMessage());
			}

		}
		System.out.println("Red Light off..");

	}
}