package com.SpringCore.DependencyInjection.ConstructorInjection;

public class Certificate {
	String name;

	public Certificate(String name) {
		super();
		this.name = name;
	}

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Certificate [name=" + name + "]";
	}

}
