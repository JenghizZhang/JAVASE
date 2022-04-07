package com.atguigu.javase.bigInteger;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("1234567890");
        BigInteger b2 = new BigInteger("1234567890000");
        BigInteger add = b1.add(b2);
        System.out.println(add);
        
        BigInteger subtract = b1.subtract(b2);
        System.out.println(subtract);
    
        System.out.println(b1.multiply(b2));
    
        System.out.println(b1.divide(b2));
    
    }
}
