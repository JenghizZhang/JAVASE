package com.atguigu.object.test;

public class Circle {
    private double radius;
    private final double PI = 3.1415926;
    
    public void setRadius(double r) {
        radius = r;
    }
    
    public double computeCircleArea() {
        return Math.pow(radius, 2) * PI;
    }
}
