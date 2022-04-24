package com.atguigu.single;

public class Test {
    public static void main(String[] args) {
        Simple s = Simple.getInstance();
        Simple s1 = Simple.getInstance();
        Simple s2 = Simple.getInstance();
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
