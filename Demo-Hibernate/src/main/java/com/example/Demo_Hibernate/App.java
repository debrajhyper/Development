package com.example.Demo_Hibernate;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Project Started...");
    	 Configuration con = new Configuration().configure();
    	 SessionFactory factory = con.buildSessionFactory();
    	 
    	 //creating student
    	Student debraj = new Student();
//       debraj.setid(103);
       debraj.setName("rahul");
       debraj.setCity("kolkata");
       debraj.setX(2256.3256);
       debraj.setDate(new Date());
       System.out.println(debraj);
       

       Session session = factory.openSession();
       
       Transaction tx = session.beginTransaction();
       session.save(debraj);
       tx.commit();
       
       session.close();
       
       System.out.println("Done...");
       
    }
}
