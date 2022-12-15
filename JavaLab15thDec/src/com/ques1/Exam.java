////JavaLab exam 15thDec (LIKE command in mysql by jdbc)
////printing product details in ProductDetails.txt file in the E:\Details directory
////Ankan Goswami

package com.ques1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Exam {

	void file() throws IOException {
		Scanner sc = new Scanner(System.in);

		OutputStream os = new FileOutputStream("E:\\Details//ProductDetails.txt"); //// giving the file loaction & name
		String ID;
		String name;
		String price;
		System.out.println("Enter product ID"); //// taking product details by user

		ID = sc.nextLine();
		System.out.println("Enter product name");
		name = sc.nextLine();
		System.out.println("Enter product price");
		price = sc.nextLine();

		//// Accept only bytes
		//// giving the file loaction & name
		byte[] a = ID.getBytes();
		byte[] b = name.getBytes();//// getBytes to convert it into bytes
		byte[] c = price.getBytes();

		os.write(a);
		os.write(b);
		os.write(c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam od = new Exam(); //// Creating object
		try {
			od.file(); //// calling the method
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	} //// end of main

}//// end of class
