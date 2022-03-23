package com.atguigu.object.test;

public class Person {
    // 属性/成员变量
    int weight;
    
    private String name;
    private int age;
    private int sex;
    
    public void study() {
        System.out.println("studying");
    }
    
    public void showAge() {
        System.out.println("age = " + age);
    }
    
    public int addAge(int num) {
        age += num;
        return age;
    }
    
    // 方法/成员函数
    public void eat(int food) {
        weight += food;
    }
    
    public void say() {
        System.out.println("我现在体重是" + weight);
    }
}
