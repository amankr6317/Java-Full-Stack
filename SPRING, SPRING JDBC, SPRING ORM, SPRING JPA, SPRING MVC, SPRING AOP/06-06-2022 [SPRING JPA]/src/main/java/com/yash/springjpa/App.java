package com.yash.springjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println("Hello World!");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpasp");
		EntityManager em = emf.createEntityManager();
		s.setId(3);
		s.setName("justin");
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println(s);
	}
}