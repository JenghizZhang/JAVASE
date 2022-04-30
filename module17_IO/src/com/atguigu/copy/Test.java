package com.atguigu.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream fis = new FileInputStream("2.txt"); FileOutputStream fos = new FileOutputStream("out.txt")) {
            byte[] arr = new byte[1024];
            int r = 0;
            while ((r = fis.read(arr)) != -1) {
                fos.write(arr, 0, r);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
