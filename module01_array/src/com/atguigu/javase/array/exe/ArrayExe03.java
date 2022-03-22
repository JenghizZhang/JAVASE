package com.atguigu.javase.array.exe;

import java.util.Scanner;

/**
 * 已知：一年12个月每个月的总天数是：{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31}，从键盘输入年，月，日后，计算这一天是这一年的第几天。
 *
 * 提示：考虑闰年
 * */
public class ArrayExe03 {
    public static void main(String[] args) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        if((year%4==0 && year%100!=0)||year%400==0){
            daysInMonth[1]=29;
        }


        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        while(month<1||month>12){
            System.out.println("给我好好输入");
            month = scanner.nextInt();
        }

        System.out.println("请输入日期：");
        int day = scanner.nextInt();
        while(day<1||day>daysInMonth[month-1]){
            System.out.println("给我好好输入");
            day = scanner.nextInt();
        }

        int totalDays = 0;
        for (int i = 0; i < month-1; i++) {
            totalDays+=daysInMonth[i];
        }
        totalDays+=day;

        System.out.println("totalDays = " + totalDays);
    }
}
