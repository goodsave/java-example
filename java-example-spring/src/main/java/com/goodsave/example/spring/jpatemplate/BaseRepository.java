package com.goodsave.example.spring.jpatemplate;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * BaseRepository
 * Created by web on 2017/7/26.
 */
@Repository
public interface BaseRepository <T,ID extends Serializable>{

    <S extends T> S saveAndFlush(Iterable<S> var);

}
