package com.SpringCore.LifeCycle.AnnotationConfiguration;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/LifeCycle/AnnotationConfiguration/config.xml")) {
			Rasgulla rasgulla1 = (Rasgulla) context.getBean("rasgulla1");

			System.out.println(rasgulla1);

			context.registerShutdownHook();
		} 
		catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
