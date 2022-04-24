package com.atguigu.customerAndProducerUpdate;

public class Consumer implements Runnable{
    Resource r;
    
    public Consumer(Resource r) {
        this.r = r;
    }
    
    @Override
    public void run() {
        while(true){
            r.getCount();
        }
    }
}
