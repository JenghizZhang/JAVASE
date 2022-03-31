package com.atguigu.javase.learnInterface.test3;

import java.util.Scanner;

public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.useUSB(new Mouse());
        
        computer.useUSB(new Keyboard());
    }
}
