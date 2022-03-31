package com.atguigu.javase.learnInterface.test3;

public class Mouse implements USB{
    @Override
    public void start() {
        System.out.println("mouse start");
    }
    
    @Override
    public void end() {
        System.out.println("mouse end");
    }
}
