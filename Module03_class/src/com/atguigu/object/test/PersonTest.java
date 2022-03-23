package com.atguigu.object.test;

import com.atguigu.javase.array.ArrayReview;

public class PersonTest {
    public static void main(String[] args) {
        /*// 1. 创建对象
        Person xiaoming = new Person();
        xiaoming.eat(5);
        xiaoming.say();
        xiaoming.weight=10;
        var arrReview = new ArrayReview();
        System.out.println("arrReview.arrNum = " + arrReview.arrNum);*/
        var xiaohong = new Person();
        xiaohong.study();
        xiaohong.showAge();
        int age = xiaohong.addAge(4);
        System.out.println("age = " + age);
    }
}
