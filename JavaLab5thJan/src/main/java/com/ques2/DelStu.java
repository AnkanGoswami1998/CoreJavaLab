//// Javalab exam 5th Dec
//// Ankan Goswami
//// StudentCrud Operation by Hibernate
//// Deleting a student details

package com.ques2;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import StudentCrud.StudentManagement;

public class DelStu {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure(); //// Configure
    	SessionFactory sf = cfg.buildSessionFactory();
        System.out.println( sf );
        Session s = sf.openSession(); //// opening separate session
        Transaction tr = s.beginTransaction(); //// Creating a transaction object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID to delete:"); //// ID input by user
        int id = sc.nextInt();
        StudentManagement sm = s.get(StudentManagement.class, id);
        s.delete(sm);  //// Deleting the details
        tr.commit();
        System.out.println("Object Deleted");
	}



}
