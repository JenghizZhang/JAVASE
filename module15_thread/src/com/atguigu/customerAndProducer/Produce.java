package com.atguigu.customerAndProducer;

import static com.atguigu.customerAndProducer.Resource.r;

public class Produce implements Runnable {
    // Resource r = new Resource();
    @Override
    public void run() {
        while (true) {
            synchronized (r) {
                if (r.flag)
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                r.count++;
                System.out.println("produce No." + r.count);
                r.flag = !r.flag;
                r.notify();
            }
        }
    }
}
