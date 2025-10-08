package com.capgemini.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springdemo.beans.Car;
import com.capgemini.springdemo.beans.Engine;

public class DIDem {

	public static void main(String[] args) {
		 
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("application-context-di.xml");
 		Car car=ctx.getBean(Car.class);
		Engine engine= ctx.getBean(Engine.class);
		//System.out.println(engine);
 		//Engine engine = new Engine();
 		//car.setEngine(engine);
 		System.out.println(car);
 		
// 		Car car1=ctx.getBean(Car.class);
//		System.out.println(engine);
// 		//Engine engine = new Engine();
// 		//car.setEngine(engine);
// 		System.out.println(car1);
	}

}
