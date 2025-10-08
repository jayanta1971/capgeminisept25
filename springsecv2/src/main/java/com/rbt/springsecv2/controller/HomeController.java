package com.rbt.springsecv2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rbt.springsecv2.entity.UserEntity;
import com.rbt.springsecv2.service.CustomUserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	CustomUserService customUserService; 
	
	@GetMapping
	String greet()
	{
		return "Hello Spring Security!!!";
	}
	
	@GetMapping("/logout")
	void logout()
	{
		SecurityContextHolder.clearContext(); 
	}
	
	@PostMapping
	void save(@RequestBody UserEntity userEntity)
	{
		
		System.out.println("--Herer--");
		UserEntity userEntity1= new UserEntity();
		userEntity1.setUsername("jayanta");
		userEntity1.setPassword("pass");
		List<String> roles= new ArrayList<>();
		roles.add("Admin");
		roles.add("User");
		userEntity1.setRoles(roles);
		customUserService.saveUser(userEntity1);
	}


}
