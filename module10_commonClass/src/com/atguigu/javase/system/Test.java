package com.atguigu.javase.system;

import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println("l = " + l);
        
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 0};
        System.arraycopy(a1, 1, a2, 1, 2);
        for (int i = 0; i < a2.length; i++) {
            System.out.println("a2[i] = " + a2[i]);
        }
    
        Properties p =System.getProperties();
        System.out.println("p = " + p);
    }
}
