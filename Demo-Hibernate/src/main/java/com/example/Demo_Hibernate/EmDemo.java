package com.example.Demo_Hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure();
   	 	SessionFactory factory = con.buildSessionFactory();
   	 	
   	 	Student student1 = new Student();
//   	 	student1.setId(101);
   	 	student1.setName("debraj");
   	 	student1.setCity("kolkata");
   	 	student1.setDate(new Date());
   	 	
   	 	Certificate cert = new Certificate();
   	 	cert.setCourse("web");
   	 	cert.setDuration("2 months");
   	 	student1.setCerti(cert);
   	 	
   	 	Session s =factory.openSession();
   	 	Transaction tx = s.beginTransaction();
   	 	s.save(student1);
   	 	tx.commit();
   	 	s.close();
   	 	factory.close();

	}

}
