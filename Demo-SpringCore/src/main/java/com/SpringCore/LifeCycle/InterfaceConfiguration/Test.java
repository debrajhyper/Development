package com.SpringCore.LifeCycle.InterfaceConfiguration;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/LifeCycle/InterfaceConfiguration/config.xml")) {
			Pepsi pepsi1 = (Pepsi) context.getBean("pepsi1");

			System.out.println(pepsi1);

			context.registerShutdownHook();
		} 
		catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
