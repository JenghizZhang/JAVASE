package com.atguigu.javase.array;

import java.util.Arrays;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] toBeSort = {3,2,1};
        int[] arrNew = Arrays.copyOf(toBeSort,5);
        Arrays.fill(arrNew, 3, 5, 10);
        Arrays.sort(arrNew);
        for(int n:arrNew){
            System.out.println("n = " + n);
        }
        
    }
}
