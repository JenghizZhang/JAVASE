package com.atguigu.thread01;

public class Subthread extends Thread {
    @Override
    public void run() {
        for (int x = 0; x < 50; x++)
            System.out.println("thread run..." + x);
    }
}

