package com.SpringCore.DependencyInjection.SetterInjection.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/DependencyInjection/SetterInjection/Reference/refconfig.xml");
		A aref1 = (A)context.getBean("aref1");
		A aref2 = (A)context.getBean("aref2");
		A aref3 = (A)context.getBean("aref3");

		System.out.println(aref1.getX());
		System.out.println(aref1.getObj().getY());
		System.out.println("-------");
		System.out.println(aref2.getX());
		System.out.println(aref2.getObj().getY());
		System.out.println("-------");
		System.out.println(aref3.getX());
		System.out.println(aref3.getObj().getY());
		System.out.println("-------");
		System.out.println("");

		System.out.println(aref1);
		System.out.println(aref2);
		System.out.println(aref3);

		((ClassPathXmlApplicationContext) context).close();
	}

}
