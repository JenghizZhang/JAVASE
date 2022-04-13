package com.atguigu.javase.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        Integer[] arr = list.toArray(new Integer[list.size()]);
        
        List<Integer> list2 = new ArrayList<>();
        list2 = Arrays.asList(new Integer[]{1,2,3});
        for (int i :
                list2) {
            System.out.println(i);
        }
    
    
        Integer[] a = list2.toArray(new Integer[list2.size()]);
    }
    
    
    
}
