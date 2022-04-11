package com.atguigu.javase.collection.set.hashSet;

import java.util.Set;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
    
        Set<Student> s = new HashSet<>();
        s.add(new Student(12, "san"));
        s.add(new Student(121, "san1"));
        s.add(new Student(122, "san2"));
        s.add(new Student(123, "san3"));
    
    
        System.out.println(s);
        // Person p = new Person();
        // System.out.println(p.hashCode());
        //
        // Set<String> s = new HashSet<>();
        // s.add("通话");
        // s.add("重地");
        // System.out.println(s);
        // // StringHash();
        // Set<String> s = new HashSet<>();
        // s.add("a");
        // s.add("d");
        // s.add("b");
        // s.add("c");
        // s.add("e");
        // System.out.println(s.add("e"));
        // System.out.println(s);
        // Iterator<String> i = s.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }
    }
    
    private static void StringHash(){
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("通话".hashCode() =="重地".hashCode());
    }
}
