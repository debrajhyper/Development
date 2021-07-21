package com.SpringCore.LifeCycle.InterfaceConfiguration;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void afterPropertiesSet() throws Exception { 	// Init method
		// TODO Auto-generated method stub
		System.out.println("init pepsi method");

	}

	@Override
	public void destroy() throws Exception {		//Destroy method
		// TODO Auto-generated method stub
		System.out.println("Destroy pepsi method");
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

}
