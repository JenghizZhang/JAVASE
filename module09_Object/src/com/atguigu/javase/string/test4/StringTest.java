package com.atguigu.javase.string.test4;

public class StringTest {
    public static void main(String[] args) {
        // stringConsByte();
        // stringConsByte2();
        String s = new String(new char[]{'a', 'b', 'c'});
        // String s = new String(new char[]{'a', 'b', 'c'}, 1, 1);
        System.out.println(s);
        
        String[] c = s.split("");
        for (String sss : c) {
            System.out.println(sss);
        }
    }
    
    public static void stringConsByte2() {
        byte[] b = {-28, -67, -96};
        String s1 = new String(b);
        System.out.println(s1);
        
        
        // System.out.println(new String(b, 2, 2));
    }
    
    public static void stringConsByte() {
        byte[] b = {97, 98, 99, 100};
        String s1 = new String(b);
        System.out.println(s1);
        
        
        System.out.println(new String(b, 2, 2));
    }
}
