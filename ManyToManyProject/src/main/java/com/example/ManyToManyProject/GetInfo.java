//// JavaLab Test 19th Jan
//// Many to many joins 
//// Ankan Goswami
//// to get the questions & answers

package com.example.ManyToManyProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Questions;

public class GetInfo {
	
	public static void main(String[] args) {
		
		  Configuration cfg = new Configuration().configure();  ////All configurations
		  SessionFactory sf = cfg.buildSessionFactory();
	      System.out.println(sf);
	      
	      Session s = sf.openSession();
	      Questions q = s.get(Questions.class, 1); //// to get the value
	      System.out.println(q); //// printing the value
	}

}
