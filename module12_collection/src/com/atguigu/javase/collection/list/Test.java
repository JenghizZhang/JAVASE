package com.atguigu.javase.collection.list;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        listIterator();
    }
    
    public static void listAdd() {
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        System.out.println(l);
        l.add(1, "ab");
        System.out.println(l);
        
        String s = l.get(1);
        System.out.println(s);
    }
    
    public static void listGet() {
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add(1, "ab");
        
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
    
    public static void listRemove() {
        List<String> l = new ArrayList<>();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("5");
        l.add("6");
        
        String s = l.remove(2);
        System.out.println(l);
        System.out.println(s);
    }
    
    public static void listIterator() {
        List<String> l = new LinkedList<>();
        l.add("2");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("5");
        l.add("6");
    
        ListIterator<String> li = l.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
