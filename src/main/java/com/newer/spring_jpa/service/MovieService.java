package com.newer.spring_jpa.service;

import com.newer.spring_jpa.domain.Movie;
import com.newer.spring_jpa.domain.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public void save(Movie movie){
        this.movieRepository.save(movie);
    }

    public void del(Integer id){
        this.movieRepository.deleteById(id);
    }


    public List<Movie> findAll(){
        return this.movieRepository.findAll();
    }


    public Movie findById(Integer id){
        return this.movieRepository.findById(id).get();
    }

    public List<Movie> findByName(String name){
        return this.movieRepository.findByName(name);
    }

    public  List<Movie> findMovieByNameLike(String name){
        return this.movieRepository.findMovieByNameLike(name);
    }
}
