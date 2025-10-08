package com.capgemini.annodspringdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.annodspringdemo.beans.Car;
import com.capgemini.annodspringdemo.beans.Movie;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      AnnotationConfigApplicationContext ctx=  new AnnotationConfigApplicationContext(App.class);
      ctx.scan("com.capgemini.annodspringdemo");
//      Movie m= ctx.getBean(Movie.class);
//      System.out.println(m);
//      
//      Movie m1= ctx.getBean(Movie.class);
//      System.out.println(m1);
      
      Car car=  ctx.getBean(Car.class);
      
      System.out.println(car);
    }
}
