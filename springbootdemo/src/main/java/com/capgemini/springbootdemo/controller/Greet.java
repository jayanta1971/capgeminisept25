package com.capgemini.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
	
	@GetMapping("/hello")
	String hello()
	{
		return "Hello";
		
	}
	
	@PostMapping("/data")
	void data(@RequestBody String data)
	{
		 System.out.println(data);
		
	}

}
