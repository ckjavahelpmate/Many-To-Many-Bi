package com.manytomany.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCab {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Cab cab1 = new Cab() ;
		cab1.setDriverName("DriverBabhi");
		cab1.setCost("Rs.25 per km");
		
		Cab cab2 = new Cab() ;
		cab2.setDriverName("bhabhu bayya");
		cab2.setCost("Rs.10 per km");
		
		Cab cab3 = new Cab() ;
		cab3.setDriverName("DriverBabu");
		cab3.setCost("Rs.15 per km");
		
		Person person1 = new Person() ;
		person1.setName("urmila");
		person1.setAge(21);
		person1.setEmail("uru@baaru.com");
		
		Person person2 = new Person() ;
		person2.setName("nalini");
		person2.setAge(20);
		person2.setEmail("nalli@kulli.com");
		
		Person person3 = new Person() ;
		person3.setName("kaveri");
		person3.setAge(21);
		person3.setEmail("kavu@hari.com");
		
		List<Person> persons = new ArrayList() ;
		persons.add(person1) ;
		persons.add(person2) ;
		persons.add(person3) ;
		
		List<Cab> cabs = new ArrayList<Cab>() ;
		cabs.add(cab1) ;
		cabs.add(cab2) ;
		cabs.add(cab3) ;
		
		person1.setCabs(cabs);
		person2.setCabs(cabs);
		person3.setCabs(cabs);
		
		
		entityTransaction.begin();
		
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);
		entityManager.persist(cab1);
		entityManager.persist(cab2);
		entityManager.persist(cab3);
		
		entityTransaction.commit();
		

		
		
	}

}
