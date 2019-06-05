package com.newer.spring_jpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

    //一般的增删查改都可以不用写

    @Query("from Movie where name=:name")
        //表名-对象名 字段-属性名称
    List<Movie> findByName(@Param("name") String name);

    //namem模糊查询 select * from movie where name like ?
    List<Movie> findMovieByNameLike(String name);
}