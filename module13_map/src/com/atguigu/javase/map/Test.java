package com.atguigu.javase.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Integer put1 = map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(map.get(s));
        }
        
        
        Set<Map.Entry<String, Integer>> s = map.entrySet();
        for (Map.Entry<String, Integer> entry : s) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        // System.out.println(map);
        // System.out.println(put1);
        //
        // Integer integer = map.get("3");
        // System.out.println(integer);
        //
        // System.out.println(map.containsKey("3"));
        // System.out.println(map.containsValue(55.22));
        // System.out.println(map.size());
        // System.out.println(map.remove("3"));
        // System.out.println(map.remove("99"));
        //
        // Collection<Integer> c = map.values();
        // System.out.println(c);
        //
        // map.clear();
        // System.out.println(map.isEmpty());
        // Map<String, Integer> m = new HashMap<>();
        // System.out.println(m.put("q", 1));
        // m.put("w", 1);
        // m.put("e", 1);
        // System.out.println(m.put("e", 2));
        // System.out.println(m);
        //
        // System.out.println(m.get("f"));
        //
        // System.out.println(m.containsKey("e"));
        // System.out.println(m.containsValue(1));
        //
        // System.out.println(m.size());
        // System.out.println(m.remove("e"));
        // System.out.println(m);
        //
        // Collection<Integer> c = m.values();
        // System.out.println(c);
    }
}
