package com.atguigu.javase.array.exe;

import java.util.Scanner;

/**
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 成绩>=最高分-10    等级为’A’
 * 成绩>=最高分-20    等级为’B’
 * 成绩>=最高分-30    等级为’C’
 * 其余                        等级为’D’
 *
 * 提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 * */
public class ArrayExe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入有多少人");
        int num = scanner.nextInt();

        int max = 0;
        int[] scoreArr=new int[num];
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println("输入学生"+(i+1)+"成绩：");
            int score = scanner.nextInt();
            scoreArr[i] = score;
            max = max<score? score:max;
        }

        char[] gradeArr = new char[num];
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i]>=max-10){
                gradeArr[i]='A';
            }else if(scoreArr[i]>=max-20){
                gradeArr[i]='B';
            }else if(scoreArr[i]>=max-30){
                gradeArr[i]='C';
            }else{
                gradeArr[i]='D';
            }
            System.out.println("输入学生"+(i+1)+"等级："+gradeArr[i]);
        }

    }
}
