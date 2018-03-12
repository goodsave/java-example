package com.goodsave.basic.datetime;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Main
 * Created by Joker on 2017/8/15.
 */
public class Main {

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //private final DateTimeFormatter FT = DateTimeFormatter.ofPattern("y/M/d H:m:s");
    private final DateTimeFormatter FTB = DateTimeFormatter.ofPattern("y-M-d H:m:s");


    @Test
    public void test() throws ParseException {

        String dateTimeString = "2017-7-3 5:9:5";
        Date date = sdf.parse(dateTimeString);
        System.out.println(date);


        System.out.println(LocalDateTime.parse(dateTimeString, FTB));

    }

}
