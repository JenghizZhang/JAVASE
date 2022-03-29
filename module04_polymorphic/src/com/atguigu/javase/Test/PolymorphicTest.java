package com.atguigu.javase.Test;

public class PolymorphicTest {
    public static void main(String[] args) {
        Person p = new Student();
        // 对象p就是子类对象，调用成员变量s
        System.out.println("p.s = " + p.s);
        
        p.eat();
    }
}
