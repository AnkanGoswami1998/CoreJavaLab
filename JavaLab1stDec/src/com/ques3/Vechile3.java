//// Java Ques3 on thread lab test
//// Ankan Goswami
//// 1st December
package com.ques3;

public class Vechile3 extends Thread { //// Vechile 1 movement

	@Override
	public void run() {

		System.out.println("Third car Startin the journey...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Third car Entering in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Third car Arrived at the toll");
		System.out.println("Third car Entering the tolbooth....");

		for (int i = 0; i > 5; i++) {
			System.out.println("Third car Arriving in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Third car Entered the tolbooth");
		System.out.println("Third car Exiting tolbooth...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Third car Exiting in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Third car Exited the tolbooth");
		System.out.println("Third car Croosing the bridge...");

		for (int i = 0; i > 5; i++) {
			System.out.println("Third car Crossing in " + i + " seconds");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Third car Crossed the bridge");

	}

}
