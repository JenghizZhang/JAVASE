package com.atguigu.javase.map.hashMap;

import com.atguigu.javase.map.javabean.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();
        map.put("a", new Person(11, "san"));
        map.put("b", new Person(12, "san"));
        map.put("c", new Person(13, "san"));
        map.put("d", new Person(14, "san"));
        
        map.put(null, null);
        map.put("1", null);
        
        Set<String> s = map.keySet();
        Set<Map.Entry<String, Person>> s2 = map.entrySet();
        for (Map.Entry<String, Person> entry : s2) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    
        hashMap();
    }
    
    public static void hashMap(){
        Map<String, Person> map = new HashMap<>();
    
        map.put("a", new Person(11, "san"));
        map.put("b", new Person(11, "san"));
        map.put("c", new Person(11, "san"));
        map.put("d", new Person(11, "san"));
    
        Map<Person, String> map2 = new HashMap<>();
        
        for(Map.Entry<String,Person> entry:map.entrySet()){
            String tempKey = entry.getKey();
            Person tempValue = entry.getValue();
            map2.put(tempValue, tempKey);
        }
    
        System.out.println(map2);
    }
}
