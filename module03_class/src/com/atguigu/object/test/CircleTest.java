package com.atguigu.object.test;

import java.awt.geom.Area;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println("Area = " + circle.computeCircleArea());
    }
}
