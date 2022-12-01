//// Java Ques3 on thread lab test
//// Ankan Goswami
//// 1st December
package com.ques3;

public class Vechile4 extends Thread { //// Vechile 1 movement

	@Override
	public void run() {

		System.out.println("Fourth car Startin the journey...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Fourth car Entering in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fourth car Arrived at the toll");
		System.out.println("Fourth car Entering the tolbooth....");

		for (int i = 0; i > 5; i++) {
			System.out.println("Fourth car Arriving in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fourth car Entered the tolbooth");
		System.out.println("Fourth car Exiting tolbooth...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Fourth car Exiting in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fourth car Exited the tolbooth");
		System.out.println("Fourth car Croosing the bridge...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Fourth car Crossing in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fourth car Crossed the bridge");

	}

}
