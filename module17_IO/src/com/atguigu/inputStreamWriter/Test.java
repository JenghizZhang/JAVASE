package com.atguigu.inputStreamWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        readGBK();
    }
    
    public static void readUTF_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("2.txt"));
        char[] arr = new char[1024];
        int r;
        while((r= isr.read(arr))!=-1){
            System.out.println(new String(arr,0,r));
        }
        isr.close();
    }
    
    public static void readGBK() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("out.txt"),"GBK");
        char[] arr = new char[1024];
        int r;
        while((r= isr.read(arr))!=-1){
            System.out.println(new String(arr,0,r));
        }
        isr.close();
    }
}
