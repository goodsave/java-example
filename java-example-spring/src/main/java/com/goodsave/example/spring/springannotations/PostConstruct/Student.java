package com.goodsave.example.spring.springannotations.PostConstruct;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Description
 * Created by Joker on 2017/8/7.
 */
@Component
public class Student implements Person{

    private String name;

    @PostConstruct
    private void initial(){
        this.name="XiaoMing";
    }

    @PreDestroy
    private void destroy(){
        System.out.println("对象["+this.name+"]即将被销毁...");
    }

    @Override
    public String getName() {
        return name;
    }
}
