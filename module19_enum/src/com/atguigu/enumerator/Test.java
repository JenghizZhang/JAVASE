package com.atguigu.enumerator;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("张三", Gender.MALE);
    
        System.out.println(p);
        System.out.println(p.getGender().getTag());
    }
}
