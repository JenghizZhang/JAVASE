package com.atguigu.thread04;

public class JoinThread  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"="+i);
        }
    }
}
