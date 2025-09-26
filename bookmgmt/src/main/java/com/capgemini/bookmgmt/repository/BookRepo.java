package com.capgemini.bookmgmt.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.capgemini.bookmgmt.entity.Book;
import com.capgemini.bookmgmt.util.HibernateUtil;

@Repository
public class BookRepo {
	
	public void save(Book book)
	{
		
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session= sf.getCurrentSession();
		Transaction t= session.getTransaction();
		t.begin();
		session.persist(book);
		t.commit();
		
		
	}
	
	public Book findById(int id)
	{
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session= sf.getCurrentSession();
		Transaction t= session.getTransaction();
		t.begin();
		Book book=session.find(Book.class, id);
		t.commit();
		return book;
	}
	
	public List<Book> findAll()
	{
		
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session= sf.getCurrentSession();
		Transaction t= session.getTransaction();
		t.begin();
		List<Book> bookList=session
				          .createQuery("From Book",Book.class)
				          .getResultList();
		t.commit();
		return bookList;
	}
	
	public void deleteById(int id)
	{
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session= sf.getCurrentSession();
		Transaction t= session.getTransaction();
		t.begin();
		Book book=findById(id);
	      session.remove(book);
				          
		t.commit();
		 
	}

}
