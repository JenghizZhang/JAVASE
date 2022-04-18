package com.atguigu.threadPriority;

public class Test {
    public static void main(String[] args) {
        MyThread t0 = new MyThread();
        MyThread t1 = new MyThread();
        t0.start();
        t1.start();
        t0.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("t0.getPriority() = " + t0.getPriority());
        System.out.println("t1.getPriority() = " + t1.getPriority());
    }
}
