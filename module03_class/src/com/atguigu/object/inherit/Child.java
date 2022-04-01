package com.atguigu.object.inherit;

public class Child extends Super {
    String a = "子类";
    
    public void print(){
        String a = "方法";
        System.out.println("a = " + a);
        System.out.println("this.a = " + this.a);
        System.out.println("super.a = " + super.a);
    }
    
}
