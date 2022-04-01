package com.atguigu.object.test;

import java.util.Random;

public class StudentTest {
    public static void main(String[] args) {
        int num = 20;
        Student[] studentArr = new Student[num];
        for (int i = 0; i < num; i++) {
            studentArr[i] = new Student();
            studentArr[i].number = i + 1;
            Random r = new Random();
            studentArr[i].state = (int) (Math.random() * 10 + 1);
            studentArr[i].score = r.nextInt(100);
            if (studentArr[i].state == 3) {
                studentArr[i].showMyInfo();
            }
        }
        
        
        for (int i = 0; i < num; i++) {
            System.out.println("student[" + i + "].score = " + studentArr[i].score);
        }
        /*
        System.out.println("###############冒泡################");
        
        for (int i = 0; i < num; i++) {
            int cur = i;
            for (int j = i - 1; j >= 0;  j--) {
                if (studentArr[cur].score > studentArr[j].score) {
                    int temp = studentArr[cur].score;
                    studentArr[cur].score = studentArr[j].score;
                    studentArr[j].score = temp;
                    cur--;
                } else {
                    break;
                }
            }
        }
        
        for (int i = 0; i < num; i++) {
            System.out.println("student[" + i + "].score = " + studentArr[i].score);
        }*/
        
        System.out.println("###############快排################");
        
        quickSort(studentArr, 0, studentArr.length - 1);
        for (int i = 0; i < num; i++) {
            System.out.println("student[" + i + "].score = " + studentArr[i].score);
        }
    }
    
    private static void quickSort(Student[] stuArr, int start, int end) {
        if (start < end) {
            int pivot = stuArr[end].score;
            int arr1last = start - 1;
            for (int i = start; i < end; i++) {
                if (stuArr[i].score > pivot) {
                    int temp = stuArr[i].score;
                    stuArr[i].score = stuArr[arr1last + 1].score;
                    stuArr[arr1last + 1].score = temp;
                    arr1last++;
                }
            }
            stuArr[end].score = stuArr[arr1last + 1].score;
            stuArr[arr1last + 1].score = pivot;
            quickSort(stuArr, start, arr1last);
            quickSort(stuArr, arr1last + 2, end);
        }
    }
}
