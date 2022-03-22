package com.atguigu.javase.array;

public class ArrayMultiDimension {
    public static void main(String[] args) {
        // 一、声明变量创建对象
        // 声明二维数组变量并创建二维数组的对象
        // 格式1：动态初始化，创建对象时就指定两个维度的数组长度
        int[][] arr1 = new int[2][3];
        arr1[0][0] = 100;
        arr1[0][1] = 200;
        arr1[0][2] = 300;
        arr1[1][0] = 400;
        arr1[1][1] = 500;
        arr1[1][2] = 600;

        // 格式2：动态初始化，仅指定第一个维度
        int[][] arr2 = new int[2][];
        arr2[0] = new int[]{1, 2, 3};
        arr2[1] = new int[]{2, 3};

        // 格式3：静态初始化
        // 如果某个元素设置为null不会编译报错，但是访问时需要初始化
        int[][] arr3 = new int[][]{{1, 2}, {2, 3, 4, 5}, null};

        // 格式4：声明变量【】不在一起
        int[] arr4[] = new int[2][3];

        // 二、访问数组元素（读、写）
        int[][] arr2d = new int[2][2];
        arr2d[1][0] = 10;
        System.out.println("arr2d[1][0] = " + arr2d[1][0]);

        // 三、遍历二维数组
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println("arr2["+i+"]["+j+"] = " + arr2[i][j]);
            }
        }

    }
}
