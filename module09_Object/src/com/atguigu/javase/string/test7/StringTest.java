package com.atguigu.javase.string.test7;

public class StringTest {
    public static void main(String[] args) {
        String email = "123321@gmail.com";
        stringMethod();
    }
    
    public static void stringMethod() {
        String tel = "13800138000";
        String regex = "1[3-9]\\d{9}";
        boolean b = tel.matches(regex);
        System.out.println(b);

    }
    
}
