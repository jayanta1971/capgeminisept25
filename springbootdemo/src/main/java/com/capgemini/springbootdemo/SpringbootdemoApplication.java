package com.capgemini.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.capgemini.springbootdemo.bean.AppClass;
import com.capgemini.springbootdemo.bean.RazorPay;
 

@SpringBootApplication
public class SpringbootdemoApplication implements CommandLineRunner {
	@Autowired
	ApplicationContext applicationContext;
    
	public static void main(String[] args) {
		Sy stem.out.println("---main--");
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("---CommandLineRunner-- Run");
		
//		AppClass app= applicationContext.getBean(AppClass.class);
//		app.greet();
		RazorPay razorPay = applicationContext.getBean(RazorPay.class);
		razorPay.pay(1000);
		 
	}

	@Bean
	RazorPay getRazorPay()
	{
		return new RazorPay();
	}
	
}
