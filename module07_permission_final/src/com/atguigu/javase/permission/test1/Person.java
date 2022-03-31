package com.atguigu.javase.permission.test1;

public class Person {
    private int a = 10;
    
    // 默认
    void eat(){
        System.out.println("eat");
    }
    
    protected void sleep(){
        System.out.println("sleep");
    }
    
    public int getA() {
        return a;
    }
    
    public void setA(int a) {
        this.a = a;
    }
}
