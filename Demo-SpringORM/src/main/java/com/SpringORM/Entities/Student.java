package com.SpringORM.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
	@Id
	@Column(name = "student_id")
	private int id;

	@Column(name = "student_name")
	private String name;

	@Column(name = "student_city")
	private String City;

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		City = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", City=" + City + "]";
	}

}
