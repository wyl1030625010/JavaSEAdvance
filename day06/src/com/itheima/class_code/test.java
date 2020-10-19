package com.itheima.class_code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        String s = "2048-01-01";
        Date d = new Date();
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyyƒÍMM‘¬dd»’ HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String format = sdf.format(d);
        Date date = sdf.parse(s);

        System.out.println(format);
        System.out.println(date);
    }
}
