package com.goodsave.example.spring.multipledatasources.entity;

import javax.persistence.*;

/**
 * SecondDataSourceUser
 * Created by Joker on 2017/8/1.
 */
@Entity
@Table(name = "second_datasource_user")
public class SecondDataSourceUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id")
    private Integer id;

    @Column(nullable = false, unique = true, name = "name")
    private String name;


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
}
