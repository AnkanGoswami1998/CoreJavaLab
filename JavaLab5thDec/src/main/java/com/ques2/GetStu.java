//// Javalab exam 5th Dec
//// Ankan Goswami
//// StudentCrud Operation by Hibernate
//// Getting student details

package com.ques2;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import StudentCrud.StudentManagement;

public class GetStu {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration().configure(); //// Configuring
    	SessionFactory sf = cfg.buildSessionFactory();
        System.out.println( sf );
        Session s = sf.openSession(); //// Creating separate session
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID no"); //// Input by user
        int id = sc.nextInt();
        StudentManagement sm = s.get(StudentManagement.class, id); 
        System.out.println(sm); //// Printing the details

	}

}
