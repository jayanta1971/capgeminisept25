package com.capgemini.jpahibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.capgemini.jpahibernate.entity.Movie;
import com.capgemini.jpahibernate.util.HibernateUtil;

public class HibernateDemo {

	public static void main(String[] args) {
		 
         //createData();
		//printData();
		//printSpecificData(2);
//		Movie m1= new Movie();
//		m1.setId(2);
//		m1.setImdbRating(9);
//		m1.setMovieName("Titanic");
//		m1.setMovieLanguage("English");
//		
//		updateData(m1);
		deleteData(1);
	}
	
	
	/**
	 * 
	 */
	public static void deleteData(int id)
	{
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session =sf.getCurrentSession();
		Transaction t= session.beginTransaction();
	    Movie movieDB =session.get(Movie.class, id);
	    session.remove(movieDB);
	    t.commit();
		
	}
	
	public static void updateData(Movie movie)
	{
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session =sf.getCurrentSession();
		Transaction t= session.beginTransaction();
	    Movie movieDB =session.get(Movie.class, movie.getId());
	    movieDB.setImdbRating(movie.getImdbRating());
	    movieDB.setMovieLanguage(movie.getMovieLanguage());
	    movieDB.setMovieName(movie.getMovieName());
	    session.persist(movieDB);
	    t.commit();
		
		
	}
	
	public static void printSpecificData(int id)
	{
		
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session =sf.getCurrentSession();
		Transaction t= session.beginTransaction();
	    Movie movie =session.get(Movie.class, id);
		System.out.println(movie);
		t.commit();
		
		
	}
	public static void printData()
	{
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session =sf.getCurrentSession();
		Transaction t= session.beginTransaction();
		List<Movie>listMovie=session.createQuery("From Movie",Movie.class)
									.getResultList();
		System.out.println(listMovie);
		t.commit();
	}
	
	public static void createData()
	{
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session =sf.getCurrentSession();
		Transaction t= session.beginTransaction();
		Movie m= new Movie();
		m.setMovieName("Titanic");
		m.setMovieLanguage("English");
		m.setImdbRating(8);
		session.persist(m);
		t.commit();
		
	}

}
