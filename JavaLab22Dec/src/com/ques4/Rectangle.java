////Creating class Rectangle
//// Ankan Goswami
//// 22nd December

package com.ques4;

public class Rectangle {

	int length; //// Declaing variables
	int breadth;

	public Rectangle(int length, int breadth) { //// Super constructor
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void area() { //// Creating method of area
		System.out.println("Area: " + length * breadth);
	}

	public void perimeter() { //// Creating method of Perimeter
		System.out.println("Peimeter: " + 2 * (length + breadth));
	}

}
