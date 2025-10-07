package com.rbt.moviemgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.metadata.MethodType;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

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
	 @Operation(summary = "Get a Movie", description = "Retrieves a movie provided id.")
	    @ApiResponses(value = {
	            @ApiResponse(responseCode = "200", description = "Successfully retrieved Movie"),	                    
	            @ApiResponse(responseCode = "400", description = "Invalid id supplied")	                    
	    })
	@GetMapping("/{id}")
	ResponseEntity<Movie>  findById(@PathVariable int id)
	{
		 
		 
		 
		  Movie movie= movieService.findById(id);
		  return ResponseEntity.ok(movie);
		
		 
		
	}
	//jackson data binder
	@GetMapping("/search")
	Movie  findByIdParam(@RequestParam int id)
	{
		Movie m=null;
		try {
		  m=movieService.findById(id);
		}catch (Exception ex)
		{
			ex.printStackTrace();
			
		}
		return m;
		
	}
	
	@PostMapping
	ResponseEntity<Movie>   save(@RequestBody Movie movie)
	{
		  movieService.save(movie);
		 
		  return ResponseEntity.status(201).body(movie);
		  
		
	}
	@PutMapping
	void  update(@RequestBody Movie movie)
	{
		  movieService.save(movie);
		
	}
	
	@DeleteMapping("/{id}")
	void  update(@PathVariable int id)
	{
		try {
		  movieService.deleteById(id);
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
		 
	}
	
	
	

}
