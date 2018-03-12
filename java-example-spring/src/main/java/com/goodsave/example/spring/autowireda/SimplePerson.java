package com.goodsave.example.spring.autowireda;

import org.springframework.stereotype.Service;

/**
 * SimplePersion
 * Created by Joker on 2017/7/25.
 */
@Service
/*@Service("SimplePerson")*/
public class SimplePerson implements Person {

    @Override
    public Person sayWhat(String str) {
        System.out.println("Star:"+this+"\tsay:"+str);
        return this;
    }

    @Override
    public Person doWhat(String str) {
        System.out.println("Star:"+this+"\tdo:"+str);
        return this;
    }
}
