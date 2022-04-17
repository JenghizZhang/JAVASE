package com.atguigu.javase.map.hashtable.properties;

import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        Properties p = new Properties();
        System.out.println(p.setProperty("a", "1"));
        p.setProperty("b", "2");
        p.setProperty("c", "3");
    
        System.out.println(p);
        System.out.println(p.getProperty("c"));
    }
}
