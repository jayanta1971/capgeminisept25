package com.capgemini.jpahibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.capgemini.jpahibernate.entity.Movie;
import com.capgemini.jpahibernate.util.HibernateUtil;

 

public class App1 {
	public static void main(String[] args) {
		
		SessionFactory sf= HibernateUtil.getSessionFactory();	
		Session session = sf.getCurrentSession();
		Transaction t = session.beginTransaction();
		Movie m = new Movie();
		m.setMovieName("Raj");
		session.persist(m);
		t.commit();
		

	}
	
}
