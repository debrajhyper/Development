package com.map;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
   	 	SessionFactory factory = con.buildSessionFactory();
   	 	
//   	 	Question q1 = new Question();
//   	 	q1.setQuestionId(101);
//   	 	q1.setQuestion("what is java?");
//   	 	
//   	 	Answer ans = new Answer();
//   	 	ans.setAnswerId(301);
//   	 	ans.setAnswer("java is a programming language.");
//   	 	ans.setQs(q1);
//   	 	
//   	 	Answer ans1 = new Answer();
//   	 	ans1.setAnswerId(302);
//   	 	ans1.setAnswer("with the help of java we can create softwares.");
//   	 	ans1.setQs(q1);
//   	 	
//   	 	Answer ans2 = new Answer();
//	 	ans2.setAnswerId(303);
//	 	ans2.setAnswer("java have different types of frameworks.");
//	 	ans2.setQs(q1);
//   	 	
//	 	
//	 	
//	 	List<Answer> list = new ArrayList<Answer>();
//	 	list.add(ans);
//	 	list.add(ans1);
//	 	list.add(ans2);
//	 	
//	 	
//	 	q1.setAnswers(list);
//   	 	
   	 
	 	
	 	
   	 	
   	 	Session s = factory.openSession();
   	 	Transaction tx = s.beginTransaction();
   	 	
//   	 	s.save(q1);
//   	 	s.save(ans);
//   	 	s.save(ans1);
//   	 	s.save(ans2);
   	 	
   	 	tx.commit();
   	 	
   	 	//fetching...
   	 	Question q = (Question)s.get(Question.class, 101);
   	 	System.out.println(q.getQuestionId());
   	 	System.out.println(q.getQuestion());
   	 	//Eager
   	 	System.out.println(q.getAnswers().size());
//   	 	for(Answer a : q.getAnswers()) {
//   	 		System.out.println(a.getAnswer());
//   	 	}
   	 	
   	 	s.close();
   	 	factory.close();

	}

}
