package com.atguigu.javase.embeddedClass.test1;

public class Test {
    public static void main(String[] args) {
        Outer.Inner i = (new Outer()).new Inner();
        i.inner();
    
    
        Outer.Inner i2 = new Outer().new Inner();
    }
}
