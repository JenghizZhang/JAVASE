package com.atguigu.javase.finally1;

public class Test {
    public static void main(String[] args) {
        try {
            int[] arr = {0};
            System.out.println(arr[1]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("must compile");
        }
    }
}
