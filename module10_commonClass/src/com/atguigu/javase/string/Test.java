package com.atguigu.javase.string;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "12345678";
        System.out.println(stringReverse2(s));
        
        String s2 = "  1 2   3  4    ";
        System.out.println(trim(s2));
        
        String s3 = "asdfg3435erAAEExc";
    }
    
    public static String stringReverse2(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    
    public static String stringReverse(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return new String(arr);
    }
    
    public static String trim(String s) {
        return s.replaceAll(" +", "");
    }
}
