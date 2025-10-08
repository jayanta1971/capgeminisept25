package com.capgemini.bookmgmt;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.bookmgmt.service.BookService;
import com.capgemini.bookmgmt.bean.*;
import com.capgemini.bookmgmt.config.AppConfig;
public class AppRazorPayIntegrationTest {

	
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=  new AnnotationConfigApplicationContext(AppConfig.class);
    	ctx.scan("com.capgemini.bookmgmt"); 
    	//ctx.refresh();
    	RazorPay razorPay = ctx.getBean(RazorPay.class);
    	razorPay.pay(1000);
	}

}
