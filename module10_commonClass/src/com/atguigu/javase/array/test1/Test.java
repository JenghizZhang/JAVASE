package com.atguigu.javase.array.test1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // reverse(arr, 0);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // Arrays.sort(arr);
        System.out.println(binarySearch(arr, 0, arr.length - 1, 1));
    }
    
    public static void reverse(int[] arr, int i) {
        if (arr.length / 2.0 < i + 1) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        reverse(arr, i + 1);
    }
    
    public static int binarySearch(int[] arr, int start, int end, int num) {
        int mid = (end + start) / 2;
        if (arr[mid] == num) {
            return mid;
        }
        if (end <= start) {
            return -1;
        }
        
        if (arr[mid] > num) {
            return binarySearch(arr, start, mid - 1, num);
        } else {
            return binarySearch(arr, mid + 1, end, num);
        }
    }
}
