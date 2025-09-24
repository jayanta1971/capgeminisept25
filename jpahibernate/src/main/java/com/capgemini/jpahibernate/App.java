package com.capgemini.jpahibernate;

import com.capgemini.jpahibernate.entity.Movie;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	Movie m= new Movie();
    	m.setMovieName("Mask of zoro");
    	m.setMovieLanguage("English");
    	m.setImdbRating(9);
    	em.persist(m);
    	em.getTransaction().commit();
    	
    }
}
