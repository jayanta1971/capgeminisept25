package com.rbt.moviemgmt.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api/v1/theatre")
public class MovieTheatre {
	
//	@RequestMapping(method=RequestMethod.GET)
//	@ResponseBody
	@GetMapping
	List<String> findAll()
	{
		
		return null;
		
	}
//	@RequestMapping(method=RequestMethod.POST)
//	@ResponseBody
	
	@PostMapping
	void save(String theatre)
	{
		
		
	}
 
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	List<String> findById(int id)
	{
		
		return null;
		
	}

}
