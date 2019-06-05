package com.newer.spring_jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {

    private static final long serialVersionUID = 307768025425185440L;

    @Id//主键 唯一
    @GeneratedValue(strategy = GenerationType.AUTO)//自增
    private Integer id;

    @Column
    private String name;

    @Column
    private double price;

    @Column(name = "action_time")
    private Date actionTime;

    public Movie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }
}
