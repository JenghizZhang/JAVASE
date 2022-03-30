package com.atguigu.javase.learnInterface.test3;

public class A implements B, C{
    @Override
    public void b() {
        System.out.println("b");
    }
    
    @Override
    public void c() {
        System.out.println("c");
    }
}
