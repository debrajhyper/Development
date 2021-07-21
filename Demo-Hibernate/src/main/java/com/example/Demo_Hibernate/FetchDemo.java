package com.example.Demo_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get , load
		
		Configuration con = new Configuration().configure();
   	 	SessionFactory factory = con.buildSessionFactory();
   	 	Session session = factory.openSession();
   	 	
   	 	//get- student_id : 2
   	 	Student student = (Student)session.get(Student.class, 2);
   	 	System.out.println(student);
   	 	
   	 	//load
   	 	Student student2 = (Student)session.load(Student.class, 1);
   	 	System.out.println(student2.getName() + " : " + student2.getCity());
   	 	session.close();
   	 	factory.close();
   	
	}

}
