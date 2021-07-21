package com.SpringORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringORM.Dao.StudentDao;
import com.SpringORM.Entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		boolean go = true;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (go) {
			System.out.println("PRESS 1 -> Add New Student");
			System.out.println("PRESS 2 -> Display All Students");
			System.out.println("PRESS 3 -> Details of Student");
			System.out.println("PRESS 4 -> Update Student");
			System.out.println("PRESS 5 -> Delete Student");
			System.out.println("PRESS 6 -> Exit");

			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1: {
					System.out.println("*******************************************************************");
					System.out.println("Enter Student Id :");
					int sid = Integer.parseInt(br.readLine());
					System.out.println("Enter Student Name :");
					String sName = br.readLine();
					System.out.println("Enter Student City :");
					String sCity = br.readLine();

					Student student = new Student();
					student.setId(sid);
					student.setName(sName);
					student.setCity(sCity);

					int id = studentDao.insert(student);
					System.out.println(id + " -> Student  Added");
					System.out.println("*******************************************************************");
					
					break;
				}
				case 2: {
					List<Student> allStudents = studentDao.getAllStudents();

					System.out.println("*******************************************************************");
					for (Student student : allStudents) {
						System.out.println("Id : " + student.getId());
						System.out.println("Name : " + student.getName());
						System.out.println("City : " + student.getCity());
						System.out.println("_________________________");
					}
					System.out.println("*******************************************************************");
					
					break;
				}
				case 3: {
					System.out.println("*******************************************************************");
					System.out.println("Enter Student Id : ");
					int sid = Integer.parseInt(br.readLine());
					
					Student student = studentDao.getStudent(sid);
						System.out.println("_________________________");
						System.out.println("Id : " + student.getId());
						System.out.println("Name : " + student.getName());
						System.out.println("City : " + student.getCity());
						System.out.println("_________________________");
					System.out.println("*******************************************************************");
					
					break;
				}
				case 4: {
					System.out.println("*******************************************************************");
					System.out.println("Enter Student Id which You Want To Update :");
					int sid = Integer.parseInt(br.readLine());
					System.out.println("Enter Student Name :");
					String sName = br.readLine();
					System.out.println("Enter Student City :");
					String sCity = br.readLine();
	
					Student student = new Student();
					student.setId(sid);
					student.setName(sName);
					student.setCity(sCity);
	
					studentDao.updateStudent(student);
					System.out.println("______________Updated______________");
					System.out.println("*******************************************************************");
					
					break;
				}
				case 5: {
					System.out.println("*******************************************************************");
					System.out.println("Enter Student Id : ");
					int sid = Integer.parseInt(br.readLine());
					
					studentDao.deleteStudent(sid);
					System.out.println("*******************************************************************");
					
					break;
				}
				case 6: {
					go = false;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
				}
			} catch (Exception e) {
				System.out.println("Invalid Input Try with Another One !!");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("---------------------- ThankYou ----------------------");

		((ClassPathXmlApplicationContext) context).close();
	}
}
