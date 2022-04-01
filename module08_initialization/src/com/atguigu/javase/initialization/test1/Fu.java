package com.atguigu.javase.initialization.test1;

public class Fu {
    public static int f = 1;
    
    static {
        System.out.println("父类的静态代码块");
    }
    
    {
        System.out.println("父类的构造代码块");
    }
    
    public Fu() {
        System.out.println("父类的构造方法");
    }
    
    private int age;
}
