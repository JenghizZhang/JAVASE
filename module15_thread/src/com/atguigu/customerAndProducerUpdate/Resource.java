package com.atguigu.customerAndProducerUpdate;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {
    int count = 0;
    boolean flag = false;
    private Lock lock = new ReentrantLock();
    private Condition proCon = lock.newCondition();
    private Condition conCon = lock.newCondition();
    
    public void setCount() {
        
        while (flag) {
            try {
                proCon.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        flag = true;
        System.out.println("生产第" + count + "个");
        // this.notifyAll();
        conCon.signal();
        lock.unlock();
    }
    
    public void getCount() {
        lock.lock();
        
        while (!flag) {
            try {
                conCon.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费第" + count);
        flag = false;
        // this.notifyAll();
        proCon.signal();
        lock.unlock();
    }
}
