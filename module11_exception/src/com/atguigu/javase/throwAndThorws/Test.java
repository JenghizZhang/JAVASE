package com.atguigu.javase.throwAndThorws;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(area(-10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static int area(int l) throws Exception {
        if(l<0){
            throw new Exception("长度小于0");
        }
        return (int) Math.pow(l, 2);
    }
}
