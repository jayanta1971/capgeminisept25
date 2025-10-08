package com.capgemini.bookmgmt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.bookmgmt.bean.RazorPay;

@Configuration
public class AppConfig {
	
	
	@Bean
	RazorPay getRazorPay()
	{
		
		return new RazorPay();
	}
	
	

}
