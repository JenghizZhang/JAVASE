package com.atguigu.object.test;

public class Tiger {
    
    public Tiger() {
        System.out.println("tiger无参数构造器");
    }
    
    public Tiger(String name) {
        this();
        System.out.println("tiger一参数构造器"+ name);
    }
}
