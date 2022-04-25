package com.atguigu.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) {
        CallableImpl c = new CallableImpl();
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<String> submit = es.submit(c);
        es.submit(c);
        es.submit(c);
        es.submit(c);
        es.shutdown();
    
        String s;
        try {
            s = submit.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(s);
    }
}
