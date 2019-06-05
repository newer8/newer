package com.newer.spring_jpa;

import com.newer.spring_jpa.domain.Movie;
import com.newer.spring_jpa.service.MovieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private MovieService movieService;


    @Test
    public  void add(){
        Movie m = new Movie();
        m.setName("JACK");
        m.setPrice(100d);
        m.setActionTime(new Date());

        movieService.save(m); //save方法什么时候insert,什么时候是update

    }

    @Test
    public void findAll(){

        List<Movie> movieList =  this.movieService.findAll();
        movieList.forEach(movie -> {
            System.out.println(movie.getName());
        });

    }

    @Test
    public void findByName(){
        List<Movie> movieList =  this.movieService.findMovieByNameLike("%j%");
        movieList.forEach(movie -> {
            System.out.println(movie.getName());
        });

    }

    @Test
    public void del(){
        this.movieService.del(1);
    }


    @Test
    public void contextLoads() {
    }

}
