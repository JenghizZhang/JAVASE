package com.atguigu.thread02;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName());
    }
}
