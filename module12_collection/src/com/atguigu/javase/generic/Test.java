package com.atguigu.javase.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Factory<Integer> f = new Factory<Integer>(123);
        // Factory2<Integer> f = new Factory2<Integer>();
        //
        // f.print(123);
        //
        // Factory2.staticMethod(true);
        // Inter<String> i = new InterImpl<String>();
        // i.inter("123321123123123");
        //
        // Inter i2 = new InterImpl2();
        // i2.inter("qwe");
        // List<String> l = new ArrayList<String>();
        // l.add("one");
        // l.add("two");
        // l.add("three");
        //
        //
        // List<Integer> l2 = new LinkedList<Integer>();
        // l2.add(1);
        // l2.add(2);
        // l2.add(3);
        
        List<Development> devList = new ArrayList<Development>();
        Development d1 = new Development("Zhang San", 001);
        Development d2 = new Development("Li Si", 002);
        
        devList.add(d1);
        devList.add(d2);
        
        List<Financial> finList = new ArrayList<Financial>();
        Financial f1 = new Financial("Wang Wu", 003);
        Financial f2 = new Financial("Zhao Liu", 004);
        
        finList.add(f1);
        finList.add(f2);
        
        System.out.println(devList);
        System.out.println(finList);
        each(devList);
        
        
    }
    
    public static void each(List<? extends Company> l) {
        Iterator<? extends Company> it = l.iterator();
        while (it.hasNext()) {
            it.next().work();
        }
    }
    
    
    public static void iterate(List<?> l) {
        Iterator<?> it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
}
