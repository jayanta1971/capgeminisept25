package com.capgemini.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springdemo.beans.Employee;
import com.capgemini.springdemo.beans.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("application-context.xml");
    	Employee emp=  ctx.getBean(Employee.class);
    	emp.setEmpId("E01");
    	emp.setEmpName("Jayanta");
    	System.out.println(emp);
    	
    	ClassPathXmlApplicationContext ctx1= new ClassPathXmlApplicationContext("application-context2.xml");
    	Movie m = (Movie)ctx1.getBean("movie");
    	m.setMovieName("Stree");
    	System.out.println(m);
       
    }
}
