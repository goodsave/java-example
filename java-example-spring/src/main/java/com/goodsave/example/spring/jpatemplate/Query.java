package com.goodsave.example.spring.jpatemplate;

import java.lang.annotation.*;

/**
 * Query
 * Created by web on 2017/7/26.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,ElementType.TYPE_USE,ElementType.TYPE, ElementType.METHOD})
public @interface Query {

     String value() default "";

}
