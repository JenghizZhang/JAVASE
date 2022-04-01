package com.atguigu.javase.embeddedClass.test4;

public class Test {
    public static void main(String[] args) {
        // MyInterface i = new MyInterfaceImpl();
        // i.inter();
        
        new MyInterface() {
            @Override
            public void inter() {
                System.out.println("实现类实现接口重写2");
            }
            //   重写抽象方法
        }.inter();
        
        new MyInterfaceImpl(){
        
        };
    }
}
