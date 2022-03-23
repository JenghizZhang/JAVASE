package com.atguigu.object.test;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println(new Calculator().add(1, 2.0));
        
        Calculator cal = new Calculator();
        int r1 = cal.mOL(5);
        System.out.println("r1 = " + r1);
        int r2 = cal.mOL(3, 6);
        System.out.println("r2 = " + r2);
    
        cal.mOL("123123123");
        System.out.println(new Calculator().add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(new Calculator().recursiveAdd(10));
        System.out.println(new Calculator().recursiveMul(5));
        
    }
}
