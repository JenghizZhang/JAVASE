package com.atguigu.customerAndProducer;

import static com.atguigu.customerAndProducer.Resource.r;

public class Consume implements Runnable {
    // Resource r = new Resource();
    
    @Override
    public void run() {
        while (true) {
            synchronized (r) {
                if (r.flag) {
                    System.out.println("consume No." + r.count);
                    r.flag = !r.flag;
                    r.notify();
                }else{
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
