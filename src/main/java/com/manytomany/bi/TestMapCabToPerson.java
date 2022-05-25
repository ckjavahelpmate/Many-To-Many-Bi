package com.manytomany.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMapCabToPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Person person1 = entityManager.find(Person.class, 1) ;
//		Person person2 = entityManager.find(Person.class, 2) ;
//		Person person3 = entityManager.find(Person.class, 3) ;
		
		
		Cab cab = new Cab() ;
		cab.setDriverName("Cab Raja");
		cab.setCost("12rs per km");
		
		List<Cab> cabs = new ArrayList<Cab>() ;
		cabs.add(cab) ;
		cabs.addAll(person1.getCabs()) ;
		
		person1.setCabs(cabs);
		
		entityTransaction.begin();
		
		entityManager.persist(cab);
		
		entityTransaction.commit();
	}
}
