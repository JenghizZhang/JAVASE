package com.atguigu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> c = new LinkedList<>();
        c.add("Hello");
        c.add("World");
        c.add("Java");
        c.add("Programming");
        
        Iterator<String> it = c.iterator();
        
        while (it.hasNext()) {
            String s = it.next();
            if (s == "Java") {
                c.add("123");
            }
            System.out.println(s);
        }
        
        // Iterator<String> it = c.iterator();
        // while(it.hasNext()!=false){
        //     System.out.println(it.next());
        //     // it.remove();
        // }
        // System.out.println(c);
    }
}
