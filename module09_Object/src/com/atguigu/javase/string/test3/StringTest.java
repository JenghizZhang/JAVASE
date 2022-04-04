package com.atguigu.javase.string.test3;

public class StringTest {
    public static void main(String[] args) {
        
        
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println("===================");
        String s3 = "qwe";
        String s4 = "qwe";
        System.out.println(s3 == s4);
        System.out.println("===================");
        String s5 = "hello";
        String s6 = "hi";
        String s7 = "hellohi";
        System.out.println(s5 + s6 == s7);
        System.out.println("===================");
        System.out.println("hello" + "hi" == s7);
    
    }
    
    public static void print() {
        String s = "abc";
        System.out.println(s);
        s = "qwe";
        System.out.println(s);
    }
}
