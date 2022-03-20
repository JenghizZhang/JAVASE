package com.atguigu.javase.array;

public class ArrayTest {
    public static void main(String[] args) {
        // 1. 声明数组类型变量
        int[] ageArray;
        String[] nameArray;
        int salaryArray[];

        // 声明数组的时候不能在方括号指定数组长度
        // double[5] salary;

        // 2. 创建数组类型变量
        ageArray = new int[5];
        nameArray = new String[]{"foo", "bar", "biz"};
        salaryArray = new int[]{111, 222, 333, 444};
        // 3. 从数组中存入数据
        ageArray[0]=10;
        ageArray[1]=11;
        ageArray[2]=12;
        ageArray[3]=13;
        ageArray[4]=14;

        nameArray[0] = "aaa";
        nameArray[1] = "bbb";
        nameArray[2] = "ccc";

        // 4. 读数据
        System.out.println("ageArray[0]=" + ageArray[0]);
        System.out.println("ageArray[1]=" + ageArray[1]);
        System.out.println("ageArray[2]=" + ageArray[2]);
        System.out.println("ageArray[3]=" + ageArray[3]);
        System.out.println("ageArray[4]=" + ageArray[4]);

        // 5. 遍历数组
        for (int i = 0; i < ageArray.length; i++) {
            int age = ageArray[i];
            System.out.println("age = " + age);
        }
    }
}
