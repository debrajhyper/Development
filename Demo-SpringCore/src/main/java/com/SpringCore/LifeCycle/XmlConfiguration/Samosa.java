package com.SpringCore.LifeCycle.XmlConfiguration;

public class Samosa {
	private double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	public void init() {
		System.out.println("Inside init metod");
	}

	public void destroy() {
		System.out.println("Inside destroy method");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

}
