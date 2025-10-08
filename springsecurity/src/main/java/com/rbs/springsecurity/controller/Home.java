package com.rbs.springsecurity.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rbs.springsecurity.entity.UserEntity;
import com.rbs.springsecurity.service.CustomUserDetailsService;

@RestController
@RequestMapping("/home")
public class Home {
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	
	@GetMapping
	String home()
	{
		
		return "Hello";
	}
	
	@GetMapping("/logout")
	String logout()
	{
		SecurityContextHolder.clearContext();
		return "Hello";
	}
	
	@PostMapping("/user")
	void saveUser()
	{
		UserEntity entity= new UserEntity();
		entity.setUsername("jayanta");
		entity.setPassword("pass");
		entity.setRoles(Arrays.asList("USER","Admin"));
		customUserDetailsService.saveUser(entity);
		
	}

}
