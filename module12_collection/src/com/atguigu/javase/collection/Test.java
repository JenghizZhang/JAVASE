package com.atguigu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        collectionRemove();
    }
    
    public static void collectionTest() {
        Collection<String> col = new ArrayList<>();
        col.add("Hello");
        col.add("world");
        col.add("java");
        System.out.println(col);
    }
    
    public static void collectionClear() {
        Collection<Integer> c = new LinkedList<>();
        c.add(Integer.valueOf(1));
        c.add(2);
        System.out.println(c);
        System.out.println(c.size());
        c.clear();
        System.out.println(c);
        System.out.println(c.size());
        System.out.println(c.isEmpty());
    }
    
    public static void collectionContains(){
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        System.out.println(c.contains(3));
    }
    
    public static void collectionRemove(){
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.remove(2);
        System.out.println(c);
    }
    
}
