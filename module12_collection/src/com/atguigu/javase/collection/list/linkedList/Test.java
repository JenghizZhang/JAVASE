package com.atguigu.javase.collection.list.linkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("4");
        ll.add("5");
        System.out.println(ll);
        ll.addLast("6");
        System.out.println(ll);
        ll.addFirst("0");
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(ll.size()-1));
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.push("123");
        System.out.println(ll.pop());
        System.out.println(ll);
    }
}
