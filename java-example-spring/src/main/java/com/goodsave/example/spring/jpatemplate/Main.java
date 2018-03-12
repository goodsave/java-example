package com.goodsave.example.spring.jpatemplate;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class Main {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        User user = userRepository.findOnetUserById(1);
        System.out.println(user.toString());
        System.out.println("[userRepository] = "+JSON.toJSONString(userRepository));
        System.out.println("test over");
    }

}
