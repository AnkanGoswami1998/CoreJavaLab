//// Java Ques3 on thread lab test
//// Ankan Goswami
//// 1st December
package com.ques3;

public class Vechile2 extends Thread { //// Vechile 1 movement

	@Override
	public void run() {

		System.out.println("Second car Startin the journey...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Second car Entering in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Second car Arrived at the toll");
		System.out.println("Second car Entering the tolbooth....");

		for (int i = 0; i > 5; i++) {
			System.out.println("Second car Arriving in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Second car Entered the tolbooth");
		System.out.println("Second car Exiting tolbooth...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Second car Exiting in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Second car Exited the tolbooth");
		System.out.println("Second car Croosing the bridge...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Second car Crossing in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Second car Crossed the bridge");

	}

}
