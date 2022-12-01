//// Java Ques3 on thread lab test
//// Ankan Goswami
//// 1st December
package com.ques3;

public class Vechile5 extends Thread { //// Vechile 1 movement

	@Override
	public void run() {

		System.out.println("Fifth car Startin the journey...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Fifth car Entering in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fifth car Arrived at the toll");
		System.out.println("Fifth car Entering the tolbooth....");

		for (int i = 0; i > 5; i++) {
			System.out.println("Fifth car Arriving in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fifth car Entered the tolbooth");
		System.out.println("Fifth car Exiting tolbooth...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Fifth car Exiting in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fifth car Exited the tolbooth");
		System.out.println("Fifth car Croosing the bridge...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Fifth car Crossing in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fifth car Crossed the bridge");

	}

}
