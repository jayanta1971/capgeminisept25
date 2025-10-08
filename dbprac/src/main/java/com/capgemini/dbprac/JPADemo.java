package com.capgemini.dbprac;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.dbprac.entity.Movie;

public class JPADemo {
	
	public static void main(String[] args) {
		try {
		EntityManagerFactory  emf=Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		Movie m= new Movie();
		m.setMovieName("Catch Me If You can");
		m.setMovieLanguage("English");
		em.persist(m);		
		em.getTransaction().commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
