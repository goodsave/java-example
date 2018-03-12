package com.goodsave.example.spring.aopannotation;

import java.lang.annotation.*;

/**
 * Query
 * Created by web on 2017/7/26.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DataSource {

     String name() default "default";

}
