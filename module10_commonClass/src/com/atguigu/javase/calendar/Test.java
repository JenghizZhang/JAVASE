package com.atguigu.javase.calendar;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        // Calendar calendar = Calendar.getInstance();
        // System.out.println(calendar);
        
        System.out.println(Calendar.getInstance().get(Calendar.MONTH));
        
        Calendar c = Calendar.getInstance();
        getTime(c);
        
        c.set(1998, 2, 4);
        c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) + 2);
        getTime(c);
        
        c.add(Calendar.DAY_OF_MONTH,-180);
        getTime(c);
    }
    
    public static void getTime(Calendar c) {
        String s = "";
        s += c.get(Calendar.YEAR) + "年";
        s += c.get(Calendar.MONTH) + 1 + "月";
        s += c.get(Calendar.DAY_OF_MONTH) + "日";
        s += c.get(Calendar.HOUR_OF_DAY) + "小时";
        s += c.get(Calendar.MINUTE) + "分";
        System.out.println(s);
    }
}
