package com.atguigu.thread02;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        // myThread.setName("234432");
        new MyThread().start();
        // System.out.println(myThread.getName());
    
        System.out.println(Thread.currentThread().getName());
    }
}
