package com.goodsave.example.spring.jpatemplate;

import org.springframework.stereotype.Component;

/**
 * BaseRepositoryImpl
 * Created by web on 2017/7/26.
 */
@Component
public class BaseRepositoryImpl implements BaseRepository<Object, Integer> {

    @SuppressWarnings("unchecked")
	@Override
    public Object saveAndFlush(@SuppressWarnings("rawtypes") Iterable var) {
        return null;
    }
}
