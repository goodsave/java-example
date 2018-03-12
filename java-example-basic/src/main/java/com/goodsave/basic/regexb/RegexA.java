package com.goodsave.basic.regexb;


import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by web on 2017/6/7.
 */
public class RegexA {

    public static void main(String args[]) {
        String str = "/soft/net/hello.css";
        String regEx = "/soft/net/**";
        System.out.println(matcherAnt(regEx,str));
    }


    public static  boolean matcherAnt(String reg,String str){
        PathMatcher matcher = new AntPathMatcher();
         return matcher.match(reg, str);
    }


    public static boolean match(String reg,String str){
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        return  matcher.find();
    }

    public static boolean matchIgnoreCase(String reg,String str){
        Pattern pattern = Pattern.compile(reg,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        return  matcher.find();
    }


}
