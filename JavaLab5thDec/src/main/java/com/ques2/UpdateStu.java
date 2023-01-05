//// Javalab exam 5th Dec
//// Ankan Goswami
//// StudentCrud Operation by Hibernate
//// Updating a student details

package com.ques2;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import StudentCrud.StudentManagement;

public class UpdateStu {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure(); //// Configuring
    	SessionFactory sf = cfg.buildSessionFactory();
        System.out.println( sf );
        Session s = sf.openSession();
        Transaction tr = s.beginTransaction();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID to update:");  //// get the id w want to update
        int id = sc.nextInt();
        System.out.println("Enter the new Name:"); //// update details from user
        String name = sc.next();
        System.out.println("Enter the new Email:");
        String mail = sc.next();
        System.out.println("Enter the new Subject:");
        String sub = sc.next();
        StudentManagement sm = s.get(StudentManagement.class, id);
        sm.setStudent_name(name); //// Setting the details
        sm.setEmail(mail);
        sm.setSubject(sub);
        s.save(sm);  //// Saving the details
        tr.commit();
        System.out.println("Updated Sucessfully....");

        
        

	}

}
