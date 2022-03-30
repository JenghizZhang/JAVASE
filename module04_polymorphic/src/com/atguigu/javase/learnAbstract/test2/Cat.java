package com.atguigu.javase.learnAbstract.test2;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("eat fish");
    }
    
    public Cat(String name) {
        super(name);
    }
}
