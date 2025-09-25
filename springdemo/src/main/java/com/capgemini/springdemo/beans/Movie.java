package com.capgemini.springdemo.beans;

public class Movie {

	
	String movieName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + "]";
	}
	
	
}
