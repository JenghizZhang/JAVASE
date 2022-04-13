package com.atguigu.javase.generic;

public class Factory2<Q> {
    public void print(Q i){
        System.out.println(i);
    }
    
    public static <T> void staticMethod(T q){
        System.out.println(q);
    }
}
