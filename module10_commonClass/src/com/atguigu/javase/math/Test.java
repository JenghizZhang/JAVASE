package com.atguigu.javase.math;

public class Test {
    public static void main(String[] args) {
        double p = Math.PI;
        System.out.println("p = " + p);
        
        //static int abs(int a) 返回参数的绝对值
        System.out.println(Math.abs(-6));
        
        //static double ceil(double d)返回大于或者等于参数的最小整数
        System.out.println(Math.ceil(12.3)); //向上取整数
        
        //static double floor(double d)返回小于或者等于参数的最大整数
        System.out.println("Math.floor(5.5) = " + Math.floor(5.5));//向下取整数

        //static long round(double d)对参数四舍五入
        long round = Math.round(5.5); //取整数部分  参数+0.5
        System.out.println("round = " + round);

        //static double pow(double a,double b ) a的b次幂
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));

        //static double sqrt(double d)参数的平方根
        System.out.println("Math.sqrt(4) = " + Math.sqrt(3));

        // static double random() 返回随机数 0.0-1.0之间
        for (int x = 0; x < 10; x++) {
            System.out.println(Math.random()); //伪随机数
        }
        
    }
}
