package com.rbt.moviemgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rbt.moviemgmt.entity.Movie;
import com.rbt.moviemgmt.service.MovieService;
import java.util.List;
@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping 
	List<Movie> findAll()
	{
		return movieService.findAll();
		
	}
	
	@GetMapping("/{id}")
	Movie  findById(@PathVariable int id)
	{
		return movieService.findById(id);
		
	}
	
	@GetMapping("/p")
	Movie  findByIdParam(@RequestParam int id)
	{
		return movieService.findById(id);
		
	}
	
	@PostMapping
	void  save(@RequestBody Movie movie)
	{
		  movieService.save(movie);
		
	}
	@PutMapping
	void  update(@RequestBody Movie movie)
	{
		  movieService.save(movie);
		
	}
	
	@DeleteMapping("/{id}")
	void  update(@PathVariable int id)
	{
		  movieService.deleteById(id);
		 
	}
	
	
	

}
