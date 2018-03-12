package com.goodsave.example.spring.springannotations.property;

import org.springframework.beans.factory.annotation.Required;

/**
 * Person
 * Created by Joker on 2017/8/8.
 */
public class Person {

    private String name;

    public Person(){}

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
}
