package com.atguigu.lambda;

public class CalculatorManager {
    public static void invokeCalculator(int a, int b, Calculator calculator) {
        System.out.println(calculator.calc(a, b));
    }
}
