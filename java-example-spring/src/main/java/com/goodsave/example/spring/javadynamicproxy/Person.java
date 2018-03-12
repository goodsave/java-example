package com.goodsave.example.spring.javadynamicproxy;

/**
 * Description
 * Created by Joker on 2017/7/27.
 */
public class Person {
    private Integer id;
    private String name;

    public Person(Integer id,String name) {
        this.id =id;
        this.name =name;
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
}
