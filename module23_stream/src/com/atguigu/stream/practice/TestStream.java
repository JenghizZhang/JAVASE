package com.atguigu.stream.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        
        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");
        
        one.stream()
                .filter(name -> name.length() == 3)
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("=====");
        two.stream()
                .filter(name->name.charAt(0)=='张')
                .skip(2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("=====");
        Stream.concat(one.stream(),two.stream()).forEach(System.out::println);
        
        one.stream()
                .map(Person::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

class Person {
    private String name;
    
    public Person() {
    }
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}