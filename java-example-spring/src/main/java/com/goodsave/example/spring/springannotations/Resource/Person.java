package com.goodsave.example.spring.springannotations.Resource;

/**
 * Star
 * Created by Joker on 2017/8/8.
 */
public class Person {

    private String name;

    private Integer age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void init() {
        this.name="HuangXiaoMing";
        this.age = 32;
    }


}
