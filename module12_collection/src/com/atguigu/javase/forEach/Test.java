package com.atguigu.javase.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        forList();
    }
    
    public static void forArray() {
        int[] arr = new int[]{1, 3, 5, 7, 9};
        for (int i : arr) {
            System.out.println(i++);
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void forList() {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        
        for (int i : l) {
            System.out.println(i);
        }
    }
}
