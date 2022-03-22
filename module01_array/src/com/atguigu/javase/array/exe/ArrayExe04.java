package com.atguigu.javase.array.exe;

import java.util.Scanner;

/**
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 * */
public class ArrayExe04 {
    public static void main(String[] args) {
        String[] weekArr = {"1","2","3","4","5","6","7"};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("weekArr = " + weekArr[number]);
    }
}
