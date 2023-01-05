//// Javalab exam 5th Dec
//// Ankan Goswami
//// StudentCrud Operation by Hibernate
//// Adding new Student

package com.ques2;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import StudentCrud.StudentManagement;

public class AddStu {

	public static void main(String args[]) {
		
		Configuration cfg = new Configuration().configure(); //// Configuring
    	SessionFactory sf = cfg.buildSessionFactory();
        System.out.println( sf );
        Session s = sf.openSession();  //// Creating a seperate session
        Transaction tr = s.beginTransaction(); //// Object of Transaction
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new Student ID:");  //// new Student Details from user
        int id = sc.nextInt();
        System.out.println("Enter new Student Name:");
        String name = sc.next();
        System.out.println("Enter new Student Email:");
        String mail = sc.next();
        System.out.println("Enter new Student Subject:");
        String sub = sc.next();
        StudentManagement sm = new StudentManagement(id, name, mail, sub);
        s.save(sm);  //// Saving the details 
        tr.commit();
        System.out.println("Object Added");
	}

}
