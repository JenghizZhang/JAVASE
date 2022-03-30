package com.atguigu.javase.learnAbstract.test2;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat("Tom");
        // a.setName("123");
        a.eat();
        System.out.println(a.getName());
    }
}
