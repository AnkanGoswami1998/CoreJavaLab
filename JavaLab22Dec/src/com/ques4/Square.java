////Creating class Square which inherits Rectangle
//// Ankan Goswami
//// 22nd December

package com.ques4;

import java.util.Scanner;

public class Square extends Rectangle {

	public Square(int side) { //// Constructor having parameter side
		super(side, side);

	}

	public static void main(String[] args) { //// Main Started

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of the Rectangle:");
		int l = sc.nextInt();
		System.out.println("Enter Breadth of the Rectangle:");
		int b = sc.nextInt(); //// Getting details from user
		System.out.println("Enter each side of the Square:");
		int side = sc.nextInt();
		Square s = new Square(side);
		Rectangle r = new Rectangle(l, b);

		System.out.println("Perimeter & Area of the Rectangle is: "); //// Printing area & perimeter of rectangle
		r.perimeter();
		r.area();
		System.out.println("Perimeter & Area of the Square is: "); //// Printing area & perimeter of Square
		s.perimeter();
		s.area();
	} //// Main ended

}
