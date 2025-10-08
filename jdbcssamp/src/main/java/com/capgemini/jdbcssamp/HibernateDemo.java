package com.capgemini.jdbcssamp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.capgemini.jdbcssamp.entity.Movie;
import com.capgemini.jdbcssamp.util.HibernateUtil;

public class HibernateDemo {
	
	public static void main(String[] args) {
		
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction t=session.beginTransaction();
		Movie m= new Movie();
    	m.setMovieName("Jhumroo");
    	session.persist(m);
        t.commit();  
    	
		
	}

}
