package com.atguigu.traffic;

public class Test {
    public static void main(String[] args) {
        new Traffic(Color.RED);
    }
}

class Traffic{
    private Color color;
    
    public Traffic(Color color) {
        this.color = color;
    }
    
    public Color getColor() {
        return color;
    }
}
