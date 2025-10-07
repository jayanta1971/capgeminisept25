package com.rbt.moviemgmt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbt.moviemgmt.entity.Movie;
 
import com.rbt.moviemgmt.exception.DataNotFoundException;
import com.rbt.moviemgmt.repo.MovieRepo;
import com.rbt.moviemgmt.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepo movieRepo;
	
	
	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movieRepo.findAll();
	}

	@Override
	public Movie findById(int id)   {
		// TODO Auto-generated method stub
		Optional<Movie> movieOpt= movieRepo.findById(id);
		if(movieOpt.isPresent())
		{
			return movieOpt.get();
		}
		else
		{
			throw new DataNotFoundException("Movie Not Found");
		}
 
		 
	 
	}

	@Override
	public void deleteById(int id)   {
		// TODO Auto-generated method stub
		
		Optional<Movie> movieOpt= movieRepo.findById(id);
		if(movieOpt.isPresent())
		{
			movieRepo.deleteById(id);
		}
		else
		{
			throw new DataNotFoundException("Movie Not Found");
		}
		
		
	}

	@Override
	public void save(Movie movie) {
		// TODO Auto-generated method stub
		
		movieRepo.save(movie);
	}

//	@Override
//	public List<Movie> findByMovieLanguage(String language) {
//		// TODO Auto-generated method stub
//		return  movieRepo.findByMovieLanguage(language);
//	}

	@Override
	public List<Movie> findByMovieLanguage(String language) {
		// TODO Auto-generated method stub
		return  movieRepo.findByMovieLanguage(language);
	}

	@Override
	public List<Movie> findByMovieLanguageAndMovieRating(String language, double rating) {
		// TODO Auto-generated method stub
		return movieRepo.findByMovieLanguageAndMovieRating(language,rating);
	}

	@Override
	public List<Movie> findByMovieLanguageOrderByMovieRatingDesc(String language) {
		// TODO Auto-generated method stub
		return movieRepo.findByMovieLanguageOrderByMovieRatingDesc(language);
	}

}
