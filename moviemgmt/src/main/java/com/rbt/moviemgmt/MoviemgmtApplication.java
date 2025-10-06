package com.rbt.moviemgmt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.rbt.moviemgmt.dto.RazorPay;
import com.rbt.moviemgmt.entity.Movie;
import com.rbt.moviemgmt.service.MovieService;

@SpringBootApplication
public class MoviemgmtApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext appContext;
	@Autowired
	MovieService movieService;
	
//	@Autowired
//	RazorPay razorPay;
	
	public static void main(String[] args) {
		SpringApplication.run(MoviemgmtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
//		Movie movie= new Movie("Titnaic","English",8);
//		movieService.save(movie);
		
//		List<Movie> list=movieService.findAll();
//		System.out.println(list);
//		Movie m= movieService.findById(1);
//		m.setMovieRating(6.5);
//		movieService.save(m);
//		//System.out.println(m);
//		movieService.deleteById(2);
//		List<Movie> list=movieService.findByMovieLanguage("English");
//		List<Movie> list=movieService.findByMovieLanguageAndMovieRating("English",8.0);
		List<Movie> list=movieService.findByMovieLanguageOrderByMovieRatingDesc("Hindi");
		
		System.out.println(list);
		//razorPay.pay(1000);
	}

	@Bean
	RazorPay getRazorPay()
	{
		return new RazorPay();
	}
}
