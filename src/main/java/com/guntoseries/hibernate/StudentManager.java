package com.guntoseries.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentManager {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setStudent_name("satyam");
		Student student2 = new Student();
		student2.setStudent_name("Vivek");
		Student student = new Student();
		student.setStudent_name("AAAAA");
		
			
		StudentCertification studentCertification1 = new StudentCertification();
		studentCertification1.setCertification_detail("Java Certification");
		StudentCertification studentCertification2 = new StudentCertification();
		studentCertification2.setCertification_detail("C++ Certification");
	
		
		
		
		
		// Student side
		
		student1.getStudentCertification().add(studentCertification1); //satyam -> java
		
		student2.getStudentCertification().add(studentCertification1); // vivek -> c++
		student2.getStudentCertification().add(studentCertification2); // vivek -> java
		
//		studentCertification1.getStudents().add(student1); // java -> satyam
//		studentCertification2.getStudents().add(student1); //  c++ -> satyam  // NOT WORKING
//	
//		studentCertification1.getStudents().add(student2); // java -> vivek
		
		student.getStudentCertification().add(studentCertification2); // AAAA -> C++
		
//		studentCertification2.getStudents().add(student); 
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(student1);
		session.save(student2);
		session.save(student);
		
		
		
		
		
//		// StudentCertification side
//		
//		studentCertification1.getStudents().add(student1); // java -> Satyam
//		studentCertification1.getStudents().add(student2); // java -> vivek
//		studentCertification3.getStudents().add(student3); // C++ -> shubham
//		
//		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		
//		session.save(studentCertification1);
//		session.save(studentCertification2);
//		session.save(studentCertification3);
		

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
