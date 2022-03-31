package com.atguigu.javase.initialization.test1;

public class Zi extends Fu{
    public static int z = 1;
    
    static {
        System.out.println("子类的静态代码块");
    }
    
    {
        System.out.println("子类的构造代码块");
    }
    
    public Zi() {
        System.out.println("子类的构造方法");
    }
    
    private int age;
    
}
