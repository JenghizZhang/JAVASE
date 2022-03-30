package com.atguigu.javase.learnAbstract.test;

public class AbstractTest {
    public static void main(String[] args) {
        Animal a = new Fish();
        a.eat();
        a.sleep();
    }
}
