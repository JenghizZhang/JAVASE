package com.atguigu.buffer;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("2.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        
        FileOutputStream fos = new FileOutputStream("out.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        byte[] arr = new byte[1024];
        int r;
        while ((r = bis.read(arr)) != -1) {
            bos.write(arr, 0, r);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        bis.close();
        bos.close();
    }
}
