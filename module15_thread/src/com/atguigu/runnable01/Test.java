package com.atguigu.runnable01;

public class Test {
    public static void main(String[] args) {
        Thread t0 = new Thread(new RunnableImpl());
        t0.start();
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
