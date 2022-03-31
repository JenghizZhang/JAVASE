package com.atguigu.javase.embeddedClass.test2;

public class Outer {
    public static class Inner {
        public void inner(){
            // outer();
            System.out.println("inner method");
        }
    }
    
    public void outer(){
        System.out.println("out method");
    }
}
