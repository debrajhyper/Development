package com.SpringCore.DependencyInjection.ConstructorInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private int personId;
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> courses;
	private Properties props;
	private Certificate certi;

	public Person(int personId, String name, List<String> phones, Set<String> addresses, Map<String, String> courses, Properties props, Certificate certi) {
		super();
		this.personId = personId;
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
		this.certi = certi;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses + ", props=" + props + ", certi=" + certi.name + "]";
	}

}
