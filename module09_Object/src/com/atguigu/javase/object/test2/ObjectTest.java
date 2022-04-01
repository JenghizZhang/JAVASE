package com.atguigu.javase.object.test2;

public class ObjectTest {
    public static void main(String[] args) {
        // Person p1 = new Person();
        // Person p2 = new Person();
        //
        // boolean c = p1.equals(p2);
        // System.out.println(c);
        Person p = new Person("张三", 24);
        Person p2 = new Person("张三", 24);
        System.out.println(p.equals(p2));
    }
}
