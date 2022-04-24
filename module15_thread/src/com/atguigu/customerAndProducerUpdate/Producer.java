package com.atguigu.customerAndProducerUpdate;

public class Producer implements Runnable{
    Resource r;
    
    public Producer(Resource r) {
        this.r = r;
    }
    
    @Override
    public void run() {
        while(true){
            r.setCount();
        }
    }
}
