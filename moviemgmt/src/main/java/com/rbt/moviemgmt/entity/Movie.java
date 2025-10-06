package com.rbt.moviemgmt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="movie_name")
	String movieName;
	
	@Column(name="movie_language")
	String movieLanguage;
	
	@Column(name="movie_rating")
	double movieRating;

	
	
	public Movie( String movieName, String movieLanguage, double movieRating) {
		super();
 
		this.movieName = movieName;
		this.movieLanguage = movieLanguage;
		this.movieRating = movieRating;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", movieLanguage=" + movieLanguage + ", movieRating="
				+ movieRating + "]";
	}
	

}
