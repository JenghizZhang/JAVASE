package com.atguigu.javase.collection.set.treeSet;

// import com.atguigu.javase.collection.set.hashSet.Student;
//
// import java.util.*;
// import com.atguigu.javase.collection.set.hashSet.Person;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        treeSetPerson();
    }
    //
    //
    //
    // public static void treeSetStudent(){
    //     Set<Student> set = new TreeSet<>();
    //     set.add(new Student(1, "1"));
    //     set.add(new Student(2, "222"));
    //     set.add(new Student(2, "2"));
    //     System.out.println(set);
    // }
    //
    // public static void treeSetTest(){
    //     Set<String> s = new TreeSet<>();
    //     s.add("a");
    //     s.add("b");
    //     s.add("c");
    //     s.add("d");
    //     s.add("a");
    //     System.out.println(s);
    // }
    
    public static void treeSetPerson() {
        // Set<Person> set = new TreeSet<Person>(new MyComparator());
        Set<Person> set = new TreeSet<>(new MyComparator());
        set.add(new Person(1, "1"));
        set.add(new Person(2, "222"));
        set.add(new Person(2, "2"));
        Set<String> s = new TreeSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("a");
        System.out.println(set);
    }
}
