package com.atguigu.javase.string.test6;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        stringMethods3();
    }
    
    public static void stringMethods3() {
        String s1 = "     sa b c   ";
        System.out.println(s1.trim());
        System.out.println(s1.strip());
    
        System.out.println("============");
        s1 = "aa,bb,cc,dd,ee";
        String[] sArr = s1.split(",");
        for(String s: sArr){
            System.out.println(s);
        }
    
        System.out.println("============");
        System.out.println(s1.replace("aa,","asd"));
    }
    
    public static void stringMethods2() {
        String s1 = "abc";
        String s2 = "bbc";
        System.out.println(s1.compareTo(s2));
    }
    
    public static void stringMethods() {
        String str = "abCDefGHJktyM";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        
        char[] arr = str.toCharArray();
        for (char a : arr) {
            System.out.println(a);
        }
        int i = 1;
        String strI = String.valueOf(i);
        System.out.println(strI + 1);
    }
}
