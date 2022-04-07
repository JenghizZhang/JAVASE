package com.atguigu.javase.bigDecimal;

import java.math.BigDecimal;

public class test {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("1234.5");
        BigDecimal b2 = new BigDecimal("123.5");
    
        System.out.println(b1.divide(b2,10,BigDecimal.ROUND_UP));
    }
}
