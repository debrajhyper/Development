package com.SpringCore.Autowiring.XmlAutowire.ByConstructor;

public class Emp {
	private Address address;

	public Emp(Address address) {
		super();
		System.out.println("Autowiring Constructor");
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
		System.out.println("Autowiring Setting value");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
