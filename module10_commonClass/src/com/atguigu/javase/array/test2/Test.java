package com.atguigu.javase.array.test2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {5, 6, 12, 5, 8, -1, 0, 22, 542, 1};
        
        // bubble(arr);
        // quick(arr, 0, arr.length - 1);
        choose(arr);
        System.out.println(Arrays.toString(arr));
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
    }
    
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void quick(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int smallEnd = start - 1;
        int pivot = arr[end];
        for (int i = start; i < end; i++) {
            if (pivot > arr[i]) {
                smallEnd++;
                int temp = arr[smallEnd];
                arr[smallEnd] = arr[i];
                arr[i] = temp;
            }
        }
        smallEnd++;
        int temp = arr[smallEnd];
        arr[smallEnd] = pivot;
        arr[end] = temp;
        
        quick(arr, start, smallEnd - 1);
        quick(arr, smallEnd + 1, end);
    }
    
    public static void choose(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallIndex] > arr[j]) {
                    smallIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallIndex];
            arr[smallIndex] = temp;
        }
    }
}
