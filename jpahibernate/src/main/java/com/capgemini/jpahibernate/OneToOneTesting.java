package com.capgemini.jpahibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.capgemini.jpahibernate.entity.Pan;
import com.capgemini.jpahibernate.entity.Person;
import com.capgemini.jpahibernate.util.HibernateUtil;

public class OneToOneTesting {

	public static void main(String[] args) {
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session =sf.getCurrentSession();
		Transaction t= session.beginTransaction();
		
//		Pan pan= new Pan();
//		pan.setPanNumber("AEGPF9708D");		
//		Person person= new Person();
//		person.setFirsName("Jayanta");
//		person.setPan(pan);
//		session.persist(person);
//		
//		Person person = session.find(Person.class, 2);
//		Pan pan= person.getPan();
		//System.out.println(pan);
		Pan pan= session.find(Pan.class, 2);
		System.out.println(pan.getPerson());
		
		t.commit();
		
		
	}

}
