package com.rbt.moviemgmt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbt.moviemgmt.entity.Movie;
@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

	List<Movie> findByMovieLanguage(String language);
	List<Movie> findByMovieLanguageAndMovieRating(String language,double rating);
	List<Movie> findByMovieLanguageOrderByMovieRatingAsc(String language);
	List<Movie> findByMovieLanguageOrderByMovieRatingDesc(String language);
	List<Movie> findByMovieRatingGreaterThan(double rating);


}
