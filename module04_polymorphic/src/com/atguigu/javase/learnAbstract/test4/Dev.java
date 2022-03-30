package com.atguigu.javase.learnAbstract.test4;

public class Dev extends Company {
    
    @Override
    public void work() {
        System.out.println(super.getName() + "研发部在开发程序");
    }
}
