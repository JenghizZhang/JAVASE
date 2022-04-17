package com.atguigu.javase.map.treeMap;

import com.atguigu.javase.map.javabean.Person;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<Person,String> map = new TreeMap<>(new CompImpl());
        map.put(new Person(12, "a"), "a");
        map.put(new Person(12, "a"), "b");
        map.put(new Person(13, "a"), "c");
    
        System.out.println("map = " + map);
    }
}
