package com.goodsave.example.spring.autowireda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Main
 * Created by Joker on 2017/7/25.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class Main {

    @Autowired
    Person person;

    /*@Resource(name = "SimplePerson")
    Star sp;*/

   /* @Resource(name="XiaoQiang")
    Star xq;*/

    @Test
    public void test() {
        person.sayWhat("hello world").doWhat("eating...");
    }

}
