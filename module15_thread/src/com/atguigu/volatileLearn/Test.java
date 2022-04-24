package com.atguigu.volatileLearn;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        RunnableImpl r = new RunnableImpl();
        new Thread(r).start();
    
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
        r.setFlag(false);
    }
}
