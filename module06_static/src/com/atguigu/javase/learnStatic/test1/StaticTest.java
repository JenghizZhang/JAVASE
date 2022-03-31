package com.atguigu.javase.learnStatic.test1;

public class StaticTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Zhang San";
        
        Person p2;
        p2 = new Person();
        p2.name = "Li Si";
        Person.country = "America";
        System.out.println(Person.country);
        System.out.println(Person.country);
    }
}
