//// Java Ques3 on thread lab test
//// Ankan Goswami
//// 1st December
package com.ques3;

public class Vechile1 extends Thread { //// Vechile 1 movement

	@Override
	public void run() {

		System.out.println("First car Startin the journey...");

		for (int i = 0; i > 5; i++) {
			System.out.println("First car Entering in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("First car Arrived at the toll");
		System.out.println("First car Entering the tolbooth....");

		for (int i = 0; i > 5; i++) {
			System.out.println("First car Arriving in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("First car Entered the tolbooth");
		System.out.println("First car Exiting tolbooth...");

		for (int i = 0; i > 5; i++) {
			System.out.println("First car Exiting in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("First car Exited the tolbooth");
		System.out.println("First car Croosing the bridge...");

		for (int i = 0; i > 5; i++) {
			System.out.println("First car Crossing in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("First car Crossed the bridge");

	}

}
