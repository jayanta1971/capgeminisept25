package com.capgemini.jdbcssamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jdbcssamp.entity.Movie;

public class PersistenceApp {

	public static void main(String[] args) {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit"); // "my-persistence-unit" from persistence.xml
        EntityManager em = emf.createEntityManager();
        
        try {
        	
        	em.getTransaction().begin();
        	
        	Movie m= new Movie();
        	m.setMovieName("Mr X in Bombay");
        	em.persist(m);
        	em.getTransaction().commit();
        	
        	
        }catch(Exception ex)
        {
        	
        }

	}

}
