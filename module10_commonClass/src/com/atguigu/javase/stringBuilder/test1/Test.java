package com.atguigu.javase.stringBuilder.test1;

public class Test {
    public static void main(String[] args) {
        builderOther();
    }
    
    public static void builderOther(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1235).append(new char[]{'1', 'a'});
        System.out.println(stringBuilder.length());
    
        stringBuilder.delete(0, 3);
        System.out.println(stringBuilder);
    
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
        System.out.println(stringBuilder);
        reverse.setCharAt(1,'A');
        System.out.println("reverse = " + reverse);
    
    }
    
    public static void builderInsert() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcdef");
        stringBuilder.insert(2, "QQ");
        System.out.println(stringBuilder);
    }
    
    public static void builderAppend2() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(123).append(new char[]{'1', 'a'});
        System.out.println(stringBuilder);
    }
    
    public static void builderAppend() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(100);
        stringBuilder.append(5.8);
        stringBuilder.append(true);
        System.out.println(stringBuilder);
    }
}
