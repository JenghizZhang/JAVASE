package com.atguigu.javase.array.exe;

public class ArrayExe02 {
    public static void main(String[] args) {
        int[] scoreArr = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        int low=scoreArr[0];
        int high=scoreArr[0];
        int newLength = scoreArr.length;
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            if(scoreArr[i]<low){
                low = scoreArr[i];
            }else if (scoreArr[i]>high){
                high = scoreArr[i];
            }
            sum+=scoreArr[i];
        }
        sum = sum - high - low;
        System.out.println("sum = " + (double)sum/8);
        System.out.println("high = " + high);
        System.out.println("low = " + low);
    }
}
