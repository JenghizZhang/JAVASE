package com.atguigu.javase.date;

import java.util.Date;

public class test {
    public static void main(String[] args) {
        // Date date = new Date();
        // System.out.println(date.toString());
        // System.out.println(new Date(0));
        Date date = new Date();
        System.out.println(date.getTime());
        date.setTime(0);
        System.out.println(date.toString());
    }
}
