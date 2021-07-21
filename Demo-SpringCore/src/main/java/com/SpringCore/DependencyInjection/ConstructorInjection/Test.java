package com.SpringCore.DependencyInjection.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/DependencyInjection/ConstructorInjection/constructorinjectionconfig.xml");
		Person person1 = (Person)context.getBean("person1");
		Person person2 = (Person)context.getBean("person2");
//		Person person3 = (Person)context.getBean("person3");
		Addition add = (Addition)context.getBean("add");
		
		
		System.out.println("");
		System.out.println(person1);
		System.out.println("");
		System.out.println(person2);
		System.out.println("");
//		System.out.println(person3);
		System.out.println("");
		add.doSum();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
