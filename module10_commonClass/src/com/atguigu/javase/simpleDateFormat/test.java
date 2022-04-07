package com.atguigu.javase.simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class test {
    public static void main(String[] args) {
        format();
    }
    
    public static void format(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH点mm分钟");
        String s = sdf.format(new Date());
        System.out.println(s);
        Date date=new Date();
        try {
            date = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }
}
