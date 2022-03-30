package com.atguigu.javase.learnInterface.test2;

public class Test {
    public static void main(String[] args) {
        MyInterface i = new MyInterfaceImpl();
        i.myInter();
        System.out.println("i.A = " + i.A);
    }
}
