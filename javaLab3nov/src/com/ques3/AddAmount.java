/// WAP to show money on PiggieBank
/// Author = Ankan Goswami
/// Date = 03/11/22
package com.ques3;

public class AddAmount { /// Class AddAmount

	private int amount = 50; /// Initial value 50

	public AddAmount() {

	}

	public AddAmount(int a) {
		amount = a + amount; /// a Money added
	}

	public void displayAmount() {
		System.out.println(" The money in the piggieBank is " + amount); /// Printing the amount
	}
}
