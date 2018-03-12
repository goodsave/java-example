package com.goodsave.basic.regex;

import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

/**
 * Created by Joker on 2017/6/8.
 */
public class RegexC {

    public static void main(String args[]){
        System.out.println(matcherAnt("/","/"));
    }


    /**
     * ANT匹配字符串
     * @param str 需要匹配的字符串
     * @param reg ANT表达式
     * @return 是否匹配到
     */
    public static  boolean matcherAnt(String reg,String str){
        PathMatcher matcher = new AntPathMatcher();
        return matcher.match(reg, str);
    }



}
