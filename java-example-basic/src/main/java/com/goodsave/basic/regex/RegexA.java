package com.goodsave.basic.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Joker on 2017/6/7.
 */
public class RegexA {

    public static void main(String args[]) {
        String str="ww eer rtrtr fdsf fdsfdsf asd";
        //String reg = ".*\\s.+\\s.+\\s(.*)\\s";
        String reg="(?<=\\s)\\S+(?=\\s)";
        Pattern pattern = Pattern.compile(reg);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        // 查找字符串中是否有匹配正则表达式的字符/字符串
        boolean rs = matcher.find();

        System.out.println(rs);

    }


}
