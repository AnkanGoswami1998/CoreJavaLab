//// Javalab exam 5th Dec
//// Ankan Goswami
//// StudentCrud Operation by Hibernate
//// Creating a table in mySQl server

package com.ques2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import StudentCrud.StudentManagement;




public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure();  //// Configuring 
    	SessionFactory sf = cfg.buildSessionFactory();
        System.out.println( sf );
        Session s = sf.openSession(); //// Creating separate session
        Transaction tr = s.beginTransaction(); //// Creating trnsaction object
        
        //// Inputting details of students
        StudentManagement sm1 = new StudentManagement(1, "Ankan", "Ankan@gmail.com", "Java");
        StudentManagement sm2 = new StudentManagement(2, "Akash", "Akash@gmail.com", "Python");
        StudentManagement sm3 = new StudentManagement(3, "Rakesh", "Rakesh@gmail.com", "C++");
        s.save(sm1);
        s.save(sm2); //// Saving values
        s.save(sm3);
        tr.commit();  //// commiting
    }
    
}
