package com.atguigu.thread01;

public class Test {
    public static void main(String[] args) {
        Subthread subthread = new Subthread();
        subthread.start();
        new Subthread().start();
        for (int x = 0; x < 50; x++)
            System.out.println("main run..." + x);
    }
}
