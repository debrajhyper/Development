package com.SpringCore.Autowiring.AnnotationAutowiring.TypeProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired			//Autowiring Type Property
	@Qualifier("address2")		//Calling only bean 2
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

	public void setAddress(Address address) {
		System.out.println("Autowiring Type - Setter Method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
