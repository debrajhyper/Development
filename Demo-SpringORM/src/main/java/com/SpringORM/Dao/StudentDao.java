package com.SpringORM.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.SpringORM.Entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	//Create
	@Transactional
	public int insert(Student student) {
		// Insert Student
		Integer i = (Integer) this.hibernateTemplate.save(student);

		return i;
	}
	
	//Update
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	
	//Read
	public Student getStudent(int studentId) {
		//Read Student
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		
		return student;
	}
	
	//Read All
	public List<Student> getAllStudents() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		
		return students;
	}
	
	//Delete
	@Transactional
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		
		this.hibernateTemplate.delete(student);
	}
	
	
	
	
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
