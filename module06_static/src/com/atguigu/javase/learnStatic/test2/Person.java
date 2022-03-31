package com.atguigu.javase.learnStatic.test2;

public class Person {
    static String country = "China";
    String name;
    public static void eat(){
        System.out.println("i am eating"+Person.country);
    }
    
    public void say(){
        System.out.println(country);
        int[] arr = new int[3];
        
    }
}
