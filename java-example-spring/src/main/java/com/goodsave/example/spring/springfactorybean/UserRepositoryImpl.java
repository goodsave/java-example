package com.goodsave.example.spring.springfactorybean;

/**
 * Description
 * Created by Joker on 2017/9/19.
 */
public class UserRepositoryImpl implements UserRepository{
    @Override
    public String getUserNameById(Integer id) {
        return "goodsave";
    }
}
