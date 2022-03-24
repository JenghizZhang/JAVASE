package com.atguigu.object.test;

public class MerryObject {
    // 将属性修饰符设置为私有
    private int age;
    
    // 这是对外暴露获取数据的get方法
    public int getAge() {
        return age;
    }
    
    // 对外暴露设置数据set方法
    public void setAge(int input) {
        if (input < 20 || input > 60) {
            System.out.println("age超出范围");
        } else {
            age = input;
        }
    }
}
