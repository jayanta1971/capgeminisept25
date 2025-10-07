package com.rbt.moviemgmt.service;

import java.util.List;

import com.rbt.moviemgmt.entity.Movie;
 
import com.rbt.moviemgmt.exception.DataNotFoundException;

public interface MovieService {
	
	List<Movie> findAll();
	Movie findById(int id)  ;
	void deleteById(int id)  ;
	void save(Movie movie);
	List<Movie> findByMovieLanguage(String language);
	List<Movie> findByMovieLanguageAndMovieRating(String language,double rating);
	List<Movie> findByMovieLanguageOrderByMovieRatingDesc(String language);
}
