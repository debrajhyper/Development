package com.SpringCore.LifeCycle.XmlConfiguration;

import org.springframework.beans.BeansException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		try ( AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/LifeCycle/XmlConfiguration/config.xml") ) {
			Samosa samosa1 = (Samosa) context.getBean("samosa1");

			System.out.println(samosa1);

			context.registerShutdownHook(); // registering shutdown hook
		} 
		catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
