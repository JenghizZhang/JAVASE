package com.atguigu.javase.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        reverseSort();
    }
    
    public static void binarySearch(){
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(19);
        l.add(20);
        l.add(122);
        System.out.println(Collections.binarySearch(l,12));
    }
    public static void reverseSort(){
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(19);
        l.add(20);
        l.add(122);
        Collections.sort(l, (o1, o2) -> o2 - o1);
        System.out.println(l);
    }
    public static void shuffle(){
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(19);
        l.add(20);
        l.add(122);
        Collections.shuffle(l);
        System.out.println(l);
    }
}
