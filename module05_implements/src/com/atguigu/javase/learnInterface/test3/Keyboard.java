package com.atguigu.javase.learnInterface.test3;

public class Keyboard implements USB{
    @Override
    public void start() {
        System.out.println("keyboard start");
    }
    
    @Override
    public void end() {
        System.out.println("keyboard end");
    }
}
