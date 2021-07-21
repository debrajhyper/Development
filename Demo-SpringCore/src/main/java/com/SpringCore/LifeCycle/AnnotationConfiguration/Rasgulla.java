package com.SpringCore.LifeCycle.AnnotationConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Rasgulla {
	private long price;

	public Rasgulla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@PostConstruct
	public void start() {
		System.out.println("Starting init method");
	}

	@PreDestroy
	public void end() {
		System.out.println("Ending Destroy method");
	}

	@Override
	public String toString() {
		return "Rasgulla [price=" + price + "]";
	}

}
