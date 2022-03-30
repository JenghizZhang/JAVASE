package com.atguigu.javase.learnAbstract.test4;

public class Test {
    public static void main(String[] args) {
        Company c1 = new Dev();
        Company c2 = new Financial();
        c1.setName("张三");
        c1.setId("研发001");
        c1.work();
        
        System.out.println("c1.getName() = " + c1.getName());
    }
}
