/// Room details
/// Author = Ankan Goswami
/// Date = 03/11/22

package com.ques2;

public class Room {

	private int number;
	private String type;
	private boolean ac;
	private double area, price;

	void enterdetails(int number, String type, boolean ac, double area, double price) {

	}

	void printDetaits() {
		System.out.println("Room Number:" + number);
		System.out.println("Room Type:" + type);
		System.out.println("Room Facility:" + ac);
		System.out.println("Room Area:" + area);
		System.out.println("Room Price:" + price);

	}

}
