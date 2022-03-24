package com.atguigu.object.test;

public class Soldier {
    private String name;
    private String weapon;
    private int age;
    
    public Soldier(String name) {
        this.name = name;
    }
    
    public Soldier(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }
    
    public Soldier(String name, String weapon, char gender) {
        this.name = name;
        this.weapon = weapon;
    }
    
    // 无参构造器
    public Soldier() {
    
    }
}
