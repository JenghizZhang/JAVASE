package com.atguigu.javase.test3;

public class PolymorphicTest {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        a1.eat();
        ((Cat)a1).catchMouse();
    
        ((Dog)a2).wow();
    }
}
