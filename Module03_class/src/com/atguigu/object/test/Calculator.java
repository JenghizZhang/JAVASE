package com.atguigu.object.test;

public class Calculator {
    // 这个方法针对double类型
    public double add(double a, double b) {
        return a + b;
    }
    
    // 这个方法针对int类型
    public int add(int a, int b) {
        return a + b;
    }
    
    // 三个input
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // e可变参数
    public int add(int... num) {
        int sum = 0;
        for (int j : num) {
            sum += j;
        }
        return sum;
    }
    
    public int mOL(int i) {
        return (int) Math.pow(i, 2);
    }
    
    public int mOL(int i, int j) {
        return i * j;
    }
    
    public void mOL(String value) {
        System.out.println("value = " + value);
    }
    
    public int recursiveAdd(int num) {
        if (num == 1) {
            return 1;
        } else {
            return recursiveAdd(num - 1) + num;
        }
    }
    
    public int recursiveMul(int num){
        if(num ==2){
            return 2;
        }else{
            return num * recursiveMul(num - 1);
        }
    }
}
