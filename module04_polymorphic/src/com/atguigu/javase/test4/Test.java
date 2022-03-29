package com.atguigu.javase.test4;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Faculty();
        if (p1 instanceof Faculty) {
            ((Faculty) p1).setDegree("本科");
            System.out.println(((Faculty) p1).getDegree());
        }
    
        Person p2 = new Staff();
        if(p2 instanceof Staff){
            ((Staff) p2).setDuty("职员");
            System.out.println(((Staff) p2).getDuty());
        }
    }
}
