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
    	Employee emp1=  ctx.getBean(Employee.class);
//    	emp1.setEmpId("E01");
    	System.out.println(emp1);    	
    	Employee emp2=  ctx.getBean(Employee.class);
    	System.out.println(emp2);
    	Employee emp3=  ctx.getBean(Employee.class);
    	System.out.println(emp3);

    }
}
