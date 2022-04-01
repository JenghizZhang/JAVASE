package com.atguigu.javase.embeddedClass.test1;

public class Outer {
    public class Inner {
        public void inner(){
            outer();
            System.out.println("inner method");
        }
    }
    
    public void outer(){
        System.out.println("out method");
    }
}
