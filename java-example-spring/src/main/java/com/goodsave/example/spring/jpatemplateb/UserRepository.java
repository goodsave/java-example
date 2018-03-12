package com.goodsave.example.spring.jpatemplateb;

import org.springframework.stereotype.Repository;

/**
 * UserRepository
 * Created by web on 2017/7/29.
 */
@Repository
public interface UserRepository extends MinsxRepository<User,Integer>{

    @Query("select user from User user where user.name=?")
    User findUserByName(String name);

}
