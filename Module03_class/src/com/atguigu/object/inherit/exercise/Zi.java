package com.atguigu.object.inherit.exercise;

public class Zi extends Fu {
    public Zi() {
        super();
        System.out.println("子类构造方法");
    }
    
    public Zi(int a) {
        super(); //调用父类的无参数构造方法.
        System.out.println("子类构造方法::重载的");
    }
}
