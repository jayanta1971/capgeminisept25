package com.capgemini.jpahibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.capgemini.jpahibernate.entity.Course;
import com.capgemini.jpahibernate.entity.Student;
import com.capgemini.jpahibernate.util.HibernateUtil;

public class ManyToManyTest {

	public static void main(String[] args) {
		SessionFactory sf= HibernateUtil.getSessionFactory();
		Session session =sf.getCurrentSession();
		Transaction t= session.beginTransaction();
		Course course1 = new Course();
		course1.setCourseName("Java");
		Course course2 = new Course();
		course2.setCourseName("C++");
		Course course3 = new Course();
		course3.setCourseName("C");
		
		List<Course> listCourse = new ArrayList<>();
		listCourse.add(course1);
		listCourse.add(course2);
		listCourse.add(course3);
		
		Student student1 = new Student();
		student1.setFirsName("Jayanta");
		student1.setListCourse(listCourse);
	 
		
		Student student2 = new Student();
		student2.setFirsName("Amit");
		List<Course> listCourse1 = new ArrayList<>();
		listCourse1.add(course1);
		listCourse1.add(course3);
		student2.setListCourse(listCourse1);
		
		session.persist(student1);
		session.persist(student2);
		t.commit();
		
	}

}
