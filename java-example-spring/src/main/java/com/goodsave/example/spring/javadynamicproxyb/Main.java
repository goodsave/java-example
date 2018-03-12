package com.goodsave.example.spring.javadynamicproxyb;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Main
 * Created by Joker on 2017/9/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.goodsave.example.spring.javadynamicproxyb.Config.class)
public class Main {

    @Autowired
    UserRepository userRepository;

    @Test
    public void test(){
        System.out.println("---->"+ JSON.toJSONString(userRepository.getClass()));
        userRepository.getUserNameById(2);
    }

}
