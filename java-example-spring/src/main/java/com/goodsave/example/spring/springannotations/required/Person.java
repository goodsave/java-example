package com.goodsave.example.spring.springannotations.required;

import org.springframework.beans.factory.annotation.Required;

/**
 * Star
 * Created by Joker on 2017/8/7.
 */
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
}
