package com.SpringCore.DependencyInjection.SetterInjection.Primitive;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("setter Setting studentId");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setter Setting studentName");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("setter Setting studentAddress");
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [ studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress + " ]";
	}

}
