package com.atguigu.callable;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<String> {
    
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "在运行");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "结束运行");
        
        return "this is the return";
    }
}
