package com.SpringCore.Autowiring.AnnotationAutowiring.TypeProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/Autowiring/AnnotationAutowiring/TypeProperty/autoconfig.xml");
		Emp emp1 = context.getBean("emp1",Emp.class);
		
		System.out.println(emp1);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
