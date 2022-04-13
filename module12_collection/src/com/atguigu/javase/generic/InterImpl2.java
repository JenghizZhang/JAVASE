package com.atguigu.javase.generic;

public class InterImpl2 implements Inter<String>{
    @Override
    public void inter(String s) {
        System.out.println(s);
    }
}
