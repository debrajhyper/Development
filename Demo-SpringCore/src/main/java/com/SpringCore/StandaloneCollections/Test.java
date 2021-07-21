package com.SpringCore.StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/StandaloneCollections/standalonecollectionconfig.xml");
		Emp emp1 = (Emp)context.getBean("emp1");
		
        System.out.println(emp1.getName() + "						" + emp1.getName().getClass().getName());
        System.out.println(emp1.getPhones() + "	" + emp1.getPhones().getClass().getName());
        System.out.println(emp1.getAddresses() + " 				" + emp1.getAddresses().getClass().getName());
        System.out.println(emp1.getCourses() + " 	" + emp1.getCourses().getClass().getName());
        System.out.println(emp1.getProps() + " 			" + emp1.getProps().getClass().getName());
        System.out.println("");
//        System.out.println(emp1);
        
        ((ClassPathXmlApplicationContext) context).close();
	}

}
