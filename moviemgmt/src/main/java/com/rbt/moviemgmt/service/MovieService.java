package com.rbt.moviemgmt.service;

import java.util.List;

import com.rbt.moviemgmt.entity.Movie;

public interface MovieService {
	
	List<Movie> findAll();
	Movie findById(int id);
	void deleteById(int id);
	void save(Movie movie);

}
