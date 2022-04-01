package com.atguigu.javase.embeddedClass.test3;

public class Outer {
    int x=3;
    public void outer(){
        int x=2;
        class Inner{
            final int x=1;
            public void inner(){
                int x=0;
                System.out.println("inner class"+Outer.this.x);
            }
        }
        var i = new Inner();
        i.inner();
    }
}
