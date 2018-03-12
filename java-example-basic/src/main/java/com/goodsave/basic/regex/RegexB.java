package com.goodsave.basic.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Joker on 2017/6/7.
 */
public class RegexB {

    public static void main(String args[]){

        String aaa="http://www.jb51.net/article/31251.htm";

        String bbb= aaa.substring(aaa.indexOf("/",8),aaa.length());

        System.out.println(bbb);




        String reg = "http://.*/";
        Pattern r = Pattern.compile(reg);
        String str = "http://www.jb51.net/article/31251.htm";
        Matcher m = r.matcher(str);
        while (m.find()) {
            System.out.println(m.start()+"   "+m.end());
        }

    }



}
