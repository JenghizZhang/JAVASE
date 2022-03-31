package com.atguigu.javase.learnStatic.test1;

public class Person {
    String name;
    static String country = "China";
    
    public void say() {
        System.out.println(this.name);
    }
}
