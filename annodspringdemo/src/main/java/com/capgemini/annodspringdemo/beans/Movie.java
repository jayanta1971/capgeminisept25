package com.capgemini.annodspringdemo.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Movie {
	
	
	String movieName;
	
	String language;
	
	

	public Movie() {
		super();
		this.movieName="Titanic";
		this.language="English";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", language=" + language + "]";
	}
	
	

}
