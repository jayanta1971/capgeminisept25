package com.capgemini.bookmgmt.entity.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bookmgmt.entity.Book;
import com.capgemini.bookmgmt.repository.BookRepo;
import com.capgemini.bookmgmt.util.HibernateUtil;

@Service
public class BookService {
	@Autowired
	BookRepo bookRepo;
	
	public void save(Book book)
	{
		
		bookRepo.save(book);
		
		
	}
	
	public Book findById(int id)
	{
		 
		return bookRepo.findById(id);
	}
	
	public List<Book> findAll()
	{
		return bookRepo.findAll();
		 
	}
	
	public void deleteById(int id)
	{
		 
		bookRepo.deleteById(id); 
	}
	
	

}
