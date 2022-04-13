package com.atguigu.javase.generic;

public class InterImpl<T> implements Inter<T> {
    
    @Override
    public void inter(T t) {
        System.out.println(t);
    }
}
