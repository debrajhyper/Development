package com.SpringCore.Autowiring.AnnotationAutowiring.TypeSetterMethod;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	private Address address;

	public Emp(Address address) {
		super();
		System.out.println("Autowiring Type - Constructor");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	@Autowired			//Autowiring Type Setter Method
	public void setAddress(Address address) {
		System.out.println("Autowiring Type - Setter Method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
