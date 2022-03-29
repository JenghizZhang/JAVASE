package com.atguigu.javase.Test;

public class Student extends Person{
    String s = "子类成员";
    
    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }
}
