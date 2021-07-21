package com.Project.web.model;

public class Alien {
	private int uid;
	private String uname;
	private String city;
	
	public Alien(int uid, String uname, String city) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.city = city;
	}

	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Alien [uid=" + uid + ", uname=" + uname + ", city=" + city + "]";
	}
	

}
