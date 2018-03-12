package com.goodsave.example.spring.multipledatasources.repository;

import com.goodsave.example.spring.multipledatasources.entity.FirstDataSourceUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description
 * Created by Joker on 2017/8/1.
 */
@Repository
public interface FirstDataSourceUserRepository extends JpaRepository<FirstDataSourceUser,Integer>{

}
