package com.atguigu.customerAndProducerUpdate;

public class Test {
    public static void main(String[] args) {
        Resource r = new Resource();
        
        new Thread(new Producer(r)).start();
        new Thread(new Producer(r)).start();
        new Thread(new Producer(r)).start();
        new Thread(new Consumer(r)).start();
        new Thread(new Consumer(r)).start();
        new Thread(new Consumer(r)).start();
    }
}

