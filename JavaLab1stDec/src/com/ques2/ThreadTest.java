//// Java Ques2 on thread lab test
//// Ankan Goswami
//// 1st December

package com.ques2;

public class ThreadTest {

	public static void main(String args[]) { ///// Main started
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		ThreadC c = new ThreadC();

		a.start(); ///// Starting TreadA
		/// a.setPriority(Thread.MAX_PRIORITY);

		b.start(); ///// Starting ThreadB
		try {
			b.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/// b.setPriority(Thread.MAX_PRIORITY);

		c.start(); ///// Starting ThreadC
		try {
			c.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//// c.setPriority(Thread.MAX_PRIORITY);

	}

}
