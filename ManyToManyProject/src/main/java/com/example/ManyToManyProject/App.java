//// JavaLab Test 19th Jan
//// Many to many joins 
//// Ankan Goswami
//// Main class to execute the program
package com.example.ManyToManyProject;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Answers;
import com.model.Questions;



public class App {
  public static void main(String[] args) {
	  
	  Configuration cfg = new Configuration().configure();  ////All configurations
	  SessionFactory sf = cfg.buildSessionFactory();
      System.out.println(sf);
      
      Session s = sf.openSession();
      Transaction tr = s.beginTransaction();  //// Transaction
      Answers a1 = new Answers();
      a1.setId(1);
      a1.setAnswerName("Java is a programming language"); //// Values added to table
      a1.setPostedBy("Ankan");
      
      Answers a2 = new Answers();
      a2.setId(2);
      a2.setAnswerName("Java is a platfrom");
      a2.setPostedBy("Akash");
      
      Questions q1 = new Questions();
      q1.setId(1);
      q1.setQname("What is java");
      Set<Answers> a = new HashSet<Answers>();
      a.add(a1);
      a.add(a2);
      q1.setAnswers(a);
      
      Answers a3 = new Answers();
      a3.setId(3);
      a3.setAnswerName("My fav programing language is java");
      a3.setPostedBy("Rajiv");
      
      Answers a4 = new Answers();
      a4.setId(4);
      a4.setAnswerName("My fav programing language is C++");
      a4.setPostedBy("Pranab");
      
      Questions q2 = new Questions();
      q2.setId(2);
      q2.setQname("What is your favourite programing language");
      Set<Answers> b = new HashSet<Answers>();
      b.add(a3);
      b.add(a4);
      q2.setAnswers(b);
      
      s.save(q1); //// Saving the values
      s.save(q2);
      
      tr.commit(); //// commiting 
      s.close();
      
      System.out.println("Object Saved....");
  }
}
