package com.atguigu.threadSecurity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class RunnableImpl implements Runnable {
    
    private int totalTicket = 100;
    
    private Lock lock = new ReentrantLock();
    
    public void sell() throws InterruptedException {
        lock.lock();
        try {
            Thread.sleep(5);
            System.out.println(Thread.currentThread().getName() + " sells " + totalTicket);
            totalTicket--;
        }finally {
            lock.unlock();
        }
    }
    
    public void run() {
        while(totalTicket>=0) {
            System.out.println(totalTicket);
            try {
                sell();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        var r = new RunnableImpl();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
