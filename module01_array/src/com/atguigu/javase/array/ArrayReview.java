package com.atguigu.javase.array;

public class ArrayReview {
    public static void main(String[] args) {
        // 1. 声明数组变量
        // a. 基本数据类型数组
        int[] ageArray;
        double[] salaryArray;
        // 声明数组变量不能指定长度
        // b. 引用数据类型数组
        String[] nameArray;

        // 2. 创建数组对象
        ageArray = new int[5];
        nameArray = new String[]  {"biz", "bar"};

        // 3. 将数据存入数组
        ageArray[0] = 15;
        ageArray[2] = 14;
        ageArray[3] = 13;

        for (int i = 0; i < ageArray.length; i++) {
            System.out.println("ageArray = " + ageArray[i]);
        }
    }
}
