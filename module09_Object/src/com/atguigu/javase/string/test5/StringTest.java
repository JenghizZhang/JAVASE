package com.atguigu.javase.string.test5;

public class StringTest {
    public static void main(String[] args) {
        StringMethod3();
    }
    
    public static void StringMethod3(){
        int l = "abcd".compareTo("");
        System.out.println("l = " + l);
        System.out.println("++++++++++++++++++");
    }
    
    
    public static void StringMethod2(){
        int l = "abcd".length();
        System.out.println("l = " + l);
        System.out.println("++++++++++++++++++");
    
        char c = "abcd".charAt(0);
        System.out.println("char = " + c);
    
        System.out.println("++++++++++++++++++");
    
        int i = "abcd".indexOf("aabc");
        System.out.println("index = " + i);
        
        System.out.println("++++++++++++++++++");
        System.out.println("abcd".substring(0,1));
    }
    
    public static void StringMethod() {
        String s1 = new String("abc");
        boolean b = s1.equals("abc");
        System.out.println(b);
        
        System.out.println("++++++++++++++++++");
        
        System.out.println("abcdef".equalsIgnoreCase("ABCDEF"));
        
        System.out.println("++++++++++++++++++");
        
        b = "abcdef".startsWith("ab");
        System.out.println(b);
        
        System.out.println("++++++++++++++++++");
        
        b = "abcdef".endsWith("ef");
        System.out.println(b);
    
        System.out.println("++++++++++++++++++");
    
        b = "abcdef".contains("ef");
        System.out.println(b);
    
        System.out.println("++++++++++++++++++");
    
        b = "".isEmpty();
        System.out.println(b);
    }
}
