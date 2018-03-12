package com.goodsave.example.spring.jpatemplateb;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Main
 * Created by web on 2017/7/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.goodsave.example.spring.jpatemplateb.AppConfig.class)
public class Main {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        User user = userRepository.findUserByName("goodsave");
        System.out.println("查询结果:"+ JSON.toJSONString(user));
    }

}
