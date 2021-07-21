package com.example.Demo_Hibernate;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Student_id")
	private int id;
	
	@Column(name = "Student_name", length = 50)
	private String name;
	
	@Column(name = "Student_city", length = 100)
	private String city;
	
	@Transient
	private double x;
	
	@Column(name = "added_date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	private Certificate certi;
	
	
	public Student(int id, String name, String city, double x, Date date, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.x = x;
		this.date = date;
		this.certi = certi;
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
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " : " + this.name + " : " + this.city + " : " + this.date;
	}


}
