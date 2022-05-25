package com.manytomany.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Student student1 = new Student() ;
		student1.setName("mahesh");
		student1.setAge(23);
		
		Student student2 = new Student() ;
		student2.setName("surya");
		student2.setAge(23);
		
		Student student3 = new Student() ;
		student3.setName("nalini");
		student3.setAge(23);
		
		Course course1  = new Course() ;
		course1.setName("HTML");
		course1.setDuration("10 days");
		
		Course course2  = new Course() ;
		course2.setName("JAVA");
		course2.setDuration("40 days");
		
		Course course3  = new Course() ;
		course3.setName("REACT");
		course3.setDuration("30 days");
		
//		List<Course> courses = new ArrayList<Course>() ;
//		courses.add(course1) ;
//		courses.add(course2) ;
//		courses.add(course3) ;

		List<Student> students = new ArrayList<Student>() ;
		students.add(student1) ;
		students.add(student2) ;
		students.add(student3) ;
		
		course1.setStudents(students);
		course2.setStudents(students);
		course3.setStudents(students);
//		student1.setCourses(courses);
//		student2.setCourses(courses);
//		student3.setCourses(courses);
		
		entityTransaction.begin();
		
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		
		entityTransaction.commit();

	}

}
