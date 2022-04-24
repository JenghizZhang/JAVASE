package com.atguigu.customerAndProducer;

public class Test {
    public static void main(String[] args) {
        Produce p = new Produce();
        Consume c = new Consume();
    
        Thread pt = new Thread(p);
        Thread ct = new Thread(c);
    
        pt.start();
        ct.start();
    }
}
