package com.atguigu.inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        readByteArr();
    }
    
    public static void readByte() throws IOException {
        FileInputStream fis = new FileInputStream(new File("2.txt"));
        int r = -1;
        do {
            r = fis.read();
            System.out.println(r);
        } while (r != -1);
        fis.close();
    }
    
    public static void readByteArr() throws IOException {
        FileInputStream fis = new FileInputStream(new File("2.txt"));
        byte[] arr = new byte[1024];
        int r = 0;
        while ((r = fis.read(arr)) != -1) {
            System.out.println("r = " + r);
            System.out.println(new String(arr, 0, r));
            
        }
        
        fis.close();
    }
}
