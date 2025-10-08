package com.capgemini.jpahibernate;

import java.util.List;
import java.util.Scanner;

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
         
    	//createData();
    	//printData();
    	//printSepecificData();
    	//updateData();
    	deleteData();
    }
    
    public static void deleteData()
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager em=emf.createEntityManager();
    	System.out.println("Please provide the movie id");
    	Scanner sc= new Scanner(System.in);
    	int id= sc.nextInt();    	
    	Movie m=em.find(Movie.class, id);
    	em.getTransaction().begin(); 
    	em.remove(m);
    	em.getTransaction().commit(); 
    	
    }
    
    public static void printData()
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager em=emf.createEntityManager();
    	List<Movie> movieList=em.createQuery("Select m from Movie m",Movie.class) //JPQL-> Java Persistence Query Language
    							.getResultList();
    	System.out.println(movieList);
    	
     
    	
    }
    
    public static void printSepecificData()
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager em=emf.createEntityManager();
    	System.out.println("Please provide the movie id");
    	Scanner sc= new Scanner(System.in);
    	int id= sc.nextInt();
    	
    	Movie m=em.find(Movie.class, id);
    	 
    	System.out.println(m);
    	
    }
    
    public static void updateData()
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager em=emf.createEntityManager();
    	System.out.println("Please provide the movie id");
    	Scanner sc= new Scanner(System.in);
    	int id= sc.nextInt();    	
    	Movie m=em.find(Movie.class, id);
    	System.out.println("Please enter a movie name:");
    	 
    	String movieName= sc.nextLine();
    	
    	System.out.println("Please enter   movie language:");
    	String movieLanguage= sc.nextLine();
    	
    	System.out.println("Please enter   movie rating:");
    	double movieRating= sc.nextDouble();    	
    	
    	em.getTransaction().begin();  
    	
    	m.setMovieName(movieName);
    	m.setMovieLanguage(movieLanguage);
    	m.setImdbRating(movieRating);
    	em.persist(m);         
        em.getTransaction().commit();
    	
    	
    }
    
    public static void createData()
    {
    	
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-persistence-unit");
    	EntityManager em=emf.createEntityManager();
    	Movie m= new Movie();
    	System.out.println("Please enter a movie name:");
    	Scanner sc= new Scanner(System.in);
    	String movieName= sc.nextLine();
    	
    	System.out.println("Please enter   movie language:");
    	String movieLanguage= sc.nextLine();
    	
    	System.out.println("Please enter   movie rating:");
    	double movieRating= sc.nextDouble();    	
    	
    	em.getTransaction().begin();    	
    	m.setMovieName(movieName);
    	m.setMovieLanguage(movieLanguage);
    	m.setImdbRating(movieRating);
    	em.persist(m);    	
     
        em.getTransaction().commit();
    }
}
