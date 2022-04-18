package com.atguigu.thread04;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        JoinThread t0 = new JoinThread();
        JoinThread t1 = new JoinThread(){
            @Override
            public void run() {
                Thread.yield();
                for (int i = 0; i < 50; i++) {
                    System.out.println(Thread.currentThread().getName()+"="+i);
                }
            }
        };
        
        
        t1.start();
        // Thread.yield();
    
        t0.start();
        // t0.join();
        System.out.println(123);
    }
}
