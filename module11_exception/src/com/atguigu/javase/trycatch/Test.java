package com.atguigu.javase.trycatch;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1};
        /*try {
            int i = getNum(arr);
            System.out.println("i = " + i);
    
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        */
        try{
            myExcep(0);
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    
    public static int getNum(int[] arr) {
        return arr[1] + 10;
    }
    
    public static void myExcep(int i ){
        if (i==0){
            String s=null;
            int len = s.length();
        }else{
            int[] arr={};
            int a = arr[0];
        }
    }
}
