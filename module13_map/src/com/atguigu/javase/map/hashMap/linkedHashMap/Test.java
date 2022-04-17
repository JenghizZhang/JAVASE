package com.atguigu.javase.map.hashMap.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("3", "3");
        map.put("1", "1");
        map.put("4", "4");
        map.put("2", "2");
        System.out.println(map);
    }
    
}
