package com.goodsave.example.spring.jpatemplate;

import org.springframework.stereotype.Repository;

/**
 * UserRepository
 * Created by web on 2017/7/26.
 */
@Repository
public interface UserRepository extends BaseRepository<User, Integer> {

    @Query(value = "select user from User user where user.id=?")
    User findOnetUserById(Integer id);

}
