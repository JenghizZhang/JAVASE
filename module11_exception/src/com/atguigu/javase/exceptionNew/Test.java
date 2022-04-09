package com.atguigu.javase.exceptionNew;

public class Test {
    public static void main(String[] args) {
        System.out.println(getAvg(-1, -3));
    }
    
    public static float getAvg(int m, int c) {
        if (m < 0 || c < 0) {
            throw new ScoreException();
        }
        return (m + c) / 2;
    }
}
