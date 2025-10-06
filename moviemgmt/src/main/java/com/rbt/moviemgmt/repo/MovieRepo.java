package com.rbt.moviemgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbt.moviemgmt.entity.Movie;
@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
